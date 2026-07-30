package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.j760;
import p003l.hww;
import p003l.iww;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class MarryEditProfileBaseMvpFrag<PP extends hww, VV extends iww> extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VV f310A;

    /* JADX INFO: renamed from: B */
    public boolean f311B = false;

    /* JADX INFO: renamed from: z */
    public PP f312z;

    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public MarryEditProfileSeriesAct act() {
        return super/*com.p1.mobile.android.app.Frag*/.act();
    }

    /* JADX INFO: renamed from: N4 */
    public abstract PP mo539N4();

    /* JADX INFO: renamed from: O4 */
    public abstract VV mo540O4();

    /* JADX INFO: renamed from: P4 */
    public boolean m546P4() {
        return this.f311B;
    }

    /* JADX INFO: renamed from: Q4 */
    public void mo547Q4(List<Media> list) {
    }

    /* JADX INFO: renamed from: R4 */
    public void m548R4() {
        this.f311B = true;
    }

    /* JADX INFO: renamed from: S3 */
    public void mo549S3(String str) {
    }

    /* JADX INFO: renamed from: d4 */
    public final void m550d4() {
        super.d4();
        this.f312z = (PP) mo539N4();
        VV vv = (VV) mo540O4();
        this.f310A = vv;
        this.f312z.C(vv);
        this.f312z.mo3954Z();
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m551f4() {
        super.f4();
        this.f312z.a0();
    }

    @Nullable
    public final View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f310A.inflateView(layoutInflater, viewGroup);
    }

    public void onCreate(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
        if (act().m503c2()) {
            J4().p(new j760[]{j760.a("edit_specific_profile_show_from", "selected_users_complete_profile")});
        } else if (act().m502b2()) {
            J4().p(new j760[]{j760.a("edit_specific_profile_show_from", "like_ideal_reach_limit")});
        } else {
            J4().p(new j760[]{j760.a("edit_specific_profile_show_from", "marriage")});
        }
    }

    public void onDestroyView() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroyView();
        if (NullChecker.a(act())) {
            act().hideInput();
        }
    }

    public String pageId() {
        MarrySeriesType marrySeriesTypeM9549q0 = act().m500Z1().m9549q0();
        return marrySeriesTypeM9549q0 == null ? getClass().getName() : marrySeriesTypeM9549q0.getPageId();
    }
}
