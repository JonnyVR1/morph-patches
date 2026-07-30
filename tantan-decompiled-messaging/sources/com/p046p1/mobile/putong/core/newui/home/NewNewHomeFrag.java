package com.p046p1.mobile.putong.core.newui.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import p133rx.C22306c;
import p149l.aa40;
import p149l.co5;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.eyl;
import p149l.i0e;
import p149l.j760;
import p149l.mdj0;
import p149l.nt30;
import p149l.ool0;
import p149l.psl;
import p149l.qol0;
import p149l.sa40;
import p149l.upa;
import p149l.yni;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class NewNewHomeFrag extends NewMainContextFrag implements qol0, eyl {

    /* JADX INFO: renamed from: B */
    public nt30 f21677B;

    /* JADX INFO: renamed from: C */
    public ViewTreeObserverOnGlobalLayoutListenerC7866b f21678C;

    /* JADX INFO: renamed from: D */
    public mdj0 f21679D;

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> mo29633C4() {
        return NullChecker.m81303a(this.f21677B) ? this.f21677B.m161216f5() : super.mo29633C4();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: D4 */
    public boolean mo29634D4(MotionEvent motionEvent, boolean z) {
        mdj0 mdj0Var = this.f21679D;
        return mdj0Var != null ? mdj0Var.m154072h(motionEvent, z) : super.mo29634D4(motionEvent, z);
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: F3 */
    public void mo36738F3() {
        this.f21678C.m37221S2();
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: I */
    public void mo36739I() {
        if (NullChecker.m81303a(this.f21678C)) {
            this.f21678C.m37286e6();
        }
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: J0 */
    public void mo36740J0() {
        this.f21678C.m37215R2();
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: K */
    public void mo36741K(boolean z) {
        this.f21678C.m37208P6(z);
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: O3 */
    public void mo36742O3() {
        if (NullChecker.m81303a(this.f21678C)) {
            this.f21678C.m37204P2();
        }
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: T1 */
    public void mo36743T1(int i) {
        this.f21678C.m37335o6(i);
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: T2 */
    public void mo36744T2() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_add_tag_confirm_popup", Dialog.class.getName());
        aa40 aa40Var = new aa40(act());
        aa40Var.m95528I(new aa40.InterfaceC15554a() { // from class: l.hk30
            @Override // p149l.aa40.InterfaceC15554a
            public final void onClick(String str) {
                this.f108150a.m36751a5(str);
            }
        });
        aa40Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ik30
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        aa40Var.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: U1 */
    public void mo36745U1(int i) {
        m20595o4(i);
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: V */
    public void mo36746V(SwipeDirection swipeDirection) {
        if (NullChecker.m81303a(this.f21678C)) {
            this.f21678C.m37125A2().mo38801A(swipeDirection);
        }
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: V1 */
    public View mo36747V1() {
        return this.f21678C.m37125A2().mo38809d();
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: Y1 */
    public String mo36748Y1(int i) {
        return m20604x4(i);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: Y4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m36750Z4(boolean z, Bundle bundle) {
        this.f21677B.m161304z8(z);
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m36751a5(String str) {
        if (TextUtils.equals(str, "action_add")) {
            mo36760s3("p_add_tag_confirm_popup");
            zvf0.m220396r("e_confirm_popup_add_button", "p_add_tag_confirm_popup");
        } else if (TextUtils.equals(str, "action_notadd")) {
            this.f21678C.m37125A2().mo38801A(SwipeDirection.LEFT);
        }
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: b3 */
    public void mo36752b3(SwipeDirection swipeDirection, boolean z) {
        if (NullChecker.m81303a(this.f21678C)) {
            this.f21678C.m37125A2().mo38820r(swipeDirection, z);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public void m36753b5(boolean z) {
    }

    @Override // p149l.qol0
    /* JADX INFO: renamed from: d2 */
    public ool0 mo36754d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f21678C.m37181L2(virtualCardType, userInfo);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f21679D = new mdj0(getActivity(), true);
        this.f21677B = new nt30(this);
        ViewTreeObserverOnGlobalLayoutListenerC7866b viewTreeObserverOnGlobalLayoutListenerC7866b = new ViewTreeObserverOnGlobalLayoutListenerC7866b(act(), this, this.f21679D);
        this.f21678C = viewTreeObserverOnGlobalLayoutListenerC7866b;
        this.f21677B.mo51532C(viewTreeObserverOnGlobalLayoutListenerC7866b);
        this.f21677B.mo39469Z();
        yni.m215415d(LaunchStep.HomeFragWait);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f21677B.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f21678C.m37346r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f21678C.inflateView(layoutInflater, viewGroup);
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: l1 */
    public int mo36755l1() {
        return this.f21678C.m37125A2().getMeasuredWidthProxy();
    }

    /* JADX INFO: renamed from: o */
    public boolean m36756o() {
        return this.f21678C.m37330o();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f21677B.m161296x8(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            mo29638J4().m109035k();
            co5.m107931c();
        } else {
            mo29638J4().m109036l();
        }
        if (lifecycle_() == C4319c.f15546g || lifecycle_() == C4319c.f15547h || lifecycle_() == C4319c.f15548i || lifecycle_() == C4319c.f15549j || lifecycle_() == C4319c.f15550k || lifecycle_() == C4319c.f15551l) {
            this.f21677B.m161304z8(z);
        } else {
            creates(new e30() { // from class: l.gk30
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103146a.m36750Z4(z, (Bundle) obj);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f21678C.m37383y5();
        if (((psl) getParentFragment()).mo38555T() == NewTanFragTag.HOME && act().m39812e6(TabName.Card)) {
            mo29638J4().m109035k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f21677B.m161097D8(i, strArr, iArr);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (((psl) getParentFragment()).mo38555T() == NewTanFragTag.HOME && act().m39812e6(TabName.Card)) {
            mo29638J4().m109036l();
        }
        this.f21678C.m37127A5();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f21678C.m37132B5();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f21678C.m37137C5();
        super.onStop();
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: p0 */
    public int mo36757p0() {
        return this.f21678C.m37125A2().getMeasuredHeightProxy();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return (upa.m194675N3() && ExpandedCardStyleHelper.m38090o().m38103s()) ? OMSDialogPositon.p_suggest_user_profile_info_view : "p_suggest_users_home_view";
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: q1 */
    public Act mo36758q1() {
        return act();
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: r2 */
    public void mo36759r2() {
        this.f21678C.m37329n6();
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: s3 */
    public void mo36760s3(String str) {
        sa40.m182802o().m182806D(this, 3002, str, false);
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: u0 */
    public String mo36761u0() {
        return pageId();
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: u1 */
    public void mo36762u1(int i) {
        this.f21678C.m37133B6(i);
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: v0 */
    public void mo36763v0() {
        m20599s4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        super.mo20605y4();
        this.f21677B.m161109G8();
    }

    @Override // p149l.eyl
    /* JADX INFO: renamed from: z1 */
    public <T> C22306c<T> mo36764z1(C22306c<T> c22306c) {
        return duringCreated(c22306c);
    }
}
