package com.p051p1.mobile.putong.core.p058ui.debug;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.p053ui.label.CommonLabelView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreAct;
import com.p051p1.mobile.putong.core.data.Question;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8025b;
import com.p051p1.mobile.putong.core.newui.home.base.impl.swipe.C8064o;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.debug.LabelDemoAct;
import p153l.adc0;
import p153l.d5l;
import p153l.iz40;
import p153l.kec0;
import p153l.lwb0;
import p153l.nae0;
import p153l.pk50;
import p153l.pq4;
import p153l.quq;
import p153l.sxa0;
import p153l.x20;
import p153l.xxv;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class LabelDemoAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public CommonLabelView f29714d;

    /* JADX INFO: renamed from: e */
    public CommonLabelView f29715e;

    /* JADX INFO: renamed from: f */
    public CommonLabelView f29716f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.debug.LabelDemoAct$a */
    public class ViewOnClickListenerC8473a implements View.OnClickListener {
        public ViewOnClickListenerC8473a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LabelDemoAct.this.f29716f.m22085j("全新标签");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.debug.LabelDemoAct$b */
    public class ViewOnClickListenerC8474b implements View.OnClickListener {
        public ViewOnClickListenerC8474b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new C8025b().m38534E(LabelDemoAct.this, CoreModule.f18264c.f20381e0.m116593na());
        }
    }

    /* JADX INFO: renamed from: A2 */
    public static /* synthetic */ void m46019A2() {
    }

    /* JADX INFO: renamed from: B2 */
    public static /* synthetic */ void m46020B2() {
    }

    /* JADX INFO: renamed from: C2 */
    public static /* synthetic */ void m46021C2() {
    }

    /* JADX INFO: renamed from: N2 */
    public static /* synthetic */ void m46030N2() {
    }

    /* JADX INFO: renamed from: a2 */
    public static /* synthetic */ void m46034a2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public /* synthetic */ void m46035a3(View view) {
        quq.m178187W(this);
    }

    private void init() {
        this.f29714d = (CommonLabelView) findViewById(adc0.f70073Pd);
        this.f29715e = (CommonLabelView) findViewById(adc0.f70090Qd);
        this.f29716f = (CommonLabelView) findViewById(adc0.f70107Rd);
        findViewById(adc0.f70244a1).setOnClickListener(new ViewOnClickListenerC8473a());
        findViewById(adc0.f70314e3).setOnClickListener(new View.OnClickListener() { // from class: l.r7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m30934Q().mo68401Fr();
            }
        });
        findViewById(adc0.f70297d3).setOnClickListener(new View.OnClickListener() { // from class: l.j7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118704a.m46035a3(view);
            }
        });
        findViewById(adc0.f70652y2).setOnClickListener(new View.OnClickListener() { // from class: l.v7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182797a.m46043j3(view);
            }
        });
        findViewById(adc0.f69960J2).setOnClickListener(new View.OnClickListener() { // from class: l.w7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187779a.m46050p3(view);
            }
        });
        findViewById(adc0.f70147U2).setOnClickListener(new View.OnClickListener() { // from class: l.x7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192744a.m46052q3(view);
            }
        });
        findViewById(adc0.f70164V2).setOnClickListener(new View.OnClickListener() { // from class: l.y7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197819a.m46054r3(view);
            }
        });
        findViewById(adc0.f70181W2).setOnClickListener(new View.OnClickListener() { // from class: l.z7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203261a.m46082s3(view);
            }
        });
        findViewById(adc0.f70197X2).setOnClickListener(new View.OnClickListener() { // from class: l.a8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68940a.m46083t3(view);
            }
        });
        findViewById(adc0.f70213Y2).setOnClickListener(new View.OnClickListener() { // from class: l.b8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75465a.m46062R2(view);
            }
        });
        findViewById(adc0.f70229Z2).setOnClickListener(new View.OnClickListener() { // from class: l.d8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85663a.m46063S2(view);
            }
        });
        findViewById(adc0.f70246a3).setOnClickListener(new View.OnClickListener() { // from class: l.c8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80234a.m46064T2(view);
            }
        });
        findViewById(adc0.f70669z2).setOnClickListener(new View.OnClickListener() { // from class: l.k8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124411a.m46065U2(view);
            }
        });
        findViewById(adc0.f69807A2).setOnClickListener(new View.OnClickListener() { // from class: l.l8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130510a.m46066V2(view);
            }
        });
        findViewById(adc0.f69824B2).setOnClickListener(new View.OnClickListener() { // from class: l.m8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135276a.m46067W2(view);
            }
        });
        findViewById(adc0.f69841C2).setOnClickListener(new View.OnClickListener() { // from class: l.n8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140709a.m46068X2(view);
            }
        });
        findViewById(adc0.f69858D2).setOnClickListener(new View.OnClickListener() { // from class: l.o8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145459a.m46069Z2(view);
            }
        });
        findViewById(adc0.f69875E2).setOnClickListener(new View.OnClickListener() { // from class: l.p8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JailedDialogLikeAct.m45368o2();
            }
        });
        findViewById(adc0.f69892F2).setOnClickListener(new View.OnClickListener() { // from class: l.q8r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JailedDialogLikeAct.m45368o2();
            }
        });
        findViewById(adc0.f69909G2).setOnClickListener(new View.OnClickListener() { // from class: l.h7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108149a.m46070b3(view);
            }
        });
        findViewById(adc0.f69926H2).setOnClickListener(new View.OnClickListener() { // from class: l.i7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113289a.m46071c3(view);
            }
        });
        findViewById(adc0.f69943I2).setOnClickListener(new View.OnClickListener() { // from class: l.k7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124288a.m46072d3(view);
            }
        });
        findViewById(adc0.f69977K2).setOnClickListener(new View.OnClickListener() { // from class: l.l7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130373a.m46073e3(view);
            }
        });
        findViewById(adc0.f69994L2).setOnClickListener(new View.OnClickListener() { // from class: l.m7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135098a.m46074f3(view);
            }
        });
        findViewById(adc0.f70011M2).setOnClickListener(new View.OnClickListener() { // from class: l.n7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140623a.m46075g3(view);
            }
        });
        findViewById(adc0.f70028N2).setOnClickListener(new View.OnClickListener() { // from class: l.o7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145293a.m46076h3(view);
            }
        });
        findViewById(adc0.f70045O2).setOnClickListener(new View.OnClickListener() { // from class: l.p7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150959a.m46077i3(view);
            }
        });
        findViewById(adc0.f70062P2).setOnClickListener(new View.OnClickListener() { // from class: l.q7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155999a.m46078k3(view);
            }
        });
        findViewById(adc0.f70079Q2).setOnClickListener(new View.OnClickListener() { // from class: l.s7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166708a.m46079m3(view);
            }
        });
        findViewById(adc0.f70096R2).setOnClickListener(new View.OnClickListener() { // from class: l.t7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172463a.m46080n3(view);
            }
        });
        findViewById(adc0.f70113S2).setOnClickListener(new View.OnClickListener() { // from class: l.u7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177932a.m46081o3(view);
            }
        });
        findViewById(adc0.f70130T2).setOnClickListener(new ViewOnClickListenerC8474b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public /* synthetic */ void m46043j3(View view) {
        nae0.m162083m(act(), Uri.parse("tantan://privacy_management/contacts?debug=true"));
    }

    /* JADX INFO: renamed from: m2 */
    public static /* synthetic */ void m46046m2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public /* synthetic */ void m46050p3(View view) {
        nae0.m162083m(act(), Uri.parse("tantan://privacy_management/editprofile?debug=true"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public /* synthetic */ void m46052q3(View view) {
        iz40.m142760E(this.act, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public /* synthetic */ void m46054r3(View view) {
        xxv.m213583j(this.act, 0, new x20() { // from class: l.j8r
            @Override // p153l.x20
            public final void call() {
                LabelDemoAct.m46019A2();
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public /* synthetic */ void m46057u3(Bundle bundle) {
        init();
    }

    /* JADX INFO: renamed from: R2 */
    public final /* synthetic */ void m46062R2(View view) {
        CoreModule.m30932N().mo61560nm(this.act, 0);
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ void m46063S2(View view) {
        CoreModule.m30932N().mo61560nm(this.act, 0);
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m46064T2(View view) {
        CoreModule.m30932N().mo61560nm(this.act, 1);
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m46065U2(View view) {
        pk50.m172568j().m172574f().m181681s0(this.act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m46066V2(View view) {
        pq4.m173308p(this.act);
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ void m46067W2(View view) {
        pq4.m173308p(this.act);
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m46068X2(View view) {
        iz40.m142763H(this.act, -1, true);
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m46069Z2(View view) {
        iz40.m142763H(this.act, 1, true);
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m46070b3(View view) {
        Question questionNew_ = Question.new_();
        questionNew_.text = "哈哈哈哈";
        questionNew_.f56859id = "123445";
        new lwb0(this.act, questionNew_).show();
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m46071c3(View view) {
        C8064o.m38704r(this.act, CoreModule.f18264c.f20381e0.m116593na());
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m46072d3(View view) {
        quq.m178185U(this.act);
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m46073e3(View view) {
        quq.m178184T(this.act);
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m46074f3(View view) {
        nae0.m162083m(act(), Uri.parse("tantan://privacy_management/verification?debug=true"));
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ void m46075g3(View view) {
        nae0.m162083m(act(), Uri.parse("tantan://privacy_management/leak?debug=true"));
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ void m46076h3(View view) {
        new sxa0(act(), "selected_users_card").m188474K(1, new x20() { // from class: l.g8r
            @Override // p153l.x20
            public final void call() {
                LabelDemoAct.m46034a2();
            }
        });
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ void m46077i3(View view) {
        new sxa0(act(), "selected_users_card").m188474K(2, new x20() { // from class: l.h8r
            @Override // p153l.x20
            public final void call() {
                LabelDemoAct.m46020B2();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(kec0.f125912k6, viewGroup, false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.g7r
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102619a.m46057u3((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m46078k3(View view) {
        new sxa0(act(), "selected_users_card").m188474K(3, new x20() { // from class: l.e8r
            @Override // p153l.x20
            public final void call() {
                LabelDemoAct.m46046m2();
            }
        });
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m46079m3(View view) {
        new sxa0(act(), "selected_users_card").m188474K(5, new x20() { // from class: l.f8r
            @Override // p153l.x20
            public final void call() {
                LabelDemoAct.m46021C2();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m46080n3(View view) {
        new sxa0(act(), "selected_users_card").m188474K(5, new x20() { // from class: l.i8r
            @Override // p153l.x20
            public final void call() {
                LabelDemoAct.m46030N2();
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m46081o3(View view) {
        CoreModule.f18264c.f20381e0.f89072L5.clear();
        CoreModule.f18264c.f20381e0.f89079M5.clear();
        new d5l(this.act).show();
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m46082s3(View view) {
        CoreModule.m30932N().mo61560nm(this.act, 0);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m46083t3(View view) {
        CoreModule.m30932N().mo61560nm(this.act, 0);
    }
}
