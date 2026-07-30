package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class c6e implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f79953b = new c6e();

    /* JADX INFO: renamed from: d */
    public static z6m m108127d() {
        return f79953b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        if (tcu.m190496d().mo95724a(sj6Var, message) || TextUtils.equals(sj6Var.f168926a.f56859id, "fake_conversation_greeting") || !dek0.m115423d(sj6Var.f168927b, sj6Var.f168926a)) {
            return false;
        }
        if ((sj6Var.f168927b.isSVIP() && sj6Var.f168927b.isHideLocationFromSVip()) || sj6Var.f168927b.unilateralBlock() || User.isTeamAccount(sj6Var.f168926a.f56859id) || !TextUtils.isEmpty(sj6Var.f168926a.localDraft) || TextUtils.equals("group", sj6Var.f168926a.convType)) {
            return false;
        }
        if (NullChecker.m82486a(message)) {
            return (TEnum.equals(message.messageType, MessageType.red_packet) || dek0.m115422c(message)) ? false : true;
        }
        return true;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return m218804c(dek0.m115421b(sj6Var.f168927b));
    }
}
