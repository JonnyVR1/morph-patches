package p149l;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: loaded from: classes7.dex */
public class k2c extends AbstractDaoMaster {
    public k2c(Database database) {
        super(database, 1);
        registerDaoClass(r8e.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m144274a(Database database, boolean z) {
        r8e.m178248c(database, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m144275b(Database database, boolean z) {
        r8e.m178249d(database, z);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m2c newSession() {
        return new m2c(this.f205955db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public m2c newSession(IdentityScopeType identityScopeType) {
        return new m2c(this.f205955db, identityScopeType, this.daoConfigMap);
    }
}
