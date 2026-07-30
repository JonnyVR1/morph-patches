package org.greenrobot.greendao.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScope;
import org.greenrobot.greendao.identityscope.IdentityScopeLong;
import org.greenrobot.greendao.identityscope.IdentityScopeObject;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import p149l.qhg0;
import p149l.zw00;

/* JADX INFO: loaded from: classes3.dex */
public final class DaoConfig implements Cloneable {
    public final String[] allColumns;

    /* JADX INFO: renamed from: db */
    public final Database f205958db;
    private IdentityScope<?, ?> identityScope;
    public final boolean keyIsNumeric;
    public final String[] nonPkColumns;
    public final String[] pkColumns;
    public final Property pkProperty;
    public final Property[] properties;
    public final zw00 statements;
    public final String tablename;

    public DaoConfig(Database database, Class<? extends AbstractDao<?, ?>> cls) {
        this.f205958db = database;
        try {
            this.tablename = (String) cls.getField("TABLENAME").get(null);
            Property[] propertyArrReflectProperties = reflectProperties(cls);
            this.properties = propertyArrReflectProperties;
            this.allColumns = new String[propertyArrReflectProperties.length];
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Property property = null;
            for (int i = 0; i < propertyArrReflectProperties.length; i++) {
                Property property2 = propertyArrReflectProperties[i];
                String str = property2.columnName;
                this.allColumns[i] = str;
                if (property2.primaryKey) {
                    arrayList.add(str);
                    property = property2;
                } else {
                    arrayList2.add(str);
                }
            }
            this.nonPkColumns = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            this.pkColumns = strArr;
            Property property3 = strArr.length == 1 ? property : null;
            this.pkProperty = property3;
            this.statements = new zw00(database, this.tablename, this.allColumns, strArr);
            if (property3 == null) {
                this.keyIsNumeric = false;
            } else {
                Class<?> cls2 = property3.type;
                this.keyIsNumeric = cls2.equals(Long.TYPE) || cls2.equals(Long.class) || cls2.equals(Integer.TYPE) || cls2.equals(Integer.class) || cls2.equals(Short.TYPE) || cls2.equals(Short.class) || cls2.equals(Byte.TYPE) || cls2.equals(Byte.class);
            }
        } catch (Exception e) {
            throw new DaoException("Could not init DAOConfig", e);
        }
    }

    private static Property[] reflectProperties(Class<? extends AbstractDao<?, ?>> cls) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        Field[] declaredFields = Class.forName(cls.getName().concat("$Properties")).getDeclaredFields();
        ArrayList<Property> arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get(null);
                if (obj instanceof Property) {
                    arrayList.add((Property) obj);
                }
            }
        }
        Property[] propertyArr = new Property[arrayList.size()];
        for (Property property : arrayList) {
            int i = property.ordinal;
            if (propertyArr[i] != null) {
                throw new DaoException("Duplicate property ordinals");
            }
            propertyArr[i] = property;
        }
        return propertyArr;
    }

    public void clearIdentityScope() {
        IdentityScope<?, ?> identityScope = this.identityScope;
        if (identityScope != null) {
            identityScope.clear();
        }
    }

    public DaoConfig clone() {
        return new DaoConfig(this);
    }

    public IdentityScope<?, ?> getIdentityScope() {
        return this.identityScope;
    }

    public void initIdentityScope(IdentityScopeType identityScopeType) {
        if (identityScopeType == IdentityScopeType.None) {
            this.identityScope = null;
            return;
        }
        if (identityScopeType != IdentityScopeType.Session) {
            qhg0.m174539a("Unsupported type: ", identityScopeType);
        } else if (this.keyIsNumeric) {
            this.identityScope = new IdentityScopeLong();
        } else {
            this.identityScope = new IdentityScopeObject();
        }
    }

    public void setIdentityScope(IdentityScope<?, ?> identityScope) {
        this.identityScope = identityScope;
    }

    public DaoConfig(DaoConfig daoConfig) {
        this.f205958db = daoConfig.f205958db;
        this.tablename = daoConfig.tablename;
        this.properties = daoConfig.properties;
        this.allColumns = daoConfig.allColumns;
        this.pkColumns = daoConfig.pkColumns;
        this.nonPkColumns = daoConfig.nonPkColumns;
        this.pkProperty = daoConfig.pkProperty;
        this.statements = daoConfig.statements;
        this.keyIsNumeric = daoConfig.keyIsNumeric;
    }
}
