package com.clevertap.android.sdk.inbox;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.fetch.FetchTrigger;
import com.p046p1.mobile.putong.core.data.Trigger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.jh3;
import p149l.tc20;
import p149l.yei;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Lcom/clevertap/android/sdk/inbox/InboxV2Bridge;", "", "Lcom/clevertap/android/sdk/inbox/InboxV2Fetcher;", "fetcher", "Ll/tc20;", "networkScope", "<init>", "(Lcom/clevertap/android/sdk/inbox/InboxV2Fetcher;Ll/tc20;)V", "Lcom/clevertap/android/sdk/network/fetch/FetchTrigger;", Trigger.TYPE, "Ll/yei;", "callback", "", Constants.INAPP_DATA_TAG, "(Lcom/clevertap/android/sdk/network/fetch/FetchTrigger;Ll/yei;)V", "e", "(Ll/yei;)V", "c", "()V", "a", "Lcom/clevertap/android/sdk/inbox/InboxV2Fetcher;", "b", "Ll/tc20;", "", "()Z", "isInboxFetchDisabledForSession", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class InboxV2Bridge {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InboxV2Fetcher fetcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final tc20 networkScope;

    public InboxV2Bridge(@NotNull InboxV2Fetcher inboxV2Fetcher, @NotNull tc20 tc20Var) {
        inboxV2Fetcher.getClass();
        tc20Var.getClass();
        this.fetcher = inboxV2Fetcher;
        this.networkScope = tc20Var;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6727b() {
        return this.fetcher.getDisabledForSession();
    }

    /* JADX INFO: renamed from: c */
    public final void m6728c() {
        this.fetcher.m6733c();
    }

    /* JADX INFO: renamed from: d */
    public final void m6729d(@NotNull FetchTrigger trigger, @Nullable yei callback) {
        trigger.getClass();
        jh3.m141367d(this.networkScope.getCoroutineScope(), null, null, new InboxV2Bridge$submit$1(this, trigger, callback, null), 3, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m6730e(@NotNull yei callback) {
        callback.getClass();
        jh3.m141367d(this.networkScope.getCoroutineScope(), null, null, new InboxV2Bridge$submitFailure$1(callback, null), 3, null);
    }
}
