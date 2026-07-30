package p002l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.vwb;
import l.x4s;
import l.ypv;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zl3 extends ir2 {

    /* JADX INFO: renamed from: a */
    public n1m f23481a;

    /* JADX INFO: renamed from: b */
    public zpd0 f23482b = new zpd0("follow_guide_last_follow_user_chat_button" + ypv.a.D0(), 0L);

    /* JADX INFO: renamed from: c */
    public String f23483c = ypv.a.D0();

    public zl3(n1m n1mVar) {
        this.f23481a = n1mVar;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02ab  */
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        String fields;
        String str;
        String str2 = bLiveTemplateItem.scene;
        BLiveAbsData bLiveAbsData = crc0Var.f8911a;
        String string = "";
        if (bLiveAbsData == null || bLiveAbsData.anchor.id.equals(this.f23483c) || !"follow".equals(str2) || !ypv.k().n6() || !m27404j()) {
            BLiveAbsData bLiveAbsData2 = crc0Var.f8911a;
            if (bLiveAbsData2 != null && !bLiveAbsData2.anchor.id.equals(this.f23483c) && "voiceFollow".equals(str2) && ypv.k().n6() && m27404j()) {
                boolean zB = x4s.b(crc0Var.f8911a.liveMode);
                n1m n1mVar = this.f23481a;
                if (zB) {
                    if (BLiveVoiceFollowship.isFollow(n1mVar.mo9307b())) {
                        string = ypv.e.getString(R$string.f2939Pe);
                        str = "6";
                    } else {
                        string = ypv.e.getString(R$string.f2669D4);
                        str = "5";
                    }
                } else if (Followship.isFollowed(n1mVar.mo9306a()) || User.isMatched(this.f23481a.mo9308c())) {
                    if (crc0Var.f8915e == 3) {
                        str = "4";
                    } else {
                        string = ypv.e.getString(R$string.f2939Pe) + "\n";
                        str = "2";
                    }
                } else if (crc0Var.f8915e == 3) {
                    string = bLiveTemplateItem.text;
                    str = "3";
                } else {
                    string = ypv.e.getString(R$string.f2669D4) + "\n";
                    str = "1";
                }
            } else {
                if ("gift".equals(str2) || "jumpTopRoom".equals(str2) || "followUser".equals(str2) || "callApply".equals(str2) || "voiceCallInvite".equals(str2) || "voiceCallApply".equals(str2) || "joinLotteryGiftRedPacket".equals(str2) || LiveMessage.LiveMessageType.SHOOT_GAME.equals(str2) || "maskModeFollowApply".equals(str2) || "maskModeFollowFollowed".equals(str2) || "maskModeFollowApproved".equals(str2) || "voiceSongGameOver".equals(str2) || "surpriseGiftBox".equals(str2) || "chatReply".equals(str2) || "profile".equals(str2) || "anchorInviteCall".equals(str2) || "voiceFollowUser".equals(str2) || "buttonOpenProfile".equals(str2) || "chat".equals(str2) || "createChatGroup".equals(str2) || "approveChatGroupApply".equals(str2) || "multiCallApply".equals(str2) || "multiCallApprove".equals(str2) || "jumpToVote".equals(str2) || "voiceThankNewUser".equals(str2) || "jumpToSendMessage".equals(str2) || "jumpToFansbasePanel".equals(str2) || "jumpToSetting".equals(str2) || "jumpToMagicFinger".equals(str2) || "schemaJump".equals(str2) || "auctionApprove".equals(str2) || "thankForSendLittleFlame".equals(str2) || "jumpVoiceFlameMarket".equals(str2) || "buttonOpenChat".equals(str2) || "settleApprove".equals(str2) || "grabStarRedPacket".equals(str2) || "roomLevelDetail".equals(str2) || "inviteVoiceCall".equals(str2) || (("userApplyVoiceCall".equals(str2) && ypv.a.D0().equals(crc0Var.f8916f)) || "userRole".equals(str2) || "guideNewUserSendStar".equals(str2) || "voiceRoomApplaud".equals(str2) || "openAnchorGradeWeb".equals(str2) || "openAuctionApplyPanel".equals(str2) || "sendStarToUser".equals(str2) || "returnGift".equals(str2) || "ktvKingCongratulate".equals(str2))) {
                    fields = bLiveTemplateItem.text;
                } else if (!"userProfile".equals(str2) || templateData == null) {
                    str = "";
                } else {
                    fields = templateData.getFields(bLiveTemplateItem.index - 1);
                }
                string = fields;
                str = "";
            }
        } else if (Followship.isFollowed(this.f23481a.mo9306a()) || User.isMatched(this.f23481a.mo9308c())) {
            str = "";
        } else {
            String str3 = bLiveTemplateItem.text;
            this.f23482b.put(Long.valueOf(System.currentTimeMillis()));
            str = "";
            string = str3;
        }
        return vwb.f0(new String[]{string, str});
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: c */
    public boolean mo10623c(List<String> list, BLiveTemplateItem bLiveTemplateItem, crc0 crc0Var) {
        if ("voiceFollow".equals(bLiveTemplateItem.scene)) {
            return super.mo10623c(list, bLiveTemplateItem, crc0Var) && list.size() >= 2;
        }
        if ("chatReply".equals(bLiveTemplateItem.scene) || "voiceThankNewUser".equals(bLiveTemplateItem.scene)) {
            return super.mo10623c(list, bLiveTemplateItem, crc0Var) && this.f23483c.equals(crc0Var.f8916f);
        }
        return super.mo10623c(list, bLiveTemplateItem, crc0Var);
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        jmf0Var.f13874c = uz00.f20887b;
        String str = list.get(0);
        BLiveAbsData bLiveAbsData = crc0Var.f8911a;
        if (bLiveAbsData == null || !bLiveAbsData.isVoiceLive()) {
            m27403i(jmf0Var.f13872a, bLiveTemplateItem, str, jmf0Var.f13873b, crc0Var.f8914d);
        } else {
            boolean zEquals = "voiceFollow".equals(bLiveTemplateItem.scene);
            SpannableStringBuilder spannableStringBuilder = jmf0Var.f13872a;
            if (zEquals) {
                m27405k(spannableStringBuilder, bLiveTemplateItem, list, jmf0Var.f13873b, crc0Var.f8914d);
            } else {
                m27406l(spannableStringBuilder, bLiveTemplateItem, str, jmf0Var.f13873b, crc0Var);
            }
        }
        jmf0Var.f13873b += str.length();
    }

    /* JADX INFO: renamed from: g */
    public final void m27401g(BLiveTemplateItem bLiveTemplateItem, boolean z) {
        if (TextUtils.isEmpty(bLiveTemplateItem.background)) {
            if (z) {
                bLiveTemplateItem.background = "#d27a36";
            } else {
                bLiveTemplateItem.background = "#000000";
            }
        }
    }

    @Override // p002l.k4m
    public String getType() {
        return "button";
    }

    /* JADX INFO: renamed from: h */
    public final int m27402h(String str, boolean z) {
        if (z) {
            return "anchorInviteCall".equals(str) ? 2 : 1;
        }
        return "userRole".equals(str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m27403i(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, String str, int i, LongLinkChatMessage.LiveChatMessage liveChatMessage) {
        spannableStringBuilder.append((CharSequence) str);
        if (TextUtils.isEmpty(bLiveTemplateItem.background)) {
            bLiveTemplateItem.background = "#000000";
        }
        ped0 ped0Var = new ped0(bLiveTemplateItem.scene, bLiveTemplateItem.size, Color.parseColor(bLiveTemplateItem.background), Color.parseColor(bLiveTemplateItem.color));
        spannableStringBuilder.setSpan(ped0Var, i, str.length() + i, 33);
        z2s z2sVar = new z2s(bLiveTemplateItem.scene, ped0Var);
        if (NullChecker.a(liveChatMessage) && liveChatMessage.getH5() != null) {
            z2sVar.m27049g(liveChatMessage.getH5());
        }
        spannableStringBuilder.setSpan(z2sVar, i, str.length() + i, 33);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m27404j() {
        return System.currentTimeMillis() - ((Long) this.f23482b.get()).longValue() > ((long) (ypv.k().L3() * 1000));
    }

    /* JADX INFO: renamed from: k */
    public final void m27405k(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, List<String> list, int i, LongLinkChatMessage.LiveChatMessage liveChatMessage) {
        String str = list.get(0);
        String str2 = list.size() > 1 ? list.get(1) : "";
        spannableStringBuilder.append((CharSequence) str);
        w6n0 w6n0Var = new w6n0(bLiveTemplateItem.scene);
        w6n0Var.m24360g(str2, str);
        spannableStringBuilder.setSpan(w6n0Var, i, str.length() + i, 33);
        x6n0 x6n0Var = new x6n0(bLiveTemplateItem.scene, w6n0Var);
        if (NullChecker.a(liveChatMessage) && liveChatMessage.getH5() != null) {
            x6n0Var.m27049g(liveChatMessage.getH5());
        }
        spannableStringBuilder.setSpan(x6n0Var, i, str.length() + i, 33);
    }

    /* JADX INFO: renamed from: l */
    public final void m27406l(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, String str, int i, crc0 crc0Var) {
        spannableStringBuilder.append((CharSequence) str);
        boolean zB = x4s.b(crc0Var.f8911a.liveMode);
        m27401g(bLiveTemplateItem, zB);
        pio0 pio0Var = new pio0(bLiveTemplateItem.scene, str, bLiveTemplateItem.size, Color.parseColor(bLiveTemplateItem.background), Color.parseColor(bLiveTemplateItem.color), TextUtils.isEmpty(bLiveTemplateItem.startColor) ? 0 : Color.parseColor(bLiveTemplateItem.startColor), TextUtils.isEmpty(bLiveTemplateItem.endColor) ? 0 : Color.parseColor(bLiveTemplateItem.endColor));
        pio0Var.m20347g(m27402h(bLiveTemplateItem.scene, zB));
        spannableStringBuilder.setSpan(pio0Var, i, str.length() + i, 33);
        z2s z2sVar = new z2s(bLiveTemplateItem.scene, pio0Var);
        if (NullChecker.a(crc0Var.f8914d) && crc0Var.f8914d.getH5() != null) {
            z2sVar.m27049g(crc0Var.f8914d.getH5());
        }
        if (!TextUtils.isEmpty(bLiveTemplateItem.url) && "grabStarRedPacket".equals(bLiveTemplateItem.scene)) {
            z2sVar.m27049g(bLiveTemplateItem.url);
        }
        if (!TextUtils.isEmpty(str)) {
            z2sVar.m27047e(str);
        }
        spannableStringBuilder.setSpan(z2sVar, i, str.length() + i, 33);
    }
}
