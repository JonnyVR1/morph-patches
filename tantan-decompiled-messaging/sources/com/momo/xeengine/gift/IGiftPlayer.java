package com.momo.xeengine.gift;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface IGiftPlayer {
    void play(@NotNull GiftEntity giftEntity);

    void setPlayerType(GiftPlayerType giftPlayerType);

    void stop();
}
