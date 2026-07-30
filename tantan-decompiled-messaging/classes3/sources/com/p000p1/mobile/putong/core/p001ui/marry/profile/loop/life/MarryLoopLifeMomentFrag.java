package com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.life;

import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.data.Media;
import java.util.List;
import l.lqa;
import p003l.g0x;
import p003l.l0x;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryLoopLifeMomentFrag extends MarryEditProfileBaseMvpFrag<g0x, l0x> {
    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo547Q4(List<Media> list) {
        super.mo547Q4(list);
        ((l0x) this.f310A).m5927C(list);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S3 */
    public void mo549S3(String str) {
        super.mo549S3(str);
        ((l0x) this.f310A).m5926B(str);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public g0x mo539N4() {
        return new g0x(this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public l0x mo540O4() {
        return new l0x(act(), this);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    public String pageId() {
        MarrySeriesType marrySeriesTypeM9549q0 = act().m500Z1().m9549q0();
        if (marrySeriesTypeM9549q0 == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return lqa.w() ? "p_edit_lifestyle" : "p_upload_photos";
        }
        return marrySeriesTypeM9549q0 == MarrySeriesType.LIFE_MOMENT ? "p_edit_life_moment" : super.pageId();
    }
}
