package com.p069ss.bytertc.engine.type;

/* JADX INFO: loaded from: classes13.dex */
public enum GameSceneType {
    NORMAL(0),
    THEMEPARK(1);

    private final int value;

    GameSceneType(int i) {
        this.value = i;
    }

    public static GameSceneType fromId(int i) {
        for (GameSceneType gameSceneType : values()) {
            if (gameSceneType.value() == i) {
                return gameSceneType;
            }
        }
        return NORMAL;
    }

    public int value() {
        return this.value;
    }
}
