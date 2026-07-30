package com.clevertap.android.sdk;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.cryption.InterfaceC1176c;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.aom;
import p149l.dhi;
import p149l.iqm;
import p149l.lar;
import p149l.qv3;
import p149l.vnm;

/* JADX INFO: renamed from: com.clevertap.android.sdk.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b \u0010!¨\u0006$"}, m87232d2 = {"Lcom/clevertap/android/sdk/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "accountId", "Ll/aom;", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;Ljava/lang/String;)Ll/aom;", "Ll/dhi;", "g", "(Landroid/content/Context;Ljava/lang/String;)Ll/dhi;", "Lcom/clevertap/android/sdk/cryption/c;", "cryptHandler", Constants.DEVICE_ID_TAG, "Ll/iqm;", "j", "(Landroid/content/Context;Lcom/clevertap/android/sdk/cryption/c;Ljava/lang/String;Ljava/lang/String;)Ll/iqm;", "Ll/vnm;", "h", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ll/vnm;", "Ll/lar;", "k", "(Landroid/content/Context;Ljava/lang/String;)Ll/lar;", "prefName", "Ll/qv3;", "e", "(Landroid/content/Context;Ljava/lang/String;)Ll/qv3;", "", "storeType", "c", "(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Companion", "a", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C1289j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile C1289j INSTANCE;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.j$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m87232d2 = {"Lcom/clevertap/android/sdk/j$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/j;", "a", "()Lcom/clevertap/android/sdk/j;", "INSTANCE", "Lcom/clevertap/android/sdk/j;", "", "ASSET_STORE_PREFIX", "Ljava/lang/String;", "FILE_STORE_PREFIX", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final C1289j m6769a() {
            C1289j c1289j;
            C1289j c1289j2 = C1289j.INSTANCE;
            if (c1289j2 != null) {
                return c1289j2;
            }
            synchronized (this) {
                c1289j = C1289j.INSTANCE;
                if (c1289j == null) {
                    c1289j = new C1289j();
                    C1289j.INSTANCE = c1289j;
                }
            }
            return c1289j;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m6760d(C1289j c1289j, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return c1289j.m6762c(i, str, str2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final C1289j m6761f() {
        return INSTANCE.m6769a();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m6762c(int storeType, @NotNull String deviceId, @NotNull String accountId) {
        deviceId.getClass();
        accountId.getClass();
        if (storeType == 1) {
            return "inApp:" + deviceId + ':' + accountId;
        }
        if (storeType == 2) {
            return "counts_per_inapp:" + deviceId + ':' + accountId;
        }
        if (storeType == 3) {
            return Constants.CLEVERTAP_STORAGE_TAG;
        }
        if (storeType == 4) {
            return "inapp_assets:" + accountId;
        }
        if (storeType != 5) {
            return Constants.CLEVERTAP_STORAGE_TAG;
        }
        return "ct_files:" + accountId;
    }

    @VisibleForTesting
    @NotNull
    /* JADX INFO: renamed from: e */
    public final qv3 m6763e(@NotNull Context context, @NotNull String prefName) {
        context.getClass();
        prefName.getClass();
        return new qv3(context, prefName);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final dhi m6764g(@NotNull Context context, @NotNull String accountId) {
        context.getClass();
        accountId.getClass();
        return new dhi(m6763e(context, m6760d(this, 5, null, accountId, 2, null)));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final vnm m6765h(@NotNull Context context, @NotNull String deviceId, @NotNull String accountId) {
        context.getClass();
        deviceId.getClass();
        accountId.getClass();
        return new vnm(m6763e(context, m6762c(2, deviceId, accountId)));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final aom m6766i(@NotNull Context context, @NotNull String accountId) {
        context.getClass();
        accountId.getClass();
        return new aom(m6763e(context, m6760d(this, 4, null, accountId, 2, null)));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final iqm m6767j(@NotNull Context context, @NotNull InterfaceC1176c cryptHandler, @NotNull String deviceId, @NotNull String accountId) {
        context.getClass();
        cryptHandler.getClass();
        deviceId.getClass();
        accountId.getClass();
        return new iqm(m6763e(context, m6762c(1, deviceId, accountId)), cryptHandler);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final lar m6768k(@NotNull Context context, @NotNull String accountId) {
        context.getClass();
        accountId.getClass();
        return new lar(m6763e(context, m6760d(this, 3, null, null, 6, null)), accountId);
    }
}
