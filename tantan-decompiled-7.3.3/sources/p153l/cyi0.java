package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dyi0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0010H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR$\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0018R\u0011\u0010'\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, m88121d2 = {"Ll/cyi0;", "Ll/dyi0;", "", p7f.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "f", "()Ll/dyi0;", "j", "node", "", "h", "(Ll/dyi0;)Z", "b", "", FirebaseAnalytics.Param.INDEX, RXScreenCaptureService.KEY_INDEX, "(I)Ll/dyi0;", "", "a", "(Ll/dyi0;)V", "m", "(I)V", BLiveStormDanmakuGiftResourceType.f45292l, "", "g", "()[Ll/dyi0;", "n", "(II)V", "[Ll/dyi0;", "value", "c", "()I", "k", "size", "e", "()Z", "isEmpty", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public class cyi0<T extends dyi0 & Comparable<? super T>> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f84380b = AtomicIntegerFieldUpdater.newUpdater(cyi0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    @Nullable
    public T[] a;

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final void m113170a(@NotNull T node) {
        node.mo95131f(this);
        dyi0[] dyi0VarArrM113175g = m113175g();
        int iM113172c = m113172c();
        m113179k(iM113172c + 1);
        dyi0VarArrM113175g[iM113172c] = node;
        node.setIndex(iM113172c);
        m113181m(iM113172c);
    }

    @PublishedApi
    @Nullable
    /* JADX INFO: renamed from: b */
    public final T m113171b() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m113172c() {
        return f84380b.get(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m113173e() {
        return m113172c() == 0;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final T m113174f() {
        T t;
        synchronized (this) {
            t = (T) m113171b();
        }
        return t;
    }

    /* JADX INFO: renamed from: g */
    public final T[] m113175g() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new dyi0[4];
            this.a = tArr2;
            return tArr2;
        }
        if (m113172c() < tArr.length) {
            return tArr;
        }
        T[] tArr3 = (T[]) ((dyi0[]) Arrays.copyOf(tArr, m113172c() * 2));
        this.a = tArr3;
        return tArr3;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m113176h(@NotNull T node) {
        boolean z;
        synchronized (this) {
            if (node.mo95130a() == null) {
                z = false;
            } else {
                m113177i(node.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: i */
    public final T m113177i(int index) {
        T[] tArr = this.a;
        tArr.getClass();
        m113179k(m113172c() - 1);
        if (index < m113172c()) {
            m113182n(index, m113172c());
            int i = (index - 1) / 2;
            if (index > 0) {
                T t = tArr[index];
                t.getClass();
                T t2 = tArr[i];
                t2.getClass();
                if (((Comparable) t).compareTo(t2) < 0) {
                    m113182n(index, i);
                    m113181m(i);
                } else {
                    m113180l(index);
                }
            } else {
                m113180l(index);
            }
        }
        T t3 = tArr[m113172c()];
        t3.getClass();
        t3.mo95131f(null);
        t3.setIndex(-1);
        tArr[m113172c()] = null;
        return t3;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final T m113178j() {
        T t;
        synchronized (this) {
            t = m113172c() > 0 ? (T) m113177i(0) : null;
        }
        return t;
    }

    /* JADX INFO: renamed from: k */
    public final void m113179k(int i) {
        f84380b.set(this, i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX INFO: renamed from: l */
    public final void m113180l(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 >= m113172c()) {
                return;
            }
            T[] tArr = this.a;
            tArr.getClass();
            int i4 = i2 + 2;
            if (i4 < m113172c()) {
                T t = tArr[i4];
                t.getClass();
                T t2 = tArr[i3];
                t2.getClass();
                if (((Comparable) t).compareTo(t2) >= 0) {
                    i4 = i3;
                }
            } else {
                i4 = i3;
            }
            T t3 = tArr[i];
            t3.getClass();
            T t4 = tArr[i4];
            t4.getClass();
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m113182n(i, i4);
            i = i4;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m113181m(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            tArr.getClass();
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            t.getClass();
            T t2 = tArr[i];
            t2.getClass();
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m113182n(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m113182n(int i, int j) {
        T[] tArr = this.a;
        tArr.getClass();
        T t = tArr[j];
        t.getClass();
        T t2 = tArr[i];
        t2.getClass();
        tArr[i] = t;
        tArr[j] = t2;
        t.setIndex(i);
        t2.setIndex(j);
    }
}
