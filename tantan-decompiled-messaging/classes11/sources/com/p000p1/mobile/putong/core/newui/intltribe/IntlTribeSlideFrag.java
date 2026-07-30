package com.p000p1.mobile.putong.core.newui.intltribe;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.VirtualCardType;
import l.e30;
import l.ool0;
import l.qol0;
import p009l.hhp;
import p009l.pip;
import p009l.vi4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlTribeSlideFrag extends NewMainContextFrag implements qol0 {

    /* JADX INFO: renamed from: B */
    public hhp f3115B;

    /* JADX INFO: renamed from: C */
    public pip f3116C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m3584X4(boolean z, Bundle bundle) {
        this.f3115B.m15828p2(z);
    }

    /* JADX INFO: renamed from: Y4 */
    private void m3585Y4() {
        J4().l();
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m3586B4() {
        return false;
    }

    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public IntlTribeSwipeAct act() {
        return getActivity();
    }

    /* JADX INFO: renamed from: d2 */
    public ool0 m3588d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f3116C.m20429u0(virtualCardType, userInfo);
    }

    /* JADX INFO: renamed from: d4 */
    public void m3589d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        this.f3115B = new hhp(this);
        pip pipVar = new pip(act(), this);
        this.f3116C = pipVar;
        this.f3115B.C(pipVar);
        vi4.m23379b(CacheCardType.DEFAULT_CARD).mo12119g(act(), act());
    }

    /* JADX INFO: renamed from: f4 */
    public void m3590f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        this.f3115B.m15806a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m3591g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f3116C.m20366D0(getArguments());
        m3585Y4();
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3116C.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m3592n4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.n4(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        this.f3115B.m15824n2(i, i2, intent);
    }

    public void onHiddenChanged(final boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        if (lifecycle_() == c.g || lifecycle_() == c.h || lifecycle_() == c.i || lifecycle_() == c.j || lifecycle_() == c.k || lifecycle_() == c.l) {
            this.f3115B.m15828p2(z);
        } else {
            creates(new e30() { // from class: l.ofp
                public final void call(Object obj) {
                    this.f18002a.m3584X4(z, (Bundle) obj);
                }
            });
        }
    }

    public void onPause() {
        super.onPause();
        this.f3116C.m20419o1();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super/*androidx.fragment.app.Fragment*/.onRequestPermissionsResult(i, strArr, iArr);
        this.f3115B.m15831s2(i, strArr, iArr);
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        this.f3116C.m20421p1();
        onHiddenChanged(false);
    }

    public void onStart() {
        super/*com.p1.mobile.android.app.Frag*/.onStart();
    }

    public void onStop() {
        this.f3116C.m20423q1();
        onHiddenChanged(true);
        super/*com.p1.mobile.android.app.Frag*/.onStop();
    }

    /* JADX INFO: renamed from: y4 */
    public void m3593y4() {
        super/*com.p1.mobile.android.app.Frag*/.y4();
        this.f3115B.m15832t2();
    }
}
