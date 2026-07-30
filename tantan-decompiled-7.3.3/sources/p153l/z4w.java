package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class z4w extends q4w<LongLinkCoreChatMessage.RevokeChatMsg> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkCoreChatMessage.RevokeChatMsg> mo95510b() {
        return LongLinkCoreChatMessage.RevokeChatMsg.class;
    }

    @Override // p153l.fxl
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.message_single_update;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CANCEL_MSG;
    }

    @Override // p153l.q4w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkCoreChatMessage.RevokeChatMsg revokeChatMsg) {
        PushMessageContent pushMessageContentNew_ = PushMessageContent.new_();
        pushMessage.content = pushMessageContentNew_;
        pushMessageContentNew_.type = "message";
        pushMessageContentNew_.f39652id = revokeChatMsg.getMsgId();
        pushMessage.content.parent = IdBoxed.new_();
        pushMessage.content.parent.f39607id = revokeChatMsg.getOtherUserId();
        pushMessage.content.parent.type = "conversation";
    }
}
