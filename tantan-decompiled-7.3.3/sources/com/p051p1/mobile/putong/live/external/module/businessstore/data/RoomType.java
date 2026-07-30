package com.p051p1.mobile.putong.live.external.module.businessstore.data;

/* JADX INFO: loaded from: classes9.dex */
public enum RoomType {
    suggest("推荐", "suggest"),
    nearby("附近", "nearby");

    private String name;
    private String searchKey;

    RoomType(String str, String str2) {
        this.name = str;
        this.searchKey = str2;
    }
}
