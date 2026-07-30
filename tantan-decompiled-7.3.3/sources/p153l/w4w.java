package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMomentMessage;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class w4w extends q4w<LongLinkMomentMessage.MomentCancelLike> {
    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMomentMessage.MomentCancelLike> mo95510b() {
        return LongLinkMomentMessage.MomentCancelLike.class;
    }

    @Override // p153l.fxl
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo96253c() {
        return PushMessageIntent.moment_single_unlike;
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_MOMENT_CANCEL_LIKE;
    }

    @Override // p153l.q4w
    public void populatePushMessage(PushMessage pushMessage, pq60 pq60Var, LongLinkMomentMessage.MomentCancelLike momentCancelLike) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.parent = IdBoxed.new_();
        pushMessage.content.parent.f39607id = momentCancelLike.getMid();
    }
}
