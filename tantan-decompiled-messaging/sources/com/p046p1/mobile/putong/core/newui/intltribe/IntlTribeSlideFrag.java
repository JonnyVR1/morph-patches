package com.p046p1.mobile.putong.core.newui.intltribe;

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
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import p149l.e30;
import p149l.hhp;
import p149l.ool0;
import p149l.pip;
import p149l.qol0;
import p149l.vi4;

/* JADX INFO: loaded from: classes11.dex */
public class IntlTribeSlideFrag extends NewMainContextFrag implements qol0 {

    /* JADX INFO: renamed from: B */
    public hhp f24337B;

    /* JADX INFO: renamed from: C */
    public pip f24338C;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m39522X4(boolean z, Bundle bundle) {
        this.f24337B.m131085p2(z);
    }

    /* JADX INFO: renamed from: Y4 */
    private void m39523Y4() {
        mo29638J4().m109036l();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public IntlTribeSwipeAct act() {
        return (IntlTribeSwipeAct) getActivity();
    }

    @Override // p149l.qol0
    /* JADX INFO: renamed from: d2 */
    public ool0 mo36754d2(VirtualCardType virtualCardType, CoreSuggested.UserInfo userInfo) {
        return this.f24338C.m169744u0(virtualCardType, userInfo);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f24337B = new hhp(this);
        pip pipVar = new pip(act(), this);
        this.f24338C = pipVar;
        this.f24337B.mo51532C(pipVar);
        vi4.m198496b(CacheCardType.DEFAULT_CARD).mo102633g(act(), act());
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f24337B.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f24338C.m169682D0(getArguments());
        m39523Y4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f24338C.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f24337B.m131081n2(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        if (lifecycle_() == C4319c.f15546g || lifecycle_() == C4319c.f15547h || lifecycle_() == C4319c.f15548i || lifecycle_() == C4319c.f15549j || lifecycle_() == C4319c.f15550k || lifecycle_() == C4319c.f15551l) {
            this.f24337B.m131085p2(z);
        } else {
            creates(new e30() { // from class: l.ofp
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143729a.m39522X4(z, (Bundle) obj);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f24338C.m169734o1();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f24337B.m131088s2(i, strArr, iArr);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f24338C.m169736p1();
        onHiddenChanged(false);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        this.f24338C.m169738q1();
        onHiddenChanged(true);
        super.onStop();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo20605y4() {
        super.mo20605y4();
        this.f24337B.m131089t2();
    }
}
