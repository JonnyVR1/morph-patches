package p149l;

import android.database.sqlite.SQLiteStatement;
import java.util.Date;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

/* JADX INFO: renamed from: l.d7 */
/* JADX INFO: loaded from: classes7.dex */
public class C16308d7 {
    /* JADX INFO: renamed from: a */
    public static void m110206a(Database database, zw00 zw00Var, boolean z, Property[] propertyArr, Object[] objArr, Property[] propertyArr2, Object[] objArr2) {
        DatabaseStatement databaseStatementM220503d = zw00Var.m220503d(propertyArr, propertyArr2);
        if (database.isDbLockedByCurrentThread()) {
            synchronized (databaseStatementM220503d) {
                try {
                    if (z) {
                        m110208c((SQLiteStatement) databaseStatementM220503d.getRawStatement(), objArr, objArr2);
                    } else {
                        m110209d(databaseStatementM220503d, objArr, objArr2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        database.beginTransaction();
        try {
            synchronized (databaseStatementM220503d) {
                m110209d(databaseStatementM220503d, objArr, objArr2);
            }
            database.setTransactionSuccessful();
            database.endTransaction();
        } catch (Throwable th2) {
            database.endTransaction();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m110207b(Database database, zw00 zw00Var, boolean z, Property[] propertyArr, Object[] objArr, Property[] propertyArr2, Object[] objArr2, Property property, Object[] objArr3) {
        DatabaseStatement databaseStatementM220504e = zw00Var.m220504e(propertyArr, propertyArr2, property, objArr3);
        if (database.isDbLockedByCurrentThread()) {
            synchronized (databaseStatementM220504e) {
                try {
                    if (z) {
                        m110208c((SQLiteStatement) databaseStatementM220504e.getRawStatement(), objArr, objArr2);
                    } else {
                        m110209d(databaseStatementM220504e, objArr, objArr2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        database.beginTransaction();
        try {
            synchronized (databaseStatementM220504e) {
                m110209d(databaseStatementM220504e, objArr, objArr2);
            }
            database.setTransactionSuccessful();
            database.endTransaction();
        } catch (Throwable th2) {
            database.endTransaction();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m110208c(SQLiteStatement sQLiteStatement, Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            if (obj == null) {
                sQLiteStatement.bindNull(i + 1);
            } else if (obj instanceof Float) {
                sQLiteStatement.bindDouble(i + 1, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                sQLiteStatement.bindDouble(i + 1, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                sQLiteStatement.bindString(i + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteStatement.bindLong(i + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteStatement.bindLong(i + 1, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                sQLiteStatement.bindLong(i + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else if (obj instanceof Date) {
                sQLiteStatement.bindLong(i + 1, ((Date) obj).getTime());
            }
            i++;
        }
        if (objArr2 != null) {
            for (int i2 = 0; i2 < objArr2.length; i2++) {
                Object obj2 = objArr2[i2];
                if (obj2 == null) {
                    sQLiteStatement.bindNull(i2 + 1 + length);
                } else if (obj2 instanceof String) {
                    sQLiteStatement.bindString(i2 + 1 + length, (String) obj2);
                } else if (obj2 instanceof Float) {
                    sQLiteStatement.bindDouble(i2 + 1 + length, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Double) {
                    sQLiteStatement.bindDouble(i2 + 1 + length, ((Double) obj2).doubleValue());
                } else if (obj2 instanceof Integer) {
                    sQLiteStatement.bindLong(i2 + 1 + length, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    sQLiteStatement.bindLong(i2 + 1 + length, ((Long) obj2).longValue());
                } else if (obj2 instanceof Boolean) {
                    sQLiteStatement.bindLong(i2 + 1 + length, ((Boolean) obj2).booleanValue() ? 1L : 0L);
                } else if (objArr[i2] instanceof Date) {
                    sQLiteStatement.bindLong(i2 + 1 + length, ((Date) obj2).getTime());
                }
            }
        }
        sQLiteStatement.execute();
    }

    /* JADX INFO: renamed from: d */
    private static void m110209d(DatabaseStatement databaseStatement, Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            if (obj == null) {
                databaseStatement.bindNull(i + 1);
            } else if (obj instanceof Float) {
                databaseStatement.bindDouble(i + 1, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                databaseStatement.bindDouble(i + 1, ((Double) obj).doubleValue());
            } else if (obj instanceof String) {
                databaseStatement.bindString(i + 1, (String) obj);
            } else if (obj instanceof Integer) {
                databaseStatement.bindLong(i + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                databaseStatement.bindLong(i + 1, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                databaseStatement.bindLong(i + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else if (obj instanceof Date) {
                databaseStatement.bindLong(i + 1, ((Date) obj).getTime());
            }
            i++;
        }
        if (objArr2 != null) {
            for (int i2 = 0; i2 < objArr2.length; i2++) {
                Object obj2 = objArr2[i2];
                if (obj2 == null) {
                    databaseStatement.bindNull(i2 + 1 + length);
                } else if (obj2 instanceof String) {
                    databaseStatement.bindString(i2 + 1 + length, (String) obj2);
                } else if (obj2 instanceof Float) {
                    databaseStatement.bindDouble(i2 + 1 + length, ((Float) obj2).floatValue());
                } else if (obj2 instanceof Double) {
                    databaseStatement.bindDouble(i2 + 1 + length, ((Double) obj2).doubleValue());
                } else if (obj2 instanceof Integer) {
                    databaseStatement.bindLong(i2 + 1 + length, ((Integer) obj2).intValue());
                } else if (obj2 instanceof Long) {
                    databaseStatement.bindLong(i2 + 1 + length, ((Long) obj2).longValue());
                } else if (obj2 instanceof Boolean) {
                    databaseStatement.bindLong(i2 + 1 + length, ((Boolean) obj2).booleanValue() ? 1L : 0L);
                } else if (objArr[i2] instanceof Date) {
                    databaseStatement.bindLong(i2 + 1 + length, ((Date) obj2).getTime());
                }
            }
        }
        databaseStatement.execute();
    }
}
