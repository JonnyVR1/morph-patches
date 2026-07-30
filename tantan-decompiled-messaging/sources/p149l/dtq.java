package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class dtq implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f87868b = new dtq();

    /* JADX INFO: renamed from: d */
    public static j4m m113580d() {
        return f87868b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        if (!upa.m194826u3() || !CoreModule.f17545c.f19639e0.m169520na().isFemale() || !TEnum.equals(pi6Var.f149101a.status, "default") || !TextUtils.equals(pi6Var.f149101a.convType, "default") || !CoreModule.f17545c.f19588N0.m31967k3(pi6Var.f149102b, 5) || !NullChecker.m81303a(message) || !message.isOtherUser() || mqi0.m155944o() - message.createdTime >= 300000.0d) {
            return false;
        }
        Conversation conversation = pi6Var.f149101a;
        return conversation.f20374mm < 1 && conversation.unreadMessages > 0;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return m139684c("刚发来消息");
    }
}
