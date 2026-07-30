package p153l;

import com.p051p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ejk0 extends wzh0<User> {
    public ejk0(h9c h9cVar, String str, vzf0 vzf0Var, List list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public final void m120983F(User user) {
        if (user.isRiskAudit()) {
            User userMo225055clone = user.mo225055clone();
            userMo225055clone.f56859id = "fake_risk_audit_default_" + user.f56859id;
            wyd0 userName = user.getUserName();
            wyd0 userPicture = user.getUserPicture();
            if (user.isRiskAuditName()) {
                userMo225055clone.name = userName.get();
            }
            if (user.isRiskAuditAvatar()) {
                userMo225055clone.pictures.get(0).url = userPicture.get();
            }
            super.upsert(userMo225055clone, null);
        }
    }

    @Override // p153l.wzh0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User upsert(User user, z20<User, User> z20Var) {
        m120983F(user);
        return (User) super.upsert(user, z20Var);
    }
}
