package p002l;

import android.text.TextUtils;
import com.google.protobuf.q;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import l.ki60;
import l.vpv;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o2s extends vp2<LongLinkChatMessage.LiveChatMessage> {
    public o2s(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, String str2) {
        LiveMessage.ExtInfo extInfo;
        Template.TemplateData template = liveChatMessage.getTemplate();
        BLiveTemplate bLiveTemplateM20739f = this.f21259c.m23568d().m20739f(template.getId());
        if (bLiveTemplateM20739f == null) {
            return m24089k(str, liveChatMessage, template.getId());
        }
        int i = LiveMessage.VOICE_CHAT_CATEGORY;
        int i2 = bLiveTemplateM20739f.category;
        if (i == i2 || LiveMessage.NORMAL_CHAT_CATEGORY == i2) {
            LiveMessage.ExtInfo extInfoM12194A = e5t.m12194A(template, bLiveTemplateM20739f);
            extInfoM12194A.buttonScene = e5t.m12219x(bLiveTemplateM20739f);
            extInfo = extInfoM12194A;
        } else {
            extInfo = null;
        }
        int id = template.getId();
        LiveUserInfo liveUserInfoM12217v = e5t.m12217v(liveChatMessage);
        String userId = liveChatMessage.getUserId();
        int i3 = LiveMessage.VOICE_CHAT_CATEGORY;
        int i4 = bLiveTemplateM20739f.category;
        return m24090l(liveChatMessage, str, id, liveUserInfoM12217v, userId, (i3 == i4 || LiveMessage.NORMAL_CHAT_CATEGORY == i4) ? template : null, extInfo);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatMessage.LiveChatMessage> mo9244b() {
        return LongLinkChatMessage.LiveChatMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.chat.msg";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: g */
    public void mo19191g(q qVar, ki60 ki60Var) {
        vpv vpvVar = ypv.a;
        String strD0 = vpvVar == null ? "" : vpvVar.D0();
        if (TextUtils.isEmpty(strD0)) {
            return;
        }
        mo10390y(ki60Var.a.getMsgId(), ki60Var.b, strD0);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str) {
        return m24095r(liveChatMessage.getRoomId(), "no_care", "no_care");
    }
}
