package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bmt0 implements sxr0, eyt0, dfy0, dyt0 {

    /* JADX INFO: renamed from: a */
    public final plt0 f76319a;

    /* JADX INFO: renamed from: b */
    public final qlt0 f76320b;

    /* JADX INFO: renamed from: d */
    public final cns0 f76322d;

    /* JADX INFO: renamed from: e */
    public final Executor f76323e;

    /* JADX INFO: renamed from: f */
    public final Clock f76324f;

    /* JADX INFO: renamed from: c */
    public final Set f76321c = new HashSet();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f76325g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public final amt0 f76326h = new amt0();

    /* JADX INFO: renamed from: i */
    public boolean f76327i = false;

    /* JADX INFO: renamed from: j */
    public WeakReference f76328j = new WeakReference(this);

    public bmt0(zms0 zms0Var, qlt0 qlt0Var, Executor executor, plt0 plt0Var, Clock clock) {
        this.f76319a = plt0Var;
        cms0 cms0Var = fms0.f98370b;
        this.f76322d = zms0Var.m219369a("google.afma.activeView.handleUpdate", cms0Var, cms0Var);
        this.f76320b = qlt0Var;
        this.f76323e = executor;
        this.f76324f = clock;
    }

    /* JADX INFO: renamed from: u */
    private final void m102675u() {
        Iterator it = this.f76321c.iterator();
        while (it.hasNext()) {
            this.f76319a.m170290f((q9t0) it.next());
        }
        this.f76319a.m170289e();
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: B */
    public final synchronized void mo102676B(@Nullable Context context) {
        this.f76326h.f70682e = "u";
        m102682b();
        m102675u();
        this.f76327i = true;
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: K */
    public final synchronized void mo102677K(@Nullable Context context) {
        this.f76326h.f70679b = true;
        m102682b();
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: M6 */
    public final synchronized void mo102678M6() {
        this.f76326h.f70679b = true;
        m102682b();
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: P */
    public final synchronized void mo102680P(@Nullable Context context) {
        this.f76326h.f70679b = false;
        m102682b();
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final synchronized void mo13669U(rxr0 rxr0Var) {
        amt0 amt0Var = this.f76326h;
        amt0Var.f70678a = rxr0Var.f161504j;
        amt0Var.f70683f = rxr0Var;
        m102682b();
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo95459a() {
        if (this.f76325g.compareAndSet(false, true)) {
            this.f76319a.m170287c(this);
            m102682b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m102682b() {
        try {
            if (this.f76328j.get() == null) {
                m102688q();
                return;
            }
            if (this.f76327i || !this.f76325g.get()) {
                return;
            }
            try {
                this.f76326h.f70681d = this.f76324f.elapsedRealtime();
                final JSONObject jSONObjectM175503a = this.f76320b.zzb(this.f76326h);
                for (final q9t0 q9t0Var : this.f76321c) {
                    this.f76323e.execute(new Runnable() { // from class: l.slt0
                        @Override // java.lang.Runnable
                        public final void run() {
                            q9t0Var.mo13723z0("AFMA_updateActiveView", jSONObjectM175503a);
                        }
                    });
                }
                l3t0.m148408b(this.f76322d.zzb(jSONObjectM175503a), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                xsu0.m210835l("Failed to call ActiveViewJS", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: g7 */
    public final synchronized void mo102683g7() {
        this.f76326h.f70679b = false;
        m102682b();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m102684i(q9t0 q9t0Var) {
        this.f76321c.add(q9t0Var);
        this.f76319a.m170288d(q9t0Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m102685k(Object obj) {
        this.f76328j = new WeakReference(obj);
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m102688q() {
        m102675u();
        this.f76327i = true;
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: O */
    public final void mo102679O() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: P2 */
    public final void mo102681P2() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m4 */
    public final void mo102686m4() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m5 */
    public final void mo102687m5(int i) {
    }
}
