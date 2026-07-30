package p153l;

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
import com.google.android.gms.measurement.internal.C2477c;
import com.google.android.gms.measurement.internal.C2481g;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzon;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class zvw0 extends kix0 {

    /* JADX INFO: renamed from: c */
    public final zyw0 f206298c;

    /* JADX INFO: renamed from: d */
    public boolean f206299d;

    public zvw0(atx0 atx0Var) {
        super(atx0Var);
        this.f206298c = new zyw0(this, zza(), "google_app_measurement_local.db");
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: F */
    private final boolean m221815F() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX INFO: renamed from: v */
    public static long m221816v(SQLiteDatabase sQLiteDatabase) {
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
    public final boolean m221817A(zzon zzonVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzonVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m221823x(1, bArrMarshall);
        }
        zzj().m114560C().m153300a("User property too long for local database. Sending directly to service");
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final void m221818B() {
        int iDelete;
        mo15146h();
        try {
            SQLiteDatabase sQLiteDatabaseM221821E = m221821E();
            if (sQLiteDatabaseM221821E == null || (iDelete = sQLiteDatabaseM221821E.delete("messages", null, null)) <= 0) {
                return;
            }
            zzj().m114562E().m153301b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            zzj().m114558A().m153301b("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final boolean m221819C() {
        return m221823x(3, new byte[0]);
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final boolean m221820D() {
        mo15146h();
        if (this.f206299d || !m221815F()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseM221821E = m221821E();
                    if (sQLiteDatabaseM221821E == null) {
                        this.f206299d = true;
                        if (sQLiteDatabaseM221821E != null) {
                            sQLiteDatabaseM221821E.close();
                        }
                        return false;
                    }
                    sQLiteDatabaseM221821E.beginTransaction();
                    sQLiteDatabaseM221821E.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseM221821E.setTransactionSuccessful();
                    sQLiteDatabaseM221821E.endTransaction();
                    sQLiteDatabaseM221821E.close();
                    return true;
                } catch (SQLiteFullException e) {
                    zzj().m114558A().m153301b("Error deleting app launch break from local database", e);
                    this.f206299d = true;
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
                zzj().m114558A().m153301b("Error deleting app launch break from local database", e2);
                this.f206299d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().m114563F().m153300a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final SQLiteDatabase m221821E() throws SQLiteException {
        if (this.f206299d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f206298c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f206299d = true;
        return null;
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.v1v0, p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ n9s0 mo15147i() {
        return super.mo15147i();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ C2477c mo15148j() {
        return super.mo15148j();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ zvw0 mo15149k() {
        return super.mo15149k();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2481g mo15150l() {
        return super.mo15150l();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ say0 mo15151m() {
        return super.mo15151m();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ hcy0 mo15152n() {
        return super.mo15152n();
    }

    @Override // p153l.v1v0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ thy0 mo15153o() {
        return super.mo15153o();
    }

    @Override // p153l.kix0
    /* JADX INFO: renamed from: u */
    public final boolean mo15155u() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01df  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e4  */
    /* JADX INFO: renamed from: w */
    public final List<AbstractSafeParcelable> m221822w(int i) {
        SQLiteDatabase sQLiteDatabaseM221821E;
        Cursor cursorQuery;
        String str;
        String[] strArr;
        zzon zzonVarCreateFromParcel;
        zzae zzaeVarCreateFromParcel;
        mo15146h();
        Cursor cursor = null;
        if (this.f206299d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!m221815F()) {
            return arrayList;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            try {
                sQLiteDatabaseM221821E = m221821E();
                if (sQLiteDatabaseM221821E == null) {
                    this.f206299d = true;
                    if (sQLiteDatabaseM221821E != null) {
                        sQLiteDatabaseM221821E.close();
                    }
                    return null;
                }
                try {
                    sQLiteDatabaseM221821E.beginTransaction();
                    long jM221816v = m221816v(sQLiteDatabaseM221821E);
                    long j = -1;
                    if (jM221816v != -1) {
                        strArr = new String[]{String.valueOf(jM221816v)};
                        str = "rowid<?";
                    } else {
                        str = null;
                        strArr = null;
                    }
                    cursorQuery = sQLiteDatabaseM221821E.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
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
                                        zzj().m114558A().m153300a("Failed to load event from local database");
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
                                        zzj().m114558A().m153300a("Failed to load user property from local database");
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
                                        zzj().m114558A().m153300a("Failed to load conditional user property from local database");
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
                                zzj().m114563F().m153300a("Skipping app launch break");
                            } else {
                                zzj().m114558A().m153300a("Unknown record type in local database");
                            }
                        } catch (SQLiteDatabaseLockedException unused4) {
                            SystemClock.sleep(i2);
                            i2 += 20;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseM221821E != null) {
                                sQLiteDatabaseM221821E.close();
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            zzj().m114558A().m153301b("Error reading entries from local database", e);
                            this.f206299d = true;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseM221821E != null) {
                                sQLiteDatabaseM221821E.close();
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            if (sQLiteDatabaseM221821E != null) {
                                try {
                                    if (sQLiteDatabaseM221821E.inTransaction()) {
                                        sQLiteDatabaseM221821E.endTransaction();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseM221821E != null) {
                                        sQLiteDatabaseM221821E.close();
                                    }
                                    throw th;
                                }
                            }
                            zzj().m114558A().m153301b("Error reading entries from local database", e);
                            this.f206299d = true;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (sQLiteDatabaseM221821E != null) {
                                sQLiteDatabaseM221821E.close();
                            }
                        }
                    }
                    if (sQLiteDatabaseM221821E.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList.size()) {
                        zzj().m114558A().m153300a("Fewer entries removed from local database than expected");
                    }
                    sQLiteDatabaseM221821E.setTransactionSuccessful();
                    sQLiteDatabaseM221821E.endTransaction();
                    cursorQuery.close();
                    sQLiteDatabaseM221821E.close();
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
                    if (sQLiteDatabaseM221821E != null) {
                        sQLiteDatabaseM221821E.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused6) {
                sQLiteDatabaseM221821E = null;
                cursorQuery = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabaseM221821E = null;
                cursorQuery = null;
            } catch (SQLiteException e6) {
                e = e6;
                sQLiteDatabaseM221821E = null;
                cursorQuery = null;
            } catch (Throwable th6) {
                th = th6;
                sQLiteDatabaseM221821E = null;
            }
        }
        zzj().m114563F().m153300a("Failed to read events from database in reasonable time");
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
    public final boolean m221823x(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseM221821E;
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
        mo15146h();
        ?? r2 = 0;
        if (this.f206299d) {
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
                sQLiteDatabaseM221821E = m221821E();
                if (sQLiteDatabaseM221821E != null) {
                    try {
                        try {
                            sQLiteDatabaseM221821E.beginTransaction();
                            RawQuery = sQLiteDatabaseM221821E.rawQuery("select count(1) from messages", null);
                            if (RawQuery == 0) {
                                j = 0;
                                if (j >= 100000) {
                                    zzj().m114558A().m153300a("Data loss, local db full");
                                    j2 = 100001 - j;
                                    jDelete = sQLiteDatabaseM221821E.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                    if (jDelete != j2) {
                                        r19 = r2;
                                        z = true;
                                        zzj().m114558A().m153303d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                        r19 = r19;
                                    } else {
                                        r19 = r2;
                                        z = true;
                                    }
                                } else {
                                    r19 = r2;
                                    z = true;
                                }
                                sQLiteDatabaseM221821E.insertOrThrow("messages", null, contentValues);
                                sQLiteDatabaseM221821E.setTransactionSuccessful();
                                sQLiteDatabaseM221821E.endTransaction();
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                sQLiteDatabaseM221821E.close();
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
                                                zzj().m114558A().m153300a("Data loss, local db full");
                                                j2 = 100001 - j;
                                                jDelete = sQLiteDatabaseM221821E.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                                if (jDelete != j2) {
                                                    r19 = r2;
                                                    try {
                                                        try {
                                                            z = true;
                                                            try {
                                                                zzj().m114558A().m153303d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                                                r19 = r19;
                                                            } catch (SQLiteFullException e) {
                                                                e = e;
                                                                r110 = r19;
                                                                r9 = RawQuery;
                                                                r16 = r110;
                                                                zzj().m114558A().m153301b("Error writing entry; local database full", e);
                                                                this.f206299d = true;
                                                                if (r9 != 0) {
                                                                    r9.close();
                                                                }
                                                                if (sQLiteDatabaseM221821E != null) {
                                                                    sQLiteDatabaseM221821E.close();
                                                                }
                                                                i2++;
                                                                r2 = r16;
                                                            } catch (SQLiteException e2) {
                                                                e = e2;
                                                                r11 = RawQuery;
                                                                r18 = r19;
                                                                sQLiteDatabase = sQLiteDatabaseM221821E;
                                                                RawQuery = r11;
                                                                r16 = r18;
                                                                if (sQLiteDatabase != null) {
                                                                    if (sQLiteDatabase.inTransaction()) {
                                                                        sQLiteDatabase.endTransaction();
                                                                    }
                                                                }
                                                                zzj().m114558A().m153301b("Error writing entry to local database", e);
                                                                this.f206299d = z;
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
                                                            if (sQLiteDatabaseM221821E != null) {
                                                                sQLiteDatabaseM221821E.close();
                                                            }
                                                            i2++;
                                                            r2 = r16;
                                                        }
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        r110 = r19;
                                                        r9 = RawQuery;
                                                        r16 = r110;
                                                        zzj().m114558A().m153301b("Error writing entry; local database full", e);
                                                        this.f206299d = true;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        if (sQLiteDatabaseM221821E != null) {
                                                            sQLiteDatabaseM221821E.close();
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
                                                        sQLiteDatabase = sQLiteDatabaseM221821E;
                                                        RawQuery = r11;
                                                        r16 = r18;
                                                        if (sQLiteDatabase != null) {
                                                            if (sQLiteDatabase.inTransaction()) {
                                                                sQLiteDatabase.endTransaction();
                                                            }
                                                        }
                                                        zzj().m114558A().m153301b("Error writing entry to local database", e);
                                                        this.f206299d = z;
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
                                        sQLiteDatabaseM221821E.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabaseM221821E.setTransactionSuccessful();
                                        sQLiteDatabaseM221821E.endTransaction();
                                        if (RawQuery != 0) {
                                            RawQuery.close();
                                        }
                                        sQLiteDatabaseM221821E.close();
                                        return z;
                                    } catch (Throwable th) {
                                        th = th;
                                        r7 = RawQuery;
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                        if (sQLiteDatabaseM221821E != null) {
                                            sQLiteDatabaseM221821E.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteFullException e6) {
                                    e = e6;
                                    r110 = r2;
                                    r9 = RawQuery;
                                    r16 = r110;
                                    zzj().m114558A().m153301b("Error writing entry; local database full", e);
                                    this.f206299d = true;
                                    if (r9 != 0) {
                                        r9.close();
                                    }
                                    if (sQLiteDatabaseM221821E != null) {
                                        sQLiteDatabaseM221821E.close();
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
                                if (sQLiteDatabaseM221821E != null) {
                                    sQLiteDatabaseM221821E.close();
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
                                sQLiteDatabase = sQLiteDatabaseM221821E;
                                RawQuery = r11;
                                r16 = r18;
                                if (sQLiteDatabase != null) {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                }
                                zzj().m114558A().m153301b("Error writing entry to local database", e);
                                this.f206299d = z;
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
                    if (sQLiteDatabaseM221821E != null) {
                        sQLiteDatabaseM221821E.close();
                    }
                    throw th;
                }
                try {
                    try {
                        this.f206299d = true;
                        if (sQLiteDatabaseM221821E != null) {
                            sQLiteDatabaseM221821E.close();
                        }
                        return r2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (SQLiteFullException e10) {
                    e = e10;
                    r16 = r2;
                    zzj().m114558A().m153301b("Error writing entry; local database full", e);
                    this.f206299d = true;
                    if (r9 != 0) {
                        r9.close();
                    }
                    if (sQLiteDatabaseM221821E != null) {
                        sQLiteDatabaseM221821E.close();
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
                    sQLiteDatabase = sQLiteDatabaseM221821E;
                    RawQuery = r11;
                    r16 = r18;
                    if (sQLiteDatabase != null) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteDatabaseM221821E = sQLiteDatabase;
                            r7 = RawQuery;
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (sQLiteDatabaseM221821E != null) {
                                sQLiteDatabaseM221821E.close();
                            }
                            throw th;
                        }
                    }
                    zzj().m114558A().m153301b("Error writing entry to local database", e);
                    this.f206299d = z;
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
                sQLiteDatabaseM221821E = null;
            } catch (SQLiteFullException e12) {
                e = e12;
                r16 = r2;
                sQLiteDatabaseM221821E = null;
            } catch (SQLiteException e13) {
                e = e13;
                r16 = r2;
                z = true;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseM221821E = null;
            }
            SystemClock.sleep(i3);
            i3 += 20;
            if (r8 != 0) {
                r8.close();
            }
            if (sQLiteDatabaseM221821E != null) {
                sQLiteDatabaseM221821E.close();
            }
            i2++;
            r2 = r16;
        }
        ?? r111 = r2;
        zzj().m114562E().m153300a("Failed to write entry to local database");
        return r111;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m221824y(zzae zzaeVar) {
        mo15143e();
        byte[] bArrM136311k0 = hny0.m136311k0(zzaeVar);
        if (bArrM136311k0.length <= 131072) {
            return m221823x(2, bArrM136311k0);
        }
        zzj().m114560C().m153300a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m221825z(zzbf zzbfVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbfVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return m221823x(0, bArrMarshall);
        }
        zzj().m114560C().m153300a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }
}
