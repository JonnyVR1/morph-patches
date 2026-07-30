package com.momo.xeengine.gift;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface GiftPlayerListener {
    void onGiftPlayCanceled(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity);

    void onGiftPlayFailed(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, int i, @NotNull String str);

    void onGiftPlayFinished(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity, @Nullable String str);

    default void onGiftPrepared(@NotNull GiftPlayer giftPlayer, @NotNull GiftEntity giftEntity) {
    }
}
