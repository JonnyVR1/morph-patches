package p149l;

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

/* JADX INFO: loaded from: classes13.dex */
public final class alj0 {

    /* JADX INFO: renamed from: a */
    public final List<ckq> f70441a;

    /* JADX INFO: renamed from: b */
    public final List<e620> f70442b;

    /* JADX INFO: renamed from: c */
    public final Set<Class<? extends Throwable>> f70443c;

    /* JADX INFO: renamed from: d */
    public b2m f70444d;

    /* JADX INFO: renamed from: e */
    public b2m f70445e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f70446f;

    /* JADX INFO: renamed from: l.alj0$b */
    public static class C15651b {
        private static final alj0 INSTANCE = new alj0();
    }

    public alj0() {
        this.f70446f = new AtomicBoolean(false);
        this.f70441a = new CopyOnWriteArrayList();
        this.f70442b = new CopyOnWriteArrayList();
        this.f70443c = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m97289a(alj0 alj0Var, ckq ckqVar, Thread thread, Throwable th, boolean z, CountDownLatch countDownLatch) {
        alj0Var.getClass();
        try {
            alj0Var.f70446f.compareAndSet(false, ckqVar.mo107425a(thread, th, z));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m97290b(e620 e620Var, String str, String str2, boolean z, boolean z2, boolean z3, String str3, CountDownLatch countDownLatch) {
        try {
            e620Var.m114940a(str, str2, z, z2, z3, str3);
        } catch (Exception unused) {
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: d */
    public static alj0 m97291d() {
        return C15651b.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public boolean m97292c(Throwable th) {
        Iterator<Class<? extends Throwable>> it = this.f70443c.iterator();
        while (it.hasNext()) {
            if (ThrowableUtils.m81186a(th, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m97293e(final Thread thread, final Throwable th, final boolean z) {
        final CountDownLatch countDownLatch = new CountDownLatch(this.f70441a.size());
        this.f70446f.set(false);
        for (final ckq ckqVar : this.f70441a) {
            zoi0.m219564a(new Runnable() { // from class: l.zkj0
                @Override // java.lang.Runnable
                public final void run() {
                    alj0.m97289a(this.f203546a, ckqVar, thread, th, z, countDownLatch);
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.f70446f.get()) {
            return true;
        }
        if (!z || !m97300l(th)) {
            return false;
        }
        m97299k(thread, th, true);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m97294f(final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final String str3) {
        final CountDownLatch countDownLatch = new CountDownLatch(this.f70442b.size());
        for (final e620 e620Var : this.f70442b) {
            zoi0.m219564a(new Runnable() { // from class: l.ykj0
                @Override // java.lang.Runnable
                public final void run() {
                    alj0.m97290b(e620Var, str, str2, z, z2, z3, str3, countDownLatch);
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b2m b2mVar = this.f70445e;
        if (b2mVar != null) {
            b2mVar.mo81167b(str, str2, z, z2, z3, str3);
        }
        m97300l(new NativeException("native exception!"));
    }

    /* JADX INFO: renamed from: g */
    public void m97295g(@NonNull ckq ckqVar) {
        this.f70441a.add(ckqVar);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: h */
    public final void m97296h(Class<? extends Throwable>... clsArr) {
        if (clsArr == null || clsArr.length <= 0) {
            return;
        }
        this.f70443c.addAll(Arrays.asList(clsArr));
    }

    /* JADX INFO: renamed from: i */
    public void m97297i(@NonNull b2m b2mVar) {
        this.f70444d = b2mVar;
    }

    /* JADX INFO: renamed from: j */
    public void m97298j(@NonNull b2m b2mVar) {
        this.f70445e = b2mVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m97299k(Thread thread, Throwable th, boolean z) {
        b2m b2mVar = this.f70444d;
        if (b2mVar != null) {
            b2mVar.mo99972a(thread, th, z);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m97300l(Throwable th) {
        try {
            q2m q2mVarM160822m = nt2.m160822m();
            if (q2mVarM160822m != null) {
                return q2mVarM160822m.mo155670c(th);
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
