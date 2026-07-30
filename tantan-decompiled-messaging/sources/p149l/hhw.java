package p149l;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes2.dex */
public class hhw extends AbstractDao<ghw, String> {

    /* JADX INFO: renamed from: l.hhw$a */
    public static class C17319a {

        /* JADX INFO: renamed from: a */
        public static final Property f107829a = new Property(0, String.class, Constants.KEY_KEY, true, "KEY");

        /* JADX INFO: renamed from: b */
        public static final Property f107830b = new Property(1, String.class, "bid", false, "BID");

        /* JADX INFO: renamed from: c */
        public static final Property f107831c = new Property(2, String.class, "url", false, "URL");

        /* JADX INFO: renamed from: d */
        public static final Property f107832d = new Property(3, String.class, "namespace", false, "NAMESPACE");

        /* JADX INFO: renamed from: e */
        public static final Property f107833e = new Property(4, String.class, FirebaseAnalytics.Param.METHOD, false, "METHOD");

        /* JADX INFO: renamed from: f */
        public static final Property f107834f = new Property(5, String.class, CommandMessage.PARAMS, false, "PARAMS");

        /* JADX INFO: renamed from: g */
        public static final Property f107835g = new Property(6, String.class, LovePlanetStage.result, false, "RESULT");

        /* JADX INFO: renamed from: h */
        public static final Property f107836h = new Property(7, Integer.TYPE, "hasUploaded", false, "HAS_UPLOADED");
    }

    public hhw(DaoConfig daoConfig, l2c l2cVar) {
        super(daoConfig, l2cVar);
    }

    /* JADX INFO: renamed from: c */
    public static void m131164c(Database database, boolean z) {
        String str = z ? "IF NOT EXISTS " : "";
        database.execSQL("CREATE TABLE " + str + "\"bridge_record\" (\"KEY\" TEXT PRIMARY KEY NOT NULL ,\"BID\" TEXT,\"URL\" TEXT,\"NAMESPACE\" TEXT,\"METHOD\" TEXT,\"PARAMS\" TEXT,\"RESULT\" TEXT,\"HAS_UPLOADED\" INTEGER NOT NULL );");
        database.execSQL("CREATE INDEX " + str + "IDX_bridge_record_KEY ON \"bridge_record\" (\"KEY\" ASC);");
    }

    /* JADX INFO: renamed from: d */
    public static void m131165d(Database database, boolean z) {
        StringBuilder sb = new StringBuilder("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"bridge_record\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void bindValues(SQLiteStatement sQLiteStatement, ghw ghwVar) {
        sQLiteStatement.clearBindings();
        String strM126226c = ghwVar.m126226c();
        if (strM126226c != null) {
            sQLiteStatement.bindString(1, strM126226c);
        }
        String strM126224a = ghwVar.m126224a();
        if (strM126224a != null) {
            sQLiteStatement.bindString(2, strM126224a);
        }
        String strM126231h = ghwVar.m126231h();
        if (strM126231h != null) {
            sQLiteStatement.bindString(3, strM126231h);
        }
        String strM126228e = ghwVar.m126228e();
        if (strM126228e != null) {
            sQLiteStatement.bindString(4, strM126228e);
        }
        String strM126227d = ghwVar.m126227d();
        if (strM126227d != null) {
            sQLiteStatement.bindString(5, strM126227d);
        }
        String strM126229f = ghwVar.m126229f();
        if (strM126229f != null) {
            sQLiteStatement.bindString(6, strM126229f);
        }
        String strM126230g = ghwVar.m126230g();
        if (strM126230g != null) {
            sQLiteStatement.bindString(7, strM126230g);
        }
        sQLiteStatement.bindLong(8, ghwVar.m126225b());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void bindValues(DatabaseStatement databaseStatement, ghw ghwVar) {
        databaseStatement.clearBindings();
        String strM126226c = ghwVar.m126226c();
        if (strM126226c != null) {
            databaseStatement.bindString(1, strM126226c);
        }
        String strM126224a = ghwVar.m126224a();
        if (strM126224a != null) {
            databaseStatement.bindString(2, strM126224a);
        }
        String strM126231h = ghwVar.m126231h();
        if (strM126231h != null) {
            databaseStatement.bindString(3, strM126231h);
        }
        String strM126228e = ghwVar.m126228e();
        if (strM126228e != null) {
            databaseStatement.bindString(4, strM126228e);
        }
        String strM126227d = ghwVar.m126227d();
        if (strM126227d != null) {
            databaseStatement.bindString(5, strM126227d);
        }
        String strM126229f = ghwVar.m126229f();
        if (strM126229f != null) {
            databaseStatement.bindString(6, strM126229f);
        }
        String strM126230g = ghwVar.m126230g();
        if (strM126230g != null) {
            databaseStatement.bindString(7, strM126230g);
        }
        databaseStatement.bindLong(8, ghwVar.m126225b());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String getKey(ghw ghwVar) {
        if (ghwVar != null) {
            return ghwVar.m126226c();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean hasKey(ghw ghwVar) {
        return ghwVar.m126226c() != null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ghw readEntity(Cursor cursor, int i) {
        ghw ghwVar = new ghw();
        readEntity(cursor, ghwVar, i);
        return ghwVar;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void readEntity(Cursor cursor, ghw ghwVar, int i) {
        ghwVar.m126234k(cursor.isNull(i) ? null : cursor.getString(i));
        int i2 = i + 1;
        ghwVar.m126232i(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        ghwVar.m126239p(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 3;
        ghwVar.m126236m(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 4;
        ghwVar.m126235l(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 5;
        ghwVar.m126237n(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 6;
        ghwVar.m126238o(cursor.isNull(i7) ? null : cursor.getString(i7));
        ghwVar.m126233j(cursor.getInt(i + 7));
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
    public final String updateKeyAfterInsert(ghw ghwVar, long j) {
        return ghwVar.m126226c();
    }
}
