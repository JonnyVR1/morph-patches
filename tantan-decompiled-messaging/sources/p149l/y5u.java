package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class y5u extends vp2<LongLinkLiveMessage.LiveStickerAuditMsg> {
    public y5u(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkLiveMessage.LiveStickerAuditMsg liveStickerAuditMsg, String str2) {
        String str3;
        if (TextUtils.equals(liveStickerAuditMsg.getStatus(), "approve")) {
            str3 = "sticker_modify_result_approve";
        } else {
            str3 = TextUtils.equals(liveStickerAuditMsg.getStatus(), "reject") ? "sticker_modify_result_reject" : "sticker_modify_result_submit";
        }
        return new LiveControlMessage(str, str3).setContent(liveStickerAuditMsg.getMsg());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveStickerAuditMsg> mo94398b() {
        return LongLinkLiveMessage.LiveStickerAuditMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.sticker.audit";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveStickerAuditMsg liveStickerAuditMsg, String str) {
        return true;
    }
}
