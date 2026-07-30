package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public final class asv0 {

    /* JADX INFO: renamed from: a */
    public final g6v0 f71490a;

    /* JADX INFO: renamed from: b */
    public final ojv0 f71491b;

    /* JADX INFO: renamed from: c */
    public final tpv0 f71492c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet f71493d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f71494e;

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f71495f;

    /* JADX INFO: renamed from: g */
    public final Object f71496g;

    /* JADX INFO: renamed from: h */
    @GuardedBy("releasedLock")
    public boolean f71497h;

    /* JADX INFO: renamed from: i */
    public boolean f71498i;

    public asv0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, g6v0 g6v0Var, tpv0 tpv0Var, boolean z) {
        this.f71490a = g6v0Var;
        this.f71493d = copyOnWriteArraySet;
        this.f71492c = tpv0Var;
        this.f71496g = new Object();
        this.f71494e = new ArrayDeque();
        this.f71495f = new ArrayDeque();
        this.f71491b = g6v0Var.mo100826a(looper, new Handler.Callback() { // from class: l.ukv0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                asv0.m98623g(this.f176968a, message);
                return true;
            }
        });
        this.f71498i = z;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ boolean m98623g(asv0 asv0Var, Message message) {
        Iterator it = asv0Var.f71493d.iterator();
        while (it.hasNext()) {
            ((uqv0) it.next()).m195018b(asv0Var.f71492c);
            if (asv0Var.f71491b.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final asv0 m98624a(Looper looper, tpv0 tpv0Var) {
        return new asv0(this.f71493d, looper, this.f71490a, tpv0Var, this.f71498i);
    }

    /* JADX INFO: renamed from: b */
    public final void m98625b(Object obj) {
        synchronized (this.f71496g) {
            try {
                if (this.f71497h) {
                    return;
                }
                this.f71493d.add(new uqv0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m98626c() {
        m98630h();
        if (this.f71495f.isEmpty()) {
            return;
        }
        if (!this.f71491b.zzg(0)) {
            ojv0 ojv0Var = this.f71491b;
            ojv0Var.mo164791f(ojv0Var.mo164790e(0));
        }
        boolean zIsEmpty = this.f71494e.isEmpty();
        this.f71494e.addAll(this.f71495f);
        this.f71495f.clear();
        if (zIsEmpty) {
            while (!this.f71494e.isEmpty()) {
                ((Runnable) this.f71494e.peekFirst()).run();
                this.f71494e.removeFirst();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m98627d(final int i, final gnv0 gnv0Var) {
        m98630h();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f71493d);
        this.f71495f.add(new Runnable() { // from class: l.amv0
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    gnv0 gnv0Var2 = gnv0Var;
                    ((uqv0) it.next()).m195017a(i, gnv0Var2);
                }
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m98628e() {
        m98630h();
        synchronized (this.f71496g) {
            this.f71497h = true;
        }
        Iterator it = this.f71493d.iterator();
        while (it.hasNext()) {
            ((uqv0) it.next()).m195019c(this.f71492c);
        }
        this.f71493d.clear();
    }

    /* JADX INFO: renamed from: f */
    public final void m98629f(Object obj) {
        m98630h();
        for (uqv0 uqv0Var : this.f71493d) {
            if (uqv0Var.f177784a.equals(obj)) {
                uqv0Var.m195019c(this.f71492c);
                this.f71493d.remove(uqv0Var);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m98630h() {
        if (this.f71498i) {
            f5v0.m119535f(Thread.currentThread() == this.f71491b.zza().getThread());
        }
    }

    public asv0(Looper looper, g6v0 g6v0Var, tpv0 tpv0Var) {
        this(new CopyOnWriteArraySet(), looper, g6v0Var, tpv0Var, true);
    }
}
