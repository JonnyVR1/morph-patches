package p149l;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: loaded from: classes2.dex */
public class j2c extends AbstractDaoMaster {
    public j2c(Database database) {
        super(database, 1);
        registerDaoClass(hhw.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m139424a(Database database, boolean z) {
        hhw.m131164c(database, z);
    }

    /* JADX INFO: renamed from: b */
    public static void m139425b(Database database, boolean z) {
        hhw.m131165d(database, z);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l2c newSession() {
        return new l2c(this.f205955db, IdentityScopeType.Session, this.daoConfigMap);
    }

    @Override // org.greenrobot.greendao.AbstractDaoMaster
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l2c newSession(IdentityScopeType identityScopeType) {
        return new l2c(this.f205955db, identityScopeType, this.daoConfigMap);
    }
}
