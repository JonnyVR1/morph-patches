package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class f6n0 extends jk2<LongLinkLiveMessage.VoiceChatGroupApply, LongLinkLiveMessage.VoiceChatGroupApply> {
    public f6n0(wbg0<LongLinkLiveMessage.VoiceChatGroupApply, LongLinkLiveMessage.VoiceChatGroupApply> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply, String str2) {
        if (voiceChatGroupApply.getTemplateData().getId() <= 0) {
            return super.mo113619x(str, voiceChatGroupApply, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.voiceChatApplyUserId = voiceChatGroupApply.getApplyUserId();
        extInfo.voiceChatApplyId = voiceChatGroupApply.getApplyId();
        extInfo.voiceChatApplyUserName = voiceChatGroupApply.getUserName();
        return m159458o(str, voiceChatGroupApply.getTemplateData().getId(), null, null, Template.TemplateData.newBuilder().setId(voiceChatGroupApply.getTemplateData().getId()).addAllFields(voiceChatGroupApply.getTemplateData().getFieldsList()).build(), extInfo);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceChatGroupApply> mo95510b() {
        return LongLinkLiveMessage.VoiceChatGroupApply.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.chatGroupApply";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceChatGroupApply mo95993z(String str, LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply) {
        return voiceChatGroupApply;
    }
}
