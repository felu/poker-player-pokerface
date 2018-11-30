package org.leanpoker.player;

import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Pokerface Java player";

    public static int betRequest(JsonElement request) {
        int smallblind = request.getAsJsonObject().get("small_blind").getAsInt();
        System.out.println("Smallblind is: " + smallblind);
        return 2 * smallblind;
    }

    public static void showdown(JsonElement game) {
    }
}
