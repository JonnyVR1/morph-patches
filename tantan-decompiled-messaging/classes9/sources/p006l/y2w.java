package p006l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class y2w extends s2w<LongLinkMomentMessage.MomentCancelLike> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMomentMessage.MomentCancelLike> mo11743b() {
        return LongLinkMomentMessage.MomentCancelLike.class;
    }

    @Override // p006l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "moment.single.unlike";
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_MOMENT_CANCEL_LIKE;
    }

    @Override // p006l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkMomentMessage.MomentCancelLike momentCancelLike) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.parent = IdBoxed.new_();
        pushMessage.content.parent.id = momentCancelLike.getMid();
    }
}
