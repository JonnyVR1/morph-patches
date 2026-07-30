package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPanelBgInfo;

/* JADX INFO: loaded from: classes4.dex */
public class h8v extends bk2<LongLinkVoiceKtv.VoiceKTVPanelBg, BLiveVoiceKtvPanelBgInfo> {
    public h8v(p3g0<BLiveVoiceKtvPanelBgInfo, BLiveVoiceKtvPanelBgInfo> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVoiceKtv.VoiceKTVPanelBg voiceKTVPanelBg, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceKtvPanelBgInfo mo94461z(String str, LongLinkVoiceKtv.VoiceKTVPanelBg voiceKTVPanelBg) {
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfoNew_ = BLiveVoiceKtvPanelBgInfo.new_();
        bLiveVoiceKtvPanelBgInfoNew_.url = voiceKTVPanelBg.getUrl();
        bLiveVoiceKtvPanelBgInfoNew_.remainSeconds = voiceKTVPanelBg.getRemainSeconds();
        bLiveVoiceKtvPanelBgInfoNew_.updatedTime = voiceKTVPanelBg.getUpdatedTime();
        bLiveVoiceKtvPanelBgInfoNew_.gameId = voiceKTVPanelBg.getGameId();
        bLiveVoiceKtvPanelBgInfoNew_.userId = voiceKTVPanelBg.getUserId();
        return bLiveVoiceKtvPanelBgInfoNew_;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceKtv.VoiceKTVPanelBg> mo94398b() {
        return LongLinkVoiceKtv.VoiceKTVPanelBg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicetrick.ktv.panelBgInfo";
    }
}
