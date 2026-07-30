package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.age.AgeVerificationAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.cwf0;
import l.e30;
import l.i0e;
import l.j760;
import l.s7m;
import l.v9j;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tc0 implements s7m<dc0> {

    /* JADX INFO: renamed from: A */
    public List<cwf0> f22002A = new ArrayList();

    /* JADX INFO: renamed from: B */
    public e30<String> f22003B = new e30() { // from class: l.ic0
        public final void call(Object obj) {
            this.f14352a.m24647S((String) obj);
        }
    };

    /* JADX INFO: renamed from: C */
    public View.OnClickListener f22004C = new View.OnClickListener() { // from class: l.kc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f15690a.m24619T(view);
        }
    };

    /* JADX INFO: renamed from: D */
    public View.OnClickListener f22005D = new View.OnClickListener() { // from class: l.lc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f16320a.m24650W(view);
        }
    };

    /* JADX INFO: renamed from: E */
    public View.OnClickListener f22006E = new View.OnClickListener() { // from class: l.mc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f16894a.m24620X(view);
        }
    };

    /* JADX INFO: renamed from: F */
    public View.OnClickListener f22007F = new View.OnClickListener() { // from class: l.nc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f17584a.m24651Y(view);
        }
    };

    /* JADX INFO: renamed from: a */
    public VLinear f22008a;

    /* JADX INFO: renamed from: b */
    public VLinear f22009b;

    /* JADX INFO: renamed from: c */
    public VFrame f22010c;

    /* JADX INFO: renamed from: d */
    public VFrame f22011d;

    /* JADX INFO: renamed from: e */
    public VFrame f22012e;

    /* JADX INFO: renamed from: f */
    public VLinear f22013f;

    /* JADX INFO: renamed from: g */
    public VText f22014g;

    /* JADX INFO: renamed from: h */
    public VText f22015h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f22016i;

    /* JADX INFO: renamed from: j */
    public VImage f22017j;

    /* JADX INFO: renamed from: k */
    public VText f22018k;

    /* JADX INFO: renamed from: l */
    public VButton f22019l;

    /* JADX INFO: renamed from: m */
    public VText f22020m;

    /* JADX INFO: renamed from: n */
    public ViewStub f22021n;

    /* JADX INFO: renamed from: o */
    public VText f22022o;

    /* JADX INFO: renamed from: p */
    public VText f22023p;

    /* JADX INFO: renamed from: q */
    public VText f22024q;

    /* JADX INFO: renamed from: r */
    public VLinear f22025r;

    /* JADX INFO: renamed from: s */
    public VFrame f22026s;

    /* JADX INFO: renamed from: t */
    public VButton f22027t;

    /* JADX INFO: renamed from: u */
    public dc0 f22028u;

    /* JADX INFO: renamed from: v */
    public AgeVerificationAct f22029v;

    /* JADX INFO: renamed from: w */
    public cwf0 f22030w;

    /* JADX INFO: renamed from: x */
    public cwf0 f22031x;

    /* JADX INFO: renamed from: y */
    public cwf0 f22032y;

    /* JADX INFO: renamed from: z */
    public cwf0 f22033z;

    /* JADX INFO: renamed from: l.tc0$a */
    public static class C1302a {
        /* JADX INFO: renamed from: b */
        public static void m24661b(tc0 tc0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            tc0Var.f22008a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            tc0Var.f22009b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            tc0Var.f22010c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
            tc0Var.f22011d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
            tc0Var.f22012e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
            tc0Var.f22013f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            tc0Var.f22014g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            tc0Var.f22015h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            tc0Var.f22016i = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            tc0Var.f22017j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            tc0Var.f22018k = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(2);
            tc0Var.f22019l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(3);
            tc0Var.f22020m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
            tc0Var.f22021n = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
            tc0Var.f22022o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5);
            tc0Var.f22023p = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6);
            tc0Var.f22024q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7);
            tc0Var.f22025r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            tc0Var.f22026s = viewGroup.getChildAt(1);
            tc0Var.f22027t = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m24662c(tc0 tc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f12298lf, viewGroup, false);
            m24661b(tc0Var, viewInflate);
            return viewInflate;
        }
    }

    public tc0(AgeVerificationAct ageVerificationAct) {
        this.f22029v = ageVerificationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m24616P(View view) {
        this.f22003B.call("insuranceCard");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m24617Q(View view) {
        this.f22003B.call("drivingLicense");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m24618R(View view) {
        this.f22003B.call("passport");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m24619T(View view) {
        CoreDlg.b2((AgeVerificationAct) act());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m24620X(View view) {
        zvf0.r("e_age_verify_submit_button", "p_age_verify");
        this.f22028u.m13901q0();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m24627i(Boolean bool) {
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m24642C0() {
        return this.f22029v;
    }

    /* JADX INFO: renamed from: L */
    public View m24643L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1302a.m24662c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void m24658i1(dc0 dc0Var) {
        this.f22028u = dc0Var;
    }

    /* JADX INFO: renamed from: N */
    public final void m24645N() {
        cwf0 cwf0VarC = i0e.c("p_age_verify_type", AgeVerificationAct.class.getName());
        this.f22030w = cwf0VarC;
        i0e.f(cwf0VarC);
        this.f22002A.add(this.f22030w);
    }

    /* JADX INFO: renamed from: O */
    public void m24646O() {
        Iterator<cwf0> it = this.f22002A.iterator();
        while (it.hasNext()) {
            i0e.e(it.next());
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m24647S(String str) {
        String str2;
        if ("drivingLicense".equals(str)) {
            str2 = "driver_license";
        } else {
            str2 = "passport";
            if (!"passport".equals(str)) {
                str2 = "health_card";
            }
        }
        zvf0.u("e_age_verify_type", "p_age_verify_type", new j760[]{vwb.Y("certificate_type", str2)});
        m24652Z();
        xdl0.M(this.f22009b, false);
        xdl0.M(this.f22013f, true);
        xdl0.M(this.f22025r, false);
        if (this.f22021n.getParent() != null) {
            boolean zEquals = "insuranceCard".equals(str);
            ViewStub viewStub = this.f22021n;
            if (zEquals) {
                viewStub.setLayoutResource(f6c0.f12332nf);
            } else {
                viewStub.setLayoutResource(f6c0.f12315mf);
            }
            this.f22021n.inflate();
        }
        xdl0.M(this.f22026s, true);
        this.f22027t.setText(R$string.f1585B);
        this.f22028u.m13900p0(str);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Double m24648U() {
        return Double.valueOf(this.f22028u.m13893h0());
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m24649V(Double d) {
        zvf0.r("e_age_verify_age_check", "p_age_verify");
        this.f22028u.m13899o0(d.doubleValue());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m24650W(View view) {
        CoreDlg.I1(this.f22029v, new v9j() { // from class: l.oc0
            public final Object call() {
                return this.f18138a.m24648U();
            }
        }, new e30() { // from class: l.pc0
            public final void call(Object obj) {
                this.f18672a.m24649V((Double) obj);
            }
        }, new e30() { // from class: l.qc0
            public final void call(Object obj) {
                tc0.m24627i((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m24651Y(View view) {
        zvf0.r("e_age_verify_submit_succeed_button", "p_age_verify_submit_succeed");
        i0e.e(this.f22033z);
        this.f22029v.finish();
    }

    /* JADX INFO: renamed from: Z */
    public final void m24652Z() {
        i0e.e(this.f22030w);
        this.f22002A.remove(this.f22030w);
        cwf0 cwf0VarC = i0e.c("p_age_verify_photo_upload", AgeVerificationAct.class.getName());
        this.f22031x = cwf0VarC;
        i0e.f(cwf0VarC);
        this.f22002A.add(this.f22031x);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m24653a0() {
        i0e.e(this.f22031x);
        this.f22002A.remove(this.f22031x);
        cwf0 cwf0VarC = i0e.c("p_age_verify", AgeVerificationAct.class.getName());
        this.f22032y = cwf0VarC;
        i0e.f(cwf0VarC);
        this.f22002A.add(this.f22032y);
    }

    @Nullable
    public Act act() {
        return this.f22029v;
    }

    /* JADX INFO: renamed from: b0 */
    public void m24654b0(double d) {
        this.f22023p.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Double.valueOf(d)));
    }

    /* JADX INFO: renamed from: c0 */
    public void m24655c0(String str) {
        m24653a0();
        this.f22014g.setText(R$string.f1765H);
        xdl0.M(this.f22015h, false);
        xdl0.M(this.f22017j, false);
        xdl0.M(this.f22018k, false);
        qib0.f19782G.m12776i0(this.f22016i, str);
        xdl0.M(this.f22019l, true);
        xdl0.M(this.f22020m, true);
        xdl0.M(this.f22022o, true);
        xdl0.M(this.f22023p, true);
        xdl0.M(this.f22024q, true);
        this.f22027t.setText(R$string.f1735G);
        this.f22027t.setOnClickListener(this.f22006E);
    }

    /* JADX INFO: renamed from: d0 */
    public void m24656d0() {
        m24657e0();
        xdl0.M(this.f22009b, false);
        xdl0.M(this.f22013f, false);
        xdl0.M(this.f22025r, true);
        this.f22027t.setText(R$string.f2642k);
        this.f22027t.setOnClickListener(this.f22007F);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m24657e0() {
        i0e.e(this.f22032y);
        this.f22002A.remove(this.f22032y);
        cwf0 cwf0VarC = i0e.c("p_age_verify_submit_succeed", AgeVerificationAct.class.getName());
        this.f22033z = cwf0VarC;
        i0e.f(cwf0VarC);
        this.f22002A.add(this.f22033z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24643L(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m24659r() {
        m24645N();
        xdl0.M(this.f22009b, true);
        xdl0.M(this.f22013f, false);
        xdl0.M(this.f22025r, false);
        this.f22010c.setOnClickListener(new View.OnClickListener() { // from class: l.rc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20482a.m24617Q(view);
            }
        });
        this.f22011d.setOnClickListener(new View.OnClickListener() { // from class: l.sc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21253a.m24618R(view);
            }
        });
        this.f22012e.setOnClickListener(new View.OnClickListener() { // from class: l.jc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15105a.m24616P(view);
            }
        });
        this.f22027t.setOnClickListener(this.f22004C);
        this.f22016i.setOnClickListener(this.f22004C);
        this.f22019l.setOnClickListener(this.f22004C);
        this.f22023p.setOnClickListener(this.f22005D);
        m24654b0(this.f22028u.m13893h0());
    }

    public void destroy() {
    }
}
