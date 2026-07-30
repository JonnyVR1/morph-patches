package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.verification.age.AgeVerificationAct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class pc0 implements iam<zb0> {

    /* JADX INFO: renamed from: A */
    public List<l4g0> f151459A = new ArrayList();

    /* JADX INFO: renamed from: B */
    public y20<String> f151460B = new y20() { // from class: l.ec0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f92998a.m171590S((String) obj);
        }
    };

    /* JADX INFO: renamed from: C */
    public View.OnClickListener f151461C = new View.OnClickListener() { // from class: l.gc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f103514a.m171563T(view);
        }
    };

    /* JADX INFO: renamed from: D */
    public View.OnClickListener f151462D = new View.OnClickListener() { // from class: l.hc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f108661a.m171593W(view);
        }
    };

    /* JADX INFO: renamed from: E */
    public View.OnClickListener f151463E = new View.OnClickListener() { // from class: l.ic0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f114266a.m171564X(view);
        }
    };

    /* JADX INFO: renamed from: F */
    public View.OnClickListener f151464F = new View.OnClickListener() { // from class: l.jc0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f120004a.m171594Y(view);
        }
    };

    /* JADX INFO: renamed from: a */
    public VLinear f151465a;

    /* JADX INFO: renamed from: b */
    public VLinear f151466b;

    /* JADX INFO: renamed from: c */
    public VFrame f151467c;

    /* JADX INFO: renamed from: d */
    public VFrame f151468d;

    /* JADX INFO: renamed from: e */
    public VFrame f151469e;

    /* JADX INFO: renamed from: f */
    public VLinear f151470f;

    /* JADX INFO: renamed from: g */
    public VText f151471g;

    /* JADX INFO: renamed from: h */
    public VText f151472h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f151473i;

    /* JADX INFO: renamed from: j */
    public VImage f151474j;

    /* JADX INFO: renamed from: k */
    public VText f151475k;

    /* JADX INFO: renamed from: l */
    public VButton f151476l;

    /* JADX INFO: renamed from: m */
    public VText f151477m;

    /* JADX INFO: renamed from: n */
    public ViewStub f151478n;

    /* JADX INFO: renamed from: o */
    public VText f151479o;

    /* JADX INFO: renamed from: p */
    public VText f151480p;

    /* JADX INFO: renamed from: q */
    public VText f151481q;

    /* JADX INFO: renamed from: r */
    public VLinear f151482r;

    /* JADX INFO: renamed from: s */
    public VFrame f151483s;

    /* JADX INFO: renamed from: t */
    public VButton f151484t;

    /* JADX INFO: renamed from: u */
    public zb0 f151485u;

    /* JADX INFO: renamed from: v */
    public AgeVerificationAct f151486v;

    /* JADX INFO: renamed from: w */
    public l4g0 f151487w;

    /* JADX INFO: renamed from: x */
    public l4g0 f151488x;

    /* JADX INFO: renamed from: y */
    public l4g0 f151489y;

    /* JADX INFO: renamed from: z */
    public l4g0 f151490z;

    /* JADX INFO: renamed from: l.pc0$a */
    public static class C19339a {
        /* JADX INFO: renamed from: b */
        public static void m171603b(pc0 pc0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            pc0Var.f151465a = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            pc0Var.f151466b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            pc0Var.f151467c = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
            pc0Var.f151468d = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
            pc0Var.f151469e = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
            pc0Var.f151470f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            pc0Var.f151471g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
            pc0Var.f151472h = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
            pc0Var.f151473i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
            pc0Var.f151474j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
            pc0Var.f151475k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(2);
            pc0Var.f151476l = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(3);
            pc0Var.f151477m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
            pc0Var.f151478n = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
            pc0Var.f151479o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(5);
            pc0Var.f151480p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(6);
            pc0Var.f151481q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(7);
            pc0Var.f151482r = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            pc0Var.f151483s = (VFrame) viewGroup.getChildAt(1);
            pc0Var.f151484t = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m171604c(pc0 pc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f126057sf, viewGroup, false);
            m171603b(pc0Var, viewInflate);
            return viewInflate;
        }
    }

    public pc0(AgeVerificationAct ageVerificationAct) {
        this.f151486v = ageVerificationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m171560P(View view) {
        this.f151460B.call("insuranceCard");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m171561Q(View view) {
        this.f151460B.call("drivingLicense");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m171562R(View view) {
        this.f151460B.call("passport");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m171563T(View view) {
        CoreDlg.m46234b2((AgeVerificationAct) getAct());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m171564X(View view) {
        i4g0.m138520r("e_age_verify_submit_button", "p_age_verify");
        this.f151485u.m219159q0();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m171571i(Boolean bool) {
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f151486v;
    }

    /* JADX INFO: renamed from: L */
    public View m171586L(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19339a.m171604c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zb0 zb0Var) {
        this.f151485u = zb0Var;
    }

    /* JADX INFO: renamed from: N */
    public final void m171588N() {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_age_verify_type", AgeVerificationAct.class.getName());
        this.f151487w = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        this.f151459A.add(this.f151487w);
    }

    /* JADX INFO: renamed from: O */
    public void m171589O() {
        Iterator<l4g0> it = this.f151459A.iterator();
        while (it.hasNext()) {
            w1e.m204401e(it.next());
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m171590S(String str) {
        String str2;
        if ("drivingLicense".equals(str)) {
            str2 = "driver_license";
        } else {
            str2 = "passport";
            if (!"passport".equals(str)) {
                str2 = "health_card";
            }
        }
        i4g0.m138523u("e_age_verify_type", "p_age_verify_type", jyb.m147494Y("certificate_type", str2));
        m171595Z();
        bnl0.m105524M(this.f151466b, false);
        bnl0.m105524M(this.f151470f, true);
        bnl0.m105524M(this.f151482r, false);
        if (this.f151478n.getParent() != null) {
            boolean zEquals = "insuranceCard".equals(str);
            ViewStub viewStub = this.f151478n;
            if (zEquals) {
                viewStub.setLayoutResource(kec0.f126091uf);
            } else {
                viewStub.setLayoutResource(kec0.f126074tf);
            }
            this.f151478n.inflate();
        }
        bnl0.m105524M(this.f151483s, true);
        this.f151484t.setText(R$string.f18316B);
        this.f151485u.m219158p0(str);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ Double m171591U() {
        return Double.valueOf(this.f151485u.m219151h0());
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m171592V(Double d) {
        i4g0.m138520r("e_age_verify_age_check", "p_age_verify");
        this.f151485u.m219157o0(d.doubleValue());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m171593W(View view) {
        CoreDlg.m46176I1(this.f151486v, new pcj() { // from class: l.kc0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f125008a.m171591U();
            }
        }, new y20() { // from class: l.lc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131241a.m171592V((Double) obj);
            }
        }, new y20() { // from class: l.mc0
            @Override // p153l.y20
            public final void call(Object obj) {
                pc0.m171571i((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m171594Y(View view) {
        i4g0.m138520r("e_age_verify_submit_succeed_button", "p_age_verify_submit_succeed");
        w1e.m204401e(this.f151490z);
        this.f151486v.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: Z */
    public final void m171595Z() {
        w1e.m204401e(this.f151487w);
        this.f151459A.remove(this.f151487w);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_age_verify_photo_upload", AgeVerificationAct.class.getName());
        this.f151488x = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        this.f151459A.add(this.f151488x);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m171596a0() {
        w1e.m204401e(this.f151488x);
        this.f151459A.remove(this.f151488x);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_age_verify", AgeVerificationAct.class.getName());
        this.f151489y = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        this.f151459A.add(this.f151489y);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f151486v;
    }

    /* JADX INFO: renamed from: b0 */
    public void m171597b0(double d) {
        this.f151480p.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Double.valueOf(d)));
    }

    /* JADX INFO: renamed from: c0 */
    public void m171598c0(String str) {
        m171596a0();
        this.f151471g.setText(R$string.f18502H);
        bnl0.m105524M(this.f151472h, false);
        bnl0.m105524M(this.f151474j, false);
        bnl0.m105524M(this.f151475k, false);
        uqb0.f180374G.m127146i0(this.f151473i, str);
        bnl0.m105524M(this.f151476l, true);
        bnl0.m105524M(this.f151477m, true);
        bnl0.m105524M(this.f151479o, true);
        bnl0.m105524M(this.f151480p, true);
        bnl0.m105524M(this.f151481q, true);
        this.f151484t.setText(R$string.f18471G);
        this.f151484t.setOnClickListener(this.f151463E);
    }

    /* JADX INFO: renamed from: d0 */
    public void m171599d0() {
        m171600e0();
        bnl0.m105524M(this.f151466b, false);
        bnl0.m105524M(this.f151470f, false);
        bnl0.m105524M(this.f151482r, true);
        this.f151484t.setText(R$string.f19383k);
        this.f151484t.setOnClickListener(this.f151464F);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m171600e0() {
        w1e.m204401e(this.f151489y);
        this.f151459A.remove(this.f151489y);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_age_verify_submit_succeed", AgeVerificationAct.class.getName());
        this.f151490z = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        this.f151459A.add(this.f151490z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m171586L(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m171601r() {
        m171588N();
        bnl0.m105524M(this.f151466b, true);
        bnl0.m105524M(this.f151470f, false);
        bnl0.m105524M(this.f151482r, false);
        this.f151467c.setOnClickListener(new View.OnClickListener() { // from class: l.nc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141300a.m171561Q(view);
            }
        });
        this.f151468d.setOnClickListener(new View.OnClickListener() { // from class: l.oc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146640a.m171562R(view);
            }
        });
        this.f151469e.setOnClickListener(new View.OnClickListener() { // from class: l.fc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98171a.m171560P(view);
            }
        });
        this.f151484t.setOnClickListener(this.f151461C);
        this.f151473i.setOnClickListener(this.f151461C);
        this.f151476l.setOnClickListener(this.f151461C);
        this.f151480p.setOnClickListener(this.f151462D);
        m171597b0(this.f151485u.m219151h0());
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
