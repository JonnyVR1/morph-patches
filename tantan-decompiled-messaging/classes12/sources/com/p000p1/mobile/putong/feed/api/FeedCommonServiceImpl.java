package com.p000p1.mobile.putong.feed.api;

import android.content.Context;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService;
import com.p1.mobile.android.app.Act;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.DbObject;
import java.util.HashSet;
import l.djx;
import l.m2;
import l.vrx;
import l.xh5;
import p007l.adh;
import p007l.aih;
import p007l.okg;
import p007l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
@Route(name = "putong-common 使用的 feed 服务", path = "/feed_common_service/service")
public class FeedCommonServiceImpl implements FeedCommonService {

    /* JADX INFO: renamed from: a */
    public m2 f650a = new okg();

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: B5 */
    public void mo1154B5(Act act, Video video, String str) {
        if (video.duration < (djx.h().a() + 1) * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) {
            act.startActivity(VideoEditAct.m2170Z1(act, video.url, false, str));
        } else {
            act.startActivity(NewAlbumVideoEditAct.m3402K2(act, video, str));
        }
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: H0 */
    public String mo1155H0() {
        return Moment.DB_ADAPTER.CREATE_TABLE(new orh0(Moments.TYPE, Moment.DB_ADAPTER, null, 1));
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: O0 */
    public HashSet<String> mo1156O0(Envelope envelope, Integer num) {
        HashSet<String> hashSet = new HashSet<>();
        envelope.localOptions = num.intValue();
        for (Moment moment : ((FeedData) envelope.getModuleData(FeedData.class)).moments) {
            moment.localInFeed = (xh5.MOMENT_IN_FEED & num.intValue()) != 0;
            moment.localInUserFeed = true;
            hashSet.add(((DbObject) moment).id);
        }
        return hashSet;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: R0 */
    public vrx mo1157R0() {
        return new adh();
    }

    public void init(Context context) {
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.feed.FeedCommonService
    /* JADX INFO: renamed from: nh */
    public vrx mo1158nh() {
        return new aih();
    }
}
