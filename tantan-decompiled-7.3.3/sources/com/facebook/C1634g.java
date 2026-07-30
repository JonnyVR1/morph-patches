package com.facebook;

import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.facebook.internal.C1680e;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.op90;
import p153l.ztv;

/* JADX INFO: renamed from: com.facebook.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0014B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Lcom/facebook/g;", "", "Ll/ztv;", "localBroadcastManager", "Ll/op90;", "profileCache", "<init>", "(Ll/ztv;Ll/op90;)V", "", Constants.INAPP_DATA_TAG, "()Z", "Lcom/facebook/Profile;", "currentProfile", "writeToCache", "", "g", "(Lcom/facebook/Profile;Z)V", "oldProfile", "e", "(Lcom/facebook/Profile;Lcom/facebook/Profile;)V", "a", "Ll/ztv;", "b", "Ll/op90;", "c", "Lcom/facebook/Profile;", "currentProfileField", "value", "()Lcom/facebook/Profile;", "f", "(Lcom/facebook/Profile;)V", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C1634g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static volatile C1634g f6451d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ztv localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final op90 profileCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Profile currentProfileField;

    /* JADX INFO: renamed from: com.facebook.g$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/facebook/g$a;", "", "<init>", "()V", "Lcom/facebook/g;", "a", "()Lcom/facebook/g;", "", "ACTION_CURRENT_PROFILE_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_PROFILE", "EXTRA_OLD_PROFILE", "instance", "Lcom/facebook/g;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final synchronized C1634g m8440a() {
            C1634g c1634g;
            try {
                if (C1634g.f6451d == null) {
                    ztv ztvVarM221572b = ztv.m221572b(C1600c.m8101l());
                    ztvVarM221572b.getClass();
                    C1634g.f6451d = new C1634g(ztvVarM221572b, new op90());
                }
                c1634g = C1634g.f6451d;
                if (c1634g == null) {
                    Intrinsics.m88391r("instance");
                    c1634g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return c1634g;
        }

        public Companion() {
        }
    }

    public C1634g(@NotNull ztv ztvVar, @NotNull op90 op90Var) {
        ztvVar.getClass();
        op90Var.getClass();
        this.localBroadcastManager = ztvVar;
        this.profileCache = op90Var;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Profile getCurrentProfileField() {
        return this.currentProfileField;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8436d() {
        Profile profileM168621b = this.profileCache.m168621b();
        if (profileM168621b == null) {
            return false;
        }
        m8439g(profileM168621b, false);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m8437e(Profile oldProfile, Profile currentProfile) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", oldProfile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", currentProfile);
        this.localBroadcastManager.m221575d(intent);
    }

    /* JADX INFO: renamed from: f */
    public final void m8438f(@Nullable Profile profile) {
        m8439g(profile, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m8439g(Profile currentProfile, boolean writeToCache) {
        Profile profile = this.currentProfileField;
        this.currentProfileField = currentProfile;
        if (writeToCache) {
            op90 op90Var = this.profileCache;
            if (currentProfile != null) {
                op90Var.m168622c(currentProfile);
            } else {
                op90Var.m168620a();
            }
        }
        if (C1680e.m8888e(profile, currentProfile)) {
            return;
        }
        m8437e(profile, currentProfile);
    }
}
