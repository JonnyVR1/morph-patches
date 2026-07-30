package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class z7u extends mq2<LongLinkLiveMessage.LiveStickerAuditMsg> {
    public z7u(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkLiveMessage.LiveStickerAuditMsg liveStickerAuditMsg, String str2) {
        String str3;
        if (TextUtils.equals(liveStickerAuditMsg.getStatus(), "approve")) {
            str3 = "sticker_modify_result_approve";
        } else {
            str3 = TextUtils.equals(liveStickerAuditMsg.getStatus(), "reject") ? "sticker_modify_result_reject" : "sticker_modify_result_submit";
        }
        return new LiveControlMessage(str, str3).setContent(liveStickerAuditMsg.getMsg());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveStickerAuditMsg> mo95510b() {
        return LongLinkLiveMessage.LiveStickerAuditMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.sticker.audit";
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveStickerAuditMsg liveStickerAuditMsg, String str) {
        return true;
    }
}
