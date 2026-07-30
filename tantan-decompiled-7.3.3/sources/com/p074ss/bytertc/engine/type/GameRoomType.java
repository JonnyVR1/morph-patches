package com.p074ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes11.dex */
public enum GameRoomType {
    TEAM(0),
    WORLD(1);

    private final int value;

    GameRoomType(int i) {
        this.value = i;
    }

    public static GameRoomType fromId(int i) {
        for (GameRoomType gameRoomType : values()) {
            if (gameRoomType.value() == i) {
                return gameRoomType;
            }
        }
        return TEAM;
    }

    public int value() {
        return this.value;
    }
}
