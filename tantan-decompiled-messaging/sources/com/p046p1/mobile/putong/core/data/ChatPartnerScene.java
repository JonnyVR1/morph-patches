package com.p046p1.mobile.putong.core.data;

/* JADX INFO: loaded from: classes10.dex */
public enum ChatPartnerScene {
    MESSAGE_PAGE_PASSIVE("messagePagePassive"),
    ONLINE_SQUARE_PASSIVE("onlineSquarePassive"),
    ONLINE_SQUARE_ACTIVE("onlineSquareActive");

    private final String value;

    ChatPartnerScene(String str) {
        this.value = str;
    }

    public static ChatPartnerScene get(String str) {
        str.getClass();
        switch (str) {
            case "onlineSquareActive":
                return ONLINE_SQUARE_ACTIVE;
            case "messagePagePassive":
                return MESSAGE_PAGE_PASSIVE;
            case "onlineSquarePassive":
                return ONLINE_SQUARE_PASSIVE;
            default:
                return null;
        }
    }

    public String getValue() {
        return this.value;
    }
}
