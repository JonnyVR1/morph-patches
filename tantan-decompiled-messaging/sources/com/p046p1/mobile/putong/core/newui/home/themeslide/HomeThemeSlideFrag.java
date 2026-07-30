package com.p046p1.mobile.putong.core.newui.home.themeslide;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import p149l.dcl;
import p149l.e30;
import p149l.e900;
import p149l.eli0;
import p149l.idl;
import p149l.j760;
import p149l.ool0;
import p149l.psl;
import p149l.qol0;
import p149l.vi4;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class HomeThemeSlideFrag extends NewMainContextFrag implements qol0 {

    /* JADX INFO: renamed from: B */
    public dcl f23342B;

    /* JADX INFO: renamed from: C */
    public idl f23343C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m38825X4(boolean z, Bundle bundle) {
        this.f23342B.m110859z2(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m38827Y4() {
        if (e900.m115330b().m115335g()) {
            mo29638J4().m109040p(j760.m140076a("momentcard_contenttype", e900.m115330b().m115331c()));
        }
        mo29638J4().m109036l();
    }

    @Override // p149l.qol0
    /* JADX INFO: renamed from: d2 */
    public ool0 mo36754d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f23343C.m135594y0(virtualCardType, userInfo);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f23342B = new dcl(this);
        idl idlVar = new idl(act(), this);
        this.f23343C = idlVar;
        this.f23342B.mo51532C(idlVar);
        vi4.m198496b(CacheCardType.DEFAULT_CARD).mo102633g(act(), act());
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f23342B.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f23343C.m135581r();
        m38827Y4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f23343C.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        this.pageHelper.m109040p(vwb.m200311Y("momentcard_contenttype", eli0.m117121a()));
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f23342B.m110856x2(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            mo29638J4().m109035k();
        } else {
            mo29638J4().m109036l();
        }
        if (lifecycle_() == C4319c.f15546g || lifecycle_() == C4319c.f15547h || lifecycle_() == C4319c.f15548i || lifecycle_() == C4319c.f15549j || lifecycle_() == C4319c.f15550k || lifecycle_() == C4319c.f15551l) {
            this.f23342B.m110859z2(z);
        } else {
            creates(new e30() { // from class: l.bal
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74700a.m38825X4(z, (Bundle) obj);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f23343C.m135572m1();
        if (((psl) getParentFragment()).mo38555T() == NewTanFragTag.MOMENT_THEME_CARD && act().m39812e6(TabName.Card)) {
            mo29638J4().m109035k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f23342B.m110799C2(i, strArr, iArr);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (((psl) getParentFragment()).mo38555T() == NewTanFragTag.MOMENT_THEME_CARD && act().m39812e6(TabName.Card)) {
            mo29638J4().m109036l();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f23343C.m135574n1();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f23343C.m135576o1();
        super.onStop();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_activity_momentcard_view";
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        super.mo20605y4();
        this.f23342B.m110801D2();
    }
}
