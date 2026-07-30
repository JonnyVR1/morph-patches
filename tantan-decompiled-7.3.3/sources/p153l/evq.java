package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class evq implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f96021b = new evq();

    /* JADX INFO: renamed from: d */
    public static z6m m122812d() {
        return f96021b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        if (!gra.m131757u3() || !CoreModule.f18264c.f20381e0.m116593na().isFemale() || !TEnum.equals(sj6Var.f168926a.status, "default") || !TextUtils.equals(sj6Var.f168926a.convType, "default") || !CoreModule.f18264c.f20330N0.m32970k3(sj6Var.f168927b, 5) || !NullChecker.m82486a(message) || !message.isOtherUser() || pzi0.m174454o() - message.createdTime >= 300000.0d) {
            return false;
        }
        Conversation conversation = sj6Var.f168926a;
        return conversation.f21116mm < 1 && conversation.unreadMessages > 0;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return m218804c("刚发来消息");
    }
}
