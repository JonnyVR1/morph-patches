package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.ms5;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\fR\u0013\u0010\u0012\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001e\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u0013\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f8\u0002X\u0082\u0004R\u0013\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002X\u0082\u0004¨\u0006\""}, m87232d2 = {"Ll/ms5;", "N", "", "prev", "<init>", "(Ll/ms5;)V", "value", "", "o", "(Ll/ms5;)Z", "", "c", "()V", "m", "()Z", "n", "f", "()Ll/ms5;", "next", BLiveStormDanmakuGiftResourceType.f44444l, "isTail", "h", "k", "isRemoved", "g", "()Ljava/lang/Object;", "nextOrClosed", Constants.INAPP_DATA_TAG, "aliveSegmentLeft", "e", "aliveSegmentRight", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class ms5<N extends ms5<N>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f135443a = AtomicReferenceFieldUpdater.newUpdater(ms5.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f135444b = AtomicReferenceFieldUpdater.newUpdater(ms5.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ms5(@Nullable N n) {
        this._prev$volatile = n;
    }

    /* JADX INFO: renamed from: c */
    public final void m156109c() {
        f135444b.set(this, null);
    }

    /* JADX INFO: renamed from: d */
    public final N m156110d() {
        N n = (N) m156114h();
        while (n != null && n.mo153991k()) {
            n = (N) f135444b.get(n);
        }
        return n;
    }

    /* JADX INFO: renamed from: e */
    public final N m156111e() {
        ms5 ms5VarM156112f;
        N n = (N) m156112f();
        n.getClass();
        while (n.mo153991k() && (ms5VarM156112f = n.m156112f()) != null) {
            n = (N) ms5VarM156112f;
        }
        return n;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final N m156112f() {
        Object objM156113g = m156113g();
        if (objM156113g == ls5.f129806a) {
            return null;
        }
        return (N) objM156113g;
    }

    /* JADX INFO: renamed from: g */
    public final Object m156113g() {
        return f135443a.get(this);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final N m156114h() {
        return (N) f135444b.get(this);
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo153991k();

    /* JADX INFO: renamed from: l */
    public final boolean m156115l() {
        return m156112f() == null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m156116m() {
        return C21643z7.m217426a(f135443a, this, null, ls5.f129806a);
    }

    /* JADX INFO: renamed from: n */
    public final void m156117n() {
        Object obj;
        if (m156115l()) {
            return;
        }
        while (true) {
            ms5 ms5VarM156110d = m156110d();
            ms5 ms5VarM156111e = m156111e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f135444b;
            do {
                obj = atomicReferenceFieldUpdater.get(ms5VarM156111e);
            } while (!C21643z7.m217426a(atomicReferenceFieldUpdater, ms5VarM156111e, obj, ((ms5) obj) == null ? null : ms5VarM156110d));
            if (ms5VarM156110d != null) {
                f135443a.set(ms5VarM156110d, ms5VarM156111e);
            }
            if (!ms5VarM156111e.mo153991k() || ms5VarM156111e.m156115l()) {
                if (ms5VarM156110d == null || !ms5VarM156110d.mo153991k()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m156118o(@NotNull N value) {
        return C21643z7.m217426a(f135443a, this, null, value);
    }
}
