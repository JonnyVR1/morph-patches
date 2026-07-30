package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetTeamInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class hfw {

    /* JADX INFO: renamed from: a */
    public BLiveLovePlanet f109350a = null;

    /* JADX INFO: renamed from: b */
    public InterfaceC17449a f109351b;

    /* JADX INFO: renamed from: l.hfw$a */
    public interface InterfaceC17449a {
        /* JADX INFO: renamed from: W0 */
        void mo134878W0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo);

        /* JADX INFO: renamed from: a2 */
        void mo134879a2(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo);

        /* JADX INFO: renamed from: c */
        void mo134880c();

        /* JADX INFO: renamed from: o0 */
        void mo134881o0(BLiveLovePlanet bLiveLovePlanet);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m134853A(LongLinkVirtualVoice.VoiceLovePlanetUser voiceLovePlanetUser) {
        this.f109350a.playerInfos.add(m134864m(voiceLovePlanetUser));
        this.f109350a.singleUserIds.add(voiceLovePlanetUser.getUserId());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m134854B(final LongLinkVirtualVoice.VoiceLovePlanetUser voiceLovePlanetUser) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = (BLiveLovePlanetPlayerInfo) jyb.m147529r(this.f109350a.playerInfos, new qcj() { // from class: l.dfw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, voiceLovePlanetUser.getUserId()));
            }
        });
        if (NullChecker.m82486a(bLiveLovePlanetPlayerInfo)) {
            bLiveLovePlanetPlayerInfo.receivedScore = voiceLovePlanetUser.getReceivedScore();
            bLiveLovePlanetPlayerInfo.selectPosition = voiceLovePlanetUser.getSelectPosition();
            bLiveLovePlanetPlayerInfo.isLeave = voiceLovePlanetUser.getIsLeave();
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m134855C(LongLinkVirtualVoice.VoiceLovePlanetTeam voiceLovePlanetTeam) {
        this.f109350a.teamInfos.add(m134865n(voiceLovePlanetTeam));
    }

    /* JADX INFO: renamed from: D */
    public final BLiveMaskAvatarConfig m134856D(userMaskConfig.PictureConfig pictureConfig) {
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
    public final void m134857E(List<LongLinkVirtualVoice.VoiceLovePlanetUser> list) {
        jyb.m147537z(list, new y20() { // from class: l.bfw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76550a.m134854B((LongLinkVirtualVoice.VoiceLovePlanetUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public BLiveLovePlanetPlayerInfo m134858F() {
        BLiveLovePlanet bLiveLovePlanet = this.f109350a;
        if (bLiveLovePlanet == null) {
            return null;
        }
        return (BLiveLovePlanetPlayerInfo) jyb.m147529r(bLiveLovePlanet.playerInfos, new qcj() { // from class: l.yew
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, zrv.f205799a.m207631D0()));
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m134859G(BLiveLovePlanet bLiveLovePlanet) {
        this.f109350a = bLiveLovePlanet;
    }

    /* JADX INFO: renamed from: H */
    public void m134860H(InterfaceC17449a interfaceC17449a) {
        this.f109351b = interfaceC17449a;
    }

    /* JADX INFO: renamed from: I */
    public final void m134861I(LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
        BLiveLovePlanet bLiveLovePlanet = this.f109350a;
        List<BLiveLovePlanetTeamInfo> list = bLiveLovePlanet.teamInfos;
        if (list == null) {
            bLiveLovePlanet.teamInfos = list;
        } else {
            list.clear();
        }
        list.clear();
        jyb.m147537z(voiceLiveLovePlanetUpdate.getTeamsList(), new y20() { // from class: l.afw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71069a.m134855C((LongLinkVirtualVoice.VoiceLovePlanetTeam) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public void m134862J(final String str, BLiveAvatarFrameConfig bLiveAvatarFrameConfig) {
        BLiveLovePlanet bLiveLovePlanet;
        if (bLiveAvatarFrameConfig == null || (bLiveLovePlanet = this.f109350a) == null) {
            return;
        }
        if (NullChecker.m82486a(bLiveLovePlanet.host) && TextUtils.equals(this.f109350a.host.userId, str) && NullChecker.m82486a(this.f109350a.host.avatarConfig)) {
            BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = this.f109350a.host;
            bLiveLovePlanetPlayerInfo.avatarConfig.frameConfig = bLiveAvatarFrameConfig;
            this.f109351b.mo134879a2(bLiveLovePlanetPlayerInfo);
        } else {
            BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo2 = (BLiveLovePlanetPlayerInfo) jyb.m147529r(this.f109350a.playerInfos, new qcj() { // from class: l.xew
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, str));
                }
            });
            if (NullChecker.m82486a(bLiveLovePlanetPlayerInfo2) && NullChecker.m82486a(bLiveLovePlanetPlayerInfo2.avatarConfig)) {
                bLiveLovePlanetPlayerInfo2.avatarConfig.frameConfig = bLiveAvatarFrameConfig;
                this.f109351b.mo134881o0(this.f109350a);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m134863l(final String str) {
        BLiveLovePlanet bLiveLovePlanet = this.f109350a;
        if (bLiveLovePlanet == null) {
            return false;
        }
        if (NullChecker.m82486a(bLiveLovePlanet.host) && TextUtils.equals(str, this.f109350a.host.userId)) {
            return NullChecker.m82486a(this.f109350a.host.avatarConfig) && this.f109350a.host.avatarConfig.frameConfig.checkNeedChangeVoice();
        }
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo = (BLiveLovePlanetPlayerInfo) jyb.m147529r(this.f109350a.playerInfos, new qcj() { // from class: l.cfw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLovePlanetPlayerInfo) obj).userId, str));
            }
        });
        return NullChecker.m82486a(bLiveLovePlanetPlayerInfo) && NullChecker.m82486a(bLiveLovePlanetPlayerInfo.avatarConfig) && bLiveLovePlanetPlayerInfo.avatarConfig.frameConfig.checkNeedChangeVoice();
    }

    /* JADX INFO: renamed from: m */
    public BLiveLovePlanetPlayerInfo m134864m(LongLinkVirtualVoice.VoiceLovePlanetUser voiceLovePlanetUser) {
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
        bLiveLovePlanetPlayerInfoNew_.avatarConfig = m134856D(voiceLovePlanetUser.getAvatarConfig().getFrameConfig());
        return bLiveLovePlanetPlayerInfoNew_;
    }

    /* JADX INFO: renamed from: n */
    public final BLiveLovePlanetTeamInfo m134865n(LongLinkVirtualVoice.VoiceLovePlanetTeam voiceLovePlanetTeam) {
        BLiveLovePlanetTeamInfo bLiveLovePlanetTeamInfoNew_ = BLiveLovePlanetTeamInfo.new_();
        bLiveLovePlanetTeamInfoNew_.otherUserId = voiceLovePlanetTeam.getOtherUserId();
        bLiveLovePlanetTeamInfoNew_.userId = voiceLovePlanetTeam.getUserId();
        bLiveLovePlanetTeamInfoNew_.totalScore = voiceLovePlanetTeam.getTotalScore();
        bLiveLovePlanetTeamInfoNew_.tip = voiceLovePlanetTeam.getTips();
        return bLiveLovePlanetTeamInfoNew_;
    }

    /* JADX INFO: renamed from: o */
    public final void m134866o(List<LongLinkVirtualVoice.VoiceLovePlanetUser> list) {
        jyb.m147537z(list, new y20() { // from class: l.zew
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204088a.m134877z((LongLinkVirtualVoice.VoiceLovePlanetUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m134867p(final String str) {
        return NullChecker.m82486a(this.f109350a) && jyb.m147520m(this.f109350a.playerInfos, new qcj() { // from class: l.efw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveLovePlanetPlayerInfo) obj).userId));
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public BLiveLovePlanet m134868q() {
        return this.f109350a;
    }

    /* JADX INFO: renamed from: r */
    public String m134869r() {
        return NullChecker.m82486a(this.f109350a) ? this.f109350a.stage.toString() : "unknown_";
    }

    /* JADX INFO: renamed from: s */
    public BLiveLovePlanetPlayerInfo m134870s() {
        if (NullChecker.m82486a(this.f109350a)) {
            return this.f109350a.host;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public BLiveLovePlanetPlayerInfo m134871t() {
        if (NullChecker.m82486a(this.f109350a)) {
            return this.f109350a.mvp;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public void m134872u(LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
        fhw.m125605a(VirtualVoiceMotionType.lovePlanet, voiceLiveLovePlanetUpdate.toString());
        if (this.f109350a == null) {
            this.f109351b.mo134880c();
        }
        switch (voiceLiveLovePlanetUpdate.getUpdateType()) {
            case refreshLovePlanet:
                this.f109351b.mo134880c();
                break;
            case updateMvp:
                this.f109350a.mvp = m134864m(voiceLiveLovePlanetUpdate.getMvp());
                this.f109351b.mo134878W0(this.f109350a.mvp);
                break;
            case insertHost:
                this.f109350a.host = m134864m(voiceLiveLovePlanetUpdate.getHost());
                this.f109351b.mo134879a2(this.f109350a.host);
                break;
            case deleteHost:
                this.f109350a.host = null;
                this.f109351b.mo134879a2(null);
                break;
            case updatePlayers:
                m134857E(voiceLiveLovePlanetUpdate.getPlayersList());
                this.f109351b.mo134881o0(this.f109350a);
                break;
            case insertPlayers:
                m134874w(voiceLiveLovePlanetUpdate.getPlayersList());
                this.f109351b.mo134881o0(this.f109350a);
                break;
            case deletePlayers:
                m134866o(voiceLiveLovePlanetUpdate.getPlayersList());
                this.f109351b.mo134881o0(this.f109350a);
                break;
            case updateTeamAndPlayer:
                m134861I(voiceLiveLovePlanetUpdate);
                m134857E(voiceLiveLovePlanetUpdate.getPlayersList());
                this.f109351b.mo134881o0(this.f109350a);
                break;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m134873v(LongLinkVirtualVoice.VoiceLiveLovePlanetUpdate voiceLiveLovePlanetUpdate) {
        try {
            m134872u(voiceLiveLovePlanetUpdate);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m134874w(List<LongLinkVirtualVoice.VoiceLovePlanetUser> list) {
        jyb.m147537z(list, new y20() { // from class: l.wew
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188729a.m134853A((LongLinkVirtualVoice.VoiceLovePlanetUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public boolean m134875x(String str) {
        BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo;
        BLiveLovePlanet bLiveLovePlanet = this.f109350a;
        return (bLiveLovePlanet == null || (bLiveLovePlanetPlayerInfo = bLiveLovePlanet.host) == null || !TextUtils.equals(bLiveLovePlanetPlayerInfo.userId, str) || TextUtils.isEmpty(str)) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public boolean m134876y() {
        BLiveLovePlanet bLiveLovePlanet = this.f109350a;
        if (bLiveLovePlanet == null) {
            return false;
        }
        return "introduction".equals(bLiveLovePlanet.stage.toString()) || LovePlanetStage.result.equals(this.f109350a.stage.toString()) || LovePlanetStage.choice.equals(this.f109350a.stage.toString()) || "trip".equals(this.f109350a.stage.toString());
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m134877z(final LongLinkVirtualVoice.VoiceLovePlanetUser voiceLovePlanetUser) {
        jyb.m147503d0(this.f109350a.playerInfos, new qcj() { // from class: l.ffw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(voiceLovePlanetUser.getUserId(), ((BLiveLovePlanetPlayerInfo) obj).userId));
            }
        });
        jyb.m147503d0(this.f109350a.singleUserIds, new qcj() { // from class: l.gfw
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(voiceLovePlanetUser.getUserId(), (String) obj));
            }
        });
    }
}
