package com.example.vstremoukhov.memapp;

public enum Video {

    ORANGE_1(Config.ROOT + "24D643CD-C165-4692-B039-991E73CAFC0A.mp4"),
    ORANGE_2(Config.ROOT + "F1537E14-513B-4A06-9BD7-77BB217CC47D.mp4"),
    ORANGE_3(Config.ROOT + "69DEE4CC-35E4-477C-BD41-7622D010E49E.mp4"),
    ORANGE_4(Config.ROOT + "0FAF75EB-0B5F-4B46-86C7-CC81E6A9EED7.mp4"),
    ORANGE_5(Config.ROOT + "68CEEA47-B74D-4B73-A496-8536EA824144.mp4");

    public final String url;

    Video(String url) {
        this.url = url;
    }

    private class Config {
        private static final String ROOT = "http://storage.ws.pho.to/s2/";
    }
}
