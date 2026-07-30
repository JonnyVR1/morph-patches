package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.template.Template;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rxm0 extends bk2<LongLinkLiveMessage.VoiceChatGroupInviteCreate, LongLinkLiveMessage.VoiceChatGroupInviteCreate> {
    public rxm0(p3g0<LongLinkLiveMessage.VoiceChatGroupInviteCreate, LongLinkLiveMessage.VoiceChatGroupInviteCreate> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate, String str2) {
        return voiceChatGroupInviteCreate.getTemplateData().getId() <= 0 ? super.mo9247x(str, voiceChatGroupInviteCreate, str2) : m24092n(str, voiceChatGroupInviteCreate.getTemplateData().getId(), null, null, (Template.TemplateData) Template.TemplateData.newBuilder().setId(voiceChatGroupInviteCreate.getTemplateData().getId()).addAllFields(voiceChatGroupInviteCreate.getTemplateData().getFieldsList()).build());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceChatGroupInviteCreate> mo9244b() {
        return LongLinkLiveMessage.VoiceChatGroupInviteCreate.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.chatGroup.inviteCreate";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceChatGroupInviteCreate mo9251z(String str, LongLinkLiveMessage.VoiceChatGroupInviteCreate voiceChatGroupInviteCreate) {
        return voiceChatGroupInviteCreate;
    }
}
