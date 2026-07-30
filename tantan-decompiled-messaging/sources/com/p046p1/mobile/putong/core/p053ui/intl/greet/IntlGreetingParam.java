package com.p046p1.mobile.putong.core.p053ui.intl.greet;

import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.IceBreakingContent;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000e¨\u0006'"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetingParam;", "Ljava/io/Serializable;", "<init>", "()V", "greetInfo", "Lcom/p1/mobile/putong/core/data/Greeting;", "getGreetInfo", "()Lcom/p1/mobile/putong/core/data/Greeting;", "setGreetInfo", "(Lcom/p1/mobile/putong/core/data/Greeting;)V", "isStartHomeCard", "", "()Z", "setStartHomeCard", "(Z)V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "preSendMsg", "getPreSendMsg", "setPreSendMsg", "iceBreakingContent", "Lcom/p1/mobile/putong/core/data/IceBreakingContent;", "getIceBreakingContent", "()Lcom/p1/mobile/putong/core/data/IceBreakingContent;", "setIceBreakingContent", "(Lcom/p1/mobile/putong/core/data/IceBreakingContent;)V", "hotLevel", "", "getHotLevel", "()I", "setHotLevel", "(I)V", "hasCreatedGreeting", "getHasCreatedGreeting", "setHasCreatedGreeting", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlGreetingParam implements Serializable {

    @Nullable
    private Greeting greetInfo;
    private int hotLevel;

    @Nullable
    private IceBreakingContent iceBreakingContent;
    private boolean isStartHomeCard;

    @NotNull
    private String from = "";

    @Nullable
    private String preSendMsg = "";
    private boolean hasCreatedGreeting = true;

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @Nullable
    public final Greeting getGreetInfo() {
        return this.greetInfo;
    }

    public final boolean getHasCreatedGreeting() {
        return this.hasCreatedGreeting;
    }

    public final int getHotLevel() {
        return this.hotLevel;
    }

    @Nullable
    public final IceBreakingContent getIceBreakingContent() {
        return this.iceBreakingContent;
    }

    @Nullable
    public final String getPreSendMsg() {
        return this.preSendMsg;
    }

    /* JADX INFO: renamed from: isStartHomeCard, reason: from getter */
    public final boolean getIsStartHomeCard() {
        return this.isStartHomeCard;
    }

    public final void setFrom(@NotNull String str) {
        str.getClass();
        this.from = str;
    }

    public final void setGreetInfo(@Nullable Greeting greeting) {
        this.greetInfo = greeting;
    }

    public final void setHasCreatedGreeting(boolean z) {
        this.hasCreatedGreeting = z;
    }

    public final void setHotLevel(int i) {
        this.hotLevel = i;
    }

    public final void setIceBreakingContent(@Nullable IceBreakingContent iceBreakingContent) {
        this.iceBreakingContent = iceBreakingContent;
    }

    public final void setPreSendMsg(@Nullable String str) {
        this.preSendMsg = str;
    }

    public final void setStartHomeCard(boolean z) {
        this.isStartHomeCard = z;
    }
}
