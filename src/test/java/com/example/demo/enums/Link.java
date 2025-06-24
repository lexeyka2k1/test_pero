package com.example.demo.enums;

public enum Link {
    PRODUCT("https://vk.com/club225299895?w=product-225299895_10044406"),
    COMMUNITY("https://vk.com/club225299895");

    public final String url;

    Link(String url) {
        this.url = url;
    }
}
