package alex.klimchuk.tdd.example;

import java.util.HashMap;

/**
 * Created by Alex Klimchuk on 04-05-2024.
 */
class Bank {
    private final HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(final Expression source, final String currency) {
        return source.reduce(this, currency);
    }

    public int rate(final String from, final String to) {
        if (from.equals(to)) {
            return 1;
        }
        return rateMap.get(new Pair(from, to));
    }

    public void addRate(final String from, final String to, final int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
