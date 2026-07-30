package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.verification.age.AgeVerificationAct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class tc0 implements s7m<dc0> {

    /* JADX INFO: renamed from: A */
    public List<cwf0> f169373A = new ArrayList();

    /* JADX INFO: renamed from: B */
    public e30<String> f169374B = new e30() { // from class: l.ic0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f112396a.m187962S((String) obj);
        }
    };

    /* JADX INFO: renamed from: C */
    public View.OnClickListener f169375C = new View.OnClickListener() { // from class: l.kc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f122280a.m187935T(view);
        }
    };

    /* JADX INFO: renamed from: D */
    public View.OnClickListener f169376D = new View.OnClickListener() { // from class: l.lc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f127363a.m187965W(view);
        }
    };

    /* JADX INFO: renamed from: E */
    public View.OnClickListener f169377E = new View.OnClickListener() { // from class: l.mc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f133073a.m187936X(view);
        }
    };

    /* JADX INFO: renamed from: F */
    public View.OnClickListener f169378F = new View.OnClickListener() { // from class: l.nc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f138083a.m187966Y(view);
        }
    };

    /* JADX INFO: renamed from: a */
    public VLinear f169379a;

    /* JADX INFO: renamed from: b */
    public VLinear f169380b;

    /* JADX INFO: renamed from: c */
    public VFrame f169381c;

    /* JADX INFO: renamed from: d */
    public VFrame f169382d;

    /* JADX INFO: renamed from: e */
    public VFrame f169383e;

    /* JADX INFO: renamed from: f */
    public VLinear f169384f;

    /* JADX INFO: renamed from: g */
    public VText f169385g;

    /* JADX INFO: renamed from: h */
    public VText f169386h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f169387i;

    /* JADX INFO: renamed from: j */
    public VImage f169388j;

    /* JADX INFO: renamed from: k */
    public VText f169389k;

    /* JADX INFO: renamed from: l */
    public VButton f169390l;

    /* JADX INFO: renamed from: m */
    public VText f169391m;

    /* JADX INFO: renamed from: n */
    public ViewStub f169392n;

    /* JADX INFO: renamed from: o */
    public VText f169393o;

    /* JADX INFO: renamed from: p */
    public VText f169394p;

    /* JADX INFO: renamed from: q */
    public VText f169395q;

    /* JADX INFO: renamed from: r */
    public VLinear f169396r;

    /* JADX INFO: renamed from: s */
    public VFrame f169397s;

    /* JADX INFO: renamed from: t */
    public VButton f169398t;

    /* JADX INFO: renamed from: u */
    public dc0 f169399u;

    /* JADX INFO: renamed from: v */
    public AgeVerificationAct f169400v;

    /* JADX INFO: renamed from: w */
    public cwf0 f169401w;

    /* JADX INFO: renamed from: x */
    public cwf0 f169402x;

    /* JADX INFO: renamed from: y */
    public cwf0 f169403y;

    /* JADX INFO: renamed from: z */
    public cwf0 f169404z;

    /* JADX INFO: renamed from: l.tc0$a */
    public static class C20143a {
        /* JADX INFO: renamed from: b */
        public static void m187975b(tc0 tc0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            tc0Var.f169379a = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            tc0Var.f169380b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            tc0Var.f169381c = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
            tc0Var.f169382d = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
            tc0Var.f169383e = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
            tc0Var.f169384f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            tc0Var.f169385g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            tc0Var.f169386h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            tc0Var.f169387i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            tc0Var.f169388j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            tc0Var.f169389k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(2);
            tc0Var.f169390l = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(3);
            tc0Var.f169391m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
            tc0Var.f169392n = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
            tc0Var.f169393o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5);
            tc0Var.f169394p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6);
            tc0Var.f169395q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7);
            tc0Var.f169396r = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            tc0Var.f169397s = (VFrame) viewGroup.getChildAt(1);
            tc0Var.f169398t = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m187976c(tc0 tc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95884lf, viewGroup, false);
            m187975b(tc0Var, viewInflate);
            return viewInflate;
        }
    }

    public tc0(AgeVerificationAct ageVerificationAct) {
        this.f169400v = ageVerificationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m187932P(View view) {
        this.f169374B.call("insuranceCard");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m187933Q(View view) {
        this.f169374B.call("drivingLicense");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m187934R(View view) {
        this.f169374B.call("passport");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m187935T(View view) {
        CoreDlg.m45051b2((AgeVerificationAct) getAct());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m187936X(View view) {
        zvf0.m220396r("e_age_verify_submit_button", "p_age_verify");
        this.f169399u.m110664q0();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m187943i(Boolean bool) {
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f169400v;
    }

    /* JADX INFO: renamed from: L */
    public View m187958L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20143a.m187976c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dc0 dc0Var) {
        this.f169399u = dc0Var;
    }

    /* JADX INFO: renamed from: N */
    public final void m187960N() {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_age_verify_type", AgeVerificationAct.class.getName());
        this.f169401w = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        this.f169373A.add(this.f169401w);
    }

    /* JADX INFO: renamed from: O */
    public void m187961O() {
        Iterator<cwf0> it = this.f169373A.iterator();
        while (it.hasNext()) {
            i0e.m133796e(it.next());
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m187962S(String str) {
        String str2;
        if ("drivingLicense".equals(str)) {
            str2 = "driver_license";
        } else {
            str2 = "passport";
            if (!"passport".equals(str)) {
                str2 = "health_card";
            }
        }
        zvf0.m220399u("e_age_verify_type", "p_age_verify_type", vwb.m200311Y("certificate_type", str2));
        m187967Z();
        xdl0.m208344M(this.f169380b, false);
        xdl0.m208344M(this.f169384f, true);
        xdl0.m208344M(this.f169396r, false);
        if (this.f169392n.getParent() != null) {
            boolean zEquals = "insuranceCard".equals(str);
            ViewStub viewStub = this.f169392n;
            if (zEquals) {
                viewStub.setLayoutResource(f6c0.f95918nf);
            } else {
                viewStub.setLayoutResource(f6c0.f95901mf);
            }
            this.f169392n.inflate();
        }
        xdl0.m208344M(this.f169397s, true);
        this.f169398t.setText(R$string.f17596B);
        this.f169399u.m110663p0(str);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Double m187963U() {
        return Double.valueOf(this.f169399u.m110656h0());
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m187964V(Double d) {
        zvf0.m220396r("e_age_verify_age_check", "p_age_verify");
        this.f169399u.m110662o0(d.doubleValue());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m187965W(View view) {
        CoreDlg.m44993I1(this.f169400v, new v9j() { // from class: l.oc0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f142995a.m187963U();
            }
        }, new e30() { // from class: l.pc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148126a.m187964V((Double) obj);
            }
        }, new e30() { // from class: l.qc0
            @Override // p149l.e30
            public final void call(Object obj) {
                tc0.m187943i((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m187966Y(View view) {
        zvf0.m220396r("e_age_verify_submit_succeed_button", "p_age_verify_submit_succeed");
        i0e.m133796e(this.f169404z);
        this.f169400v.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: Z */
    public final void m187967Z() {
        i0e.m133796e(this.f169401w);
        this.f169373A.remove(this.f169401w);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_age_verify_photo_upload", AgeVerificationAct.class.getName());
        this.f169402x = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        this.f169373A.add(this.f169402x);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m187968a0() {
        i0e.m133796e(this.f169402x);
        this.f169373A.remove(this.f169402x);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_age_verify", AgeVerificationAct.class.getName());
        this.f169403y = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        this.f169373A.add(this.f169403y);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f169400v;
    }

    /* JADX INFO: renamed from: b0 */
    public void m187969b0(double d) {
        this.f169394p.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Double.valueOf(d)));
    }

    /* JADX INFO: renamed from: c0 */
    public void m187970c0(String str) {
        m187968a0();
        this.f169385g.setText(R$string.f17776H);
        xdl0.m208344M(this.f169386h, false);
        xdl0.m208344M(this.f169388j, false);
        xdl0.m208344M(this.f169389k, false);
        qib0.f154691G.m102363i0(this.f169387i, str);
        xdl0.m208344M(this.f169390l, true);
        xdl0.m208344M(this.f169391m, true);
        xdl0.m208344M(this.f169393o, true);
        xdl0.m208344M(this.f169394p, true);
        xdl0.m208344M(this.f169395q, true);
        this.f169398t.setText(R$string.f17746G);
        this.f169398t.setOnClickListener(this.f169377E);
    }

    /* JADX INFO: renamed from: d0 */
    public void m187971d0() {
        m187972e0();
        xdl0.m208344M(this.f169380b, false);
        xdl0.m208344M(this.f169384f, false);
        xdl0.m208344M(this.f169396r, true);
        this.f169398t.setText(R$string.f18653k);
        this.f169398t.setOnClickListener(this.f169378F);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m187972e0() {
        i0e.m133796e(this.f169403y);
        this.f169373A.remove(this.f169403y);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_age_verify_submit_succeed", AgeVerificationAct.class.getName());
        this.f169404z = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        this.f169373A.add(this.f169404z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m187958L(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m187973r() {
        m187960N();
        xdl0.m208344M(this.f169380b, true);
        xdl0.m208344M(this.f169384f, false);
        xdl0.m208344M(this.f169396r, false);
        this.f169381c.setOnClickListener(new View.OnClickListener() { // from class: l.rc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158700a.m187933Q(view);
            }
        });
        this.f169382d.setOnClickListener(new View.OnClickListener() { // from class: l.sc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163690a.m187934R(view);
            }
        });
        this.f169383e.setOnClickListener(new View.OnClickListener() { // from class: l.jc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117241a.m187932P(view);
            }
        });
        this.f169398t.setOnClickListener(this.f169375C);
        this.f169387i.setOnClickListener(this.f169375C);
        this.f169390l.setOnClickListener(this.f169375C);
        this.f169394p.setOnClickListener(this.f169376D);
        m187969b0(this.f169399u.m110656h0());
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
