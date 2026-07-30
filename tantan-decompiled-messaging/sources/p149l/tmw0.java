package p149l;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.C2454c;
import com.google.android.gms.measurement.internal.C2458g;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzon;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class tmw0 extends e9x0 {

    /* JADX INFO: renamed from: c */
    public final tpw0 f171185c;

    /* JADX INFO: renamed from: d */
    public boolean f171186d;

    public tmw0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f171185c = new tpw0(this, zza(), "google_app_measurement_local.db");
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: F */
    private final boolean m189722F() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX INFO: renamed from: v */
    public static long m189723v(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m189724A(zzon zzonVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzonVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m189730x(1, bArrMarshall);
        }
        zzj().m211414C().m123936a("User property too long for local database. Sending directly to service");
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final void m189725B() {
        int iDelete;
        mo15092h();
        try {
            SQLiteDatabase sQLiteDatabaseM189728E = m189728E();
            if (sQLiteDatabaseM189728E == null || (iDelete = sQLiteDatabaseM189728E.delete("messages", null, null)) <= 0) {
                return;
            }
            zzj().m211416E().m123937b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            zzj().m211412A().m123937b("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final boolean m189726C() {
        return m189730x(3, new byte[0]);
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final boolean m189727D() {
        mo15092h();
        if (this.f171186d || !m189722F()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseM189728E = m189728E();
                    if (sQLiteDatabaseM189728E == null) {
                        this.f171186d = true;
                        if (sQLiteDatabaseM189728E != null) {
                            sQLiteDatabaseM189728E.close();
                        }
                        return false;
                    }
                    sQLiteDatabaseM189728E.beginTransaction();
                    sQLiteDatabaseM189728E.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseM189728E.setTransactionSuccessful();
                    sQLiteDatabaseM189728E.endTransaction();
                    sQLiteDatabaseM189728E.close();
                    return true;
                } catch (SQLiteFullException e) {
                    zzj().m211412A().m123937b("Error deleting app launch break from local database", e);
                    this.f171186d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i);
                i += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteException e2) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                zzj().m211412A().m123937b("Error deleting app launch break from local database", e2);
                this.f171186d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().m211417F().m123936a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final SQLiteDatabase m189728E() throws SQLiteException {
        if (this.f171186d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f171185c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f171186d = true;
        return null;
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.psu0, p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ h0s0 mo15093i() {
        return super.mo15093i();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2454c mo15094j() {
        return super.mo15094j();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ tmw0 mo15095k() {
        return super.mo15095k();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2458g mo15096l() {
        return super.mo15096l();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ m1y0 mo15097m() {
        return super.mo15097m();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ b3y0 mo15098n() {
        return super.mo15098n();
    }

    @Override // p149l.psu0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ n8y0 mo15099o() {
        return super.mo15099o();
    }

    @Override // p149l.e9x0
    /* JADX INFO: renamed from: u */
    public final boolean mo15101u() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01df  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e4  */
    /* JADX INFO: renamed from: w */
    public final List<AbstractSafeParcelable> m189729w(int i) {
        SQLiteDatabase sQLiteDatabaseM189728E;
        Cursor cursorQuery;
        String str;
        String[] strArr;
        zzon zzonVarCreateFromParcel;
        zzae zzaeVarCreateFromParcel;
        mo15092h();
        Cursor cursor = null;
        if (this.f171186d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!m189722F()) {
            return arrayList;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            try {
                sQLiteDatabaseM189728E = m189728E();
                if (sQLiteDatabaseM189728E == null) {
                    this.f171186d = true;
                    if (sQLiteDatabaseM189728E != null) {
                        sQLiteDatabaseM189728E.close();
                    }
                    return null;
                }
                try {
                    sQLiteDatabaseM189728E.beginTransaction();
                    long jM189723v = m189723v(sQLiteDatabaseM189728E);
                    long j = -1;
                    if (jM189723v != -1) {
                        strArr = new String[]{String.valueOf(jM189723v)};
                        str = "rowid<?";
                    } else {
                        str = null;
                        strArr = null;
                    }
                    cursorQuery = sQLiteDatabaseM189728E.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                    while (cursorQuery.moveToNext()) {
                        try {
                            j = cursorQuery.getLong(0);
                            int i4 = cursorQuery.getInt(1);
                            byte[] blob = cursorQuery.getBlob(2);
                            if (i4 == 0) {
                                Parcel parcelObtain = Parcel.obtain();
                                try {
                                    try {
                                        parcelObtain.unmarshall(blob, 0, blob.length);
                                        parcelObtain.setDataPosition(0);
                                        zzbf zzbfVarCreateFromParcel = zzbf.CREATOR.createFromParcel(parcelObtain);
                                        parcelObtain.recycle();
                                        if (zzbfVarCreateFromParcel != null) {
                                            arrayList.add(zzbfVarCreateFromParcel);
                                        }
                                    } catch (SafeParcelReader.ParseException unused) {
                                        zzj().m211412A().m123936a("Failed to load event from local database");
                                        parcelObtain.recycle();
                                    }
                                } catch (Throwable th) {
                                    parcelObtain.recycle();
                                    throw th;
                                }
                            } else if (i4 == 1) {
                                Parcel parcelObtain2 = Parcel.obtain();
                                try {
                                    try {
                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                        parcelObtain2.setDataPosition(0);
                                        zzonVarCreateFromParcel = zzon.CREATOR.createFromParcel(parcelObtain2);
                                        parcelObtain2.recycle();
                                    } catch (SafeParcelReader.ParseException unused2) {
                                        zzj().m211412A().m123936a("Failed to load user property from local database");
                                        parcelObtain2.recycle();
                                        zzonVarCreateFromParcel = null;
                                    }
                                    if (zzonVarCreateFromParcel != null) {
                                        arrayList.add(zzonVarCreateFromParcel);
                                    }
                                } catch (Throwable th2) {
                                    parcelObtain2.recycle();
                                    throw th2;
                                }
                            } else if (i4 == 2) {
                                Parcel parcelObtain3 = Parcel.obtain();
                                try {
                                    try {
                                        parcelObtain3.unmarshall(blob, 0, blob.length);
                                        parcelObtain3.setDataPosition(0);
                                        zzaeVarCreateFromParcel = zzae.CREATOR.createFromParcel(parcelObtain3);
                                        parcelObtain3.recycle();
                                    } catch (SafeParcelReader.ParseException unused3) {
                                        zzj().m211412A().m123936a("Failed to load conditional user property from local database");
                                        parcelObtain3.recycle();
                                        zzaeVarCreateFromParcel = null;
                                    }
                                    if (zzaeVarCreateFromParcel != null) {
                                        arrayList.add(zzaeVarCreateFromParcel);
                                    }
                                } catch (Throwable th3) {
                                    parcelObtain3.recycle();
                                    throw th3;
                                }
                            } else if (i4 == 3) {
                                zzj().m211417F().m123936a("Skipping app launch break");
                            } else {
                                zzj().m211412A().m123936a("Unknown record type in local database");
                            }
                        } catch (SQLiteDatabaseLockedException unused4) {
                            SystemClock.sleep(i2);
                            i2 += 20;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseM189728E != null) {
                                sQLiteDatabaseM189728E.close();
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            zzj().m211412A().m123937b("Error reading entries from local database", e);
                            this.f171186d = true;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseM189728E != null) {
                                sQLiteDatabaseM189728E.close();
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            if (sQLiteDatabaseM189728E != null) {
                                try {
                                    if (sQLiteDatabaseM189728E.inTransaction()) {
                                        sQLiteDatabaseM189728E.endTransaction();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseM189728E != null) {
                                        sQLiteDatabaseM189728E.close();
                                    }
                                    throw th;
                                }
                            }
                            zzj().m211412A().m123937b("Error reading entries from local database", e);
                            this.f171186d = true;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseM189728E != null) {
                                sQLiteDatabaseM189728E.close();
                            }
                        }
                    }
                    if (sQLiteDatabaseM189728E.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                        zzj().m211412A().m123936a("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabaseM189728E.setTransactionSuccessful();
                    sQLiteDatabaseM189728E.endTransaction();
                    cursorQuery.close();
                    sQLiteDatabaseM189728E.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused5) {
                    cursorQuery = null;
                } catch (SQLiteFullException e3) {
                    e = e3;
                    cursorQuery = null;
                } catch (SQLiteException e4) {
                    e = e4;
                    cursorQuery = null;
                } catch (Throwable th5) {
                    th = th5;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseM189728E != null) {
                        sQLiteDatabaseM189728E.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused6) {
                sQLiteDatabaseM189728E = null;
                cursorQuery = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabaseM189728E = null;
                cursorQuery = null;
            } catch (SQLiteException e6) {
                e = e6;
                sQLiteDatabaseM189728E = null;
                cursorQuery = null;
            } catch (Throwable th6) {
                th = th6;
                sQLiteDatabaseM189728E = null;
            }
        }
        zzj().m211417F().m123936a("Failed to read events from database in reasonable time");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0167  */
    /* JADX WARN: Code duplicated, block: B:102:0x016c  */
    /* JADX WARN: Code duplicated, block: B:109:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[Catch: all -> 0x0060, SQLiteException -> 0x0064, SQLiteDatabaseLockedException -> 0x0068, SQLiteFullException -> 0x00cc, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:25:0x0055, B:27:0x005b, B:40:0x007d, B:42:0x00a1, B:44:0x00ab, B:46:0x00b3, B:58:0x00d4), top: B:107:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x0108 A[Catch: all -> 0x010c, TryCatch #11 {all -> 0x010c, blocks: (B:73:0x0102, B:75:0x0108, B:78:0x0110), top: B:113:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0123  */
    /* JADX WARN: Code duplicated, block: B:82:0x0128  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0156  */
    /* JADX WARN: Code duplicated, block: B:97:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v31 */
    /* JADX WARN: Type inference failed for: r16v32 */
    /* JADX WARN: Type inference failed for: r16v33 */
    /* JADX WARN: Type inference failed for: r16v34 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final boolean m189730x(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM189728E;
        ?? r16;
        boolean z;
        ?? RawQuery;
        ?? r17;
        ?? r10;
        ?? r18;
        ?? r11;
        ?? r19;
        ?? r110;
        long j;
        long j2;
        long jDelete;
        mo15092h();
        ?? r2 = 0;
        if (this.f171186d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            ?? r7 = 0;
             = 0;
             = 0;
            r7 = 0;
             = 0;
            ?? r8 = 0;
            ?? r9 = 0;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseM189728E = m189728E();
                if (sQLiteDatabaseM189728E != null) {
                    try {
                        try {
                            sQLiteDatabaseM189728E.beginTransaction();
                            RawQuery = sQLiteDatabaseM189728E.rawQuery("select count(1) from messages", null);
                            if (RawQuery == 0) {
                                j = 0;
                                if (j >= 100000) {
                                    zzj().m211412A().m123936a("Data loss, local db full");
                                    j2 = 100001 - j;
                                    jDelete = sQLiteDatabaseM189728E.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                    if (jDelete != j2) {
                                        r19 = r2;
                                        z = true;
                                        zzj().m211412A().m123939d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                        r19 = r19;
                                    } else {
                                        r19 = r2;
                                        z = true;
                                    }
                                } else {
                                    r19 = r2;
                                    z = true;
                                }
                                sQLiteDatabaseM189728E.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabaseM189728E.setTransactionSuccessful();
                                sQLiteDatabaseM189728E.endTransaction();
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                sQLiteDatabaseM189728E.close();
                                return z;
                            }
                            try {
                                try {
                                    try {
                                        if (RawQuery.moveToFirst()) {
                                            j = RawQuery.getLong(r2);
                                        } else {
                                            j = 0;
                                        }
                                        if (j >= 100000) {
                                            try {
                                                zzj().m211412A().m123936a("Data loss, local db full");
                                                j2 = 100001 - j;
                                                jDelete = sQLiteDatabaseM189728E.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                                if (jDelete != j2) {
                                                    r19 = r2;
                                                    try {
                                                        try {
                                                            z = true;
                                                            try {
                                                                zzj().m211412A().m123939d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                                                r19 = r19;
                                                            } catch (SQLiteFullException e) {
                                                                e = e;
                                                                r110 = r19;
                                                                r9 = RawQuery;
                                                                r16 = r110;
                                                                zzj().m211412A().m123937b("Error writing entry; local database full", e);
                                                                this.f171186d = true;
                                                                if (r9 != 0) {
                                                                    r9.close();
                                                                }
                                                                if (sQLiteDatabaseM189728E != null) {
                                                                    sQLiteDatabaseM189728E.close();
                                                                }
                                                                i2++;
                                                                r2 = r16;
                                                            } catch (SQLiteException e2) {
                                                                e = e2;
                                                                r11 = RawQuery;
                                                                r18 = r19;
                                                                sQLiteDatabase = sQLiteDatabaseM189728E;
                                                                RawQuery = r11;
                                                                r16 = r18;
                                                                if (sQLiteDatabase != null) {
                                                                    if (sQLiteDatabase.inTransaction()) {
                                                                        sQLiteDatabase.endTransaction();
                                                                    }
                                                                }
                                                                zzj().m211412A().m123937b("Error writing entry to local database", e);
                                                                this.f171186d = z;
                                                                if (RawQuery != 0) {
                                                                    RawQuery.close();
                                                                }
                                                                if (sQLiteDatabase != null) {
                                                                    sQLiteDatabase.close();
                                                                }
                                                                i2++;
                                                                r2 = r16;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused) {
                                                            r8 = RawQuery;
                                                            r16 = r19;
                                                            SystemClock.sleep(i3);
                                                            i3 += 20;
                                                            if (r8 != 0) {
                                                                r8.close();
                                                            }
                                                            if (sQLiteDatabaseM189728E != null) {
                                                                sQLiteDatabaseM189728E.close();
                                                            }
                                                            i2++;
                                                            r2 = r16;
                                                        }
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        r110 = r19;
                                                        r9 = RawQuery;
                                                        r16 = r110;
                                                        zzj().m211412A().m123937b("Error writing entry; local database full", e);
                                                        this.f171186d = true;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        if (sQLiteDatabaseM189728E != null) {
                                                            sQLiteDatabaseM189728E.close();
                                                        }
                                                        i2++;
                                                        r2 = r16;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        r10 = RawQuery;
                                                        r17 = r19;
                                                        z = true;
                                                        r11 = r10;
                                                        r18 = r17;
                                                        sQLiteDatabase = sQLiteDatabaseM189728E;
                                                        RawQuery = r11;
                                                        r16 = r18;
                                                        if (sQLiteDatabase != null) {
                                                            if (sQLiteDatabase.inTransaction()) {
                                                                sQLiteDatabase.endTransaction();
                                                            }
                                                        }
                                                        zzj().m211412A().m123937b("Error writing entry to local database", e);
                                                        this.f171186d = z;
                                                        if (RawQuery != 0) {
                                                            RawQuery.close();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.close();
                                                        }
                                                        i2++;
                                                        r2 = r16;
                                                    }
                                                } else {
                                                    r19 = r2;
                                                    z = true;
                                                }
                                            } catch (SQLiteFullException e5) {
                                                e = e5;
                                                r19 = r2;
                                            }
                                        } else {
                                            r19 = r2;
                                            z = true;
                                        }
                                        sQLiteDatabaseM189728E.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabaseM189728E.setTransactionSuccessful();
                                        sQLiteDatabaseM189728E.endTransaction();
                                        if (RawQuery != 0) {
                                            RawQuery.close();
                                        }
                                        sQLiteDatabaseM189728E.close();
                                        return z;
                                    } catch (Throwable th) {
                                        th = th;
                                        r7 = RawQuery;
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                        if (sQLiteDatabaseM189728E != null) {
                                            sQLiteDatabaseM189728E.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e6) {
                                    e = e6;
                                    r110 = r2;
                                    r9 = RawQuery;
                                    r16 = r110;
                                    zzj().m211412A().m123937b("Error writing entry; local database full", e);
                                    this.f171186d = true;
                                    if (r9 != 0) {
                                        r9.close();
                                    }
                                    if (sQLiteDatabaseM189728E != null) {
                                        sQLiteDatabaseM189728E.close();
                                    }
                                    i2++;
                                    r2 = r16;
                                }
                            } catch (SQLiteDatabaseLockedException unused2) {
                                r19 = r2;
                                r8 = RawQuery;
                                r16 = r19;
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (r8 != 0) {
                                    r8.close();
                                }
                                if (sQLiteDatabaseM189728E != null) {
                                    sQLiteDatabaseM189728E.close();
                                }
                                i2++;
                                r2 = r16;
                            } catch (SQLiteException e7) {
                                e = e7;
                                r17 = r2;
                                r10 = RawQuery;
                                z = true;
                                r11 = r10;
                                r18 = r17;
                                sQLiteDatabase = sQLiteDatabaseM189728E;
                                RawQuery = r11;
                                r16 = r18;
                                if (sQLiteDatabase != null) {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                }
                                zzj().m211412A().m123937b("Error writing entry to local database", e);
                                this.f171186d = z;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r2 = r16;
                            }
                        } catch (SQLiteDatabaseLockedException unused3) {
                            r16 = r2;
                        }
                    } catch (SQLiteFullException e8) {
                        e = e8;
                        r16 = r2;
                    } catch (SQLiteException e9) {
                        e = e9;
                        r18 = r2;
                        z = true;
                        r11 = 0;
                    }
                    if (r7 != 0) {
                        r7.close();
                    }
                    if (sQLiteDatabaseM189728E != null) {
                        sQLiteDatabaseM189728E.close();
                    }
                    throw th;
                }
                try {
                    try {
                        this.f171186d = true;
                        if (sQLiteDatabaseM189728E != null) {
                            sQLiteDatabaseM189728E.close();
                        }
                        return r2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (SQLiteFullException e10) {
                    e = e10;
                    r16 = r2;
                    zzj().m211412A().m123937b("Error writing entry; local database full", e);
                    this.f171186d = true;
                    if (r9 != 0) {
                        r9.close();
                    }
                    if (sQLiteDatabaseM189728E != null) {
                        sQLiteDatabaseM189728E.close();
                    }
                    i2++;
                    r2 = r16;
                } catch (SQLiteException e11) {
                    e = e11;
                    r17 = r2;
                    r10 = 0;
                    z = true;
                    r11 = r10;
                    r18 = r17;
                    sQLiteDatabase = sQLiteDatabaseM189728E;
                    RawQuery = r11;
                    r16 = r18;
                    if (sQLiteDatabase != null) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteDatabaseM189728E = sQLiteDatabase;
                            r7 = RawQuery;
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (sQLiteDatabaseM189728E != null) {
                                sQLiteDatabaseM189728E.close();
                            }
                            throw th;
                        }
                    }
                    zzj().m211412A().m123937b("Error writing entry to local database", e);
                    this.f171186d = z;
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    i2++;
                    r2 = r16;
                }
                r16 = r2;
            } catch (SQLiteDatabaseLockedException unused4) {
                r16 = r2;
                sQLiteDatabaseM189728E = null;
            } catch (SQLiteFullException e12) {
                e = e12;
                r16 = r2;
                sQLiteDatabaseM189728E = null;
            } catch (SQLiteException e13) {
                e = e13;
                r16 = r2;
                z = true;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseM189728E = null;
            }
            SystemClock.sleep(i3);
            i3 += 20;
            if (r8 != 0) {
                r8.close();
            }
            if (sQLiteDatabaseM189728E != null) {
                sQLiteDatabaseM189728E.close();
            }
            i2++;
            r2 = r16;
        }
        ?? r111 = r2;
        zzj().m211416E().m123936a("Failed to write entry to local database");
        return r111;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m189731y(zzae zzaeVar) {
        mo15089e();
        byte[] bArrM101444k0 = bey0.m101444k0(zzaeVar);
        if (bArrM101444k0.length <= 131072) {
            return m189730x(2, bArrM101444k0);
        }
        zzj().m211414C().m123936a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m189732z(zzbf zzbfVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbfVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m189730x(0, bArrMarshall);
        }
        zzj().m211414C().m123936a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
