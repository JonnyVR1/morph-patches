package p149l;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010\u0017R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010,\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010/R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00100\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u00103¨\u00064"}, m87232d2 = {"Ll/e13;", "", "", "bitmapPath", "", "fallbackToAppIcon", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "instanceConfig", "", "downloadTimeLimitInMillis", "", "downloadSizeLimitInBytes", "<init>", "(Ljava/lang/String;ZLandroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;JI)V", "a", "()Ljava/lang/String;", "b", "()Z", "c", "()Landroid/content/Context;", Constants.INAPP_DATA_TAG, "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "e", "()J", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "setBitmapPath", "(Ljava/lang/String;)V", "Z", "getFallbackToAppIcon", "setFallbackToAppIcon", "(Z)V", "Landroid/content/Context;", "getContext", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "getInstanceConfig", "J", "getDownloadTimeLimitInMillis", "setDownloadTimeLimitInMillis", "(J)V", "I", "g", "setDownloadSizeLimitInBytes", "(I)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class e13 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String bitmapPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean fallbackToAppIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final CleverTapInstanceConfig instanceConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long downloadTimeLimitInMillis;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int downloadSizeLimitInBytes;

    public /* synthetic */ e13(String str, boolean z, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : context, (i2 & 8) == 0 ? cleverTapInstanceConfig : null, (i2 & 16) != 0 ? -1L : j, (i2 & 32) != 0 ? -1 : i);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBitmapPath() {
        return this.bitmapPath;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getFallbackToAppIcon() {
        return this.fallbackToAppIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final CleverTapInstanceConfig getInstanceConfig() {
        return this.instanceConfig;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getDownloadTimeLimitInMillis() {
        return this.downloadTimeLimitInMillis;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e13)) {
            return false;
        }
        e13 e13Var = (e13) other;
        return Intrinsics.m87488d(this.bitmapPath, e13Var.bitmapPath) && this.fallbackToAppIcon == e13Var.fallbackToAppIcon && Intrinsics.m87488d(this.context, e13Var.context) && Intrinsics.m87488d(this.instanceConfig, e13Var.instanceConfig) && this.downloadTimeLimitInMillis == e13Var.downloadTimeLimitInMillis && this.downloadSizeLimitInBytes == e13Var.downloadSizeLimitInBytes;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m114364f() {
        return this.bitmapPath;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDownloadSizeLimitInBytes() {
        return this.downloadSizeLimitInBytes;
    }

    public int hashCode() {
        String str = this.bitmapPath;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.fallbackToAppIcon)) * 31;
        Context context = this.context;
        int iHashCode2 = (iHashCode + (context == null ? 0 : context.hashCode())) * 31;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.instanceConfig;
        return ((((iHashCode2 + (cleverTapInstanceConfig != null ? cleverTapInstanceConfig.hashCode() : 0)) * 31) + Long.hashCode(this.downloadTimeLimitInMillis)) * 31) + Integer.hashCode(this.downloadSizeLimitInBytes);
    }

    @NotNull
    public String toString() {
        return "BitmapDownloadRequest(bitmapPath=" + this.bitmapPath + ", fallbackToAppIcon=" + this.fallbackToAppIcon + ", context=" + this.context + ", instanceConfig=" + this.instanceConfig + ", downloadTimeLimitInMillis=" + this.downloadTimeLimitInMillis + ", downloadSizeLimitInBytes=" + this.downloadSizeLimitInBytes + ')';
    }

    @JvmOverloads
    public e13(@Nullable String str, boolean z, @Nullable Context context, @Nullable CleverTapInstanceConfig cleverTapInstanceConfig, long j, int i) {
        this.bitmapPath = str;
        this.fallbackToAppIcon = z;
        this.context = context;
        this.instanceConfig = cleverTapInstanceConfig;
        this.downloadTimeLimitInMillis = j;
        this.downloadSizeLimitInBytes = i;
    }

    @JvmOverloads
    public e13(@Nullable String str, boolean z, @Nullable Context context, @Nullable CleverTapInstanceConfig cleverTapInstanceConfig, long j) {
        this(str, z, context, cleverTapInstanceConfig, j, 0, 32, null);
    }
}
