package com.p051p1.mobile.putong.core.newui.home.themeslide;

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
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import p153l.cvl;
import p153l.eui0;
import p153l.jyb;
import p153l.nh00;
import p153l.pf60;
import p153l.sxl0;
import p153l.tel;
import p153l.uj4;
import p153l.uxl0;
import p153l.y20;
import p153l.yfl;

/* JADX INFO: loaded from: classes11.dex */
public class HomeThemeSlideFrag extends NewMainContextFrag implements uxl0 {

    /* JADX INFO: renamed from: B */
    public tel f24084B;

    /* JADX INFO: renamed from: C */
    public yfl f24085C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m39828X4(boolean z, Bundle bundle) {
        this.f24084B.m190841z2(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m39830Y4() {
        if (nh00.m163018b().m163023g()) {
            mo30636J4().m152781p(pf60.m172085a("momentcard_contenttype", nh00.m163018b().m163019c()));
        }
        mo30636J4().m152777l();
    }

    @Override // p153l.uxl0
    /* JADX INFO: renamed from: d2 */
    public sxl0 mo37757d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f24085C.m215747y0(virtualCardType, userInfo);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f24084B = new tel(this);
        yfl yflVar = new yfl(act(), this);
        this.f24085C = yflVar;
        this.f24084B.mo52715C(yflVar);
        uj4.m196317b(CacheCardType.DEFAULT_CARD).mo136053g(act(), act());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f24084B.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f24085C.m215734r();
        m39830Y4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f24085C.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        this.pageHelper.m152781p(jyb.m147494Y("momentcard_contenttype", eui0.m122571a()));
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f24084B.m190838x2(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            mo30636J4().m152776k();
        } else {
            mo30636J4().m152777l();
        }
        if (lifecycle_() == C4470c.f16265g || lifecycle_() == C4470c.f16266h || lifecycle_() == C4470c.f16267i || lifecycle_() == C4470c.f16268j || lifecycle_() == C4470c.f16269k || lifecycle_() == C4470c.f16270l) {
            this.f24084B.m190841z2(z);
        } else {
            creates(new y20() { // from class: l.rcl
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162222a.m39828X4(z, (Bundle) obj);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f24085C.m215725m1();
        if (((cvl) getParentFragment()).mo39558T() == NewTanFragTag.MOMENT_THEME_CARD && act().m40820i6(TabName.Card)) {
            mo30636J4().m152776k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f24084B.m190781C2(i, strArr, iArr);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (((cvl) getParentFragment()).mo39558T() == NewTanFragTag.MOMENT_THEME_CARD && act().m40820i6(TabName.Card)) {
            mo30636J4().m152777l();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f24085C.m215727n1();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f24085C.m215729o1();
        super.onStop();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_activity_momentcard_view";
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        super.mo21604y4();
        this.f24084B.m190783D2();
    }
}
