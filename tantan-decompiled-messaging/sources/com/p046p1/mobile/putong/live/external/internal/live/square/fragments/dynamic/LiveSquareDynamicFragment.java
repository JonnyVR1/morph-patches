package com.p046p1.mobile.putong.live.external.internal.live.square.fragments.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import p147v.VFrame;
import p149l.f5c0;
import p149l.l9s;
import p149l.qmg;
import p149l.szt;
import p149l.ypv;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareDynamicFragment extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public Fragment f44999A;

    /* JADX INFO: renamed from: z */
    public VFrame f45000z;

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        super.mo68932Y4();
        Fragment fragment = this.f44999A;
        if (fragment == null || !(fragment instanceof PutongFrag)) {
            return;
        }
        ((PutongFrag) fragment).mo29637I4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        l9s.m149044G().mo67273mg().mo181768d(this);
        m69045l5();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m69044k5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public View m69044k5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return szt.m186798b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l5 */
    public void m69045l5() {
        qmg qmgVarMo60265C6 = l9s.m149080i().mo60265C6(FeedMomentListType.LIVE_SQUARE_DYNAMIC);
        Bundle bundle = new Bundle();
        bundle.putString("user_id", ypv.f199493a.m199309D0());
        this.f44999A = qmgVarMo60265C6.mo170331a(getChildFragmentManager(), f5c0.f95101i0, bundle);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        l9s.m149044G().mo67273mg().mo181767c();
    }
}
