package com.p051p1.mobile.putong.core.newui.intltribe;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import p153l.hjp;
import p153l.pkp;
import p153l.sxl0;
import p153l.uj4;
import p153l.uxl0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeSlideFrag extends NewMainContextFrag implements uxl0 {

    /* JADX INFO: renamed from: B */
    public hjp f25079B;

    /* JADX INFO: renamed from: C */
    public pkp f25080C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m40525X4(boolean z, Bundle bundle) {
        this.f25079B.m135489p2(z);
    }

    /* JADX INFO: renamed from: Y4 */
    private void m40526Y4() {
        mo30636J4().m152777l();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public IntlTribeSwipeAct act() {
        return (IntlTribeSwipeAct) getActivity();
    }

    @Override // p153l.uxl0
    /* JADX INFO: renamed from: d2 */
    public sxl0 mo37757d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f25080C.m172740u0(virtualCardType, userInfo);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f25079B = new hjp(this);
        pkp pkpVar = new pkp(act(), this);
        this.f25080C = pkpVar;
        this.f25079B.mo52715C(pkpVar);
        uj4.m196317b(CacheCardType.DEFAULT_CARD).mo136053g(act(), act());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f25079B.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f25080C.m172678D0(getArguments());
        m40526Y4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f25080C.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f25079B.m135485n2(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        if (lifecycle_() == C4470c.f16265g || lifecycle_() == C4470c.f16266h || lifecycle_() == C4470c.f16267i || lifecycle_() == C4470c.f16268j || lifecycle_() == C4470c.f16269k || lifecycle_() == C4470c.f16270l) {
            this.f25079B.m135489p2(z);
        } else {
            creates(new y20() { // from class: l.ohp
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147470a.m40525X4(z, (Bundle) obj);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f25080C.m172730o1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f25079B.m135492s2(i, strArr, iArr);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f25080C.m172732p1();
        onHiddenChanged(false);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f25080C.m172734q1();
        onHiddenChanged(true);
        super.onStop();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        super.mo21604y4();
        this.f25079B.m135493t2();
    }
}
