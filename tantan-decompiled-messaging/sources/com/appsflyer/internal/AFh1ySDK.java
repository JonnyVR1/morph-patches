package com.appsflyer.internal;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bz00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, m87232d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "", "msg", "", "shouldRemoteDebug", "", Constants.INAPP_DATA_TAG, "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "", "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", RXScreenCaptureService.KEY_INDEX, ResourceDirection.f38808v, "w", "p0", "getMonetizationNetwork", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1cSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, m87233k = 1, m87234mv = {1, 6, 0}, m87236xi = 48)
public abstract class AFh1ySDK {
    public static long getMonetizationNetwork = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    public static /* synthetic */ void d$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            bz00.m104536a();
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1ySDK.mo5182d(aFg1cSDK, str, z);
    }

    public static /* synthetic */ void e$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if (obj != null) {
            bz00.m104536a();
            return;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            z3 = true;
        }
        if ((i & 64) != 0) {
            z4 = true;
        }
        aFh1ySDK.mo5183e(aFg1cSDK, str, th, z, z2, z3, z4);
    }

    public static /* synthetic */ void i$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            bz00.m104536a();
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1ySDK.mo5184i(aFg1cSDK, str, z);
    }

    public static /* synthetic */ void v$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            bz00.m104536a();
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1ySDK.mo5185v(aFg1cSDK, str, z);
    }

    public static /* synthetic */ void w$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            bz00.m104536a();
            return;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        aFh1ySDK.mo5186w(aFg1cSDK, str, z);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public final void m5240d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m5244e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        e$default(this, aFg1cSDK, str, th, z, z2, z3, false, 64, null);
    }

    public void force(@NotNull AFg1cSDK tag, @NotNull String msg) {
        tag.getClass();
        msg.getClass();
    }

    @NotNull
    public final String getMonetizationNetwork(@Nullable String str, @NotNull AFg1cSDK aFg1cSDK) {
        aFg1cSDK.getClass();
        if (str == null || StringsKt.m93438e0(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - getMonetizationNetwork);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(strWithTag$SDK_prodRelease);
        return sb.toString();
    }

    @JvmName
    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: i */
    public final void m5245i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: v */
    public final void m5246v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: w */
    public final void m5247w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        aFg1cSDK.getClass();
        str.getClass();
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1cSDK aFg1cSDK) {
        str.getClass();
        aFg1cSDK.getClass();
        StringBuilder sb = new StringBuilder("[");
        sb.append(aFg1cSDK.getCurrencyIso4217Code);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: d */
    public void mo5182d(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: i */
    public void mo5184i(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: v */
    public void mo5185v(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: w */
    public void mo5186w(@NotNull AFg1cSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m5241e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        e$default(this, aFg1cSDK, str, th, false, false, false, false, 120, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m5242e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        e$default(this, aFg1cSDK, str, th, z, false, false, false, 112, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m5243e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2) {
        aFg1cSDK.getClass();
        str.getClass();
        th.getClass();
        e$default(this, aFg1cSDK, str, th, z, z2, false, false, 96, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public void mo5183e(@NotNull AFg1cSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        throwable.getClass();
    }
}
