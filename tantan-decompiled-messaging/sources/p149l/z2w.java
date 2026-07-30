package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMomentMessage;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class z2w extends s2w<LongLinkMomentMessage.MomentComment> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMomentMessage.MomentComment> mo94398b() {
        return LongLinkMomentMessage.MomentComment.class;
    }

    @Override // p149l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.moment_single_comment;
    }

    @Override // p149l.s2w
    /* JADX INFO: renamed from: e */
    public void mo94755e(PushMessage pushMessage) {
        super.mo94755e(pushMessage);
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_MOMENT_COMMENT;
    }

    @Override // p149l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkMomentMessage.MomentComment momentComment) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "moment";
        pushMessageContent.f38804id = momentComment.getOtherUserId();
    }
}
