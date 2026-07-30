package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class rxm0 extends bk2<LongLinkLiveMessage.VoiceChatGroupInviteCreate, LongLinkLiveMessage.VoiceChatGroupInviteCreate> {
    public rxm0(p3g0<LongLinkLiveMessage.VoiceChatGroupInviteCreate, LongLinkLiveMessage.VoiceChatGroupInviteCreate> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate, String str2) {
        return voiceChatGroupInviteCreate.getTemplateData().getId() <= 0 ? super.mo94401x(str, voiceChatGroupInviteCreate, str2) : m199209n(str, voiceChatGroupInviteCreate.getTemplateData().getId(), null, null, Template.TemplateData.newBuilder().setId(voiceChatGroupInviteCreate.getTemplateData().getId()).addAllFields(voiceChatGroupInviteCreate.getTemplateData().getFieldsList()).build());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceChatGroupInviteCreate> mo94398b() {
        return LongLinkLiveMessage.VoiceChatGroupInviteCreate.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voiceLive.chatGroup.inviteCreate";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceChatGroupInviteCreate mo94461z(String str, LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate) {
        return voiceChatGroupInviteCreate;
    }
}
