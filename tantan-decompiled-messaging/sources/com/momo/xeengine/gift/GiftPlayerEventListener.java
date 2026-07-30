package com.momo.xeengine.gift;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface GiftPlayerEventListener {
    void onReceiveEvent(@NotNull GiftPlayer giftPlayer, @NotNull GiftPlayerEvent giftPlayerEvent);
}
