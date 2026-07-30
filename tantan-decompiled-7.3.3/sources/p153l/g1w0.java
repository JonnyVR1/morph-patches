package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public final class g1w0 {

    /* JADX INFO: renamed from: a */
    public final mfv0 f101784a;

    /* JADX INFO: renamed from: b */
    public final usv0 f101785b;

    /* JADX INFO: renamed from: c */
    public final zyv0 f101786c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f101787d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f101788e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f101789f;

    /* JADX INFO: renamed from: g */
    public final Object f101790g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("releasedLock")
    public boolean f101791h;

    /* JADX INFO: renamed from: i */
    public boolean f101792i;

    public g1w0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, mfv0 mfv0Var, zyv0 zyv0Var, boolean z) {
        this.f101784a = mfv0Var;
        this.f101787d = copyOnWriteArraySet;
        this.f101786c = zyv0Var;
        this.f101790g = new Object();
        this.f101788e = new ArrayDeque();
        this.f101789f = new ArrayDeque();
        this.f101785b = mfv0Var.mo135184a(looper, new Handler.Callback() { // from class: l.auv0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                g1w0.m128563g(this.f73552a, message);
                return true;
            }
        });
        this.f101792i = z;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m128563g(g1w0 g1w0Var, Message message) {
        Iterator it = g1w0Var.f101787d.iterator();
        while (it.hasNext()) {
            ((a0w0) it.next()).m95431b(g1w0Var.f101786c);
            if (g1w0Var.f101785b.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final g1w0 m128564a(Looper looper, zyv0 zyv0Var) {
        return new g1w0(this.f101787d, looper, this.f101784a, zyv0Var, this.f101792i);
    }

    /* JADX INFO: renamed from: b */
    public final void m128565b(Object obj) {
        synchronized (this.f101790g) {
            try {
                if (this.f101791h) {
                    return;
                }
                this.f101787d.add(new a0w0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m128566c() {
        m128570h();
        if (this.f101789f.isEmpty()) {
            return;
        }
        if (!this.f101785b.zzg(0)) {
            usv0 usv0Var = this.f101785b;
            usv0Var.mo121302f(usv0Var.mo121301e(0));
        }
        boolean zIsEmpty = this.f101788e.isEmpty();
        this.f101788e.addAll(this.f101789f);
        this.f101789f.clear();
        if (zIsEmpty) {
            while (!this.f101788e.isEmpty()) {
                ((Runnable) this.f101788e.peekFirst()).run();
                this.f101788e.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m128567d(final int i, final mwv0 mwv0Var) {
        m128570h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f101787d);
        this.f101789f.add(new Runnable() { // from class: l.gvv0
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    mwv0 mwv0Var2 = mwv0Var;
                    ((a0w0) it.next()).m95430a(i, mwv0Var2);
                }
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m128568e() {
        m128570h();
        synchronized (this.f101790g) {
            this.f101791h = true;
        }
        Iterator it = this.f101787d.iterator();
        while (it.hasNext()) {
            ((a0w0) it.next()).m95432c(this.f101786c);
        }
        this.f101787d.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m128569f(Object obj) {
        m128570h();
        for (a0w0 a0w0Var : this.f101787d) {
            if (a0w0Var.f67760a.equals(obj)) {
                a0w0Var.m95432c(this.f101786c);
                this.f101787d.remove(a0w0Var);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m128570h() {
        if (this.f101792i) {
            lev0.m153958f(Thread.currentThread() == this.f101785b.zza().getThread());
        }
    }

    public g1w0(Looper looper, mfv0 mfv0Var, zyv0 zyv0Var) {
        this(new CopyOnWriteArraySet(), looper, mfv0Var, zyv0Var, true);
    }
}
