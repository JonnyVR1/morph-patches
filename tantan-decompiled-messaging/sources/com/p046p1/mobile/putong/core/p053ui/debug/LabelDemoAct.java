package com.p046p1.mobile.putong.core.p053ui.debug;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.p048ui.label.CommonLabelView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreAct;
import com.p046p1.mobile.putong.core.data.Question;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7874b;
import com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7913o;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.debug.LabelDemoAct;
import p149l.d30;
import p149l.e30;
import p149l.f6c0;
import p149l.hob0;
import p149l.ic50;
import p149l.j2e0;
import p149l.n2l;
import p149l.opa0;
import p149l.psq;
import p149l.qp4;
import p149l.u4c0;
import p149l.uq40;
import p149l.wvv;

/* JADX INFO: loaded from: classes10.dex */
public class LabelDemoAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public CommonLabelView f28866d;

    /* JADX INFO: renamed from: e */
    public CommonLabelView f28867e;

    /* JADX INFO: renamed from: f */
    public CommonLabelView f28868f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.debug.LabelDemoAct$a */
    public class ViewOnClickListenerC8310a implements View.OnClickListener {
        public ViewOnClickListenerC8310a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LabelDemoAct.this.f28868f.m21086j("全新标签");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.debug.LabelDemoAct$b */
    public class ViewOnClickListenerC8311b implements View.OnClickListener {
        public ViewOnClickListenerC8311b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new C7874b().m37531E(LabelDemoAct.this, CoreModule.f17545c.f19639e0.m169520na());
        }
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m44836A2() {
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m44837B2() {
    }

    /* JADX INFO: renamed from: M2 */
    public static /* synthetic */ void m44846M2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public /* synthetic */ void m44850Y2(View view) {
        psq.m171207W(this);
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ void m44851Z1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public /* synthetic */ void m44859h3(View view) {
        j2e0.m139446m(act(), Uri.parse("tantan://privacy_management/contacts?debug=true"));
    }

    private void init() {
        this.f28866d = (CommonLabelView) findViewById(u4c0.f173934Md);
        this.f28867e = (CommonLabelView) findViewById(u4c0.f173951Nd);
        this.f28868f = (CommonLabelView) findViewById(u4c0.f173968Od);
        findViewById(u4c0.f174153a1).setOnClickListener(new ViewOnClickListenerC8310a());
        findViewById(u4c0.f174189c3).setOnClickListener(new View.OnClickListener() { // from class: l.q5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m29936Q().mo67218Fr();
            }
        });
        findViewById(u4c0.f174172b3).setOnClickListener(new View.OnClickListener() { // from class: l.i5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111631a.m44850Y2(view);
            }
        });
        findViewById(u4c0.f174527w2).setOnClickListener(new View.OnClickListener() { // from class: l.u5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174748a.m44859h3(view);
            }
        });
        findViewById(u4c0.f173838H2).setOnClickListener(new View.OnClickListener() { // from class: l.v5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180106a.m44865n3(view);
            }
        });
        findViewById(u4c0.f174025S2).setOnClickListener(new View.OnClickListener() { // from class: l.w5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184736a.m44867o3(view);
            }
        });
        findViewById(u4c0.f174042T2).setOnClickListener(new View.OnClickListener() { // from class: l.x5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191181a.m44869p3(view);
            }
        });
        findViewById(u4c0.f174058U2).setOnClickListener(new View.OnClickListener() { // from class: l.y5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196472a.m44899q3(view);
            }
        });
        findViewById(u4c0.f174074V2).setOnClickListener(new View.OnClickListener() { // from class: l.z5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201842a.m44900r3(view);
            }
        });
        findViewById(u4c0.f174090W2).setOnClickListener(new View.OnClickListener() { // from class: l.a6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67791a.m44879Q2(view);
            }
        });
        findViewById(u4c0.f174106X2).setOnClickListener(new View.OnClickListener() { // from class: l.c6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79562a.m44880R2(view);
            }
        });
        findViewById(u4c0.f174122Y2).setOnClickListener(new View.OnClickListener() { // from class: l.b6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73875a.m44881S2(view);
            }
        });
        findViewById(u4c0.f174544x2).setOnClickListener(new View.OnClickListener() { // from class: l.j6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116534a.m44882T2(view);
            }
        });
        findViewById(u4c0.f174561y2).setOnClickListener(new View.OnClickListener() { // from class: l.k6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121500a.m44883U2(view);
            }
        });
        findViewById(u4c0.f174578z2).setOnClickListener(new View.OnClickListener() { // from class: l.l6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126655a.m44884V2(view);
            }
        });
        findViewById(u4c0.f173719A2).setOnClickListener(new View.OnClickListener() { // from class: l.m6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131751a.m44885W2(view);
            }
        });
        findViewById(u4c0.f173736B2).setOnClickListener(new View.OnClickListener() { // from class: l.n6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137439a.m44886X2(view);
            }
        });
        findViewById(u4c0.f173753C2).setOnClickListener(new View.OnClickListener() { // from class: l.o6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JailedDialogLikeAct.m44185n2();
            }
        });
        findViewById(u4c0.f173770D2).setOnClickListener(new View.OnClickListener() { // from class: l.p6r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JailedDialogLikeAct.m44185n2();
            }
        });
        findViewById(u4c0.f173787E2).setOnClickListener(new View.OnClickListener() { // from class: l.g5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101186a.m44887Z2(view);
            }
        });
        findViewById(u4c0.f173804F2).setOnClickListener(new View.OnClickListener() { // from class: l.h5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105977a.m44888a3(view);
            }
        });
        findViewById(u4c0.f173821G2).setOnClickListener(new View.OnClickListener() { // from class: l.j5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116340a.m44889b3(view);
            }
        });
        findViewById(u4c0.f173855I2).setOnClickListener(new View.OnClickListener() { // from class: l.k5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121221a.m44890c3(view);
            }
        });
        findViewById(u4c0.f173872J2).setOnClickListener(new View.OnClickListener() { // from class: l.l5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126196a.m44891d3(view);
            }
        });
        findViewById(u4c0.f173889K2).setOnClickListener(new View.OnClickListener() { // from class: l.m5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131413a.m44892e3(view);
            }
        });
        findViewById(u4c0.f173906L2).setOnClickListener(new View.OnClickListener() { // from class: l.n5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137230a.m44893f3(view);
            }
        });
        findViewById(u4c0.f173923M2).setOnClickListener(new View.OnClickListener() { // from class: l.o5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141926a.m44894g3(view);
            }
        });
        findViewById(u4c0.f173940N2).setOnClickListener(new View.OnClickListener() { // from class: l.p5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147320a.m44895i3(view);
            }
        });
        findViewById(u4c0.f173957O2).setOnClickListener(new View.OnClickListener() { // from class: l.r5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157868a.m44896j3(view);
            }
        });
        findViewById(u4c0.f173974P2).setOnClickListener(new View.OnClickListener() { // from class: l.s5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162581a.m44897k3(view);
            }
        });
        findViewById(u4c0.f173991Q2).setOnClickListener(new View.OnClickListener() { // from class: l.t5r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167846a.m44898m3(view);
            }
        });
        findViewById(u4c0.f174008R2).setOnClickListener(new ViewOnClickListenerC8311b());
    }

    /* JADX INFO: renamed from: l2 */
    public static /* synthetic */ void m44862l2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public /* synthetic */ void m44865n3(View view) {
        j2e0.m139446m(act(), Uri.parse("tantan://privacy_management/editprofile?debug=true"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public /* synthetic */ void m44867o3(View view) {
        uq40.m194955E(this.act, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public /* synthetic */ void m44869p3(View view) {
        wvv.m205770j(this.act, 0, new d30() { // from class: l.i6r
            @Override // p149l.d30
            public final void call() {
                LabelDemoAct.m44878z2();
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public /* synthetic */ void m44873s3(Bundle bundle) {
        init();
    }

    /* JADX INFO: renamed from: z2 */
    public static /* synthetic */ void m44878z2() {
    }

    /* JADX INFO: renamed from: Q2 */
    public final /* synthetic */ void m44879Q2(View view) {
        CoreModule.m29934N().mo60376nm(this.act, 0);
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m44880R2(View view) {
        CoreModule.m29934N().mo60376nm(this.act, 0);
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m44881S2(View view) {
        CoreModule.m29934N().mo60376nm(this.act, 1);
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m44882T2(View view) {
        ic50.m135327j().m135333f().m145258s0(this.act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m44883U2(View view) {
        qp4.m175810p(this.act);
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m44884V2(View view) {
        qp4.m175810p(this.act);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m44885W2(View view) {
        uq40.m194958H(this.act, -1, true);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m44886X2(View view) {
        uq40.m194958H(this.act, 1, true);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m44887Z2(View view) {
        Question questionNew_ = Question.new_();
        questionNew_.text = "哈哈哈哈";
        questionNew_.f56011id = "123445";
        new hob0(this.act, questionNew_).show();
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m44888a3(View view) {
        C7913o.m37701r(this.act, CoreModule.f17545c.f19639e0.m169520na());
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m44889b3(View view) {
        psq.m171205U(this.act);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m44890c3(View view) {
        psq.m171204T(this.act);
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m44891d3(View view) {
        j2e0.m139446m(act(), Uri.parse("tantan://privacy_management/verification?debug=true"));
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m44892e3(View view) {
        j2e0.m139446m(act(), Uri.parse("tantan://privacy_management/leak?debug=true"));
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m44893f3(View view) {
        new opa0(act(), "selected_users_card").m165327K(1, new d30() { // from class: l.f6r
            @Override // p149l.d30
            public final void call() {
                LabelDemoAct.m44851Z1();
            }
        });
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m44894g3(View view) {
        new opa0(act(), "selected_users_card").m165327K(2, new d30() { // from class: l.g6r
            @Override // p149l.d30
            public final void call() {
                LabelDemoAct.m44836A2();
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m44895i3(View view) {
        new opa0(act(), "selected_users_card").m165327K(3, new d30() { // from class: l.d6r
            @Override // p149l.d30
            public final void call() {
                LabelDemoAct.m44862l2();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(f6c0.f95841j6, viewGroup, false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.f5r
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f95198a.m44873s3((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m44896j3(View view) {
        new opa0(act(), "selected_users_card").m165327K(5, new d30() { // from class: l.e6r
            @Override // p149l.d30
            public final void call() {
                LabelDemoAct.m44837B2();
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m44897k3(View view) {
        new opa0(act(), "selected_users_card").m165327K(5, new d30() { // from class: l.h6r
            @Override // p149l.d30
            public final void call() {
                LabelDemoAct.m44846M2();
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m44898m3(View view) {
        CoreModule.f17545c.f19639e0.f149215L5.clear();
        CoreModule.f17545c.f19639e0.f149222M5.clear();
        new n2l(this.act).show();
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m44899q3(View view) {
        CoreModule.m29934N().mo60376nm(this.act, 0);
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m44900r3(View view) {
        CoreModule.m29934N().mo60376nm(this.act, 0);
    }
}
