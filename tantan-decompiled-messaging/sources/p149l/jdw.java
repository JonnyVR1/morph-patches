package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetTeamInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class jdw {

    /* JADX INFO: renamed from: a */
    public BLiveLovePlanet f117443a = null;

    /* JADX INFO: renamed from: b */
    public InterfaceC17756a f117444b;

    /* JADX INFO: renamed from: l.jdw$a */
    public interface InterfaceC17756a {
        /* JADX INFO: renamed from: W0 */
        void mo139729W0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo);

        /* JADX INFO: renamed from: a2 */
        void mo139730a2(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo);

        /* JADX INFO: renamed from: c */
        void mo139731c();

        /* JADX INFO: renamed from: o0 */
        void mo139743o0(BLiveLovePlanet bLiveLovePlanet);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m141067A(LongLinkVirtualVoice.VoiceLovePlanetUser voiceLovePlanetUser) {
        this.f117443a.playerInfos.add(m141078m(voiceLovePlanetUser));
        this.f117443a.singleUserIds.add(voiceLovePlanetUser.getUserId());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m141068B(final LongLinkVirtualVoice.VoiceLovePlanetUser voiceLovePlanetUser) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = (BLiveLovePlanetPlayerInfo) vwb.m200346r(this.f117443a.playerInfos, new w9j() { // from class: l.fdw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, voiceLovePlanetUser.getUserId()));
            }
        });
        if (NullChecker.m81303a(bLiveLovePlanetPlayerInfo)) {
            bLiveLovePlanetPlayerInfo.receivedScore = voiceLovePlanetUser.getReceivedScore();
            bLiveLovePlanetPlayerInfo.selectPosition = voiceLovePlanetUser.getSelectPosition();
            bLiveLovePlanetPlayerInfo.isLeave = voiceLovePlanetUser.getIsLeave();
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m141069C(LongLinkVirtualVoice.VoiceLovePlanetTeam voiceLovePlanetTeam) {
        this.f117443a.teamInfos.add(m141079n(voiceLovePlanetTeam));
    }

    /* JADX INFO: renamed from: D */
    public final BLiveMaskAvatarConfig m141070D(userMaskConfig.PictureConfig pictureConfig) {
        BLiveMaskAvatarConfig bLiveMaskAvatarConfigNew_ = BLiveMaskAvatarConfig.new_();
        BLiveAvatarFrameConfig bLiveAvatarFrameConfigNew_ = BLiveAvatarFrameConfig.new_();
        bLiveAvatarFrameConfigNew_.staticUrl = pictureConfig.getStaticUrl();
        bLiveAvatarFrameConfigNew_.dynamicUrl = pictureConfig.getDynamicUrl();
        bLiveAvatarFrameConfigNew_.smallDynamicUrl = pictureConfig.getSmallDynamicUrl();
        bLiveAvatarFrameConfigNew_.mediumDynamicUrl = pictureConfig.getMediumDynamicUrl();
        bLiveAvatarFrameConfigNew_.totalSec = (int) pictureConfig.getTotalSec();
        bLiveAvatarFrameConfigNew_.remainingSec = (int) pictureConfig.getRemainingSec();
        bLiveAvatarFrameConfigNew_.changeVoiceNo = (int) pictureConfig.getChangeVoiceNo();
        bLiveAvatarFrameConfigNew_.endMill = pictureConfig.getEndMill();
        bLiveAvatarFrameConfigNew_.funnyUrl = pictureConfig.getFunnyUrl();
        bLiveMaskAvatarConfigNew_.frameConfig = bLiveAvatarFrameConfigNew_;
        return bLiveMaskAvatarConfigNew_;
    }

    /* JADX INFO: renamed from: E */
    public final void m141071E(List<LongLinkVirtualVoice.VoiceLovePlanetUser> list) {
        vwb.m200354z(list, new e30() { // from class: l.ddw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85680a.m141068B((LongLinkVirtualVoice.VoiceLovePlanetUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public BLiveLovePlanetPlayerInfo m141072F() {
        BLiveLovePlanet bLiveLovePlanet = this.f117443a;
        if (bLiveLovePlanet == null) {
            return null;
        }
        return (BLiveLovePlanetPlayerInfo) vwb.m200346r(bLiveLovePlanet.playerInfos, new w9j() { // from class: l.adw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, ypv.f199493a.m199309D0()));
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m141073G(BLiveLovePlanet bLiveLovePlanet) {
        this.f117443a = bLiveLovePlanet;
    }

    /* JADX INFO: renamed from: H */
    public void m141074H(InterfaceC17756a interfaceC17756a) {
        this.f117444b = interfaceC17756a;
    }

    /* JADX INFO: renamed from: I */
    public final void m141075I(LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
        BLiveLovePlanet bLiveLovePlanet = this.f117443a;
        List<BLiveLovePlanetTeamInfo> list = bLiveLovePlanet.teamInfos;
        if (list == null) {
            bLiveLovePlanet.teamInfos = list;
        } else {
            list.clear();
        }
        list.clear();
        vwb.m200354z(voiceLiveLovePlanetUpdate.getTeamsList(), new e30() { // from class: l.cdw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80413a.m141069C((LongLinkVirtualVoice.VoiceLovePlanetTeam) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m141076J(final String str, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        BLiveLovePlanet bLiveLovePlanet;
        if (bLiveAvatarFrameConfig == null || (bLiveLovePlanet = this.f117443a) == null) {
            return;
        }
        if (NullChecker.m81303a(bLiveLovePlanet.host) && TextUtils.equals(this.f117443a.host.userId, str) && NullChecker.m81303a(this.f117443a.host.avatarConfig)) {
            BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.f117443a.host;
            bLiveLovePlanetPlayerInfo.avatarConfig.frameConfig = bLiveAvatarFrameConfig;
            this.f117444b.mo139730a2(bLiveLovePlanetPlayerInfo);
        } else {
            BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo2 = (BLiveLovePlanetPlayerInfo) vwb.m200346r(this.f117443a.playerInfos, new w9j() { // from class: l.zcw
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, str));
                }
            });
            if (NullChecker.m81303a(bLiveLovePlanetPlayerInfo2) && NullChecker.m81303a(bLiveLovePlanetPlayerInfo2.avatarConfig)) {
                bLiveLovePlanetPlayerInfo2.avatarConfig.frameConfig = bLiveAvatarFrameConfig;
                this.f117444b.mo139743o0(this.f117443a);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m141077l(final String str) {
        BLiveLovePlanet bLiveLovePlanet = this.f117443a;
        if (bLiveLovePlanet == null) {
            return false;
        }
        if (NullChecker.m81303a(bLiveLovePlanet.host) && TextUtils.equals(str, this.f117443a.host.userId)) {
            return NullChecker.m81303a(this.f117443a.host.avatarConfig) && this.f117443a.host.avatarConfig.frameConfig.checkNeedChangeVoice();
        }
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = (BLiveLovePlanetPlayerInfo) vwb.m200346r(this.f117443a.playerInfos, new w9j() { // from class: l.edw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, str));
            }
        });
        return NullChecker.m81303a(bLiveLovePlanetPlayerInfo) && NullChecker.m81303a(bLiveLovePlanetPlayerInfo.avatarConfig) && bLiveLovePlanetPlayerInfo.avatarConfig.frameConfig.checkNeedChangeVoice();
    }

    /* JADX INFO: renamed from: m */
    public BLiveLovePlanetPlayerInfo m141078m(LongLinkVirtualVoice.VoiceLovePlanetUser voiceLovePlanetUser) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfoNew_ = BLiveLovePlanetPlayerInfo.new_();
        bLiveLovePlanetPlayerInfoNew_.userId = voiceLovePlanetUser.getUserId();
        bLiveLovePlanetPlayerInfoNew_.userName = voiceLovePlanetUser.getUserName();
        bLiveLovePlanetPlayerInfoNew_.avatar = voiceLovePlanetUser.getAvatar();
        bLiveLovePlanetPlayerInfoNew_.selectPosition = voiceLovePlanetUser.getSelectPosition();
        bLiveLovePlanetPlayerInfoNew_.position = (int) voiceLovePlanetUser.getPosition();
        bLiveLovePlanetPlayerInfoNew_.gender = voiceLovePlanetUser.getGender();
        bLiveLovePlanetPlayerInfoNew_.isLeave = voiceLovePlanetUser.getIsLeave();
        bLiveLovePlanetPlayerInfoNew_.receivedScore = voiceLovePlanetUser.getReceivedScore();
        bLiveLovePlanetPlayerInfoNew_.sendScore = voiceLovePlanetUser.getSendScore();
        bLiveLovePlanetPlayerInfoNew_.avatarConfig = m141070D(voiceLovePlanetUser.getAvatarConfig().getFrameConfig());
        return bLiveLovePlanetPlayerInfoNew_;
    }

    /* JADX INFO: renamed from: n */
    public final BLiveLovePlanetTeamInfo m141079n(LongLinkVirtualVoice.VoiceLovePlanetTeam voiceLovePlanetTeam) {
        BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfoNew_ = BLiveLovePlanetTeamInfo.new_();
        bLiveLovePlanetTeamInfoNew_.otherUserId = voiceLovePlanetTeam.getOtherUserId();
        bLiveLovePlanetTeamInfoNew_.userId = voiceLovePlanetTeam.getUserId();
        bLiveLovePlanetTeamInfoNew_.totalScore = voiceLovePlanetTeam.getTotalScore();
        bLiveLovePlanetTeamInfoNew_.tip = voiceLovePlanetTeam.getTips();
        return bLiveLovePlanetTeamInfoNew_;
    }

    /* JADX INFO: renamed from: o */
    public final void m141080o(List<LongLinkVirtualVoice.VoiceLovePlanetUser> list) {
        vwb.m200354z(list, new e30() { // from class: l.bdw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75080a.m141091z((LongLinkVirtualVoice.VoiceLovePlanetUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m141081p(final String str) {
        return NullChecker.m81303a(this.f117443a) && vwb.m200337m(this.f117443a.playerInfos, new w9j() { // from class: l.gdw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveLovePlanetPlayerInfo) obj).userId));
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public BLiveLovePlanet m141082q() {
        return this.f117443a;
    }

    /* JADX INFO: renamed from: r */
    public String m141083r() {
        return NullChecker.m81303a(this.f117443a) ? this.f117443a.stage.toString() : "unknown_";
    }

    /* JADX INFO: renamed from: s */
    public BLiveLovePlanetPlayerInfo m141084s() {
        if (NullChecker.m81303a(this.f117443a)) {
            return this.f117443a.host;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public BLiveLovePlanetPlayerInfo m141085t() {
        if (NullChecker.m81303a(this.f117443a)) {
            return this.f117443a.mvp;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public void m141086u(LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
        hfw.m130790a(VirtualVoiceMotionType.lovePlanet, voiceLiveLovePlanetUpdate.toString());
        if (this.f117443a == null) {
            this.f117444b.mo139731c();
        }
        switch (voiceLiveLovePlanetUpdate.getUpdateType()) {
            case refreshLovePlanet:
                this.f117444b.mo139731c();
                break;
            case updateMvp:
                this.f117443a.mvp = m141078m(voiceLiveLovePlanetUpdate.getMvp());
                this.f117444b.mo139729W0(this.f117443a.mvp);
                break;
            case insertHost:
                this.f117443a.host = m141078m(voiceLiveLovePlanetUpdate.getHost());
                this.f117444b.mo139730a2(this.f117443a.host);
                break;
            case deleteHost:
                this.f117443a.host = null;
                this.f117444b.mo139730a2(null);
                break;
            case updatePlayers:
                m141071E(voiceLiveLovePlanetUpdate.getPlayersList());
                this.f117444b.mo139743o0(this.f117443a);
                break;
            case insertPlayers:
                m141088w(voiceLiveLovePlanetUpdate.getPlayersList());
                this.f117444b.mo139743o0(this.f117443a);
                break;
            case deletePlayers:
                m141080o(voiceLiveLovePlanetUpdate.getPlayersList());
                this.f117444b.mo139743o0(this.f117443a);
                break;
            case updateTeamAndPlayer:
                m141075I(voiceLiveLovePlanetUpdate);
                m141071E(voiceLiveLovePlanetUpdate.getPlayersList());
                this.f117444b.mo139743o0(this.f117443a);
                break;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m141087v(LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
        try {
            m141086u(voiceLiveLovePlanetUpdate);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m141088w(List<LongLinkVirtualVoice.VoiceLovePlanetUser> list) {
        vwb.m200354z(list, new e30() { // from class: l.ycw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197503a.m141067A((LongLinkVirtualVoice.VoiceLovePlanetUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public boolean m141089x(String str) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo;
        BLiveLovePlanet bLiveLovePlanet = this.f117443a;
        return (bLiveLovePlanet == null || (bLiveLovePlanetPlayerInfo = bLiveLovePlanet.host) == null || !TextUtils.equals(bLiveLovePlanetPlayerInfo.userId, str) || TextUtils.isEmpty(str)) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m141090y() {
        BLiveLovePlanet bLiveLovePlanet = this.f117443a;
        if (bLiveLovePlanet == null) {
            return false;
        }
        return "introduction".equals(bLiveLovePlanet.stage.toString()) || LovePlanetStage.result.equals(this.f117443a.stage.toString()) || LovePlanetStage.choice.equals(this.f117443a.stage.toString()) || "trip".equals(this.f117443a.stage.toString());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m141091z(final LongLinkVirtualVoice.VoiceLovePlanetUser voiceLovePlanetUser) {
        vwb.m200320d0(this.f117443a.playerInfos, new w9j() { // from class: l.hdw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(voiceLovePlanetUser.getUserId(), ((BLiveLovePlanetPlayerInfo) obj).userId));
            }
        });
        vwb.m200320d0(this.f117443a.singleUserIds, new w9j() { // from class: l.idw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(voiceLovePlanetUser.getUserId(), (String) obj));
            }
        });
    }
}
