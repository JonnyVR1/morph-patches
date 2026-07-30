package p149l;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes7.dex */
public class r8e extends AbstractDao<q8e, String> {

    /* JADX INFO: renamed from: a */
    private final wzf0 f158208a;

    /* JADX INFO: renamed from: b */
    private final c8e f158209b;

    public r8e(DaoConfig daoConfig, m2c m2cVar) {
        super(daoConfig, m2cVar);
        this.f158208a = new wzf0();
        this.f158209b = new c8e();
    }

    /* JADX INFO: renamed from: c */
    public static void m178248c(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"download\" (\"TASK_ID\" TEXT PRIMARY KEY NOT NULL ,\"SOURCE_URLS\" TEXT,\"SOURCE_URL\" TEXT,\"NAME\" TEXT,\"DES\" TEXT,\"IMAGE_URL\" TEXT,\"CHECK_CODE\" TEXT,\"MD5_STR\" TEXT,\"DOWNLOAD_TYPE\" INTEGER NOT NULL ,\"DOWNLOAD_VIDEO_TYPE\" INTEGER NOT NULL ,\"EXTRA\" TEXT,\"SAVE_PATH\" TEXT,\"COMPLETE_NUM\" INTEGER NOT NULL ,\"TOTAL_NUM\" INTEGER NOT NULL ,\"INDEX\" INTEGER NOT NULL ,\"LENGTH\" INTEGER NOT NULL ,\"LAST_CHECK_TIME\" INTEGER NOT NULL ,\"DOWNLOAD_INFOS\" TEXT,\"IS_SHOW_NOTIFY\" INTEGER NOT NULL );");
    }

    /* JADX INFO: renamed from: d */
    public static void m178249d(Database database, boolean z) {
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"download\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void bindValues(SQLiteStatement sQLiteStatement, q8e q8eVar) {
        sQLiteStatement.clearBindings();
        String strM173410y = q8eVar.m173410y();
        if (strM173410y != null) {
            sQLiteStatement.bindString(1, strM173410y);
        }
        String[] strArrM173408w = q8eVar.m173408w();
        if (strArrM173408w != null) {
            sQLiteStatement.bindString(2, this.f158208a.convertToDatabaseValue(strArrM173408w));
        }
        String strM173407v = q8eVar.m173407v();
        if (strM173407v != null) {
            sQLiteStatement.bindString(3, strM173407v);
        }
        String strM173405t = q8eVar.m173405t();
        if (strM173405t != null) {
            sQLiteStatement.bindString(4, strM173405t);
        }
        String strM173394g = q8eVar.m173394g();
        if (strM173394g != null) {
            sQLiteStatement.bindString(5, strM173394g);
        }
        String strM173399n = q8eVar.m173399n();
        if (strM173399n != null) {
            sQLiteStatement.bindString(6, strM173399n);
        }
        String strM173392b = q8eVar.m173392b();
        if (strM173392b != null) {
            sQLiteStatement.bindString(7, strM173392b);
        }
        String strM173404s = q8eVar.m173404s();
        if (strM173404s != null) {
            sQLiteStatement.bindString(8, strM173404s);
        }
        sQLiteStatement.bindLong(9, q8eVar.m173396i());
        sQLiteStatement.bindLong(10, q8eVar.m173397j());
        String strM173398m = q8eVar.m173398m();
        if (strM173398m != null) {
            sQLiteStatement.bindString(11, strM173398m);
        }
        String strM173406u = q8eVar.m173406u();
        if (strM173406u != null) {
            sQLiteStatement.bindString(12, strM173406u);
        }
        sQLiteStatement.bindLong(13, q8eVar.m173393f());
        sQLiteStatement.bindLong(14, q8eVar.m173411z());
        sQLiteStatement.bindLong(15, q8eVar.m173400o());
        sQLiteStatement.bindLong(16, q8eVar.m173403r());
        sQLiteStatement.bindLong(17, q8eVar.m173402q());
        b8e[] b8eVarArrM173395h = q8eVar.m173395h();
        if (b8eVarArrM173395h != null) {
            sQLiteStatement.bindString(18, this.f158209b.convertToDatabaseValue(b8eVarArrM173395h));
        }
        sQLiteStatement.bindLong(19, q8eVar.m173401p() ? 1L : 0L);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void bindValues(DatabaseStatement databaseStatement, q8e q8eVar) {
        databaseStatement.clearBindings();
        String strM173410y = q8eVar.m173410y();
        if (strM173410y != null) {
            databaseStatement.bindString(1, strM173410y);
        }
        String[] strArrM173408w = q8eVar.m173408w();
        if (strArrM173408w != null) {
            databaseStatement.bindString(2, this.f158208a.convertToDatabaseValue(strArrM173408w));
        }
        String strM173407v = q8eVar.m173407v();
        if (strM173407v != null) {
            databaseStatement.bindString(3, strM173407v);
        }
        String strM173405t = q8eVar.m173405t();
        if (strM173405t != null) {
            databaseStatement.bindString(4, strM173405t);
        }
        String strM173394g = q8eVar.m173394g();
        if (strM173394g != null) {
            databaseStatement.bindString(5, strM173394g);
        }
        String strM173399n = q8eVar.m173399n();
        if (strM173399n != null) {
            databaseStatement.bindString(6, strM173399n);
        }
        String strM173392b = q8eVar.m173392b();
        if (strM173392b != null) {
            databaseStatement.bindString(7, strM173392b);
        }
        String strM173404s = q8eVar.m173404s();
        if (strM173404s != null) {
            databaseStatement.bindString(8, strM173404s);
        }
        databaseStatement.bindLong(9, q8eVar.m173396i());
        databaseStatement.bindLong(10, q8eVar.m173397j());
        String strM173398m = q8eVar.m173398m();
        if (strM173398m != null) {
            databaseStatement.bindString(11, strM173398m);
        }
        String strM173406u = q8eVar.m173406u();
        if (strM173406u != null) {
            databaseStatement.bindString(12, strM173406u);
        }
        databaseStatement.bindLong(13, q8eVar.m173393f());
        databaseStatement.bindLong(14, q8eVar.m173411z());
        databaseStatement.bindLong(15, q8eVar.m173400o());
        databaseStatement.bindLong(16, q8eVar.m173403r());
        databaseStatement.bindLong(17, q8eVar.m173402q());
        b8e[] b8eVarArrM173395h = q8eVar.m173395h();
        if (b8eVarArrM173395h != null) {
            databaseStatement.bindString(18, this.f158209b.convertToDatabaseValue(b8eVarArrM173395h));
        }
        databaseStatement.bindLong(19, q8eVar.m173401p() ? 1L : 0L);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String getKey(q8e q8eVar) {
        if (q8eVar != null) {
            return q8eVar.m173410y();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean hasKey(q8e q8eVar) {
        return q8eVar.m173410y() != null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public q8e readEntity(Cursor cursor, int i) {
        q8e q8eVar = new q8e();
        readEntity(cursor, q8eVar, i);
        return q8eVar;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readEntity(Cursor cursor, q8e q8eVar, int i) {
        q8eVar.m173389X(cursor.isNull(i) ? null : cursor.getString(i));
        int i2 = i + 1;
        q8eVar.m173388W(cursor.isNull(i2) ? null : this.f158208a.convertToEntityProperty(cursor.getString(i2)));
        int i3 = i + 2;
        q8eVar.m173387V(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 3;
        q8eVar.m173385T(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        q8eVar.m173374I(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 5;
        q8eVar.m173379N(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 6;
        q8eVar.m173372F(cursor.isNull(i7) ? null : cursor.getString(i7));
        int i8 = i + 7;
        q8eVar.m173384S(cursor.isNull(i8) ? null : cursor.getString(i8));
        q8eVar.m173376K(cursor.getInt(i + 8));
        q8eVar.m173377L(cursor.getInt(i + 9));
        int i9 = i + 10;
        q8eVar.m173378M(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 11;
        q8eVar.m173386U(cursor.isNull(i10) ? null : cursor.getString(i10));
        q8eVar.m173373H(cursor.getLong(i + 12));
        q8eVar.m173390Y(cursor.getLong(i + 13));
        q8eVar.m173380O(cursor.getInt(i + 14));
        q8eVar.m173383R(cursor.getInt(i + 15));
        q8eVar.m173382Q(cursor.getLong(i + 16));
        int i11 = i + 17;
        q8eVar.m173375J(cursor.isNull(i11) ? null : this.f158209b.convertToEntityProperty(cursor.getString(i11)));
        q8eVar.m173381P(cursor.getShort(i + 18) != 0);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String readKey(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return cursor.getString(i);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String updateKeyAfterInsert(q8e q8eVar, long j) {
        return q8eVar.m173410y();
    }
}
