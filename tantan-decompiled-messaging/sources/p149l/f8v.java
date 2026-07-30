package p149l;

import android.annotation.SuppressLint;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p046p1.mobile.putong.live.base.data.BLiveKtvPlayInfoStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveQuickGiftInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvGameInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPanelBgInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;

/* JADX INFO: loaded from: classes4.dex */
public class f8v extends bk2<LongLinkVoiceKtv.VoiceKTVGame, BLiveVoiceKtvGameInfo> {
    public f8v(p3g0<BLiveVoiceKtvGameInfo, BLiveVoiceKtvGameInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public final BLiveVoiceKtvPanelBgInfo m120050B(LongLinkVoiceKtv.PanelBgInfo panelBgInfo) {
        if (panelBgInfo == null) {
            return null;
        }
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfoNew_ = BLiveVoiceKtvPanelBgInfo.new_();
        bLiveVoiceKtvPanelBgInfoNew_.url = panelBgInfo.getUrl();
        bLiveVoiceKtvPanelBgInfoNew_.updatedTime = panelBgInfo.getUpdatedTime();
        bLiveVoiceKtvPanelBgInfoNew_.remainSeconds = panelBgInfo.getRemainSeconds();
        return bLiveVoiceKtvPanelBgInfoNew_;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: C */
    public final BLiveVoiceKtvPlayInfo m120051C(LongLinkVoiceKtv.PlayInfo playInfo) {
        if (playInfo == null) {
            return null;
        }
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfoNew_ = BLiveVoiceKtvPlayInfo.new_();
        bLiveVoiceKtvPlayInfoNew_.lyricType = playInfo.getLyricType();
        bLiveVoiceKtvPlayInfoNew_.lyricUrl = playInfo.getLyricUrl();
        bLiveVoiceKtvPlayInfoNew_.mask = e1t.m114440b(playInfo.getMask());
        bLiveVoiceKtvPlayInfoNew_.orderId = playInfo.getOrderId();
        bLiveVoiceKtvPlayInfoNew_.prepareRemainSeconds = playInfo.getPrepareRemainSeconds();
        bLiveVoiceKtvPlayInfoNew_.songCode = playInfo.getSongCode();
        bLiveVoiceKtvPlayInfoNew_.songUrl = playInfo.getSongUrl();
        bLiveVoiceKtvPlayInfoNew_.status = BLiveKtvPlayInfoStatus.get(playInfo.getStatus());
        bLiveVoiceKtvPlayInfoNew_.title = playInfo.getTitle();
        bLiveVoiceKtvPlayInfoNew_.userId = playInfo.getUserId();
        bLiveVoiceKtvPlayInfoNew_.cover = playInfo.getCover();
        bLiveVoiceKtvPlayInfoNew_.author = playInfo.getAuthor();
        bLiveVoiceKtvPlayInfoNew_.durationSecond = playInfo.getDurationSecond();
        bLiveVoiceKtvPlayInfoNew_.quickGiftInfo = playInfo.hasQuickGiftInfo() ? m120052D(playInfo.getQuickGiftInfo()) : null;
        bLiveVoiceKtvPlayInfoNew_.provider = playInfo.getProvider();
        bLiveVoiceKtvPlayInfoNew_.schema = playInfo.getSchema();
        bLiveVoiceKtvPlayInfoNew_.score = playInfo.getScore();
        bLiveVoiceKtvPlayInfoNew_.level = playInfo.getLevel();
        bLiveVoiceKtvPlayInfoNew_.orderId = playInfo.getOrderId();
        bLiveVoiceKtvPlayInfoNew_.maxLevel = playInfo.getMaxLevel();
        bLiveVoiceKtvPlayInfoNew_.levelTip = playInfo.getLevelTip();
        bLiveVoiceKtvPlayInfoNew_.showLevel = playInfo.getShowLevel();
        bLiveVoiceKtvPlayInfoNew_.bestSingerName = playInfo.getBestSingerName();
        bLiveVoiceKtvPlayInfoNew_.showBgSvgaUrl = playInfo.getShowBgSvgaUrl();
        bLiveVoiceKtvPlayInfoNew_.giftUv = playInfo.getGiftUv();
        bLiveVoiceKtvPlayInfoNew_.nextLevelGiftUv = playInfo.getNextLevelGiftUv();
        return bLiveVoiceKtvPlayInfoNew_;
    }

    /* JADX INFO: renamed from: D */
    public final BLiveQuickGiftInfo m120052D(LongLinkVoiceKtv.QuickGiftInfo quickGiftInfo) {
        if (quickGiftInfo == null) {
            return null;
        }
        BLiveQuickGiftInfo bLiveQuickGiftInfoNew_ = BLiveQuickGiftInfo.new_();
        bLiveQuickGiftInfoNew_.giftId = (int) quickGiftInfo.getGiftId();
        bLiveQuickGiftInfoNew_.name = quickGiftInfo.getName();
        bLiveQuickGiftInfoNew_.url = quickGiftInfo.getUrl();
        return bLiveQuickGiftInfoNew_;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVoiceKtv.VoiceKTVGame voiceKTVGame, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceKtvGameInfo mo94461z(String str, LongLinkVoiceKtv.VoiceKTVGame voiceKTVGame) {
        BLiveVoiceKtvGameInfo bLiveVoiceKtvGameInfoNew_ = BLiveVoiceKtvGameInfo.new_();
        bLiveVoiceKtvGameInfoNew_.f44503id = voiceKTVGame.getId();
        bLiveVoiceKtvGameInfoNew_.status = voiceKTVGame.getStatus();
        bLiveVoiceKtvGameInfoNew_.playInfo = voiceKTVGame.hasPlayInfo() ? m120051C(voiceKTVGame.getPlayInfo()) : null;
        bLiveVoiceKtvGameInfoNew_.nextPlayInfo = voiceKTVGame.hasNextPlayInfo() ? m120051C(voiceKTVGame.getNextPlayInfo()) : null;
        bLiveVoiceKtvGameInfoNew_.toast = voiceKTVGame.getToast();
        bLiveVoiceKtvGameInfoNew_.panelBgInfo = voiceKTVGame.hasPanelBgInfo() ? m120050B(voiceKTVGame.getPanelBgInfo()) : null;
        return bLiveVoiceKtvGameInfoNew_;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceKtv.VoiceKTVGame> mo94398b() {
        return LongLinkVoiceKtv.VoiceKTVGame.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicetrick.ktv";
    }
}
