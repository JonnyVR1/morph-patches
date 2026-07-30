package com.p051p1.mobile.putong.core.newui.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import p137rx.C22421c;
import p153l.b240;
import p153l.cvl;
import p153l.gj40;
import p153l.gp5;
import p153l.gra;
import p153l.i4g0;
import p153l.l4g0;
import p153l.oi40;
import p153l.pf60;
import p153l.qmj0;
import p153l.sxl0;
import p153l.uqi;
import p153l.uxl0;
import p153l.w1e;
import p153l.x0m;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class NewNewHomeFrag extends NewMainContextFrag implements uxl0, x0m {

    /* JADX INFO: renamed from: B */
    public b240 f22419B;

    /* JADX INFO: renamed from: C */
    public ViewTreeObserverOnGlobalLayoutListenerC8017b f22420C;

    /* JADX INFO: renamed from: D */
    public qmj0 f22421D;

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends pf60<String, x20>> mo30631C4() {
        return NullChecker.m82486a(this.f22419B) ? this.f22419B.m102010f5() : super.mo30631C4();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: D4 */
    public boolean mo30632D4(MotionEvent motionEvent, boolean z) {
        qmj0 qmj0Var = this.f22421D;
        return qmj0Var != null ? qmj0Var.m177120h(motionEvent, z) : super.mo30632D4(motionEvent, z);
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: F3 */
    public void mo37741F3() {
        this.f22420C.m38224S2();
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: I */
    public void mo37742I() {
        if (NullChecker.m82486a(this.f22420C)) {
            this.f22420C.m38289e6();
        }
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: J0 */
    public void mo37743J0() {
        this.f22420C.m38218R2();
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: K */
    public void mo37744K(boolean z) {
        this.f22420C.m38211P6(z);
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: O3 */
    public void mo37745O3() {
        if (NullChecker.m82486a(this.f22420C)) {
            this.f22420C.m38207P2();
        }
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: T1 */
    public void mo37746T1(int i) {
        this.f22420C.m38338o6(i);
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: T2 */
    public void mo37747T2() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_add_tag_confirm_popup", Dialog.class.getName());
        oi40 oi40Var = new oi40(act());
        oi40Var.m167770I(new oi40.InterfaceC19141a() { // from class: l.vs30
            @Override // p153l.oi40.InterfaceC19141a
            public final void onClick(String str) {
                this.f185555a.m37754a5(str);
            }
        });
        oi40Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ws30
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        oi40Var.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: U1 */
    public void mo37748U1(int i) {
        m21594o4(i);
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: V */
    public void mo37749V(SwipeDirection swipeDirection) {
        if (NullChecker.m82486a(this.f22420C)) {
            this.f22420C.m38128A2().mo39804A(swipeDirection);
        }
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: V1 */
    public View mo37750V1() {
        return this.f22420C.m38128A2().mo39812d();
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: Y1 */
    public String mo37751Y1(int i) {
        return m21603x4(i);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: Y4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m37753Z4(boolean z, Bundle bundle) {
        this.f22419B.m102098z8(z);
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m37754a5(String str) {
        if (TextUtils.equals(str, "action_add")) {
            mo37763s3("p_add_tag_confirm_popup");
            i4g0.m138520r("e_confirm_popup_add_button", "p_add_tag_confirm_popup");
        } else if (TextUtils.equals(str, "action_notadd")) {
            this.f22420C.m38128A2().mo39804A(SwipeDirection.LEFT);
        }
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: b3 */
    public void mo37755b3(SwipeDirection swipeDirection, boolean z) {
        if (NullChecker.m82486a(this.f22420C)) {
            this.f22420C.m38128A2().mo39823r(swipeDirection, z);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public void m37756b5(boolean z) {
    }

    @Override // p153l.uxl0
    /* JADX INFO: renamed from: d2 */
    public sxl0 mo37757d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f22420C.m38184L2(virtualCardType, userInfo);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f22421D = new qmj0(getActivity(), true);
        this.f22419B = new b240(this);
        ViewTreeObserverOnGlobalLayoutListenerC8017b viewTreeObserverOnGlobalLayoutListenerC8017b = new ViewTreeObserverOnGlobalLayoutListenerC8017b(act(), this, this.f22421D);
        this.f22420C = viewTreeObserverOnGlobalLayoutListenerC8017b;
        this.f22419B.mo52715C(viewTreeObserverOnGlobalLayoutListenerC8017b);
        this.f22419B.mo40472Z();
        uqi.m197337d(LaunchStep.HomeFragWait);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f22419B.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f22420C.m38349r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f22420C.inflateView(layoutInflater, viewGroup);
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: l1 */
    public int mo37758l1() {
        return this.f22420C.m38128A2().getMeasuredWidthProxy();
    }

    /* JADX INFO: renamed from: o */
    public boolean m37759o() {
        return this.f22420C.m38333o();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f22419B.m102090x8(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            mo30636J4().m152776k();
            gp5.m131229c();
        } else {
            mo30636J4().m152777l();
        }
        if (lifecycle_() == C4470c.f16265g || lifecycle_() == C4470c.f16266h || lifecycle_() == C4470c.f16267i || lifecycle_() == C4470c.f16268j || lifecycle_() == C4470c.f16269k || lifecycle_() == C4470c.f16270l) {
            this.f22419B.m102098z8(z);
        } else {
            creates(new y20() { // from class: l.us30
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f180726a.m37753Z4(z, (Bundle) obj);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f22420C.m38386y5();
        if (((cvl) getParentFragment()).mo39558T() == NewTanFragTag.HOME && act().m40820i6(TabName.Card)) {
            mo30636J4().m152776k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f22419B.m101891D8(i, strArr, iArr);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (((cvl) getParentFragment()).mo39558T() == NewTanFragTag.HOME && act().m40820i6(TabName.Card)) {
            mo30636J4().m152777l();
        }
        this.f22420C.m38130A5();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f22420C.m38135B5();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f22420C.m38140C5();
        super.onStop();
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: p0 */
    public int mo37760p0() {
        return this.f22420C.m38128A2().getMeasuredHeightProxy();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return (gra.m131606N3() && ExpandedCardStyleHelper.m39093o().m39106s()) ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_suggest_users_home_view";
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: q1 */
    public Act mo37761q1() {
        return act();
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: r2 */
    public void mo37762r2() {
        this.f22420C.m38332n6();
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: s3 */
    public void mo37763s3(String str) {
        gj40.m130415o().m130419D(this, 3002, str, false);
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: u0 */
    public String mo37764u0() {
        return pageId();
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: u1 */
    public void mo37765u1(int i) {
        this.f22420C.m38136B6(i);
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: v0 */
    public void mo37766v0() {
        m21598s4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        super.mo21604y4();
        this.f22419B.m101903G8();
    }

    @Override // p153l.x0m
    /* JADX INFO: renamed from: z1 */
    public <T> C22421c<T> mo37767z1(C22421c<T> c22421c) {
        return duringCreated(c22421c);
    }
}
