package com.p000p1.mobile.putong.core.newui.home.themeslide;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.VirtualCardType;
import l.e30;
import l.e900;
import l.j760;
import l.ool0;
import l.qol0;
import l.vwb;
import p009l.dcl;
import p009l.eli0;
import p009l.idl;
import p009l.vi4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeThemeSlideFrag extends NewMainContextFrag implements qol0 {

    /* JADX INFO: renamed from: B */
    public dcl f2120B;

    /* JADX INFO: renamed from: C */
    public idl f2121C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m2821X4(boolean z, Bundle bundle) {
        this.f2120B.m13170z2(z);
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m2822B4() {
        return false;
    }

    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return getActivity();
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m2824Y4() {
        if (e900.b().g()) {
            J4().p(new j760[]{j760.a("momentcard_contenttype", e900.b().c())});
        }
        J4().l();
    }

    /* JADX INFO: renamed from: d2 */
    public ool0 m2825d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f2121C.m16487y0(virtualCardType, userInfo);
    }

    /* JADX INFO: renamed from: d4 */
    public void m2826d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        this.f2120B = new dcl(this);
        idl idlVar = new idl(act(), this);
        this.f2121C = idlVar;
        this.f2120B.C(idlVar);
        vi4.m23379b(CacheCardType.DEFAULT_CARD).mo12119g(act(), act());
    }

    /* JADX INFO: renamed from: f4 */
    public void m2827f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        this.f2120B.m13134a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m2828g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f2121C.m16474r();
        m2824Y4();
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2121C.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m2829n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
        ((PutongFrag) this).pageHelper.p(new j760[]{vwb.Y("momentcard_contenttype", eli0.m13974a())});
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        this.f2120B.m13167x2(i, i2, intent);
    }

    public void onHiddenChanged(final boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        if (z) {
            J4().k();
        } else {
            J4().l();
        }
        if (lifecycle_() == c.g || lifecycle_() == c.h || lifecycle_() == c.i || lifecycle_() == c.j || lifecycle_() == c.k || lifecycle_() == c.l) {
            this.f2120B.m13170z2(z);
        } else {
            creates(new e30() { // from class: l.bal
                public final void call(Object obj) {
                    this.f9985a.m2821X4(z, (Bundle) obj);
                }
            });
        }
    }

    public void onPause() {
        super.onPause();
        this.f2121C.m16465m1();
        if (getParentFragment().mo2537T() == NewTanFragTag.MOMENT_THEME_CARD && act().m3888e6(TabName.Card)) {
            J4().k();
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super/*androidx.fragment.app.Fragment*/.onRequestPermissionsResult(i, strArr, iArr);
        this.f2120B.m13109C2(i, strArr, iArr);
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        if (getParentFragment().mo2537T() == NewTanFragTag.MOMENT_THEME_CARD && act().m3888e6(TabName.Card)) {
            J4().l();
        }
    }

    public void onStart() {
        super/*com.p1.mobile.android.app.Frag*/.onStart();
        this.f2121C.m16467n1();
    }

    public void onStop() {
        this.f2121C.m16469o1();
        super/*com.p1.mobile.android.app.Frag*/.onStop();
    }

    public String pageId() {
        return "p_activity_momentcard_view";
    }

    /* JADX INFO: renamed from: y4 */
    public void m2830y4() {
        super/*com.p1.mobile.android.app.Frag*/.y4();
        this.f2120B.m13111D2();
    }
}
