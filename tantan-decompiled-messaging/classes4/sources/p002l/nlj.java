package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.template.Template;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nlj extends vp2<LongLinkGiftMessage.LiveGiftMessage> {
    public nlj(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkGiftMessage.LiveGiftMessage liveGiftMessage, String str2) {
        return m24092n(str, liveGiftMessage.getTempdata().getId(), null, null, (Template.TemplateData) Template.TemplateData.newBuilder().setId(liveGiftMessage.getTempdata().getId()).addAllFields(liveGiftMessage.getTempdata().getFieldsList()).build());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveGiftMessage> mo9244b() {
        return LongLinkGiftMessage.LiveGiftMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.gift.chatMessage";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkGiftMessage.LiveGiftMessage liveGiftMessage, String str) {
        return m24095r(liveGiftMessage.getRoomId(), "no_care", "no_care");
    }
}
