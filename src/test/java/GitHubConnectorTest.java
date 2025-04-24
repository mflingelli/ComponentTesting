import org.mockserver.integration.ClientAndServer;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class GitHubConnectorTest {
    private ClientAndServer mockServer;

    @BeforeClass
    public void startServer() throws IOException {
        mockServer = ClientAndServer.startClientAndServer(50080);
    }

    @AfterClass
    public void stopServer() {
        mockServer.stop();
    }

    @Test
    public void testGetUserNameInformationAgainstMock() throws IOException {
        mockServer.when(request().withMethod("GET"))
                .respond(response().withStatusCode(200)
                        .withBody(getFileContent("mflingelli.json"))
        );
        GitHubConnector connector = new GitHubConnector("http://localhost:50080/users/");
        String response = connector.getUserInformation("mflingelli");
        Assert.assertTrue(response.contains("mflingelli"));
    }

    private String getFileContent(String fileName) throws IOException {
        return Files.readString(Path.of("src/test/resources/" + fileName));
    }

    @Test
    public void testGetUserNameInformationAgainstGitHub() throws IOException {
        GitHubConnector connector = new GitHubConnector("https://api.github.com/");
        Assert.assertTrue(connector.getUserInformation("mflingelli").contains("mflingelli"));
    }
}
