package p153l;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/ntb;", "", "", "time", "", "enable", "<init>", "(JZ)V", "a", "J", "b", "()J", "Z", "()Z", "setEnable", "(Z)V", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class ntb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean enable;

    public /* synthetic */ ntb(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public ntb(long j, boolean z) {
        this.time = j;
        this.enable = z;
    }
}
