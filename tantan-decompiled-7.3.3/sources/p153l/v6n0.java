package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class v6n0 extends jk2<LongLinkLiveMessage.VoiceChatGroupInviteCreate, LongLinkLiveMessage.VoiceChatGroupInviteCreate> {
    public v6n0(wbg0<LongLinkLiveMessage.VoiceChatGroupInviteCreate, LongLinkLiveMessage.VoiceChatGroupInviteCreate> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate, String str2) {
        return voiceChatGroupInviteCreate.getTemplateData().getId() <= 0 ? super.mo113619x(str, voiceChatGroupInviteCreate, str2) : m159457n(str, voiceChatGroupInviteCreate.getTemplateData().getId(), null, null, Template.TemplateData.newBuilder().setId(voiceChatGroupInviteCreate.getTemplateData().getId()).addAllFields(voiceChatGroupInviteCreate.getTemplateData().getFieldsList()).build());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceChatGroupInviteCreate> mo95510b() {
        return LongLinkLiveMessage.VoiceChatGroupInviteCreate.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.chatGroup.inviteCreate";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceChatGroupInviteCreate mo95993z(String str, LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate) {
        return voiceChatGroupInviteCreate;
    }
}
