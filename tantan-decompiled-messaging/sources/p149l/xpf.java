package p149l;

import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.LiveBubbleConfig;
import com.p046p1.mobile.putong.data.LiveState;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.data.RecommendInfo;
import com.p046p1.mobile.putong.data.StreamCdnInfo;
import com.p046p1.mobile.putong.data.StreamUrl;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveActivityCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveRecommendInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamCdnInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class xpf {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ LiveBubbleConfig m210485a(BLiveBubbleConfig bLiveBubbleConfig) {
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
        liveBubbleConfigNew_.f38770id = bLiveBubbleConfig.f44340id;
        liveBubbleConfigNew_.subType = bLiveBubbleConfig.subType;
        liveBubbleConfigNew_.bubbleShowNotMatchedTimes = bLiveBubbleConfig.bubbleShowNotMatchedTimes;
        liveBubbleConfigNew_.bubbleShowDisappearDays = bLiveBubbleConfig.bubbleShowDisappearDays;
        return liveBubbleConfigNew_;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList<LiveBubbleConfig> m210487c(BLiveMonetizationConfig bLiveMonetizationConfig) {
        return bLiveMonetizationConfig == null ? vwb.m200324f0(LiveBubbleConfig.new_()) : vwb.m200303Q(bLiveMonetizationConfig.bubbleConfigs, new w9j() { // from class: l.wpf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xpf.m210485a((BLiveBubbleConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static e5s m210488d(BLiveCounter bLiveCounter) {
        e5s e5sVar = new e5s();
        if (bLiveCounter == null) {
            return e5sVar;
        }
        e5sVar.f89469h = bLiveCounter.discoverReddot;
        e5sVar.f89462a = bLiveCounter.liveTabUnread;
        e5sVar.f89465d = bLiveCounter.activity.discoverUnread;
        e5sVar.f89464c = vwb.m200303Q(bLiveCounter.voiceLiveTextRedDot, new w9j() { // from class: l.vpf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveCommonViewConfig) obj).text;
            }
        });
        BLiveActivityCounter bLiveActivityCounter = bLiveCounter.activity;
        e5sVar.f89467f = bLiveActivityCounter.squareDetailUnread;
        e5sVar.f89466e = bLiveActivityCounter.squareSummaryUnread;
        e5sVar.f89468g = bLiveActivityCounter.voiceActivityUnread;
        e5sVar.f89463b = bLiveCounter.voiceLiveReddot;
        return e5sVar;
    }

    /* JADX INFO: renamed from: e */
    public static BLive m210489e(Live live) {
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f44323id = live.f38767id;
        bLiveNew_.room = m210490f(live.room);
        bLiveNew_.anchor = m210490f(live.anchor);
        bLiveNew_.streamUrl = m210494j(live.streamUrl);
        bLiveNew_.rewardPoint = live.rewardPoint;
        bLiveNew_.memberCount = live.memberCount;
        bLiveNew_.startTime = live.startTime;
        bLiveNew_.state = m210492h(live.state);
        bLiveNew_.type = live.type;
        bLiveNew_.endTime = live.endTime;
        bLiveNew_.streamCdnInfo = m210493i(live.streamCdnInfo);
        bLiveNew_.recommendInfo = m210491g(live.recommendInfo);
        bLiveNew_.source = live.source;
        bLiveNew_.videoCapture = live.videoCapture;
        bLiveNew_.callback = live.callback;
        return bLiveNew_;
    }

    /* JADX INFO: renamed from: f */
    public static BLiveOwner m210490f(Owner owner) {
        BLiveOwner bLiveOwnerNew_ = BLiveOwner.new_();
        bLiveOwnerNew_.f44419id = owner.f38803id;
        bLiveOwnerNew_.type = owner.type;
        return bLiveOwnerNew_;
    }

    /* JADX INFO: renamed from: g */
    public static BLiveRecommendInfo m210491g(RecommendInfo recommendInfo) {
        BLiveRecommendInfo bLiveRecommendInfoNew_ = BLiveRecommendInfo.new_();
        bLiveRecommendInfoNew_.category = recommendInfo.category;
        bLiveRecommendInfoNew_.cachedSize = recommendInfo.cachedSize;
        return bLiveRecommendInfoNew_;
    }

    /* JADX INFO: renamed from: h */
    public static BLiveState m210492h(LiveState liveState) {
        if (TEnum.equals(liveState, "onlive")) {
            return BLiveState.get("onlive");
        }
        if (TEnum.equals(liveState, "suspended")) {
            return BLiveState.get("suspended");
        }
        return TEnum.equals(liveState, "stopped") ? BLiveState.get("stopped") : BLiveState.get("unknown_");
    }

    /* JADX INFO: renamed from: i */
    public static BLiveStreamCdnInfo m210493i(StreamCdnInfo streamCdnInfo) {
        BLiveStreamCdnInfo bLiveStreamCdnInfoNew_ = BLiveStreamCdnInfo.new_();
        bLiveStreamCdnInfoNew_.provider = streamCdnInfo.provider;
        bLiveStreamCdnInfoNew_.businessType = streamCdnInfo.businessType;
        return bLiveStreamCdnInfoNew_;
    }

    /* JADX INFO: renamed from: j */
    public static BLiveStreamUrl m210494j(StreamUrl streamUrl) {
        BLiveStreamUrl bLiveStreamUrlNew_ = BLiveStreamUrl.new_();
        bLiveStreamUrlNew_.pullHls = streamUrl.pullHls;
        bLiveStreamUrlNew_.pullFlv = streamUrl.pullFlv;
        bLiveStreamUrlNew_.pullRtmp = streamUrl.pullRtmp;
        bLiveStreamUrlNew_.push = streamUrl.push;
        return bLiveStreamUrlNew_;
    }
}
