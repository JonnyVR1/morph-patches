package p153l;

import com.p051p1.mobile.putong.data.Live;
import com.p051p1.mobile.putong.data.LiveBubbleConfig;
import com.p051p1.mobile.putong.data.LiveState;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.data.RecommendInfo;
import com.p051p1.mobile.putong.data.StreamCdnInfo;
import com.p051p1.mobile.putong.data.StreamUrl;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveOwner;
import com.p051p1.mobile.putong.live.base.data.BLiveRecommendInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamCdnInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class erf {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LiveBubbleConfig m122169a(BLiveBubbleConfig bLiveBubbleConfig) {
        LiveBubbleConfig liveBubbleConfigNew_ = LiveBubbleConfig.new_();
        liveBubbleConfigNew_.type = bLiveBubbleConfig.type;
        liveBubbleConfigNew_.bubbleTextList = bLiveBubbleConfig.bubbleTextList;
        liveBubbleConfigNew_.bubbleShowAfterWatch = bLiveBubbleConfig.bubbleShowAfterWatch;
        liveBubbleConfigNew_.bubbleDisappear = bLiveBubbleConfig.bubbleDisappear;
        liveBubbleConfigNew_.bubbleEveryDayShowMaxCount = bLiveBubbleConfig.bubbleEveryDayShowMaxCount;
        liveBubbleConfigNew_.bubbleStartColor = bLiveBubbleConfig.bubbleStartColor;
        liveBubbleConfigNew_.bubbleEndColor = bLiveBubbleConfig.bubbleEndColor;
        liveBubbleConfigNew_.bubbleTextColor = bLiveBubbleConfig.bubbleTextColor;
        liveBubbleConfigNew_.bubbleUserShowMaxCount = bLiveBubbleConfig.bubbleUserShowMaxCount;
        liveBubbleConfigNew_.bubbleTimeInterval = bLiveBubbleConfig.bubbleTimeInterval;
        liveBubbleConfigNew_.f39618id = bLiveBubbleConfig.f45188id;
        liveBubbleConfigNew_.subType = bLiveBubbleConfig.subType;
        liveBubbleConfigNew_.bubbleShowNotMatchedTimes = bLiveBubbleConfig.bubbleShowNotMatchedTimes;
        liveBubbleConfigNew_.bubbleShowDisappearDays = bLiveBubbleConfig.bubbleShowDisappearDays;
        return liveBubbleConfigNew_;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<LiveBubbleConfig> m122171c(BLiveMonetizationConfig bLiveMonetizationConfig) {
        return bLiveMonetizationConfig == null ? jyb.m147507f0(LiveBubbleConfig.new_()) : jyb.m147486Q(bLiveMonetizationConfig.bubbleConfigs, new qcj() { // from class: l.drf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return erf.m122169a((BLiveBubbleConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static f7s m122172d(BLiveCounter bLiveCounter) {
        f7s f7sVar = new f7s();
        if (bLiveCounter == null) {
            return f7sVar;
        }
        f7sVar.f97595h = bLiveCounter.discoverReddot;
        f7sVar.f97588a = bLiveCounter.liveTabUnread;
        f7sVar.f97591d = bLiveCounter.activity.discoverUnread;
        f7sVar.f97590c = jyb.m147486Q(bLiveCounter.voiceLiveTextRedDot, new qcj() { // from class: l.crf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveCommonViewConfig) obj).text;
            }
        });
        BLiveActivityCounter bLiveActivityCounter = bLiveCounter.activity;
        f7sVar.f97593f = bLiveActivityCounter.squareDetailUnread;
        f7sVar.f97592e = bLiveActivityCounter.squareSummaryUnread;
        f7sVar.f97594g = bLiveActivityCounter.voiceActivityUnread;
        f7sVar.f97589b = bLiveCounter.voiceLiveReddot;
        return f7sVar;
    }

    /* JADX INFO: renamed from: e */
    public static BLive m122173e(Live live) {
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f45171id = live.f39615id;
        bLiveNew_.room = m122174f(live.room);
        bLiveNew_.anchor = m122174f(live.anchor);
        bLiveNew_.streamUrl = m122178j(live.streamUrl);
        bLiveNew_.rewardPoint = live.rewardPoint;
        bLiveNew_.memberCount = live.memberCount;
        bLiveNew_.startTime = live.startTime;
        bLiveNew_.state = m122176h(live.state);
        bLiveNew_.type = live.type;
        bLiveNew_.endTime = live.endTime;
        bLiveNew_.streamCdnInfo = m122177i(live.streamCdnInfo);
        bLiveNew_.recommendInfo = m122175g(live.recommendInfo);
        bLiveNew_.source = live.source;
        bLiveNew_.videoCapture = live.videoCapture;
        bLiveNew_.callback = live.callback;
        return bLiveNew_;
    }

    /* JADX INFO: renamed from: f */
    public static BLiveOwner m122174f(Owner owner) {
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveOwnerNew_.f45267id = owner.f39651id;
        bLiveOwnerNew_.type = owner.type;
        return bLiveOwnerNew_;
    }

    /* JADX INFO: renamed from: g */
    public static BLiveRecommendInfo m122175g(RecommendInfo recommendInfo) {
        BLiveRecommendInfo bLiveRecommendInfoNew_ = BLiveRecommendInfo.new_();
        bLiveRecommendInfoNew_.category = recommendInfo.category;
        bLiveRecommendInfoNew_.cachedSize = recommendInfo.cachedSize;
        return bLiveRecommendInfoNew_;
    }

    /* JADX INFO: renamed from: h */
    public static BLiveState m122176h(LiveState liveState) {
        if (TEnum.equals(liveState, "onlive")) {
            return BLiveState.get("onlive");
        }
        if (TEnum.equals(liveState, "suspended")) {
            return BLiveState.get("suspended");
        }
        return TEnum.equals(liveState, "stopped") ? BLiveState.get("stopped") : BLiveState.get("unknown_");
    }

    /* JADX INFO: renamed from: i */
    public static BLiveStreamCdnInfo m122177i(StreamCdnInfo streamCdnInfo) {
        BLiveStreamCdnInfo bLiveStreamCdnInfoNew_ = BLiveStreamCdnInfo.new_();
        bLiveStreamCdnInfoNew_.provider = streamCdnInfo.provider;
        bLiveStreamCdnInfoNew_.businessType = streamCdnInfo.businessType;
        return bLiveStreamCdnInfoNew_;
    }

    /* JADX INFO: renamed from: j */
    public static BLiveStreamUrl m122178j(StreamUrl streamUrl) {
        BLiveStreamUrl bLiveStreamUrlNew_ = BLiveStreamUrl.new_();
        bLiveStreamUrlNew_.pullHls = streamUrl.pullHls;
        bLiveStreamUrlNew_.pullFlv = streamUrl.pullFlv;
        bLiveStreamUrlNew_.pullRtmp = streamUrl.pullRtmp;
        bLiveStreamUrlNew_.push = streamUrl.push;
        return bLiveStreamUrlNew_;
    }
}
