package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y5u extends vp2<LongLinkLiveMessage.LiveStickerAuditMsg> {
    public y5u(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkLiveMessage.LiveStickerAuditMsg liveStickerAuditMsg, String str2) {
        String str3;
        if (TextUtils.equals(liveStickerAuditMsg.getStatus(), "approve")) {
            str3 = "sticker_modify_result_approve";
        } else {
            str3 = TextUtils.equals(liveStickerAuditMsg.getStatus(), "reject") ? "sticker_modify_result_reject" : "sticker_modify_result_submit";
        }
        return new LiveControlMessage(str, str3).setContent(liveStickerAuditMsg.getMsg());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveStickerAuditMsg> mo9244b() {
        return LongLinkLiveMessage.LiveStickerAuditMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.sticker.audit";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveStickerAuditMsg liveStickerAuditMsg, String str) {
        return true;
    }
}
