package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class h9j implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f13914b = new h9j();

    /* JADX INFO: renamed from: d */
    public static j4m m15432d() {
        return f13914b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return false;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        String str = "来自闪聊匹配";
        if (message != null) {
            if (TEnum.equals(message.messageType, "limit_time_picture")) {
                str = "限时快拍";
            } else {
                Conversation conversation = pi6Var.f18622a;
                if (conversation.mm > 0 || TextUtils.equals(message.owner, conversation.otherUser)) {
                    str = "";
                }
            }
        }
        return m16869c(str);
    }
}
