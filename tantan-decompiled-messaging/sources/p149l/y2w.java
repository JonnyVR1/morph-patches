package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMomentMessage;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageIntent;

/* JADX INFO: loaded from: classes9.dex */
public class y2w extends s2w<LongLinkMomentMessage.MomentCancelLike> {
    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkMomentMessage.MomentCancelLike> mo94398b() {
        return LongLinkMomentMessage.MomentCancelLike.class;
    }

    @Override // p149l.sul
    @NonNull
    /* JADX INFO: renamed from: c */
    public String mo94754c() {
        return PushMessageIntent.moment_single_unlike;
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_MOMENT_CANCEL_LIKE;
    }

    @Override // p149l.s2w
    public void populatePushMessage(PushMessage pushMessage, ki60 ki60Var, LongLinkMomentMessage.MomentCancelLike momentCancelLike) {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessage.content = pushMessageContent;
        pushMessageContent.parent = IdBoxed.new_();
        pushMessage.content.parent.f38759id = momentCancelLike.getMid();
    }
}
