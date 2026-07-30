package p149l;

import java.util.Map;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes2.dex */
public class l2c extends AbstractDaoSession {

    /* JADX INFO: renamed from: a */
    private final DaoConfig f125768a;

    /* JADX INFO: renamed from: b */
    private final hhw f125769b;

    public l2c(Database database, IdentityScopeType identityScopeType, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> map) {
        super(database);
        DaoConfig daoConfigM224689clone = map.get(hhw.class).clone();
        this.f125768a = daoConfigM224689clone;
        daoConfigM224689clone.initIdentityScope(identityScopeType);
        hhw hhwVar = new hhw(daoConfigM224689clone, this);
        this.f125769b = hhwVar;
        registerDao(ghw.class, hhwVar);
    }

    /* JADX INFO: renamed from: a */
    public hhw m148279a() {
        return this.f125769b;
    }
}
