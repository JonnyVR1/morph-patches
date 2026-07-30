package p149l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m87232d2 = {"Ll/v480;", "", "", "avoidPoolGet", "avoidPoolRelease", "<init>", "(ZZ)V", "a", "Z", "()Z", "b", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class v480 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean avoidPoolGet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean avoidPoolRelease;

    public /* synthetic */ v480(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAvoidPoolGet() {
        return this.avoidPoolGet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAvoidPoolRelease() {
        return this.avoidPoolRelease;
    }

    public v480(boolean z, boolean z2) {
        this.avoidPoolGet = z;
        this.avoidPoolRelease = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v480() {
        boolean z = false;
        this(z, z, 3, null);
    }
}
