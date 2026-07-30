package p149l;

import android.text.TextUtils;
import com.google.protobuf.InterfaceC3419q;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;

/* JADX INFO: loaded from: classes4.dex */
public class o2s extends vp2<LongLinkChatMessage.LiveChatMessage> {
    public o2s(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, String str2) {
        LiveMessage.ExtInfo extInfo;
        Template.TemplateData template = liveChatMessage.getTemplate();
        BLiveTemplate bLiveTemplateM171773f = this.f182445c.m194417d().m171773f(template.getId());
        if (bLiveTemplateM171773f == null) {
            return m199206k(str, liveChatMessage, template.getId());
        }
        int i = LiveMessage.VOICE_CHAT_CATEGORY;
        int i2 = bLiveTemplateM171773f.category;
        if (i == i2 || LiveMessage.NORMAL_CHAT_CATEGORY == i2) {
            LiveMessage.ExtInfo extInfoM114895A = e5t.m114895A(template, bLiveTemplateM171773f);
            extInfoM114895A.buttonScene = e5t.m114920x(bLiveTemplateM171773f);
            extInfo = extInfoM114895A;
        } else {
            extInfo = null;
        }
        int id = template.getId();
        LiveUserInfo liveUserInfoM114918v = e5t.m114918v(liveChatMessage);
        String userId = liveChatMessage.getUserId();
        int i3 = LiveMessage.VOICE_CHAT_CATEGORY;
        int i4 = bLiveTemplateM171773f.category;
        return m199207l(liveChatMessage, str, id, liveUserInfoM114918v, userId, (i3 == i4 || LiveMessage.NORMAL_CHAT_CATEGORY == i4) ? template : null, extInfo);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatMessage.LiveChatMessage> mo94398b() {
        return LongLinkChatMessage.LiveChatMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.chat.msg";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: g */
    public void mo162321g(InterfaceC3419q interfaceC3419q, ki60 ki60Var) {
        vpv vpvVar = ypv.f199493a;
        String strM199309D0 = vpvVar == null ? "" : vpvVar.m199309D0();
        if (TextUtils.isEmpty(strM199309D0)) {
            return;
        }
        mo102260y(ki60Var.f123271a.getMsgId(), ki60Var.f123272b, strM199309D0);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str) {
        return m199212r(liveChatMessage.getRoomId(), "no_care", "no_care");
    }
}
