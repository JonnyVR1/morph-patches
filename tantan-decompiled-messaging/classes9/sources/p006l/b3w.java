package p006l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class b3w extends s2w<LongLinkCoreChatMessage.RevokeChatMsg> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkCoreChatMessage.RevokeChatMsg> mo11743b() {
        return LongLinkCoreChatMessage.RevokeChatMsg.class;
    }

    @Override // p006l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "message.single.update";
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CANCEL_MSG;
    }

    @Override // p006l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkCoreChatMessage.RevokeChatMsg revokeChatMsg) {
        PushMessageContent pushMessageContentNew_ = PushMessageContent.new_();
        pushMessage.content = pushMessageContentNew_;
        pushMessageContentNew_.type = "message";
        pushMessageContentNew_.id = revokeChatMsg.getMsgId();
        pushMessage.content.parent = IdBoxed.new_();
        pushMessage.content.parent.id = revokeChatMsg.getOtherUserId();
        pushMessage.content.parent.type = "conversation";
    }
}
