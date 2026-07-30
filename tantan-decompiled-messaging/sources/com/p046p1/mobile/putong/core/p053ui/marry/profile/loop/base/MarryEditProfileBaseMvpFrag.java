package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.hww;
import p149l.iww;
import p149l.j760;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MarryEditProfileBaseMvpFrag<PP extends hww, VV extends iww> extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VV f30419A;

    /* JADX INFO: renamed from: B */
    public boolean f30420B = false;

    /* JADX INFO: renamed from: z */
    public PP f30421z;

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct act() {
        return (MarryEditProfileSeriesAct) super.act();
    }

    /* JADX INFO: renamed from: N4 */
    public abstract PP mo47491N4();

    /* JADX INFO: renamed from: O4 */
    public abstract VV mo47492O4();

    /* JADX INFO: renamed from: P4 */
    public boolean m47498P4() {
        return this.f30420B;
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo47499Q4(List<Media> list) {
    }

    /* JADX INFO: renamed from: R4 */
    public void m47500R4() {
        this.f30420B = true;
    }

    /* JADX INFO: renamed from: S3 */
    public void mo47501S3(String str) {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public final void mo20583d4() {
        super.mo20583d4();
        this.f30421z = (PP) mo47491N4();
        VV vv = (VV) mo47492O4();
        this.f30419A = vv;
        this.f30421z.mo51532C(vv);
        this.f30421z.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public final void mo20585f4() {
        super.mo20585f4();
        this.f30421z.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public final View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f30419A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (act().m47456c2()) {
            mo29638J4().m109040p(j760.m140076a("edit_specific_profile_show_from", "selected_users_complete_profile"));
        } else if (act().m47455b2()) {
            mo29638J4().m109040p(j760.m140076a("edit_specific_profile_show_from", "like_ideal_reach_limit"));
        } else {
            mo29638J4().m109040p(j760.m140076a("edit_specific_profile_show_from", "marriage"));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (NullChecker.m81303a(act())) {
            act().hideInput();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        MarrySeriesType marrySeriesTypeM220976q0 = act().m47453Z1().m220976q0();
        return marrySeriesTypeM220976q0 == null ? getClass().getName() : marrySeriesTypeM220976q0.getPageId();
    }
}
