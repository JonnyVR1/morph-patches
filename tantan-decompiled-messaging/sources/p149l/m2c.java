package p149l;

import java.util.Map;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes7.dex */
public class m2c extends AbstractDaoSession {

    /* JADX INFO: renamed from: a */
    private final DaoConfig f130918a;

    /* JADX INFO: renamed from: b */
    private final r8e f130919b;

    public m2c(Database database, IdentityScopeType identityScopeType, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> map) {
        super(database);
        DaoConfig daoConfigClone = map.get(r8e.class).clone();
        this.f130918a = daoConfigClone;
        daoConfigClone.initIdentityScope(identityScopeType);
        r8e r8eVar = new r8e(daoConfigClone, this);
        this.f130919b = r8eVar;
        registerDao(q8e.class, r8eVar);
    }
}
