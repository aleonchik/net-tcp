package ru.leonchik.net.greet;

import ru.leonchik.net.Greetable;

public class DayGreet extends Greetable {
    @Override
    public String buildResponse(String userName) {
        return "Good day " + userName;
    }
}
