package p149l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class chh0 implements bhh0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f80873a;

    /* JADX INFO: renamed from: b */
    public final p1f<ahh0> f80874b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f80875c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f80876d;

    /* JADX INFO: renamed from: l.chh0$a */
    public class C16147a extends p1f<ahh0> {
        public C16147a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // p149l.p1f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo95569i(@NonNull jzg0 jzg0Var, @NonNull ahh0 ahh0Var) {
            jzg0Var.bindString(1, ahh0Var.workSpecId);
            jzg0Var.bindLong(2, ahh0Var.getGeneration());
            jzg0Var.bindLong(3, ahh0Var.systemId);
        }
    }

    /* JADX INFO: renamed from: l.chh0$b */
    public class C16148b extends SharedSQLiteStatement {
        public C16148b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* JADX INFO: renamed from: l.chh0$c */
    public class C16149c extends SharedSQLiteStatement {
        public C16149c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public chh0(@NonNull RoomDatabase roomDatabase) {
        this.f80873a = roomDatabase;
        this.f80874b = new C16147a(roomDatabase);
        this.f80875c = new C16148b(roomDatabase);
        this.f80876d = new C16149c(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static List<Class<?>> m106878h() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.bhh0
    /* JADX INFO: renamed from: b */
    public ahh0 mo101838b(String str, int i) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        xcd0VarM208113d.bindString(1, str);
        xcd0VarM208113d.bindLong(2, i);
        this.f80873a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f80873a, xcd0VarM208113d, false, null);
        try {
            return cursorM99746b.moveToFirst() ? new ahh0(cursorM99746b.getString(jxb.m143765e(cursorM99746b, "work_spec_id")), cursorM99746b.getInt(jxb.m143765e(cursorM99746b, "generation")), cursorM99746b.getInt(jxb.m143765e(cursorM99746b, "system_id"))) : null;
        } finally {
            cursorM99746b.close();
            xcd0VarM208113d.release();
        }
    }

    @Override // p149l.bhh0
    /* JADX INFO: renamed from: c */
    public void mo101839c(ahh0 ahh0Var) {
        this.f80873a.assertNotSuspendingTransaction();
        this.f80873a.beginTransaction();
        try {
            this.f80874b.m167058j(ahh0Var);
            this.f80873a.setTransactionSuccessful();
        } finally {
            this.f80873a.endTransaction();
        }
    }

    @Override // p149l.bhh0
    /* JADX INFO: renamed from: d */
    public List<String> mo101840d() {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f80873a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f80873a, xcd0VarM208113d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
            while (cursorM99746b.moveToNext()) {
                arrayList.add(cursorM99746b.getString(0));
            }
            cursorM99746b.close();
            xcd0VarM208113d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM99746b.close();
            xcd0VarM208113d.release();
            throw th;
        }
    }

    @Override // p149l.bhh0
    /* JADX INFO: renamed from: e */
    public void mo101841e(String str, int i) {
        this.f80873a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f80875c.m3929b();
        jzg0VarM3929b.bindString(1, str);
        jzg0VarM3929b.bindLong(2, i);
        try {
            this.f80873a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f80873a.setTransactionSuccessful();
                this.f80873a.endTransaction();
                this.f80875c.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f80873a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f80875c.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.bhh0
    /* JADX INFO: renamed from: g */
    public void mo101843g(String str) {
        this.f80873a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f80876d.m3929b();
        jzg0VarM3929b.bindString(1, str);
        try {
            this.f80873a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f80873a.setTransactionSuccessful();
                this.f80873a.endTransaction();
                this.f80876d.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f80873a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f80876d.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }
}
