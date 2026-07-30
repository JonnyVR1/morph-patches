package com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.life;

import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.Media;
import java.util.List;
import p149l.g0x;
import p149l.l0x;
import p149l.lqa;

/* JADX INFO: loaded from: classes3.dex */
public class MarryLoopLifeMomentFrag extends MarryEditProfileBaseMvpFrag<g0x, l0x> {
    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo47499Q4(List<Media> list) {
        super.mo47499Q4(list);
        ((l0x) this.f30419A).m148132C(list);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S3 */
    public void mo47501S3(String str) {
        super.mo47501S3(str);
        ((l0x) this.f30419A).m148131B(str);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public g0x mo47491N4() {
        return new g0x(this);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public l0x mo47492O4() {
        return new l0x(act(), this);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        MarrySeriesType marrySeriesTypeM220976q0 = act().m47453Z1().m220976q0();
        if (marrySeriesTypeM220976q0 == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return lqa.m150985w() ? "p_edit_lifestyle" : "p_upload_photos";
        }
        return marrySeriesTypeM220976q0 == MarrySeriesType.LIFE_MOMENT ? "p_edit_life_moment" : super.pageId();
    }
}
