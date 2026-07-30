package p153l;

import android.text.TextUtils;
import com.google.protobuf.InterfaceC3442q;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;

/* JADX INFO: loaded from: classes4.dex */
public class p4s extends mq2<LongLinkChatMessage.LiveChatMessage> {
    public p4s(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, String str2) {
        LiveMessage.ExtInfo extInfo;
        Template.TemplateData template = liveChatMessage.getTemplate();
        BLiveTemplate bLiveTemplateM157079f = this.f137993c.m220736d().m157079f(template.getId());
        if (bLiveTemplateM157079f == null) {
            return m159454k(str, liveChatMessage, template.getId());
        }
        int i = LiveMessage.VOICE_CHAT_CATEGORY;
        int i2 = bLiveTemplateM157079f.category;
        if (i == i2 || LiveMessage.NORMAL_CHAT_CATEGORY == i2) {
            LiveMessage.ExtInfo extInfoM124479A = f7t.m124479A(template, bLiveTemplateM157079f);
            extInfoM124479A.buttonScene = f7t.m124504x(bLiveTemplateM157079f);
            extInfo = extInfoM124479A;
        } else {
            extInfo = null;
        }
        int id = template.getId();
        LiveUserInfo liveUserInfoM124502v = f7t.m124502v(liveChatMessage);
        String userId = liveChatMessage.getUserId();
        int i3 = LiveMessage.VOICE_CHAT_CATEGORY;
        int i4 = bLiveTemplateM157079f.category;
        return m159455l(liveChatMessage, str, id, liveUserInfoM124502v, userId, (i3 == i4 || LiveMessage.NORMAL_CHAT_CATEGORY == i4) ? template : null, extInfo);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkChatMessage.LiveChatMessage> mo95510b() {
        return LongLinkChatMessage.LiveChatMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.chat.msg";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: g */
    public void mo159451g(InterfaceC3442q interfaceC3442q, pq60 pq60Var) {
        wrv wrvVar = zrv.f205799a;
        String strM207631D0 = wrvVar == null ? "" : wrvVar.m207631D0();
        if (TextUtils.isEmpty(strM207631D0)) {
            return;
        }
        mo145146y(pq60Var.f153643a.getMsgId(), pq60Var.f153644b, strM207631D0);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str) {
        return m159460r(liveChatMessage.getRoomId(), "no_care", "no_care");
    }
}
