package com.p000p1.mobile.putong.core.p001ui.debug;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.Question;
import com.p000p1.mobile.putong.core.p001ui.debug.LabelDemoAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.label.CommonLabelView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreAct;
import com.p1.mobile.putong.core.newui.home.base.impl.swipe.b;
import com.p1.mobile.putong.core.newui.home.base.impl.swipe.o;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.tantanapp.common.data.DbObject;
import l.d30;
import l.e30;
import l.f6c0;
import l.hob0;
import l.ic50;
import l.j2e0;
import l.psq;
import l.qp4;
import l.u4c0;
import l.uq40;
import p003l.n2l;
import p003l.opa0;
import p003l.wvv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LabelDemoAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public CommonLabelView f1260d;

    /* JADX INFO: renamed from: e */
    public CommonLabelView f1261e;

    /* JADX INFO: renamed from: f */
    public CommonLabelView f1262f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.debug.LabelDemoAct$a */
    public class ViewOnClickListenerC3085a implements View.OnClickListener {
        public ViewOnClickListenerC3085a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LabelDemoAct.this.f1262f.j("全新标签");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.debug.LabelDemoAct$b */
    public class ViewOnClickListenerC3086b implements View.OnClickListener {
        public ViewOnClickListenerC3086b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new b().E(LabelDemoAct.this, CoreModule.c.e0.na());
        }
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m2150A2() {
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m2151B2() {
    }

    /* JADX INFO: renamed from: M2 */
    public static /* synthetic */ void m2160M2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m2164Y2(View view) {
        psq.W(this);
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m2165Z1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public /* synthetic */ void m2173h3(View view) {
        j2e0.m(act(), Uri.parse("tantan://privacy_management/contacts?debug=true"));
    }

    private void init() {
        this.f1260d = findViewById(u4c0.Md);
        this.f1261e = findViewById(u4c0.Nd);
        this.f1262f = findViewById(u4c0.Od);
        findViewById(u4c0.a1).setOnClickListener(new ViewOnClickListenerC3085a());
        findViewById(u4c0.c3).setOnClickListener(new View.OnClickListener() { // from class: l.q5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.Q().Fr();
            }
        });
        findViewById(u4c0.b3).setOnClickListener(new View.OnClickListener() { // from class: l.i5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4997a.m2164Y2(view);
            }
        });
        findViewById(u4c0.w2).setOnClickListener(new View.OnClickListener() { // from class: l.u5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7670a.m2173h3(view);
            }
        });
        findViewById(u4c0.H2).setOnClickListener(new View.OnClickListener() { // from class: l.v5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7895a.m2179n3(view);
            }
        });
        findViewById(u4c0.S2).setOnClickListener(new View.OnClickListener() { // from class: l.w5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8124a.m2181o3(view);
            }
        });
        findViewById(u4c0.T2).setOnClickListener(new View.OnClickListener() { // from class: l.x5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8370a.m2183p3(view);
            }
        });
        findViewById(u4c0.U2).setOnClickListener(new View.OnClickListener() { // from class: l.y5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8997a.m2213q3(view);
            }
        });
        findViewById(u4c0.V2).setOnClickListener(new View.OnClickListener() { // from class: l.z5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9190a.m2214r3(view);
            }
        });
        findViewById(u4c0.W2).setOnClickListener(new View.OnClickListener() { // from class: l.a6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2736a.m2193Q2(view);
            }
        });
        findViewById(u4c0.X2).setOnClickListener(new View.OnClickListener() { // from class: l.c6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3980a.m2194R2(view);
            }
        });
        findViewById(u4c0.Y2).setOnClickListener(new View.OnClickListener() { // from class: l.b6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3333a.m2195S2(view);
            }
        });
        findViewById(u4c0.x2).setOnClickListener(new View.OnClickListener() { // from class: l.j6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5261a.m2196T2(view);
            }
        });
        findViewById(u4c0.y2).setOnClickListener(new View.OnClickListener() { // from class: l.k6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5619a.m2197U2(view);
            }
        });
        findViewById(u4c0.z2).setOnClickListener(new View.OnClickListener() { // from class: l.l6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6124a.m2198V2(view);
            }
        });
        findViewById(u4c0.A2).setOnClickListener(new View.OnClickListener() { // from class: l.m6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6280a.m2199W2(view);
            }
        });
        findViewById(u4c0.B2).setOnClickListener(new View.OnClickListener() { // from class: l.n6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6483a.m2200X2(view);
            }
        });
        findViewById(u4c0.C2).setOnClickListener(new View.OnClickListener() { // from class: l.o6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JailedDialogLikeAct.n2();
            }
        });
        findViewById(u4c0.D2).setOnClickListener(new View.OnClickListener() { // from class: l.p6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JailedDialogLikeAct.n2();
            }
        });
        findViewById(u4c0.E2).setOnClickListener(new View.OnClickListener() { // from class: l.g5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4583a.m2201Z2(view);
            }
        });
        findViewById(u4c0.F2).setOnClickListener(new View.OnClickListener() { // from class: l.h5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4798a.m2202a3(view);
            }
        });
        findViewById(u4c0.G2).setOnClickListener(new View.OnClickListener() { // from class: l.j5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5250a.m2203b3(view);
            }
        });
        findViewById(u4c0.I2).setOnClickListener(new View.OnClickListener() { // from class: l.k5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5441a.m2204c3(view);
            }
        });
        findViewById(u4c0.J2).setOnClickListener(new View.OnClickListener() { // from class: l.l5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5762a.m2205d3(view);
            }
        });
        findViewById(u4c0.K2).setOnClickListener(new View.OnClickListener() { // from class: l.m5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6276a.m2206e3(view);
            }
        });
        findViewById(u4c0.L2).setOnClickListener(new View.OnClickListener() { // from class: l.n5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6480a.m2207f3(view);
            }
        });
        findViewById(u4c0.M2).setOnClickListener(new View.OnClickListener() { // from class: l.o5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6601a.m2208g3(view);
            }
        });
        findViewById(u4c0.N2).setOnClickListener(new View.OnClickListener() { // from class: l.p5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6808a.m2209i3(view);
            }
        });
        findViewById(u4c0.O2).setOnClickListener(new View.OnClickListener() { // from class: l.r5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7130a.m2210j3(view);
            }
        });
        findViewById(u4c0.P2).setOnClickListener(new View.OnClickListener() { // from class: l.s5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7284a.m2211k3(view);
            }
        });
        findViewById(u4c0.Q2).setOnClickListener(new View.OnClickListener() { // from class: l.t5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7512a.m2212m3(view);
            }
        });
        findViewById(u4c0.R2).setOnClickListener(new ViewOnClickListenerC3086b());
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m2176l2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public /* synthetic */ void m2179n3(View view) {
        j2e0.m(act(), Uri.parse("tantan://privacy_management/editprofile?debug=true"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public /* synthetic */ void m2181o3(View view) {
        uq40.E(((Act) this).act, (d30) null, (d30) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public /* synthetic */ void m2183p3(View view) {
        wvv.m10576j(((Act) this).act, 0, new d30() { // from class: l.i6r
            public final void call() {
                LabelDemoAct.m2192z2();
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public /* synthetic */ void m2187s3(Bundle bundle) {
        init();
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m2192z2() {
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m2193Q2(View view) {
        CoreModule.N().nm(((Act) this).act, 0);
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m2194R2(View view) {
        CoreModule.N().nm(((Act) this).act, 0);
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m2195S2(View view) {
        CoreModule.N().nm(((Act) this).act, 1);
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m2196T2(View view) {
        ic50.j().f().s0(((Act) this).act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m2197U2(View view) {
        qp4.p(((Act) this).act);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m2198V2(View view) {
        qp4.p(((Act) this).act);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m2199W2(View view) {
        uq40.H(((Act) this).act, -1, true);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m2200X2(View view) {
        uq40.H(((Act) this).act, 1, true);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m2201Z2(View view) {
        Question questionNew_ = Question.new_();
        questionNew_.text = "哈哈哈哈";
        ((DbObject) questionNew_).id = "123445";
        new hob0(((Act) this).act, questionNew_).show();
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m2202a3(View view) {
        o.r(((Act) this).act, CoreModule.c.e0.na());
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m2203b3(View view) {
        psq.U(((Act) this).act);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m2204c3(View view) {
        psq.T(((Act) this).act);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m2205d3(View view) {
        j2e0.m(act(), Uri.parse("tantan://privacy_management/verification?debug=true"));
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m2206e3(View view) {
        j2e0.m(act(), Uri.parse("tantan://privacy_management/leak?debug=true"));
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m2207f3(View view) {
        new opa0(act(), "selected_users_card").m8578K(1, new d30() { // from class: l.f6r
            public final void call() {
                LabelDemoAct.m2165Z1();
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m2208g3(View view) {
        new opa0(act(), "selected_users_card").m8578K(2, new d30() { // from class: l.g6r
            public final void call() {
                LabelDemoAct.m2150A2();
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m2209i3(View view) {
        new opa0(act(), "selected_users_card").m8578K(3, new d30() { // from class: l.d6r
            public final void call() {
                LabelDemoAct.m2176l2();
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(f6c0.j6, viewGroup, false);
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        creates(new e30() { // from class: l.f5r
            public final void call(Object obj) {
                this.f4394a.m2187s3((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m2210j3(View view) {
        new opa0(act(), "selected_users_card").m8578K(5, new d30() { // from class: l.e6r
            public final void call() {
                LabelDemoAct.m2151B2();
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m2211k3(View view) {
        new opa0(act(), "selected_users_card").m8578K(5, new d30() { // from class: l.h6r
            public final void call() {
                LabelDemoAct.m2160M2();
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m2212m3(View view) {
        CoreModule.c.e0.L5.clear();
        CoreModule.c.e0.M5.clear();
        new n2l(((Act) this).act).show();
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m2213q3(View view) {
        CoreModule.N().nm(((Act) this).act, 0);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m2214r3(View view) {
        CoreModule.N().nm(((Act) this).act, 0);
    }
}
