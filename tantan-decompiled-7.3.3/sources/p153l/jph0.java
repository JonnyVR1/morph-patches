package p153l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jph0 implements iph0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f122105a;

    /* JADX INFO: renamed from: b */
    public final u2f<hph0> f122106b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f122107c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f122108d;

    /* JADX INFO: renamed from: l.jph0$a */
    public class C17998a extends u2f<hph0> {
        public C17998a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // p153l.u2f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo110277i(@NonNull r7h0 r7h0Var, @NonNull hph0 hph0Var) {
            r7h0Var.bindString(1, hph0Var.workSpecId);
            r7h0Var.bindLong(2, hph0Var.getGeneration());
            r7h0Var.bindLong(3, hph0Var.systemId);
        }
    }

    /* JADX INFO: renamed from: l.jph0$b */
    public class C17999b extends SharedSQLiteStatement {
        public C17999b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* JADX INFO: renamed from: l.jph0$c */
    public class C18000c extends SharedSQLiteStatement {
        public C18000c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public jph0(@NonNull RoomDatabase roomDatabase) {
        this.f122105a = roomDatabase;
        this.f122106b = new C17998a(roomDatabase);
        this.f122107c = new C17999b(roomDatabase);
        this.f122108d = new C18000c(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static List<Class<?>> m146500h() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.iph0
    /* JADX INFO: renamed from: b */
    public hph0 mo141464b(String str, int i) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        zkd0VarM220067d.bindString(1, str);
        zkd0VarM220067d.bindLong(2, i);
        this.f122105a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f122105a, zkd0VarM220067d, false, null);
        try {
            return cursorM165592b.moveToFirst() ? new hph0(cursorM165592b.getString(xyb.m213608e(cursorM165592b, "work_spec_id")), cursorM165592b.getInt(xyb.m213608e(cursorM165592b, "generation")), cursorM165592b.getInt(xyb.m213608e(cursorM165592b, "system_id"))) : null;
        } finally {
            cursorM165592b.close();
            zkd0VarM220067d.release();
        }
    }

    @Override // p153l.iph0
    /* JADX INFO: renamed from: c */
    public void mo141465c(hph0 hph0Var) {
        this.f122105a.assertNotSuspendingTransaction();
        this.f122105a.beginTransaction();
        try {
            this.f122106b.m194261j(hph0Var);
            this.f122105a.setTransactionSuccessful();
        } finally {
            this.f122105a.endTransaction();
        }
    }

    @Override // p153l.iph0
    /* JADX INFO: renamed from: d */
    public List<String> mo141466d() {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f122105a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f122105a, zkd0VarM220067d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
            while (cursorM165592b.moveToNext()) {
                arrayList.add(cursorM165592b.getString(0));
            }
            cursorM165592b.close();
            zkd0VarM220067d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM165592b.close();
            zkd0VarM220067d.release();
            throw th;
        }
    }

    @Override // p153l.iph0
    /* JADX INFO: renamed from: e */
    public void mo141467e(String str, int i) {
        this.f122105a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f122107c.m3931b();
        r7h0VarM3931b.bindString(1, str);
        r7h0VarM3931b.bindLong(2, i);
        try {
            this.f122105a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f122105a.setTransactionSuccessful();
                this.f122105a.endTransaction();
                this.f122107c.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f122105a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f122107c.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.iph0
    /* JADX INFO: renamed from: g */
    public void mo141469g(String str) {
        this.f122105a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f122108d.m3931b();
        r7h0VarM3931b.bindString(1, str);
        try {
            this.f122105a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f122105a.setTransactionSuccessful();
                this.f122105a.endTransaction();
                this.f122108d.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f122105a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f122108d.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }
}
