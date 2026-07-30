package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.connector.LongLinkCoreChatMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class b3w extends s2w<LongLinkCoreChatMessage.RevokeChatMsg> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkCoreChatMessage.RevokeChatMsg> mo94398b() {
        return LongLinkCoreChatMessage.RevokeChatMsg.class;
    }

    @Override // p149l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.message_single_update;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_CANCEL_MSG;
    }

    @Override // p149l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkCoreChatMessage.RevokeChatMsg revokeChatMsg) {
        PushMessageContent pushMessageContentNew_ = PushMessageContent.new_();
        pushMessage.content = pushMessageContentNew_;
        pushMessageContentNew_.type = "message";
        pushMessageContentNew_.f38804id = revokeChatMsg.getMsgId();
        pushMessage.content.parent = IdBoxed.new_();
        pushMessage.content.parent.f38759id = revokeChatMsg.getOtherUserId();
        pushMessage.content.parent.type = "conversation";
    }
}
