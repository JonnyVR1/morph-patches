package p149l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class eku0 {

    /* JADX INFO: renamed from: a */
    public final axt0 f92015a;

    /* JADX INFO: renamed from: b */
    public final y6u0 f92016b;

    /* JADX INFO: renamed from: c */
    public final xyt0 f92017c;

    /* JADX INFO: renamed from: d */
    public final kzt0 f92018d;

    /* JADX INFO: renamed from: e */
    public final c0u0 f92019e;

    /* JADX INFO: renamed from: f */
    public final d3u0 f92020f;

    /* JADX INFO: renamed from: g */
    public final Executor f92021g;

    /* JADX INFO: renamed from: h */
    public final u6u0 f92022h;

    /* JADX INFO: renamed from: i */
    public final bmt0 f92023i;

    /* JADX INFO: renamed from: j */
    public final q0s0 f92024j;

    /* JADX INFO: renamed from: k */
    public final qzs0 f92025k;

    /* JADX INFO: renamed from: l */
    public final ptr0 f92026l;

    /* JADX INFO: renamed from: m */
    public final u2u0 f92027m;

    /* JADX INFO: renamed from: n */
    public final z1v0 f92028n;

    /* JADX INFO: renamed from: o */
    public final s5w0 f92029o;

    /* JADX INFO: renamed from: p */
    public final rnu0 f92030p;

    /* JADX INFO: renamed from: q */
    public final p3w0 f92031q;

    /* JADX INFO: renamed from: r */
    public final xkt0 f92032r;

    /* JADX INFO: renamed from: s */
    public final jku0 f92033s;

    public eku0(axt0 axt0Var, xyt0 xyt0Var, kzt0 kzt0Var, c0u0 c0u0Var, d3u0 d3u0Var, Executor executor, u6u0 u6u0Var, bmt0 bmt0Var, q0s0 q0s0Var, @Nullable qzs0 qzs0Var, ptr0 ptr0Var, u2u0 u2u0Var, z1v0 z1v0Var, s5w0 s5w0Var, rnu0 rnu0Var, p3w0 p3w0Var, y6u0 y6u0Var, xkt0 xkt0Var, jku0 jku0Var) {
        this.f92015a = axt0Var;
        this.f92017c = xyt0Var;
        this.f92018d = kzt0Var;
        this.f92019e = c0u0Var;
        this.f92020f = d3u0Var;
        this.f92021g = executor;
        this.f92022h = u6u0Var;
        this.f92023i = bmt0Var;
        this.f92024j = q0s0Var;
        this.f92025k = qzs0Var;
        this.f92026l = ptr0Var;
        this.f92027m = u2u0Var;
        this.f92028n = z1v0Var;
        this.f92029o = s5w0Var;
        this.f92030p = rnu0Var;
        this.f92031q = p3w0Var;
        this.f92016b = y6u0Var;
        this.f92032r = xkt0Var;
        this.f92033s = jku0Var;
    }

    /* JADX INFO: renamed from: j */
    public static final gnr m116996j(q9t0 q9t0Var, String str, String str2) {
        final n3t0 n3t0Var = new n3t0();
        q9t0Var.zzN().zzB(new fbt0() { // from class: l.vju0
            @Override // p149l.fbt0
            /* JADX INFO: renamed from: a */
            public final void mo96131a(boolean z, int i, String str3, String str4) {
                n3t0 n3t0Var2 = n3t0Var;
                if (z) {
                    n3t0Var2.m157774b(null);
                    return;
                }
                n3t0Var2.m157775c(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        q9t0Var.mo13719x0(str, str2, null);
        return n3t0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m116997c() {
        this.f92015a.onAdClicked();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m116998d(String str, String str2) {
        this.f92020f.mo109944b(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m116999e() {
        this.f92017c.zzb();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m117000f(View view) {
        this.f92024j.m172356a();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m117001g(q9t0 q9t0Var, q9t0 q9t0Var2, Map map) {
        this.f92023i.m102684i(q9t0Var);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean m117002h(View view, MotionEvent motionEvent) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131986L9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f92033s.m141915b(motionEvent);
        }
        this.f92024j.m172356a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m117003i(final q9t0 q9t0Var, boolean z, xgs0 xgs0Var) {
        hbt0 hbt0VarZzN = q9t0Var.zzN();
        b1r0 b1r0Var = new b1r0() { // from class: l.wju0
            @Override // p149l.b1r0
            public final void onAdClicked() {
                this.f186685a.m116997c();
            }
        };
        ues0 ues0Var = new ues0() { // from class: l.xju0
            @Override // p149l.ues0
            /* JADX INFO: renamed from: b */
            public final void mo109944b(String str, String str2) {
                this.f193247a.m116998d(str, str2);
            }
        };
        l1r0 l1r0Var = new l1r0() { // from class: l.yju0
            @Override // p149l.l1r0
            public final void zzg() {
                this.f198691a.m116999e();
            }
        };
        dku0 dku0Var = new dku0(this);
        qzs0 qzs0Var = this.f92025k;
        z1v0 z1v0Var = this.f92028n;
        s5w0 s5w0Var = this.f92029o;
        rnu0 rnu0Var = this.f92030p;
        hbt0VarZzN.zzN(b1r0Var, this.f92018d, this.f92019e, ues0Var, l1r0Var, z, xgs0Var, this.f92024j, dku0Var, qzs0Var, z1v0Var, s5w0Var, rnu0Var, this.f92031q, null, this.f92016b, null, null, this.f92032r);
        q9t0Var.setOnTouchListener(new View.OnTouchListener() { // from class: l.zju0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f203480a.m117002h(view, motionEvent);
                return false;
            }
        });
        q9t0Var.setOnClickListener(new View.OnClickListener() { // from class: l.aku0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70320a.m117000f(view);
            }
        });
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132429v2)).booleanValue()) {
            this.f92026l.m171378c().mo136908e((View) q9t0Var);
        }
        this.f92022h.m114710q0(q9t0Var, this.f92021g);
        this.f92022h.m114710q0(new sxr0() { // from class: l.bku0
            @Override // p149l.sxr0
            /* JADX INFO: renamed from: U */
            public final void mo13669U(rxr0 rxr0Var) {
                hbt0 hbt0VarZzN2 = q9t0Var.zzN();
                Rect rect = rxr0Var.f161498d;
                hbt0VarZzN2.zzq(rect.left, rect.top, false);
            }
        }, this.f92021g);
        this.f92022h.m192029w0((View) q9t0Var);
        q9t0Var.mo13693j0("/trackActiveViewUnit", new vgs0() { // from class: l.cku0
            @Override // p149l.vgs0
            /* JADX INFO: renamed from: a */
            public final void mo12863a(Object obj, Map map) {
                this.f81355a.m117001g(q9t0Var, (q9t0) obj, map);
            }
        });
        this.f92023i.m102685k(q9t0Var);
    }
}
