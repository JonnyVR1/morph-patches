package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.qt5;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001e\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004R\u0013\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002X\u0082\u0004¨\u0006\""}, m88121d2 = {"Ll/qt5;", "N", "", "prev", "<init>", "(Ll/qt5;)V", "value", "", "o", "(Ll/qt5;)Z", "", "c", "()V", "m", "()Z", "n", "f", "()Ll/qt5;", "next", BLiveStormDanmakuGiftResourceType.f45292l, "isTail", "h", "k", "isRemoved", "g", "()Ljava/lang/Object;", "nextOrClosed", Constants.INAPP_DATA_TAG, "aliveSegmentLeft", "e", "aliveSegmentRight", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public abstract class qt5<N extends qt5<N>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f159389a = AtomicReferenceFieldUpdater.newUpdater(qt5.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f159390b = AtomicReferenceFieldUpdater.newUpdater(qt5.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public qt5(@Nullable N n) {
        this._prev$volatile = n;
    }

    /* JADX INFO: renamed from: c */
    public final void m177894c() {
        f159390b.set(this, null);
    }

    /* JADX INFO: renamed from: d */
    public final N m177895d() {
        N n = (N) m177899h();
        while (n != null && n.mo177900k()) {
            n = (N) f159390b.get(n);
        }
        return n;
    }

    /* JADX INFO: renamed from: e */
    public final N m177896e() {
        qt5 qt5VarM177897f;
        N n = (N) m177897f();
        n.getClass();
        while (n.mo177900k() && (qt5VarM177897f = n.m177897f()) != null) {
            n = (N) qt5VarM177897f;
        }
        return n;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final N m177897f() {
        Object objM177898g = m177898g();
        if (objM177898g == pt5.f153988a) {
            return null;
        }
        return (N) objM177898g;
    }

    /* JADX INFO: renamed from: g */
    public final Object m177898g() {
        return f159389a.get(this);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final N m177899h() {
        return (N) f159390b.get(this);
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo177900k();

    /* JADX INFO: renamed from: l */
    public final boolean m177901l() {
        return m177897f() == null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m177902m() {
        return C20511u7.m194801a(f159389a, this, null, pt5.f153988a);
    }

    /* JADX INFO: renamed from: n */
    public final void m177903n() {
        Object obj;
        if (m177901l()) {
            return;
        }
        while (true) {
            qt5 qt5VarM177895d = m177895d();
            qt5 qt5VarM177896e = m177896e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f159390b;
            do {
                obj = atomicReferenceFieldUpdater.get(qt5VarM177896e);
            } while (!C20511u7.m194801a(atomicReferenceFieldUpdater, qt5VarM177896e, obj, ((qt5) obj) == null ? null : qt5VarM177895d));
            if (qt5VarM177895d != null) {
                f159389a.set(qt5VarM177895d, qt5VarM177896e);
            }
            if (!qt5VarM177896e.mo177900k() || qt5VarM177896e.m177901l()) {
                if (qt5VarM177895d == null || !qt5VarM177895d.mo177900k()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m177904o(@NotNull N value) {
        return C20511u7.m194801a(f159389a, this, null, value);
    }
}
