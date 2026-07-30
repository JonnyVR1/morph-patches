package p006l;

import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.b8c;
import l.f30;
import l.mrf0;
import l.orh0;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class y9k0 extends orh0<User> {
    public y9k0(b8c b8cVar, String str, mrf0 mrf0Var, List list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public final void m28117F(User user) {
        if (user.isRiskAudit()) {
            User userClone = user.clone();
            ((DbObject) userClone).id = "fake_risk_audit_default_" + ((DbObject) user).id;
            uqd0 userName = user.getUserName();
            uqd0 userPicture = user.getUserPicture();
            if (user.isRiskAuditName()) {
                userClone.name = (String) userName.get();
            }
            if (user.isRiskAuditAvatar()) {
                ((Media) userClone.pictures.get(0)).url = (String) userPicture.get();
            }
            super.upsert(userClone, (f30) null);
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public User upsert(User user, f30<User, User> f30Var) {
        m28117F(user);
        return super.upsert(user, f30Var);
    }
}
