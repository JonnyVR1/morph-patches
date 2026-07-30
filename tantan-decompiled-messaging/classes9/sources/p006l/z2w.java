package p006l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class z2w extends s2w<LongLinkMomentMessage.MomentComment> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMomentMessage.MomentComment> mo11743b() {
        return LongLinkMomentMessage.MomentComment.class;
    }

    @Override // p006l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "moment.single.comment";
    }

    @Override // p006l.s2w
    /* JADX INFO: renamed from: e */
    public void mo11745e(PushMessage pushMessage) {
        super.mo11745e(pushMessage);
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_MOMENT_COMMENT;
    }

    @Override // p006l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkMomentMessage.MomentComment momentComment) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "moment";
        pushMessageContent.id = momentComment.getOtherUserId();
    }
}
