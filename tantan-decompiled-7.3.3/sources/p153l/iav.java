package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceKtv;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPanelBgInfo;

/* JADX INFO: loaded from: classes4.dex */
public class iav extends jk2<LongLinkVoiceKtv.VoiceKTVPanelBg, BLiveVoiceKtvPanelBgInfo> {
    public iav(wbg0<BLiveVoiceKtvPanelBgInfo, BLiveVoiceKtvPanelBgInfo> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVoiceKtv.VoiceKTVPanelBg voiceKTVPanelBg, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public BLiveVoiceKtvPanelBgInfo mo95993z(String str, LongLinkVoiceKtv.VoiceKTVPanelBg voiceKTVPanelBg) {
        BLiveVoiceKtvPanelBgInfo bLiveVoiceKtvPanelBgInfoNew_ = BLiveVoiceKtvPanelBgInfo.new_();
        bLiveVoiceKtvPanelBgInfoNew_.url = voiceKTVPanelBg.getUrl();
        bLiveVoiceKtvPanelBgInfoNew_.remainSeconds = voiceKTVPanelBg.getRemainSeconds();
        bLiveVoiceKtvPanelBgInfoNew_.updatedTime = voiceKTVPanelBg.getUpdatedTime();
        bLiveVoiceKtvPanelBgInfoNew_.gameId = voiceKTVPanelBg.getGameId();
        bLiveVoiceKtvPanelBgInfoNew_.userId = voiceKTVPanelBg.getUserId();
        return bLiveVoiceKtvPanelBgInfoNew_;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVoiceKtv.VoiceKTVPanelBg> mo95510b() {
        return LongLinkVoiceKtv.VoiceKTVPanelBg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicetrick.ktv.panelBgInfo";
    }
}
