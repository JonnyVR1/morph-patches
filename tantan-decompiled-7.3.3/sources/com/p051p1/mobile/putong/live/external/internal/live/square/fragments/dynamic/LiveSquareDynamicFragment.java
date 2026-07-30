package com.p051p1.mobile.putong.live.external.internal.live.square.fragments.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedMomentListType;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import p151v.VFrame;
import p153l.fog;
import p153l.ldc0;
import p153l.mbs;
import p153l.t1u;
import p153l.zrv;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareDynamicFragment extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public Fragment f45847A;

    /* JADX INFO: renamed from: z */
    public VFrame f45848z;

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        super.mo70115Y4();
        Fragment fragment = this.f45847A;
        if (fragment == null || !(fragment instanceof PutongFrag)) {
            return;
        }
        ((PutongFrag) fragment).mo30635I4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        mbs.m157821G().mo68456mg().mo184064d(this);
        m70228l5();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70227k5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k5 */
    public View m70227k5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t1u.m188935b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l5 */
    public void m70228l5() {
        fog fogVarMo61449C6 = mbs.m157857i().mo61449C6(FeedMomentListType.LIVE_SQUARE_DYNAMIC);
        Bundle bundle = new Bundle();
        bundle.putString("user_id", zrv.f205799a.m207631D0());
        this.f45847A = fogVarMo61449C6.mo121747a(getChildFragmentManager(), ldc0.f131558i0, bundle);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        mbs.m157821G().mo68456mg().mo184063c();
    }
}
