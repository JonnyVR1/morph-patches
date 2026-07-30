package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class bxm0 extends bk2<LongLinkLiveMessage.VoiceChatGroupApply, LongLinkLiveMessage.VoiceChatGroupApply> {
    public bxm0(p3g0<LongLinkLiveMessage.VoiceChatGroupApply, LongLinkLiveMessage.VoiceChatGroupApply> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply, String str2) {
        if (voiceChatGroupApply.getTemplateData().getId() <= 0) {
            return super.mo94401x(str, voiceChatGroupApply, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.voiceChatApplyUserId = voiceChatGroupApply.getApplyUserId();
        extInfo.voiceChatApplyId = voiceChatGroupApply.getApplyId();
        extInfo.voiceChatApplyUserName = voiceChatGroupApply.getUserName();
        return m199210o(str, voiceChatGroupApply.getTemplateData().getId(), null, null, Template.TemplateData.newBuilder().setId(voiceChatGroupApply.getTemplateData().getId()).addAllFields(voiceChatGroupApply.getTemplateData().getFieldsList()).build(), extInfo);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceChatGroupApply> mo94398b() {
        return LongLinkLiveMessage.VoiceChatGroupApply.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voiceLive.chatGroupApply";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceChatGroupApply mo94461z(String str, LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply) {
        return voiceChatGroupApply;
    }
}
