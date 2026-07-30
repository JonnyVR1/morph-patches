package p007l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Ll/w7j0;", "", "", "name", "source", "", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "J", "()J", "Companion", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class w7j0 {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final w7j0 f5010d = new w7j0("none", "", 500);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long duration;

    public w7j0(@NotNull String str, @NotNull String str2, long j) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.source = str2;
        this.duration = j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSource() {
        return this.source;
    }
}
