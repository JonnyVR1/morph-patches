package p153l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zm3 extends yr2 {

    /* JADX INFO: renamed from: a */
    public g4m f205030a;

    /* JADX INFO: renamed from: b */
    public byd0 f205031b = new byd0("follow_guide_last_follow_user_chat_button" + zrv.f205799a.m207631D0(), 0L);

    /* JADX INFO: renamed from: c */
    public String f205032c = zrv.f205799a.m207631D0();

    public zm3(g4m g4mVar) {
        this.f205030a = g4mVar;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02ab  */
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        String fields;
        String str;
        String str2 = bLiveTemplateItem.scene;
        BLiveAbsData bLiveAbsData = hzc0Var.f112221a;
        String string = "";
        if (bLiveAbsData == null || bLiveAbsData.anchor.f45267id.equals(this.f205032c) || !"follow".equals(str2) || !zrv.m221193k().m203684n6() || !m220352j()) {
            BLiveAbsData bLiveAbsData2 = hzc0Var.f112221a;
            if (bLiveAbsData2 != null && !bLiveAbsData2.anchor.f45267id.equals(this.f205032c) && "voiceFollow".equals(str2) && zrv.m221193k().m203684n6() && m220352j()) {
                boolean zM214494b = y6s.m214494b(hzc0Var.f112221a.liveMode);
                g4m g4mVar = this.f205030a;
                if (zM214494b) {
                    if (BLiveVoiceFollowship.isFollow(g4mVar.mo128898b())) {
                        string = zrv.f205803e.getString(R$string.f47745Pe);
                        str = Constants.VIA_SHARE_TYPE_INFO;
                    } else {
                        string = zrv.f205803e.getString(R$string.f47475D4);
                        str = "5";
                    }
                } else if (Followship.isFollowed(g4mVar.mo128897a()) || User.isMatched(this.f205030a.mo128899c())) {
                    if (hzc0Var.f112225e == 3) {
                        str = "4";
                    } else {
                        string = zrv.f205803e.getString(R$string.f47745Pe) + SignParameters.NEW_LINE;
                        str = "2";
                    }
                } else if (hzc0Var.f112225e == 3) {
                    string = bLiveTemplateItem.text;
                    str = "3";
                } else {
                    string = zrv.f205803e.getString(R$string.f47475D4) + SignParameters.NEW_LINE;
                    str = "1";
                }
            } else {
                if ("gift".equals(str2) || "jumpTopRoom".equals(str2) || "followUser".equals(str2) || BLiveButtonType.callApply.equals(str2) || "voiceCallInvite".equals(str2) || "voiceCallApply".equals(str2) || "joinLotteryGiftRedPacket".equals(str2) || "shootGame".equals(str2) || "maskModeFollowApply".equals(str2) || "maskModeFollowFollowed".equals(str2) || "maskModeFollowApproved".equals(str2) || "voiceSongGameOver".equals(str2) || "surpriseGiftBox".equals(str2) || "chatReply".equals(str2) || "profile".equals(str2) || "anchorInviteCall".equals(str2) || "voiceFollowUser".equals(str2) || "buttonOpenProfile".equals(str2) || "chat".equals(str2) || "createChatGroup".equals(str2) || "approveChatGroupApply".equals(str2) || "multiCallApply".equals(str2) || "multiCallApprove".equals(str2) || "jumpToVote".equals(str2) || "voiceThankNewUser".equals(str2) || "jumpToSendMessage".equals(str2) || "jumpToFansbasePanel".equals(str2) || "jumpToSetting".equals(str2) || "jumpToMagicFinger".equals(str2) || "schemaJump".equals(str2) || "auctionApprove".equals(str2) || "thankForSendLittleFlame".equals(str2) || "jumpVoiceFlameMarket".equals(str2) || "buttonOpenChat".equals(str2) || "settleApprove".equals(str2) || "grabStarRedPacket".equals(str2) || "roomLevelDetail".equals(str2) || "inviteVoiceCall".equals(str2) || (("userApplyVoiceCall".equals(str2) && zrv.f205799a.m207631D0().equals(hzc0Var.f112226f)) || "userRole".equals(str2) || "guideNewUserSendStar".equals(str2) || "voiceRoomApplaud".equals(str2) || "openAnchorGradeWeb".equals(str2) || "openAuctionApplyPanel".equals(str2) || "sendStarToUser".equals(str2) || "returnGift".equals(str2) || "ktvKingCongratulate".equals(str2))) {
                    fields = bLiveTemplateItem.text;
                } else if (!"userProfile".equals(str2) || templateData == null) {
                    str = "";
                } else {
                    fields = templateData.getFields(bLiveTemplateItem.index - 1);
                }
                string = fields;
                str = "";
            }
        } else if (Followship.isFollowed(this.f205030a.mo128897a()) || User.isMatched(this.f205030a.mo128899c())) {
            str = "";
        } else {
            String str3 = bLiveTemplateItem.text;
            this.f205031b.put(Long.valueOf(System.currentTimeMillis()));
            str = "";
            string = str3;
        }
        return jyb.m147507f0(string, str);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: c */
    public boolean mo152559c(List<String> list, BLiveTemplateItem bLiveTemplateItem, hzc0 hzc0Var) {
        if ("voiceFollow".equals(bLiveTemplateItem.scene)) {
            return super.mo152559c(list, bLiveTemplateItem, hzc0Var) && list.size() >= 2;
        }
        if ("chatReply".equals(bLiveTemplateItem.scene) || "voiceThankNewUser".equals(bLiveTemplateItem.scene)) {
            return super.mo152559c(list, bLiveTemplateItem, hzc0Var) && this.f205032c.equals(hzc0Var.f112226f);
        }
        return super.mo152559c(list, bLiveTemplateItem, hzc0Var);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        suf0Var.f170683c = e810.f92501b;
        String str = list.get(0);
        BLiveAbsData bLiveAbsData = hzc0Var.f112221a;
        if (bLiveAbsData == null || !bLiveAbsData.isVoiceLive()) {
            m220351i(suf0Var.f170681a, bLiveTemplateItem, str, suf0Var.f170682b, hzc0Var.f112224d);
        } else {
            boolean zEquals = "voiceFollow".equals(bLiveTemplateItem.scene);
            SpannableStringBuilder spannableStringBuilder = suf0Var.f170681a;
            if (zEquals) {
                m220353k(spannableStringBuilder, bLiveTemplateItem, list, suf0Var.f170682b, hzc0Var.f112224d);
            } else {
                m220354l(spannableStringBuilder, bLiveTemplateItem, str, suf0Var.f170682b, hzc0Var);
            }
        }
        suf0Var.f170682b += str.length();
    }

    /* JADX INFO: renamed from: g */
    public final void m220349g(BLiveTemplateItem bLiveTemplateItem, boolean z) {
        if (TextUtils.isEmpty(bLiveTemplateItem.background)) {
            if (z) {
                bLiveTemplateItem.background = "#d27a36";
            } else {
                bLiveTemplateItem.background = com.clevertap.android.sdk.Constants.BLACK;
            }
        }
    }

    @Override // p153l.b7m
    public String getType() {
        return "button";
    }

    /* JADX INFO: renamed from: h */
    public final int m220350h(String str, boolean z) {
        if (z) {
            return "anchorInviteCall".equals(str) ? 2 : 1;
        }
        return "userRole".equals(str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m220351i(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, String str, int i, LongLinkChatMessage.LiveChatMessage liveChatMessage) {
        spannableStringBuilder.append((CharSequence) str);
        if (TextUtils.isEmpty(bLiveTemplateItem.background)) {
            bLiveTemplateItem.background = com.clevertap.android.sdk.Constants.BLACK;
        }
        rmd0 rmd0Var = new rmd0(bLiveTemplateItem.scene, bLiveTemplateItem.size, Color.parseColor(bLiveTemplateItem.background), Color.parseColor(bLiveTemplateItem.color));
        spannableStringBuilder.setSpan(rmd0Var, i, str.length() + i, 33);
        a5s a5sVar = new a5s(bLiveTemplateItem.scene, rmd0Var);
        if (NullChecker.m82486a(liveChatMessage) && liveChatMessage.getH5() != null) {
            a5sVar.m96249g(liveChatMessage.getH5());
        }
        spannableStringBuilder.setSpan(a5sVar, i, str.length() + i, 33);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m220352j() {
        return System.currentTimeMillis() - this.f205031b.get().longValue() > ((long) (zrv.m221193k().m203458L3() * 1000));
    }

    /* JADX INFO: renamed from: k */
    public final void m220353k(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, List<String> list, int i, LongLinkChatMessage.LiveChatMessage liveChatMessage) {
        String str = list.get(0);
        String str2 = list.size() > 1 ? list.get(1) : "";
        spannableStringBuilder.append((CharSequence) str);
        agn0 agn0Var = new agn0(bLiveTemplateItem.scene);
        agn0Var.m97709g(str2, str);
        spannableStringBuilder.setSpan(agn0Var, i, str.length() + i, 33);
        bgn0 bgn0Var = new bgn0(bLiveTemplateItem.scene, agn0Var);
        if (NullChecker.m82486a(liveChatMessage) && liveChatMessage.getH5() != null) {
            bgn0Var.m96249g(liveChatMessage.getH5());
        }
        spannableStringBuilder.setSpan(bgn0Var, i, str.length() + i, 33);
    }

    /* JADX INFO: renamed from: l */
    public final void m220354l(SpannableStringBuilder spannableStringBuilder, BLiveTemplateItem bLiveTemplateItem, String str, int i, hzc0 hzc0Var) {
        spannableStringBuilder.append((CharSequence) str);
        boolean zM214494b = y6s.m214494b(hzc0Var.f112221a.liveMode);
        m220349g(bLiveTemplateItem, zM214494b);
        tro0 tro0Var = new tro0(bLiveTemplateItem.scene, str, bLiveTemplateItem.size, Color.parseColor(bLiveTemplateItem.background), Color.parseColor(bLiveTemplateItem.color), TextUtils.isEmpty(bLiveTemplateItem.startColor) ? 0 : Color.parseColor(bLiveTemplateItem.startColor), TextUtils.isEmpty(bLiveTemplateItem.endColor) ? 0 : Color.parseColor(bLiveTemplateItem.endColor));
        tro0Var.m192521g(m220350h(bLiveTemplateItem.scene, zM214494b));
        spannableStringBuilder.setSpan(tro0Var, i, str.length() + i, 33);
        a5s a5sVar = new a5s(bLiveTemplateItem.scene, tro0Var);
        if (NullChecker.m82486a(hzc0Var.f112224d) && hzc0Var.f112224d.getH5() != null) {
            a5sVar.m96249g(hzc0Var.f112224d.getH5());
        }
        if (!TextUtils.isEmpty(bLiveTemplateItem.url) && "grabStarRedPacket".equals(bLiveTemplateItem.scene)) {
            a5sVar.m96249g(bLiveTemplateItem.url);
        }
        if (!TextUtils.isEmpty(str)) {
            a5sVar.m96247e(str);
        }
        spannableStringBuilder.setSpan(a5sVar, i, str.length() + i, 33);
    }
}
