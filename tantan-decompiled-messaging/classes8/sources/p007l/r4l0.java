package p007l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Ll/r4l0;", "", "Ll/z4l0;", "videoFormat", "Ll/ja1;", "audioEntry", "", "output", "", "totalDuration", "<init>", "(Ll/z4l0;Ll/ja1;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll/z4l0;", "d", "()Ll/z4l0;", "b", "Ljava/lang/String;", "c", "J", "()J", "Ll/ja1;", "()Ll/ja1;", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r4l0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final z4l0 videoFormat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String output;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long totalDuration;

    public r4l0(@NotNull z4l0 z4l0Var, @Nullable ja1 ja1Var, @NotNull String str, long j) {
        z4l0Var.getClass();
        str.getClass();
        this.videoFormat = z4l0Var;
        this.output = str;
        this.totalDuration = j;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final ja1 m10548a() {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOutput() {
        return this.output;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTotalDuration() {
        return this.totalDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final z4l0 getVideoFormat() {
        return this.videoFormat;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r4l0)) {
            return false;
        }
        r4l0 r4l0Var = (r4l0) other;
        return Intrinsics.d(this.videoFormat, r4l0Var.videoFormat) && Intrinsics.d((Object) null, (Object) null) && Intrinsics.d(this.output, r4l0Var.output) && this.totalDuration == r4l0Var.totalDuration;
    }

    public int hashCode() {
        return (((this.videoFormat.hashCode() * 961) + this.output.hashCode()) * 31) + Long.hashCode(this.totalDuration);
    }

    @NotNull
    public String toString() {
        return "VideoEntry(videoFormat=" + this.videoFormat + ", audioEntry=null, output='" + this.output + "', totalDuration=" + this.totalDuration + ")";
    }
}
