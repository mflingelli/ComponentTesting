import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class GitHubConnector {
    private final String url;

    public GitHubConnector(String url) {
        this.url = url;
    }

    public String getUserInformation(String username) throws IOException {
        URL urlCall = new URL(url + "users/" + username);
        HttpURLConnection conn = (HttpURLConnection) urlCall.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        return reader.lines().collect(Collectors.joining());
    }
}
