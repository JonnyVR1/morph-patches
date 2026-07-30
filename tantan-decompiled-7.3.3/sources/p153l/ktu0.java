package p153l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class ktu0 {

    /* JADX INFO: renamed from: a */
    public final g6u0 f128736a;

    /* JADX INFO: renamed from: b */
    public final egu0 f128737b;

    /* JADX INFO: renamed from: c */
    public final d8u0 f128738c;

    /* JADX INFO: renamed from: d */
    public final q8u0 f128739d;

    /* JADX INFO: renamed from: e */
    public final i9u0 f128740e;

    /* JADX INFO: renamed from: f */
    public final jcu0 f128741f;

    /* JADX INFO: renamed from: g */
    public final Executor f128742g;

    /* JADX INFO: renamed from: h */
    public final agu0 f128743h;

    /* JADX INFO: renamed from: i */
    public final hvt0 f128744i;

    /* JADX INFO: renamed from: j */
    public final w9s0 f128745j;

    /* JADX INFO: renamed from: k */
    public final w8t0 f128746k;

    /* JADX INFO: renamed from: l */
    public final v2s0 f128747l;

    /* JADX INFO: renamed from: m */
    public final acu0 f128748m;

    /* JADX INFO: renamed from: n */
    public final fbv0 f128749n;

    /* JADX INFO: renamed from: o */
    public final yew0 f128750o;

    /* JADX INFO: renamed from: p */
    public final xwu0 f128751p;

    /* JADX INFO: renamed from: q */
    public final vcw0 f128752q;

    /* JADX INFO: renamed from: r */
    public final dut0 f128753r;

    /* JADX INFO: renamed from: s */
    public final ptu0 f128754s;

    public ktu0(g6u0 g6u0Var, d8u0 d8u0Var, q8u0 q8u0Var, i9u0 i9u0Var, jcu0 jcu0Var, Executor executor, agu0 agu0Var, hvt0 hvt0Var, w9s0 w9s0Var, @Nullable w8t0 w8t0Var, v2s0 v2s0Var, acu0 acu0Var, fbv0 fbv0Var, yew0 yew0Var, xwu0 xwu0Var, vcw0 vcw0Var, egu0 egu0Var, dut0 dut0Var, ptu0 ptu0Var) {
        this.f128736a = g6u0Var;
        this.f128738c = d8u0Var;
        this.f128739d = q8u0Var;
        this.f128740e = i9u0Var;
        this.f128741f = jcu0Var;
        this.f128742g = executor;
        this.f128743h = agu0Var;
        this.f128744i = hvt0Var;
        this.f128745j = w9s0Var;
        this.f128746k = w8t0Var;
        this.f128747l = v2s0Var;
        this.f128748m = acu0Var;
        this.f128749n = fbv0Var;
        this.f128750o = yew0Var;
        this.f128751p = xwu0Var;
        this.f128752q = vcw0Var;
        this.f128737b = egu0Var;
        this.f128753r = dut0Var;
        this.f128754s = ptu0Var;
    }

    /* JADX INFO: renamed from: j */
    public static final hpr m151401j(wit0 wit0Var, String str, String str2) {
        final tct0 tct0Var = new tct0();
        wit0Var.zzN().zzB(new lkt0() { // from class: l.btu0
            @Override // p153l.lkt0
            /* JADX INFO: renamed from: a */
            public final void mo99557a(boolean z, int i, String str3, String str4) {
                tct0 tct0Var2 = tct0Var;
                if (z) {
                    tct0Var2.m190494b(null);
                    return;
                }
                tct0Var2.m190495c(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        wit0Var.mo13773x0(str, str2, null);
        return tct0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m151402c() {
        this.f128736a.onAdClicked();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m151403d(String str, String str2) {
        this.f128741f.mo99223b(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m151404e() {
        this.f128738c.zzb();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m151405f(View view) {
        this.f128745j.m205625a();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m151406g(wit0 wit0Var, wit0 wit0Var2, Map map) {
        this.f128744i.m137396i(wit0Var);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean m151407h(View view, MotionEvent motionEvent) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168057L9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f128754s.m173782b(motionEvent);
        }
        this.f128745j.m205625a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m151408i(final wit0 wit0Var, boolean z, dqs0 dqs0Var) {
        nkt0 nkt0VarZzN = wit0Var.zzN();
        har0 har0Var = new har0() { // from class: l.ctu0
            @Override // p153l.har0
            public final void onAdClicked() {
                this.f83763a.m151402c();
            }
        };
        aos0 aos0Var = new aos0() { // from class: l.dtu0
            @Override // p153l.aos0
            /* JADX INFO: renamed from: b */
            public final void mo99223b(String str, String str2) {
                this.f90629a.m151403d(str, str2);
            }
        };
        rar0 rar0Var = new rar0() { // from class: l.etu0
            @Override // p153l.rar0
            public final void zzg() {
                this.f95817a.m151404e();
            }
        };
        jtu0 jtu0Var = new jtu0(this);
        w8t0 w8t0Var = this.f128746k;
        fbv0 fbv0Var = this.f128749n;
        yew0 yew0Var = this.f128750o;
        xwu0 xwu0Var = this.f128751p;
        nkt0VarZzN.zzN(har0Var, this.f128739d, this.f128740e, aos0Var, rar0Var, z, dqs0Var, this.f128745j, jtu0Var, w8t0Var, fbv0Var, yew0Var, xwu0Var, this.f128752q, null, this.f128737b, null, null, this.f128753r);
        wit0Var.setOnTouchListener(new View.OnTouchListener() { // from class: l.ftu0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f100809a.m151407h(view, motionEvent);
                return false;
            }
        });
        wit0Var.setOnClickListener(new View.OnClickListener() { // from class: l.gtu0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106450a.m151405f(view);
            }
        });
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168500v2)).booleanValue()) {
            this.f128747l.m199147c().mo165758e((View) wit0Var);
        }
        this.f128743h.m149283q0(wit0Var, this.f128742g);
        this.f128743h.m149283q0(new y6s0() { // from class: l.htu0
            @Override // p153l.y6s0
            /* JADX INFO: renamed from: U */
            public final void mo13723U(x6s0 x6s0Var) {
                nkt0 nkt0VarZzN2 = wit0Var.zzN();
                Rect rect = x6s0Var.f192624d;
                nkt0VarZzN2.zzq(rect.left, rect.top, false);
            }
        }, this.f128742g);
        this.f128743h.m97733w0((View) wit0Var);
        wit0Var.mo13747j0("/trackActiveViewUnit", new bqs0() { // from class: l.itu0
            @Override // p153l.bqs0
            /* JADX INFO: renamed from: a */
            public final void mo12917a(Object obj, Map map) {
                this.f116874a.m151406g(wit0Var, (wit0) obj, map);
            }
        });
        this.f128744i.m137397k(wit0Var);
    }
}
