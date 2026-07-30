package p149l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zl3 extends ir2 {

    /* JADX INFO: renamed from: a */
    public n1m f203591a;

    /* JADX INFO: renamed from: b */
    public zpd0 f203592b = new zpd0("follow_guide_last_follow_user_chat_button" + ypv.f199493a.m199309D0(), 0L);

    /* JADX INFO: renamed from: c */
    public String f203593c = ypv.f199493a.m199309D0();

    public zl3(n1m n1mVar) {
        this.f203591a = n1mVar;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02ab  */
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        String fields;
        String str;
        String str2 = bLiveTemplateItem.scene;
        BLiveAbsData bLiveAbsData = crc0Var.f82197a;
        String string = "";
        if (bLiveAbsData == null || bLiveAbsData.anchor.f44419id.equals(this.f203593c) || !"follow".equals(str2) || !ypv.m215672k().m195897n6() || !m219219j()) {
            BLiveAbsData bLiveAbsData2 = crc0Var.f82197a;
            if (bLiveAbsData2 != null && !bLiveAbsData2.anchor.f44419id.equals(this.f203593c) && "voiceFollow".equals(str2) && ypv.m215672k().m195897n6() && m219219j()) {
                boolean zM207012b = x4s.m207012b(crc0Var.f82197a.liveMode);
                n1m n1mVar = this.f203591a;
                if (zM207012b) {
                    if (BLiveVoiceFollowship.isFollow(n1mVar.mo94631b())) {
                        string = ypv.f199497e.getString(R$string.f46897Pe);
                        str = Constants.VIA_SHARE_TYPE_INFO;
                    } else {
                        string = ypv.f199497e.getString(R$string.f46627D4);
                        str = "5";
                    }
                } else if (Followship.isFollowed(n1mVar.mo94630a()) || User.isMatched(this.f203591a.mo94632c())) {
                    if (crc0Var.f82201e == 3) {
                        str = "4";
                    } else {
                        string = ypv.f199497e.getString(R$string.f46897Pe) + SignParameters.NEW_LINE;
                        str = "2";
                    }
                } else if (crc0Var.f82201e == 3) {
                    string = bLiveTemplateItem.text;
                    str = "3";
                } else {
                    string = ypv.f199497e.getString(R$string.f46627D4) + SignParameters.NEW_LINE;
                    str = "1";
                }
            } else {
                if ("gift".equals(str2) || "jumpTopRoom".equals(str2) || "followUser".equals(str2) || BLiveButtonType.callApply.equals(str2) || "voiceCallInvite".equals(str2) || "voiceCallApply".equals(str2) || "joinLotteryGiftRedPacket".equals(str2) || "shootGame".equals(str2) || "maskModeFollowApply".equals(str2) || "maskModeFollowFollowed".equals(str2) || "maskModeFollowApproved".equals(str2) || "voiceSongGameOver".equals(str2) || "surpriseGiftBox".equals(str2) || "chatReply".equals(str2) || "profile".equals(str2) || "anchorInviteCall".equals(str2) || "voiceFollowUser".equals(str2) || "buttonOpenProfile".equals(str2) || "chat".equals(str2) || "createChatGroup".equals(str2) || "approveChatGroupApply".equals(str2) || "multiCallApply".equals(str2) || "multiCallApprove".equals(str2) || "jumpToVote".equals(str2) || "voiceThankNewUser".equals(str2) || "jumpToSendMessage".equals(str2) || "jumpToFansbasePanel".equals(str2) || "jumpToSetting".equals(str2) || "jumpToMagicFinger".equals(str2) || "schemaJump".equals(str2) || "auctionApprove".equals(str2) || "thankForSendLittleFlame".equals(str2) || "jumpVoiceFlameMarket".equals(str2) || "buttonOpenChat".equals(str2) || "settleApprove".equals(str2) || "grabStarRedPacket".equals(str2) || "roomLevelDetail".equals(str2) || "inviteVoiceCall".equals(str2) || (("userApplyVoiceCall".equals(str2) && ypv.f199493a.m199309D0().equals(crc0Var.f82202f)) || "userRole".equals(str2) || "guideNewUserSendStar".equals(str2) || "voiceRoomApplaud".equals(str2) || "openAnchorGradeWeb".equals(str2) || "openAuctionApplyPanel".equals(str2) || "sendStarToUser".equals(str2) || "returnGift".equals(str2) || "ktvKingCongratulate".equals(str2))) {
                    fields = bLiveTemplateItem.text;
                } else if (!"userProfile".equals(str2) || templateData == null) {
                    str = "";
                } else {
                    fields = templateData.getFields(bLiveTemplateItem.index - 1);
                }
                string = fields;
                str = "";
            }
        } else if (Followship.isFollowed(this.f203591a.mo94630a()) || User.isMatched(this.f203591a.mo94632c())) {
            str = "";
        } else {
            String str3 = bLiveTemplateItem.text;
            this.f203592b.put(Long.valueOf(System.currentTimeMillis()));
            str = "";
            string = str3;
        }
        return vwb.m200324f0(string, str);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: c */
    public boolean mo103902c(List<String> list, BLiveTemplateItem bLiveTemplateItem, crc0 crc0Var) {
        if ("voiceFollow".equals(bLiveTemplateItem.scene)) {
            return super.mo103902c(list, bLiveTemplateItem, crc0Var) && list.size() >= 2;
        }
        if ("chatReply".equals(bLiveTemplateItem.scene) || "voiceThankNewUser".equals(bLiveTemplateItem.scene)) {
            return super.mo103902c(list, bLiveTemplateItem, crc0Var) && this.f203593c.equals(crc0Var.f82202f);
        }
        return super.mo103902c(list, bLiveTemplateItem, crc0Var);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        jmf0Var.f118631c = uz00.f178935b;
        String str = list.get(0);
        BLiveAbsData bLiveAbsData = crc0Var.f82197a;
        if (bLiveAbsData == null || !bLiveAbsData.isVoiceLive()) {
            m219218i(jmf0Var.f118629a, bLiveTemplateItem, str, jmf0Var.f118630b, crc0Var.f82200d);
        } else {
            boolean zEquals = "voiceFollow".equals(bLiveTemplateItem.scene);
            SpannableStringBuilder spannableStringBuilder = jmf0Var.f118629a;
            if (zEquals) {
                m219220k(spannableStringBuilder, bLiveTemplateItem, list, jmf0Var.f118630b, crc0Var.f82200d);
            } else {
                m219221l(spannableStringBuilder, bLiveTemplateItem, str, jmf0Var.f118630b, crc0Var);
            }
        }
        jmf0Var.f118630b += str.length();
    }

    /* JADX INFO: renamed from: g */
    public final void m219216g(BLiveTemplateItem bLiveTemplateItem, boolean z) {
        if (TextUtils.isEmpty(bLiveTemplateItem.background)) {
            if (z) {
                bLiveTemplateItem.background = "#d27a36";
            } else {
                bLiveTemplateItem.background = com.clevertap.android.sdk.Constants.BLACK;
            }
        }
    }

    @Override // p149l.k4m
    public String getType() {
        return "button";
    }

    /* JADX INFO: renamed from: h */
    public final int m219217h(String str, boolean z) {
        if (z) {
            return "anchorInviteCall".equals(str) ? 2 : 1;
        }
        return "userRole".equals(str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m219218i(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, String str, int i, LongLinkChatMessage.LiveChatMessage liveChatMessage) {
        spannableStringBuilder.append((CharSequence) str);
        if (TextUtils.isEmpty(bLiveTemplateItem.background)) {
            bLiveTemplateItem.background = com.clevertap.android.sdk.Constants.BLACK;
        }
        ped0 ped0Var = new ped0(bLiveTemplateItem.scene, bLiveTemplateItem.size, Color.parseColor(bLiveTemplateItem.background), Color.parseColor(bLiveTemplateItem.color));
        spannableStringBuilder.setSpan(ped0Var, i, str.length() + i, 33);
        z2s z2sVar = new z2s(bLiveTemplateItem.scene, ped0Var);
        if (NullChecker.m81303a(liveChatMessage) && liveChatMessage.getH5() != null) {
            z2sVar.m216991g(liveChatMessage.getH5());
        }
        spannableStringBuilder.setSpan(z2sVar, i, str.length() + i, 33);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m219219j() {
        return System.currentTimeMillis() - this.f203592b.get().longValue() > ((long) (ypv.m215672k().m195671L3() * 1000));
    }

    /* JADX INFO: renamed from: k */
    public final void m219220k(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, List<String> list, int i, LongLinkChatMessage.LiveChatMessage liveChatMessage) {
        String str = list.get(0);
        String str2 = list.size() > 1 ? list.get(1) : "";
        spannableStringBuilder.append((CharSequence) str);
        w6n0 w6n0Var = new w6n0(bLiveTemplateItem.scene);
        w6n0Var.m201891g(str2, str);
        spannableStringBuilder.setSpan(w6n0Var, i, str.length() + i, 33);
        x6n0 x6n0Var = new x6n0(bLiveTemplateItem.scene, w6n0Var);
        if (NullChecker.m81303a(liveChatMessage) && liveChatMessage.getH5() != null) {
            x6n0Var.m216991g(liveChatMessage.getH5());
        }
        spannableStringBuilder.setSpan(x6n0Var, i, str.length() + i, 33);
    }

    /* JADX INFO: renamed from: l */
    public final void m219221l(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, String str, int i, crc0 crc0Var) {
        spannableStringBuilder.append((CharSequence) str);
        boolean zM207012b = x4s.m207012b(crc0Var.f82197a.liveMode);
        m219216g(bLiveTemplateItem, zM207012b);
        pio0 pio0Var = new pio0(bLiveTemplateItem.scene, str, bLiveTemplateItem.size, Color.parseColor(bLiveTemplateItem.background), Color.parseColor(bLiveTemplateItem.color), TextUtils.isEmpty(bLiveTemplateItem.startColor) ? 0 : Color.parseColor(bLiveTemplateItem.startColor), TextUtils.isEmpty(bLiveTemplateItem.endColor) ? 0 : Color.parseColor(bLiveTemplateItem.endColor));
        pio0Var.m169618g(m219217h(bLiveTemplateItem.scene, zM207012b));
        spannableStringBuilder.setSpan(pio0Var, i, str.length() + i, 33);
        z2s z2sVar = new z2s(bLiveTemplateItem.scene, pio0Var);
        if (NullChecker.m81303a(crc0Var.f82200d) && crc0Var.f82200d.getH5() != null) {
            z2sVar.m216991g(crc0Var.f82200d.getH5());
        }
        if (!TextUtils.isEmpty(bLiveTemplateItem.url) && "grabStarRedPacket".equals(bLiveTemplateItem.scene)) {
            z2sVar.m216991g(bLiveTemplateItem.url);
        }
        if (!TextUtils.isEmpty(str)) {
            z2sVar.m216989e(str);
        }
        spannableStringBuilder.setSpan(z2sVar, i, str.length() + i, 33);
    }
}
