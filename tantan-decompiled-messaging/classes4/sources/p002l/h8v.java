package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p1.mobile.putong.live.base.data.BLiveVoiceKtvPanelBgInfo;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h8v extends bk2<LongLinkVoiceKtv.VoiceKTVPanelBg, BLiveVoiceKtvPanelBgInfo> {
    public h8v(p3g0<BLiveVoiceKtvPanelBgInfo, BLiveVoiceKtvPanelBgInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVoiceKtv.VoiceKTVPanelBg voiceKTVPanelBg, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceKtvPanelBgInfo mo9251z(String str, LongLinkVoiceKtv.VoiceKTVPanelBg voiceKTVPanelBg) {
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfoNew_ = BLiveVoiceKtvPanelBgInfo.new_();
        bLiveVoiceKtvPanelBgInfoNew_.url = voiceKTVPanelBg.getUrl();
        bLiveVoiceKtvPanelBgInfoNew_.remainSeconds = voiceKTVPanelBg.getRemainSeconds();
        bLiveVoiceKtvPanelBgInfoNew_.updatedTime = voiceKTVPanelBg.getUpdatedTime();
        bLiveVoiceKtvPanelBgInfoNew_.gameId = voiceKTVPanelBg.getGameId();
        bLiveVoiceKtvPanelBgInfoNew_.userId = voiceKTVPanelBg.getUserId();
        return bLiveVoiceKtvPanelBgInfoNew_;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceKtv.VoiceKTVPanelBg> mo9244b() {
        return LongLinkVoiceKtv.VoiceKTVPanelBg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicetrick.ktv.panelBgInfo";
    }
}
