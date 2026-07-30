package p149l;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ept0 extends ont0 {

    /* JADX INFO: renamed from: j */
    public final ces0 f92711j;

    /* JADX INFO: renamed from: k */
    public final Runnable f92712k;

    /* JADX INFO: renamed from: l */
    public final Executor f92713l;

    public ept0(dqt0 dqt0Var, ces0 ces0Var, Runnable runnable, Executor executor) {
        super(dqt0Var);
        this.f92711j = ces0Var;
        this.f92712k = runnable;
        this.f92713l = executor;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m117676p(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p149l.eqt0
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void mo106179c() {
        final cpt0 cpt0Var = new cpt0(new AtomicReference(this.f92712k));
        this.f92713l.execute(new Runnable() { // from class: l.dpt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87321a.m117684q(cpt0Var);
            }
        });
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: i */
    public final int mo117677i() {
        return 0;
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: j */
    public final View mo117678j() {
        return null;
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: k */
    public final fgu0 mo117679k() {
        return null;
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: l */
    public final lxv0 mo117680l() {
        return null;
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: m */
    public final lxv0 mo117681m() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m117684q(Runnable runnable) {
        try {
            if (this.f92711j.zze(s050.m181848Y2(runnable))) {
                return;
            }
            m117676p(((cpt0) runnable).f81996a);
        } catch (RemoteException unused) {
            m117676p(((cpt0) runnable).f81996a);
        }
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: n */
    public final void mo117682n() {
    }

    @Override // p149l.ont0
    /* JADX INFO: renamed from: o */
    public final void mo117683o(ViewGroup viewGroup, zzq zzqVar) {
    }
}
