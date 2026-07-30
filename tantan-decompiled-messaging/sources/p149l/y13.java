package p149l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010\u0017R$\u00106\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b'\u00105R\u0014\u00109\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m87232d2 = {"Ll/y13;", "Ll/cx3;", "", "sourceString", "Ll/nvc0;", "resizeOptions", "Ll/oed0;", "rotationOptions", "Ll/zem;", "imageDecodeOptions", "postprocessorCacheKey", "postprocessorName", "<init>", "(Ljava/lang/String;Ll/nvc0;Ll/oed0;Ll/zem;Ll/cx3;Ljava/lang/String;)V", "", "hashCode", "()I", "Landroid/net/Uri;", "uri", "", "c", "(Landroid/net/Uri;)Z", "a", "()Ljava/lang/String;", "b", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getSourceString", "Ll/nvc0;", "getResizeOptions", "()Ll/nvc0;", "Ll/oed0;", "getRotationOptions", "()Ll/oed0;", Constants.INAPP_DATA_TAG, "Ll/zem;", "getImageDecodeOptions", "()Ll/zem;", "e", "Ll/cx3;", "getPostprocessorCacheKey", "()Ll/cx3;", "f", "getPostprocessorName", "g", "Ljava/lang/Object;", "getCallerContext", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "callerContext", "h", "I", "hash", "", RXScreenCaptureService.KEY_INDEX, "J", "getInBitmapCacheSince", "()J", "inBitmapCacheSince", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class y13 implements cx3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String sourceString;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final nvc0 resizeOptions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final oed0 rotationOptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final zem imageDecodeOptions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final cx3 postprocessorCacheKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final String postprocessorName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public Object callerContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int hash;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final long inBitmapCacheSince;

    public y13(@NotNull String str, @Nullable nvc0 nvc0Var, @NotNull oed0 oed0Var, @NotNull zem zemVar, @Nullable cx3 cx3Var, @Nullable String str2) {
        str.getClass();
        oed0Var.getClass();
        zemVar.getClass();
        this.sourceString = str;
        this.resizeOptions = nvc0Var;
        this.rotationOptions = oed0Var;
        this.imageDecodeOptions = zemVar;
        this.postprocessorCacheKey = cx3Var;
        this.postprocessorName = str2;
        this.hash = (((((((((str.hashCode() * 31) + (nvc0Var != null ? nvc0Var.hashCode() : 0)) * 31) + oed0Var.hashCode()) * 31) + zemVar.hashCode()) * 31) + (cx3Var != null ? cx3Var.hashCode() : 0)) * 31) + (str2 != null ? str2.hashCode() : 0);
        this.inBitmapCacheSince = RealtimeSinceBootClock.get().now();
    }

    @Override // p149l.cx3
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getSourceString() {
        return this.sourceString;
    }

    @Override // p149l.cx3
    /* JADX INFO: renamed from: b */
    public boolean mo103430b() {
        return false;
    }

    @Override // p149l.cx3
    /* JADX INFO: renamed from: c */
    public boolean mo103431c(@NotNull Uri uri) {
        uri.getClass();
        String sourceString = getSourceString();
        String string = uri.toString();
        string.getClass();
        return StringsKt.m93412P(sourceString, string, false, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m212129d(@Nullable Object obj) {
        this.callerContext = obj;
    }

    @Override // p149l.cx3
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.m87488d(y13.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        y13 y13Var = (y13) other;
        return Intrinsics.m87488d(this.sourceString, y13Var.sourceString) && Intrinsics.m87488d(this.resizeOptions, y13Var.resizeOptions) && Intrinsics.m87488d(this.rotationOptions, y13Var.rotationOptions) && Intrinsics.m87488d(this.imageDecodeOptions, y13Var.imageDecodeOptions) && Intrinsics.m87488d(this.postprocessorCacheKey, y13Var.postprocessorCacheKey) && Intrinsics.m87488d(this.postprocessorName, y13Var.postprocessorName);
    }

    @Override // p149l.cx3
    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getHash() {
        return this.hash;
    }

    @Override // p149l.cx3
    @NotNull
    public String toString() {
        return "BitmapMemoryCacheKey(sourceString=" + this.sourceString + ", resizeOptions=" + this.resizeOptions + ", rotationOptions=" + this.rotationOptions + ", imageDecodeOptions=" + this.imageDecodeOptions + ", postprocessorCacheKey=" + this.postprocessorCacheKey + ", postprocessorName=" + this.postprocessorName + ")";
    }
}
