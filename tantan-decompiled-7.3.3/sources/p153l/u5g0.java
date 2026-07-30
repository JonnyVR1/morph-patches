package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m88121d2 = {"Ll/u5g0;", "Ll/u8;", "", "min", "<init>", "(J)V", "Ll/p5d0;", "h", "()Ll/p5d0;", "e", "J", "getMin", "()J", "a", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class u5g0 extends AbstractC20518u8 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final long min;

    /* JADX INFO: renamed from: l.u5g0$a */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"Ll/u5g0$a;", "Ll/dyl;", "<init>", "()V", "sharedlibrarymanager_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static abstract class AbstractC20489a implements dyl {
    }

    public u5g0(long j) {
        this.min = j;
    }

    @Override // p153l.AbstractC20518u8
    @NotNull
    /* JADX INFO: renamed from: h */
    public p5d0 mo194586h() {
        long jM165660d = o1m.m165660d();
        long j = this.min;
        if (j == 0) {
            j = 2000000000;
        }
        if (jM165660d >= j) {
            dyl workCallback = getWorkCallback();
            if (workCallback != null) {
                workCallback.onComplete();
            }
            return p5d0.INSTANCE.m170622b();
        }
        Exception exc = new Exception("Not enough space left, current " + jM165660d);
        m194900e(m194897b(exc));
        dyl workCallback2 = getWorkCallback();
        if (workCallback2 != null) {
            workCallback2.onError(exc);
        }
        return p5d0.INSTANCE.m170621a(exc);
    }
}
