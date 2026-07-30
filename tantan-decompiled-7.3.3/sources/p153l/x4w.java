package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMomentMessage;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class x4w extends q4w<LongLinkMomentMessage.MomentComment> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMomentMessage.MomentComment> mo95510b() {
        return LongLinkMomentMessage.MomentComment.class;
    }

    @Override // p153l.fxl
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.moment_single_comment;
    }

    @Override // p153l.q4w
    /* JADX INFO: renamed from: e */
    public void mo175263e(PushMessage pushMessage) {
        super.mo175263e(pushMessage);
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_MOMENT_COMMENT;
    }

    @Override // p153l.q4w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkMomentMessage.MomentComment momentComment) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "moment";
        pushMessageContent.f39652id = momentComment.getOtherUserId();
    }
}
