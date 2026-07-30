package com.p046p1.mobile.putong.feed.api;

import android.content.Context;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.tantanapp.android.injecter.facade.annotation.Route;
import java.util.HashSet;
import p149l.C18367m2;
import p149l.adh;
import p149l.aih;
import p149l.djx;
import p149l.okg;
import p149l.orh0;
import p149l.vrx;
import p149l.xh5;

/* JADX INFO: loaded from: classes12.dex */
@Route(name = "putong-common 使用的 feed 服务", path = "/feed_common_service/service")
public class FeedCommonServiceImpl implements FeedCommonService {

    /* JADX INFO: renamed from: a */
    public C18367m2 f39189a = new okg();

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: B5 */
    public void mo60228B5(Act act, Video video, String str) {
        if (video.duration < (djx.m112144h().m112145a() + 1) * 1000) {
            act.startActivity(VideoEditAct.m61234Z1(act, video.url, false, str));
        } else {
            act.startActivity(NewAlbumVideoEditAct.m62403K2(act, video, str));
        }
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: H0 */
    public String mo60229H0() {
        return Moment.DB_ADAPTER.CREATE_TABLE(new orh0(Moments.TYPE, Moment.DB_ADAPTER, null, 1));
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: O0 */
    public HashSet<String> mo60230O0(Envelope envelope, Integer num) {
        HashSet<String> hashSet = new HashSet<>();
        envelope.localOptions = num.intValue();
        for (Moment moment : ((FeedData) envelope.getModuleData(FeedData.class)).moments) {
            moment.localInFeed = (xh5.MOMENT_IN_FEED & num.intValue()) != 0;
            moment.localInUserFeed = true;
            hashSet.add(moment.f56011id);
        }
        return hashSet;
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: R0 */
    public vrx mo60231R0() {
        return new adh();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: nh */
    public vrx mo60232nh() {
        return new aih();
    }
}
