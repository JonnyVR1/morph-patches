package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class o4e implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f141765b = new o4e();

    /* JADX INFO: renamed from: d */
    public static j4m m162558d() {
        return f141765b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        if (sau.m183099d().mo94463a(pi6Var, message) || TextUtils.equals(pi6Var.f149101a.f56011id, "fake_conversation_greeting") || !x4k0.m206993d(pi6Var.f149102b, pi6Var.f149101a)) {
            return false;
        }
        if ((pi6Var.f149102b.isSVIP() && pi6Var.f149102b.isHideLocationFromSVip()) || pi6Var.f149102b.unilateralBlock() || User.isTeamAccount(pi6Var.f149101a.f56011id) || !TextUtils.isEmpty(pi6Var.f149101a.localDraft) || TextUtils.equals("group", pi6Var.f149101a.convType)) {
            return false;
        }
        if (NullChecker.m81303a(message)) {
            return (TEnum.equals(message.messageType, MessageType.red_packet) || x4k0.m206992c(message)) ? false : true;
        }
        return true;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return m139684c(x4k0.m206991b(pi6Var.f149102b));
    }
}
