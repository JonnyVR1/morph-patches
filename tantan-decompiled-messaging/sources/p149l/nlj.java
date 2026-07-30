package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class nlj extends vp2<LongLinkGiftMessage.LiveGiftMessage> {
    public nlj(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkGiftMessage.LiveGiftMessage liveGiftMessage, String str2) {
        return m199209n(str, liveGiftMessage.getTempdata().getId(), null, null, Template.TemplateData.newBuilder().setId(liveGiftMessage.getTempdata().getId()).addAllFields(liveGiftMessage.getTempdata().getFieldsList()).build());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkGiftMessage.LiveGiftMessage> mo94398b() {
        return LongLinkGiftMessage.LiveGiftMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.gift.chatMessage";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkGiftMessage.LiveGiftMessage liveGiftMessage, String str) {
        return m199212r(liveGiftMessage.getRoomId(), "no_care", "no_care");
    }
}
