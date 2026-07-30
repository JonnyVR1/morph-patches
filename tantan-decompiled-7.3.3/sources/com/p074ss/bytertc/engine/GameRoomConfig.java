package com.p074ss.bytertc.engine;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.engine.type.GameRoomType;
import com.p074ss.bytertc.engine.type.GameSceneType;

/* JADX INFO: loaded from: classes11.dex */
public class GameRoomConfig {
    public GameRoomType gameRoomType;
    public GameSceneType gameSceneType;

    public GameRoomConfig(GameRoomType gameRoomType, GameSceneType gameSceneType) {
        this.gameRoomType = gameRoomType;
        this.gameSceneType = gameSceneType;
    }

    @CalledByNative
    public int getGameRoomType() {
        return this.gameRoomType.value();
    }

    @CalledByNative
    public int getGameSceneType() {
        return this.gameSceneType.value();
    }

    public String toString() {
        return "GameRoomConfig{gameRoomType=" + this.gameRoomType + ", gameSceneType=" + this.gameSceneType + '}';
    }
}
