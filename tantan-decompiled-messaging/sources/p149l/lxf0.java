package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m87232d2 = {"Ll/lxf0;", "Ll/z8;", "", "min", "<init>", "(J)V", "Ll/mxc0;", "h", "()Ll/mxc0;", "e", "J", "getMin", "()J", "a", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class lxf0 extends AbstractC21646z8 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long min;

    /* JADX INFO: renamed from: l.lxf0$a */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/lxf0$a;", "Ll/lvl;", "<init>", "()V", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static abstract class AbstractC18346a implements lvl {
    }

    public lxf0(long j) {
        this.min = j;
    }

    @Override // p149l.AbstractC21646z8
    @NotNull
    /* JADX INFO: renamed from: h */
    public mxc0 mo152062h() {
        long jM191059d = tyl.m191059d();
        long j = this.min;
        if (j == 0) {
            j = 2000000000;
        }
        if (jM191059d >= j) {
            lvl workCallback = getWorkCallback();
            if (workCallback != null) {
                workCallback.onComplete();
            }
            return mxc0.INSTANCE.m156873b();
        }
        Exception exc = new Exception("Not enough space left, current " + jM191059d);
        m217547e(m217544b(exc));
        lvl workCallback2 = getWorkCallback();
        if (workCallback2 != null) {
            workCallback2.onError(exc);
        }
        return mxc0.INSTANCE.m156872a(exc);
    }
}
