package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.beatles.safety.exception.NativeException;
import com.tantanapp.beatles.safety.utils.ThrowableUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class duj0 {

    /* JADX INFO: renamed from: a */
    public final List<bmq> f90804a;

    /* JADX INFO: renamed from: b */
    public final List<me20> f90805b;

    /* JADX INFO: renamed from: c */
    public final Set<Class<? extends Throwable>> f90806c;

    /* JADX INFO: renamed from: d */
    public u4m f90807d;

    /* JADX INFO: renamed from: e */
    public u4m f90808e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f90809f;

    /* JADX INFO: renamed from: l.duj0$b */
    public static class C16632b {
        private static final duj0 INSTANCE = new duj0();
    }

    public duj0() {
        this.f90809f = new AtomicBoolean(false);
        this.f90804a = new CopyOnWriteArrayList();
        this.f90805b = new CopyOnWriteArrayList();
        this.f90806c = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m118147a(duj0 duj0Var, bmq bmqVar, Thread thread, Throwable th, boolean z, CountDownLatch countDownLatch) {
        duj0Var.getClass();
        try {
            duj0Var.f90809f.compareAndSet(false, bmqVar.mo105250a(thread, th, z));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m118148b(me20 me20Var, String str, String str2, boolean z, boolean z2, boolean z3, String str3, CountDownLatch countDownLatch) {
        try {
            me20Var.m158012a(str, str2, z, z2, z3, str3);
        } catch (Exception unused) {
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: d */
    public static duj0 m118149d() {
        return C16632b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public boolean m118150c(Throwable th) {
        Iterator<Class<? extends Throwable>> it = this.f90806c.iterator();
        while (it.hasNext()) {
            if (ThrowableUtils.m82369a(th, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m118151e(final Thread thread, final Throwable th, final boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(this.f90804a.size());
        this.f90809f.set(false);
        for (final bmq bmqVar : this.f90804a) {
            byi0.m107021a(new Runnable() { // from class: l.cuj0
                @Override // java.lang.Runnable
                public final void run() {
                    duj0.m118147a(this.f83846a, bmqVar, thread, th, z, countDownLatch);
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.f90809f.get()) {
            return true;
        }
        if (!z || !m118158l(th)) {
            return false;
        }
        m118157k(thread, th, true);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m118152f(final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final String str3) {
        final CountDownLatch countDownLatch = new CountDownLatch(this.f90805b.size());
        for (final me20 me20Var : this.f90805b) {
            byi0.m107021a(new Runnable() { // from class: l.buj0
                @Override // java.lang.Runnable
                public final void run() {
                    duj0.m118148b(me20Var, str, str2, z, z2, z3, str3, countDownLatch);
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        u4m u4mVar = this.f90808e;
        if (u4mVar != null) {
            u4mVar.mo82350b(str, str2, z, z2, z3, str3);
        }
        m118158l(new NativeException("native exception!"));
    }

    /* JADX INFO: renamed from: g */
    public void m118153g(@NonNull bmq bmqVar) {
        this.f90804a.add(bmqVar);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: h */
    public final void m118154h(Class<? extends Throwable>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        this.f90806c.addAll(Arrays.asList(clsArr));
    }

    /* JADX INFO: renamed from: i */
    public void m118155i(@NonNull u4m u4mVar) {
        this.f90807d = u4mVar;
    }

    /* JADX INFO: renamed from: j */
    public void m118156j(@NonNull u4m u4mVar) {
        this.f90808e = u4mVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m118157k(Thread thread, Throwable th, boolean z) {
        u4m u4mVar = this.f90807d;
        if (u4mVar != null) {
            u4mVar.mo194493a(thread, th, z);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m118158l(Throwable th) {
        try {
            j5m j5mVarM118053m = du2.m118053m();
            if (j5mVarM118053m != null) {
                return j5mVarM118053m.mo143545c(th);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
