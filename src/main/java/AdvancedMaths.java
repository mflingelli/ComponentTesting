public class AdvancedMaths {

    /**
     * Berechnet die Fakultät (x!) einer nicht-negativen ganzen Zahl.
     *
     * <p>Die Fakultät ist das Produkt aller positiven ganzen Zahlen kleiner oder
     * gleich x. Für x = 0 ist die Fakultät als 1 definiert.</p>
     *
     * <p><strong>Achtung:</strong> Da der Rückgabetyp {@code long} ist, kommt es bei
     * Werten ab x &ge; 21 zu einem arithmetischen Überlauf (Overflow), wodurch das
     * Ergebnis fehlerhaft wird.</p>
     *
     * @param x Die Zahl, deren Fakultät berechnet werden soll (muss &ge; 0 sein).
     * @return Das Ergebnis der Fakultätsberechnung (x!).
     * @throws ArithmeticException Wenn {@code x} negativ ist.
     */
    public long fac(final long x) {
        if (x < 0) {
            throw new ArithmeticException("Invalid input.");
        } else if (x == 0) {
            return 1;
        } else {
            return x * fac(x - 1);
        }
    }

    /**
     * Berechnet die Ackermannfunktion für zwei nicht-negative ganze Zahlen.
     *
     * <p>Die Ackermannfunktion ist eine extrem schnell wachsende mathematische Funktion,
     * die in der theoretischen Informatik als Beispiel für eine total berechenbare,
     * aber nicht primitiv-rekursive Funktion dient.</p>
     *
     * <p><strong>Achtung:</strong> Aufgrund des extremen Wachstums und der tiefen
     * Rekursion führt die Methode bereits bei sehr kleinen Werten (z. B. m &ge; 4)
     * schnell zu einem {@link StackOverflowError}.</p>
     *
     * @param m Der erste Parameter der Ackermannfunktion (nicht-negativ).
     * @param n Der zweite Parameter der Ackermannfunktion (nicht-negativ).
     * @return Das Ergebnis der Ackermann-Berechnung {@code A(m, n)}.
     */
    public long ackermann(final long m, final long n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    /**
     * Berechnet den größten gemeinsamen Teiler (ggT) zweier ganzer Zahlen
     * mithilfe des euklidischen Algorithmus.
     *
     * <p>Der ggT ist die größte natürliche Zahl, durch die zwei ganze Zahlen
     * ohne Rest teilbar sind. Die Berechnung basiert auf der mathematischen
     * Eigenschaft, dass sich der ggT zweier Zahlen nicht ändert, wenn man die
     * größere Zahl durch den Rest ihrer Division durch die kleinere Zahl ersetzt.</p>
     *
     * <p>Die Implementierung fängt negative Eingaben ab, indem sie mit den
     * Absolutwerten arbeitet, sodass {@code ggT(a, b) == ggT(-a, -b)} gilt.</p>
     *
     * @param a die erste ganze Zahl.
     * @param b die zweite ganze Zahl.
     * @return der größte gemeinsame Teiler von {@code a} und {@code b} (immer &ge; 0).
     */
    public long ggT(final long a, final long b) {
        long absA = Math.abs(a);
        long absB = Math.abs(b);

        if (absB == 0) {
            return absA;
        }
        return ggT(absB, absA % absB);
    }

}
