package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class doj extends mq2<LongLinkGiftMessage.LiveGiftMessage> {
    public doj(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkGiftMessage.LiveGiftMessage liveGiftMessage, String str2) {
        return m159457n(str, liveGiftMessage.getTempdata().getId(), null, null, Template.TemplateData.newBuilder().setId(liveGiftMessage.getTempdata().getId()).addAllFields(liveGiftMessage.getTempdata().getFieldsList()).build());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveGiftMessage> mo95510b() {
        return LongLinkGiftMessage.LiveGiftMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.gift.chatMessage";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkGiftMessage.LiveGiftMessage liveGiftMessage, String str) {
        return m159460r(liveGiftMessage.getRoomId(), "no_care", "no_care");
    }
}
