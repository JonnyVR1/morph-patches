package com.p000p1.mobile.putong.core.data;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Live;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/p1/mobile/putong/core/data/LiveLivingCardDataWrapper;", "", "originUserId", "", "currentLive", "Lcom/p1/mobile/putong/data/Live;", "currentVoice", "Lcom/p1/mobile/putong/core/data/Voice;", "<init>", "(Ljava/lang/String;Lcom/p1/mobile/putong/data/Live;Lcom/p1/mobile/putong/core/data/Voice;)V", "getOriginUserId", "()Ljava/lang/String;", "getCurrentLive", "()Lcom/p1/mobile/putong/data/Live;", "getCurrentVoice", "()Lcom/p1/mobile/putong/core/data/Voice;", "getUser", "Lcom/p1/mobile/putong/data/User;", "b_core_base"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public final class LiveLivingCardDataWrapper {

    @Nullable
    private final Live currentLive;

    @Nullable
    private final Voice currentVoice;

    @NotNull
    private final String originUserId;

    public LiveLivingCardDataWrapper(@NotNull String str, @Nullable Live live, @Nullable Voice voice) {
        str.getClass();
        this.originUserId = str;
        this.currentLive = live;
        this.currentVoice = voice;
    }

    @Nullable
    public final Live getCurrentLive() {
        return this.currentLive;
    }

    @Nullable
    public final Voice getCurrentVoice() {
        return this.currentVoice;
    }

    @NotNull
    public final String getOriginUserId() {
        return this.originUserId;
    }

    @Nullable
    public final User getUser() {
        return CoreModule.c.e0.Pa(this.originUserId);
    }
}
