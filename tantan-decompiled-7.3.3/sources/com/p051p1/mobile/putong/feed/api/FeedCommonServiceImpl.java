package com.p051p1.mobile.putong.feed.api;

import android.content.Context;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.tantanapp.android.injecter.facade.annotation.Route;
import java.util.HashSet;
import p153l.C18526m2;
import p153l.asx;
import p153l.dmg;
import p153l.peh;
import p153l.pjh;
import p153l.s0y;
import p153l.wzh0;
import p153l.xi5;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "putong-common 使用的 feed 服务", path = "/feed_common_service/service")
public class FeedCommonServiceImpl implements FeedCommonService {

    /* JADX INFO: renamed from: a */
    public C18526m2 f40037a = new dmg();

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: B5 */
    public void mo61412B5(Act act, Video video, String str) {
        if (video.duration < (asx.m99990h().m99991a() + 1) * 1000) {
            act.startActivity(VideoEditAct.m62418a2(act, video.url, false, str));
        } else {
            act.startActivity(NewAlbumVideoEditAct.m63587L2(act, video, str));
        }
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: H0 */
    public String mo61413H0() {
        return Moment.DB_ADAPTER.CREATE_TABLE(new wzh0(Moments.TYPE, Moment.DB_ADAPTER, null, 1));
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: O0 */
    public HashSet<String> mo61414O0(Envelope envelope, Integer num) {
        HashSet<String> hashSet = new HashSet<>();
        envelope.localOptions = num.intValue();
        for (Moment moment : ((FeedData) envelope.getModuleData(FeedData.class)).moments) {
            moment.localInFeed = (xi5.MOMENT_IN_FEED & num.intValue()) != 0;
            moment.localInUserFeed = true;
            hashSet.add(moment.f56859id);
        }
        return hashSet;
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: R0 */
    public s0y mo61415R0() {
        return new peh();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: nh */
    public s0y mo61416nh() {
        return new pjh();
    }
}
