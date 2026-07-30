package p006l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.longlink.msg.connector.LongLinkMomentMessage;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import l.ki60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class a3w extends s2w<LongLinkMomentMessage.MomentLike> {
    @Override // p006l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMomentMessage.MomentLike> mo11743b() {
        return LongLinkMomentMessage.MomentLike.class;
    }

    @Override // p006l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo11744c() {
        return "moment.single.like";
    }

    @Override // p006l.s2w
    /* JADX INFO: renamed from: e */
    public void mo11745e(PushMessage pushMessage) {
        super.mo11745e(pushMessage);
    }

    @Override // p006l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo11746f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_MOMENT_LIKE;
    }

    @Override // p006l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkMomentMessage.MomentLike momentLike) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "moment";
        pushMessageContent.id = momentLike.getOtherUserId();
    }
}
