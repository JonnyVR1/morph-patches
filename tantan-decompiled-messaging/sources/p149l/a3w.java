package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMomentMessage;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class a3w extends s2w<LongLinkMomentMessage.MomentLike> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMomentMessage.MomentLike> mo94398b() {
        return LongLinkMomentMessage.MomentLike.class;
    }

    @Override // p149l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.moment_single_like;
    }

    @Override // p149l.s2w
    /* JADX INFO: renamed from: e */
    public void mo94755e(PushMessage pushMessage) {
        super.mo94755e(pushMessage);
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_MOMENT_LIKE;
    }

    @Override // p149l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkMomentMessage.MomentLike momentLike) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.type = "moment";
        pushMessageContent.f38804id = momentLike.getOtherUserId();
    }
}
