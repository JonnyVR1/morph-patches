package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class o4e implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f17829b = new o4e();

    /* JADX INFO: renamed from: d */
    public static j4m m19612d() {
        return f17829b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        if (sau.m22015d().mo11180a(pi6Var, message) || TextUtils.equals(((DbObject) pi6Var.f18622a).id, "fake_conversation_greeting") || !x4k0.m24709d(pi6Var.f18623b, pi6Var.f18622a)) {
            return false;
        }
        if ((pi6Var.f18623b.isSVIP() && pi6Var.f18623b.isHideLocationFromSVip()) || pi6Var.f18623b.unilateralBlock() || User.isTeamAccount(((DbObject) pi6Var.f18622a).id) || !TextUtils.isEmpty(pi6Var.f18622a.localDraft) || TextUtils.equals("group", pi6Var.f18622a.convType)) {
            return false;
        }
        if (NullChecker.a(message)) {
            return (TEnum.equals(message.messageType, "red_packet") || x4k0.m24708c(message)) ? false : true;
        }
        return true;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return m16869c(x4k0.m24707b(pi6Var.f18623b));
    }
}
