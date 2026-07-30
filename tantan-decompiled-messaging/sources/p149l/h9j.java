package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes11.dex */
public class h9j implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f106603b = new h9j();

    /* JADX INFO: renamed from: d */
    public static j4m m130027d() {
        return f106603b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return false;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        String str = "来自闪聊匹配";
        if (message != null) {
            if (TEnum.equals(message.messageType, MessageType.limit_time_picture)) {
                str = "限时快拍";
            } else {
                Conversation conversation = pi6Var.f149101a;
                if (conversation.f20374mm > 0 || TextUtils.equals(message.owner, conversation.otherUser)) {
                    str = "";
                }
            }
        }
        return m139684c(str);
    }
}
