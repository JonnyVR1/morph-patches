package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.facebook.internal.C1680e;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ae1;
import p153l.ztv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0012\u001eB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m88121d2 = {"Lcom/facebook/AuthenticationTokenManager;", "", "Ll/ztv;", "localBroadcastManager", "Ll/ae1;", "authenticationTokenCache", "<init>", "(Ll/ztv;Ll/ae1;)V", "Lcom/facebook/AuthenticationToken;", "currentAuthenticationToken", "", "saveToCache", "", "f", "(Lcom/facebook/AuthenticationToken;Z)V", "oldAuthenticationToken", Constants.INAPP_DATA_TAG, "(Lcom/facebook/AuthenticationToken;Lcom/facebook/AuthenticationToken;)V", "a", "Ll/ztv;", "b", "Ll/ae1;", "c", "Lcom/facebook/AuthenticationToken;", "currentAuthenticationTokenField", "value", "()Lcom/facebook/AuthenticationToken;", "e", "(Lcom/facebook/AuthenticationToken;)V", "Companion", "CurrentAuthenticationTokenChangedBroadcastReceiver", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class AuthenticationTokenManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @Nullable
    public static AuthenticationTokenManager f5902d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ztv localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ae1 authenticationTokenCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public AuthenticationToken currentAuthenticationTokenField;

    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m88121d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            context.getClass();
            intent.getClass();
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenManager$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/facebook/AuthenticationTokenManager$a;", "", "<init>", "()V", "Lcom/facebook/AuthenticationTokenManager;", "a", "()Lcom/facebook/AuthenticationTokenManager;", "", "ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_AUTHENTICATION_TOKEN", "EXTRA_OLD_AUTHENTICATION_TOKEN", "SHARED_PREFERENCES_NAME", "TAG", "instanceField", "Lcom/facebook/AuthenticationTokenManager;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final AuthenticationTokenManager m7523a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f5902d;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.f5902d;
                if (authenticationTokenManager == null) {
                    ztv ztvVarM221572b = ztv.m221572b(C1600c.m8101l());
                    ztvVarM221572b.getClass();
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(ztvVarM221572b, new ae1());
                    AuthenticationTokenManager.f5902d = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }

        public Companion() {
        }
    }

    public AuthenticationTokenManager(@NotNull ztv ztvVar, @NotNull ae1 ae1Var) {
        ztvVar.getClass();
        ae1Var.getClass();
        this.localBroadcastManager = ztvVar;
        this.authenticationTokenCache = ae1Var;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AuthenticationToken getCurrentAuthenticationTokenField() {
        return this.currentAuthenticationTokenField;
    }

    /* JADX INFO: renamed from: d */
    public final void m7520d(AuthenticationToken oldAuthenticationToken, AuthenticationToken currentAuthenticationToken) {
        Intent intent = new Intent(C1600c.m8101l(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", oldAuthenticationToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", currentAuthenticationToken);
        this.localBroadcastManager.m221575d(intent);
    }

    /* JADX INFO: renamed from: e */
    public final void m7521e(@Nullable AuthenticationToken authenticationToken) {
        m7522f(authenticationToken, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m7522f(AuthenticationToken currentAuthenticationToken, boolean saveToCache) {
        AuthenticationToken currentAuthenticationTokenField = getCurrentAuthenticationTokenField();
        this.currentAuthenticationTokenField = currentAuthenticationToken;
        if (saveToCache) {
            ae1 ae1Var = this.authenticationTokenCache;
            if (currentAuthenticationToken != null) {
                ae1Var.m97172b(currentAuthenticationToken);
            } else {
                ae1Var.m97171a();
                C1680e.m8895i(C1600c.m8101l());
            }
        }
        if (C1680e.m8888e(currentAuthenticationTokenField, currentAuthenticationToken)) {
            return;
        }
        m7520d(currentAuthenticationTokenField, currentAuthenticationToken);
    }
}
