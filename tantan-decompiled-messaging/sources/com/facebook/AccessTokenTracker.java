package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.clevertap.android.sdk.Constants;
import com.facebook.internal.C1657e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ark0;
import p149l.yrv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u000e\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H$¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R$\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001c"}, m87232d2 = {"Lcom/facebook/AccessTokenTracker;", "", "<init>", "()V", "Lcom/facebook/AccessToken;", "oldAccessToken", "currentAccessToken", "", Constants.INAPP_DATA_TAG, "(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V", "e", "f", "b", "Landroid/content/BroadcastReceiver;", "a", "Landroid/content/BroadcastReceiver;", "receiver", "Ll/yrv;", "Ll/yrv;", "broadcastManager", "", "<set-?>", "c", "Z", "()Z", "isTracking", "Companion", "CurrentAccessTokenBroadcastReceiver", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public abstract class AccessTokenTracker {

    /* JADX INFO: renamed from: d */
    public static final String f5860d = AccessTokenTracker.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BroadcastReceiver receiver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yrv broadcastManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isTracking;

    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m87232d2 = {"Lcom/facebook/AccessTokenTracker$CurrentAccessTokenBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/facebook/AccessTokenTracker;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
    public final class CurrentAccessTokenBroadcastReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessTokenTracker f5864a;

        public CurrentAccessTokenBroadcastReceiver(AccessTokenTracker accessTokenTracker) {
            accessTokenTracker.getClass();
            this.f5864a = accessTokenTracker;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            context.getClass();
            intent.getClass();
            if (Intrinsics.m87488d("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                C1657e c1657e = C1657e.INSTANCE;
                C1657e.m8844j0(AccessTokenTracker.f5860d, "AccessTokenChanged");
                this.f5864a.mo7444d((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public AccessTokenTracker() {
        ark0.m98523l();
        this.receiver = new CurrentAccessTokenBroadcastReceiver(this);
        yrv yrvVarM215864b = yrv.m215864b(C1577c.m8047l());
        yrvVarM215864b.getClass();
        this.broadcastManager = yrvVarM215864b;
        m7445e();
    }

    /* JADX INFO: renamed from: b */
    public final void m7442b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.broadcastManager.m215866c(this.receiver, intentFilter);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsTracking() {
        return this.isTracking;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo7444d(@Nullable AccessToken oldAccessToken, @Nullable AccessToken currentAccessToken);

    /* JADX INFO: renamed from: e */
    public final void m7445e() {
        if (this.isTracking) {
            return;
        }
        m7442b();
        this.isTracking = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m7446f() {
        if (this.isTracking) {
            this.broadcastManager.m215868e(this.receiver);
            this.isTracking = false;
        }
    }
}
