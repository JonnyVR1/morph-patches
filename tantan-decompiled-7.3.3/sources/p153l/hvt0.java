package p153l;

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
public final class hvt0 implements y6s0, k7u0, joy0, j7u0 {

    /* JADX INFO: renamed from: a */
    public final vut0 f111809a;

    /* JADX INFO: renamed from: b */
    public final wut0 f111810b;

    /* JADX INFO: renamed from: d */
    public final iws0 f111812d;

    /* JADX INFO: renamed from: e */
    public final Executor f111813e;

    /* JADX INFO: renamed from: f */
    public final Clock f111814f;

    /* JADX INFO: renamed from: c */
    public final Set f111811c = new HashSet();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f111815g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public final gvt0 f111816h = new gvt0();

    /* JADX INFO: renamed from: i */
    public boolean f111817i = false;

    /* JADX INFO: renamed from: j */
    public WeakReference f111818j = new WeakReference(this);

    public hvt0(fws0 fws0Var, wut0 wut0Var, Executor executor, vut0 vut0Var, Clock clock) {
        this.f111809a = vut0Var;
        ivs0 ivs0Var = lvs0.f133729b;
        this.f111812d = fws0Var.m127844a("google.afma.activeView.handleUpdate", ivs0Var, ivs0Var);
        this.f111810b = wut0Var;
        this.f111813e = executor;
        this.f111814f = clock;
    }

    /* JADX INFO: renamed from: u */
    private final void m137394u() {
        Iterator it = this.f111811c.iterator();
        while (it.hasNext()) {
            this.f111809a.m202896f((wit0) it.next());
        }
        this.f111809a.m202895e();
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: B */
    public final synchronized void mo107083B(@Nullable Context context) {
        this.f111816h.f106685e = "u";
        m137395b();
        m137394u();
        this.f111817i = true;
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: K */
    public final synchronized void mo107084K(@Nullable Context context) {
        this.f111816h.f106682b = true;
        m137395b();
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: M6 */
    public final synchronized void mo113753M6() {
        this.f111816h.f106682b = true;
        m137395b();
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: P */
    public final synchronized void mo107086P(@Nullable Context context) {
        this.f111816h.f106682b = false;
        m137395b();
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final synchronized void mo13723U(x6s0 x6s0Var) {
        gvt0 gvt0Var = this.f111816h;
        gvt0Var.f106681a = x6s0Var.f192630j;
        gvt0Var.f106686f = x6s0Var;
        m137395b();
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo106809a() {
        if (this.f111815g.compareAndSet(false, true)) {
            this.f111809a.m202893c(this);
            m137395b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m137395b() {
        try {
            if (this.f111818j.get() == null) {
                m137398q();
                return;
            }
            if (this.f111817i || !this.f111815g.get()) {
                return;
            }
            try {
                this.f111816h.f106684d = this.f111814f.elapsedRealtime();
                final JSONObject jSONObjectM207975a = this.f111810b.zzb(this.f111816h);
                for (final wit0 wit0Var : this.f111811c) {
                    this.f111813e.execute(new Runnable() { // from class: l.yut0
                        @Override // java.lang.Runnable
                        public final void run() {
                            wit0Var.mo13777z0("AFMA_updateActiveView", jSONObjectM207975a);
                        }
                    });
                }
                rct0.m180822b(this.f111812d.zzb(jSONObjectM207975a), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                d2v0.m113738l("Failed to call ActiveViewJS", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: g7 */
    public final synchronized void mo113765g7() {
        this.f111816h.f106682b = false;
        m137395b();
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m137396i(wit0 wit0Var) {
        this.f111811c.add(wit0Var);
        this.f111809a.m202894d(wit0Var);
    }

    /* JADX INFO: renamed from: k */
    public final void m137397k(Object obj) {
        this.f111818j = new WeakReference(obj);
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m137398q() {
        m137394u();
        this.f111817i = true;
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: O */
    public final void mo113754O() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: P2 */
    public final void mo113755P2() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m4 */
    public final void mo113768m4() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m5 */
    public final void mo113769m5(int i) {
    }
}
