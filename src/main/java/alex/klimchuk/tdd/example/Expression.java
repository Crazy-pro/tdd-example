package alex.klimchuk.tdd.example;

/**
 * Created by Alex Klimchuk on 04-05-2024.
 */
public interface Expression {
    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int multiplier);
}
