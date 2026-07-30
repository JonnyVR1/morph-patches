package p149l;

import com.p046p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class y9k0 extends orh0<User> {
    public y9k0(b8c b8cVar, String str, mrf0 mrf0Var, List list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public final void m213538F(User user) {
        if (user.isRiskAudit()) {
            User userMo223809clone = user.mo223809clone();
            userMo223809clone.f56011id = "fake_risk_audit_default_" + user.f56011id;
            uqd0 userName = user.getUserName();
            uqd0 userPicture = user.getUserPicture();
            if (user.isRiskAuditName()) {
                userMo223809clone.name = userName.get();
            }
            if (user.isRiskAuditAvatar()) {
                userMo223809clone.pictures.get(0).url = userPicture.get();
            }
            super.upsert(userMo223809clone, null);
        }
    }

    @Override // p149l.orh0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User upsert(User user, f30<User, User> f30Var) {
        m213538F(user);
        return (User) super.upsert(user, f30Var);
    }
}
