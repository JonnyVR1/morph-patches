package p153l;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class kyt0 extends uwt0 {

    /* JADX INFO: renamed from: j */
    public final ins0 f129354j;

    /* JADX INFO: renamed from: k */
    public final Runnable f129355k;

    /* JADX INFO: renamed from: l */
    public final Executor f129356l;

    public kyt0(jzt0 jzt0Var, ins0 ins0Var, Runnable runnable, Executor executor) {
        super(jzt0Var);
        this.f129354j = ins0Var;
        this.f129355k = runnable;
        this.f129356l = executor;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m152132p(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p153l.kzt0
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void mo140700c() {
        final iyt0 iyt0Var = new iyt0(new AtomicReference(this.f129355k));
        this.f129356l.execute(new Runnable() { // from class: l.jyt0
            @Override // java.lang.Runnable
            public final void run() {
                this.f123199a.m152140q(iyt0Var);
            }
        });
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: i */
    public final int mo152133i() {
        return 0;
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: j */
    public final View mo152134j() {
        return null;
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: k */
    public final lpu0 mo152135k() {
        return null;
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: l */
    public final r6w0 mo152136l() {
        return null;
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: m */
    public final r6w0 mo152137m() {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m152140q(Runnable runnable) {
        try {
            if (this.f129354j.zze(h950.m134038Y2(runnable))) {
                return;
            }
            m152132p(((iyt0) runnable).f117636a);
        } catch (RemoteException unused) {
            m152132p(((iyt0) runnable).f117636a);
        }
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: n */
    public final void mo152138n() {
    }

    @Override // p153l.uwt0
    /* JADX INFO: renamed from: o */
    public final void mo152139o(ViewGroup viewGroup, zzq zzqVar) {
    }
}
