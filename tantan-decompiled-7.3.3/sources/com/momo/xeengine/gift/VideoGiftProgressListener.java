package com.momo.xeengine.gift;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface VideoGiftProgressListener {
    void onVideoGiftProgressUpdate(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, double d, double d2);

    void onVideoGiftStartPlaying(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity);

    void onVideoGiftStopPlaying(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity);
}
