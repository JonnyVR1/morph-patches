package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class bcj implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f76177b = new bcj();

    /* JADX INFO: renamed from: d */
    public static z6m m103543d() {
        return f76177b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return false;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        String str = "来自闪聊匹配";
        if (message != null) {
            if (TEnum.equals(message.messageType, MessageType.limit_time_picture)) {
                str = "限时快拍";
            } else {
                Conversation conversation = sj6Var.f168926a;
                if (conversation.f21116mm > 0 || TextUtils.equals(message.owner, conversation.otherUser)) {
                    str = "";
                }
            }
        }
        return m218804c(str);
    }
}
