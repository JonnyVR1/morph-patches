package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dtq implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f11997b = new dtq();

    /* JADX INFO: renamed from: d */
    public static j4m m13481d() {
        return f11997b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        if (!upa.u3() || !CoreModule.c.e0.na().isFemale() || !TEnum.equals(pi6Var.f18622a.status, "default") || !TextUtils.equals(pi6Var.f18622a.convType, "default") || !CoreModule.c.N0.k3(pi6Var.f18623b, 5) || !NullChecker.a(message) || !message.isOtherUser() || mqi0.m18550o() - message.createdTime >= 300000.0d) {
            return false;
        }
        Conversation conversation = pi6Var.f18622a;
        return conversation.mm < 1 && conversation.unreadMessages > 0;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return m16869c("刚发来消息");
    }
}
