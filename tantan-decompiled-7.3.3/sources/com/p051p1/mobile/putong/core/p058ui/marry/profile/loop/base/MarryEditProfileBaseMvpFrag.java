package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.gzw;
import p153l.hzw;
import p153l.pf60;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MarryEditProfileBaseMvpFrag<PP extends gzw, VV extends hzw> extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VV f31267A;

    /* JADX INFO: renamed from: B */
    public boolean f31268B = false;

    /* JADX INFO: renamed from: z */
    public PP f31269z;

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct act() {
        return (MarryEditProfileSeriesAct) super.act();
    }

    /* JADX INFO: renamed from: N4 */
    public abstract PP mo48674N4();

    /* JADX INFO: renamed from: O4 */
    public abstract VV mo48675O4();

    /* JADX INFO: renamed from: P4 */
    public boolean m48681P4() {
        return this.f31268B;
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo48682Q4(List<Media> list) {
    }

    /* JADX INFO: renamed from: R4 */
    public void m48683R4() {
        this.f31268B = true;
    }

    /* JADX INFO: renamed from: S3 */
    public void mo48684S3(String str) {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public final void mo21582d4() {
        super.mo21582d4();
        this.f31269z = (PP) mo48674N4();
        VV vv = (VV) mo48675O4();
        this.f31267A = vv;
        this.f31269z.mo52715C(vv);
        this.f31269z.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public final void mo21584f4() {
        super.mo21584f4();
        this.f31269z.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public final View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f31267A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (act().m48639d2()) {
            mo30636J4().m152781p(pf60.m172085a("edit_specific_profile_show_from", "selected_users_complete_profile"));
        } else if (act().m48638c2()) {
            mo30636J4().m152781p(pf60.m172085a("edit_specific_profile_show_from", "like_ideal_reach_limit"));
        } else {
            mo30636J4().m152781p(pf60.m172085a("edit_specific_profile_show_from", "marriage"));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (NullChecker.m82486a(act())) {
            act().hideInput();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        MarrySeriesType marrySeriesTypeM213993q0 = act().m48636a2().m213993q0();
        return marrySeriesTypeM213993q0 == null ? getClass().getName() : marrySeriesTypeM213993q0.getPageId();
    }
}
