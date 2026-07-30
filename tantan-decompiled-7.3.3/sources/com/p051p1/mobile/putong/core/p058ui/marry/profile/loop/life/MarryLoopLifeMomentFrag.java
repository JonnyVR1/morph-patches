package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.life;

import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.Media;
import java.util.List;
import p153l.f3x;
import p153l.k3x;
import p153l.xra;

/* JADX INFO: loaded from: classes3.dex */
public class MarryLoopLifeMomentFrag extends MarryEditProfileBaseMvpFrag<f3x, k3x> {
    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: Q4 */
    public void mo48682Q4(List<Media> list) {
        super.mo48682Q4(list);
        ((k3x) this.f31267A).m148177C(list);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S3 */
    public void mo48684S3(String str) {
        super.mo48684S3(str);
        ((k3x) this.f31267A).m148176B(str);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public f3x mo48674N4() {
        return new f3x(this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public k3x mo48675O4() {
        return new k3x(act(), this);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        MarrySeriesType marrySeriesTypeM213993q0 = act().m48636a2().m213993q0();
        if (marrySeriesTypeM213993q0 == MarrySeriesType.PROFILE_FEATURED_UPLOAD_PHOTOS) {
            return xra.m212804w() ? "p_edit_lifestyle" : "p_upload_photos";
        }
        return marrySeriesTypeM213993q0 == MarrySeriesType.LIFE_MOMENT ? "p_edit_life_moment" : super.pageId();
    }
}
