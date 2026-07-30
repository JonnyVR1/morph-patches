package org.greenrobot.greendao;

import java.util.HashMap;
import java.util.Map;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractDaoMaster {
    protected final Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> daoConfigMap = new HashMap();

    /* JADX INFO: renamed from: db */
    protected final Database f9580db;
    protected final int schemaVersion;

    public AbstractDaoMaster(Database database, int i) {
        this.f9580db = database;
        this.schemaVersion = i;
    }

    public Database getDatabase() {
        return this.f9580db;
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public abstract AbstractDaoSession newSession();

    public abstract AbstractDaoSession newSession(IdentityScopeType identityScopeType);

    public void registerDaoClass(Class<? extends AbstractDao<?, ?>> cls) {
        this.daoConfigMap.put(cls, new DaoConfig(this.f9580db, cls));
    }
}
