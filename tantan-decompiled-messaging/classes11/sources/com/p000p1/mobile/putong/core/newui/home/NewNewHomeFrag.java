package com.p000p1.mobile.putong.core.newui.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import l.aa40;
import l.co5;
import l.cwf0;
import l.d30;
import l.e30;
import l.j760;
import l.ool0;
import l.qol0;
import l.sa40;
import l.upa;
import l.zvf0;
import p009l.eyl;
import p009l.i0e;
import p009l.mdj0;
import p009l.nt30;
import p009l.yni;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewNewHomeFrag extends NewMainContextFrag implements qol0, eyl {

    /* JADX INFO: renamed from: B */
    public nt30 f455B;

    /* JADX INFO: renamed from: C */
    public ViewTreeObserverOnGlobalLayoutListenerC0030b f456C;

    /* JADX INFO: renamed from: D */
    public mdj0 f457D;

    /* JADX INFO: renamed from: B4 */
    public boolean m687B4() {
        return false;
    }

    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> m688C4() {
        return NullChecker.a(this.f455B) ? this.f455B.m19422f5() : super/*com.p1.mobile.putong.app.PutongFrag*/.C4();
    }

    /* JADX INFO: renamed from: D4 */
    public boolean m689D4(MotionEvent motionEvent, boolean z) {
        mdj0 mdj0Var = this.f457D;
        return mdj0Var != null ? mdj0Var.m18409h(motionEvent, z) : super/*com.p1.mobile.putong.app.PutongFrag*/.D4(motionEvent, z);
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: F3 */
    public void mo690F3() {
        this.f456C.m1189S2();
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: I */
    public void mo691I() {
        if (NullChecker.a(this.f456C)) {
            this.f456C.m1254e6();
        }
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: J0 */
    public void mo692J0() {
        this.f456C.m1183R2();
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: K */
    public void mo693K(boolean z) {
        this.f456C.m1176P6(z);
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: O3 */
    public void mo694O3() {
        if (NullChecker.a(this.f456C)) {
            this.f456C.m1172P2();
        }
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: T1 */
    public void mo695T1(int i) {
        this.f456C.m1304o6(i);
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: T2 */
    public void mo696T2() {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_add_tag_confirm_popup", Dialog.class.getName());
        aa40 aa40Var = new aa40(act());
        aa40Var.I(new aa40.a() { // from class: l.hk30
            public final void onClick(String str) {
                this.f14163a.m703a5(str);
            }
        });
        aa40Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ik30
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        });
        aa40Var.show();
        i0e.m16065f(cwf0VarM16062c);
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: U1 */
    public void mo697U1(int i) {
        o4(i);
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: V */
    public void mo698V(SwipeDirection swipeDirection) {
        if (NullChecker.a(this.f456C)) {
            this.f456C.m1092A2().mo2797A(swipeDirection);
        }
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: V1 */
    public View mo699V1() {
        return this.f456C.m1092A2().mo2805d();
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: Y1 */
    public String mo700Y1(int i) {
        return x4(i);
    }

    /* JADX INFO: renamed from: Y4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return getActivity();
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m702Z4(boolean z, Bundle bundle) {
        this.f455B.m19510z8(z);
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m703a5(String str) {
        if (TextUtils.equals(str, "action_add")) {
            mo715s3("p_add_tag_confirm_popup");
            zvf0.r("e_confirm_popup_add_button", "p_add_tag_confirm_popup");
        } else if (TextUtils.equals(str, "action_notadd")) {
            this.f456C.m1092A2().mo2797A(SwipeDirection.LEFT);
        }
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: b3 */
    public void mo704b3(SwipeDirection swipeDirection, boolean z) {
        if (NullChecker.a(this.f456C)) {
            this.f456C.m1092A2().mo2816r(swipeDirection, z);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public void m705b5(boolean z) {
    }

    /* JADX INFO: renamed from: d2 */
    public ool0 m706d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f456C.m1149L2(virtualCardType, userInfo);
    }

    /* JADX INFO: renamed from: d4 */
    public void m707d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        this.f457D = new mdj0(getActivity(), true);
        this.f455B = new nt30(this);
        ViewTreeObserverOnGlobalLayoutListenerC0030b viewTreeObserverOnGlobalLayoutListenerC0030b = new ViewTreeObserverOnGlobalLayoutListenerC0030b(act(), this, this.f457D);
        this.f456C = viewTreeObserverOnGlobalLayoutListenerC0030b;
        this.f455B.C(viewTreeObserverOnGlobalLayoutListenerC0030b);
        this.f455B.m19391Z();
        yni.m25472d(LaunchStep.HomeFragWait);
    }

    /* JADX INFO: renamed from: f4 */
    public void m708f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        this.f455B.m19396a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m709g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f456C.m1315r();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f456C.inflateView(layoutInflater, viewGroup);
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: l1 */
    public int mo710l1() {
        return this.f456C.m1092A2().getMeasuredWidthProxy();
    }

    /* JADX INFO: renamed from: o */
    public boolean m711o() {
        return this.f456C.m1299o();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        this.f455B.m19502x8(i, i2, intent);
    }

    public void onHiddenChanged(final boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        if (z) {
            J4().k();
            co5.c();
        } else {
            J4().l();
        }
        if (lifecycle_() == c.g || lifecycle_() == c.h || lifecycle_() == c.i || lifecycle_() == c.j || lifecycle_() == c.k || lifecycle_() == c.l) {
            this.f455B.m19510z8(z);
        } else {
            creates(new e30() { // from class: l.gk30
                public final void call(Object obj) {
                    this.f13611a.m702Z4(z, (Bundle) obj);
                }
            });
        }
    }

    public void onPause() {
        super.onPause();
        this.f456C.m1352y5();
        if (getParentFragment().mo2537T() == NewTanFragTag.HOME && act().m3888e6(TabName.Card)) {
            J4().k();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super/*androidx.fragment.app.Fragment*/.onRequestPermissionsResult(i, strArr, iArr);
        this.f455B.m19301D8(i, strArr, iArr);
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        if (getParentFragment().mo2537T() == NewTanFragTag.HOME && act().m3888e6(TabName.Card)) {
            J4().l();
        }
        this.f456C.m1094A5();
    }

    public void onStart() {
        super/*com.p1.mobile.android.app.Frag*/.onStart();
        this.f456C.m1099B5();
    }

    public void onStop() {
        this.f456C.m1105C5();
        super/*com.p1.mobile.android.app.Frag*/.onStop();
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: p0 */
    public int mo712p0() {
        return this.f456C.m1092A2().getMeasuredHeightProxy();
    }

    public String pageId() {
        return (upa.N3() && ExpandedCardStyleHelper.m2064o().m2077s()) ? "p_suggest_user_profile_info_view" : "p_suggest_users_home_view";
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: q1 */
    public Act mo713q1() {
        return act();
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: r2 */
    public void mo714r2() {
        this.f456C.m1298n6();
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: s3 */
    public void mo715s3(String str) {
        sa40.o().D(this, 3002, str, false);
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: u0 */
    public String mo716u0() {
        return pageId();
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: u1 */
    public void mo717u1(int i) {
        this.f456C.m1100B6(i);
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: v0 */
    public void mo718v0() {
        s4();
    }

    /* JADX INFO: renamed from: y4 */
    public void m719y4() {
        super/*com.p1.mobile.android.app.Frag*/.y4();
        this.f455B.m19313G8();
    }

    @Override // p009l.eyl
    /* JADX INFO: renamed from: z1 */
    public <T> rx.c<T> mo720z1(rx.c<T> cVar) {
        return duringCreated(cVar);
    }
}
