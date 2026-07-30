package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.template.Template;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bxm0 extends bk2<LongLinkLiveMessage.VoiceChatGroupApply, LongLinkLiveMessage.VoiceChatGroupApply> {
    public bxm0(p3g0<LongLinkLiveMessage.VoiceChatGroupApply, LongLinkLiveMessage.VoiceChatGroupApply> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply, String str2) {
        if (voiceChatGroupApply.getTemplateData().getId() <= 0) {
            return super.mo9247x(str, voiceChatGroupApply, str2);
        }
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.voiceChatApplyUserId = voiceChatGroupApply.getApplyUserId();
        extInfo.voiceChatApplyId = voiceChatGroupApply.getApplyId();
        extInfo.voiceChatApplyUserName = voiceChatGroupApply.getUserName();
        return m24093o(str, voiceChatGroupApply.getTemplateData().getId(), null, null, (Template.TemplateData) Template.TemplateData.newBuilder().setId(voiceChatGroupApply.getTemplateData().getId()).addAllFields(voiceChatGroupApply.getTemplateData().getFieldsList()).build(), extInfo);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceChatGroupApply> mo9244b() {
        return LongLinkLiveMessage.VoiceChatGroupApply.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.chatGroupApply";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceChatGroupApply mo9251z(String str, LongLinkLiveMessage.VoiceChatGroupApply voiceChatGroupApply) {
        return voiceChatGroupApply;
    }
}
