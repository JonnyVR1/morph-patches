package p153l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wjq0 implements vjq0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f189488a;

    /* JADX INFO: renamed from: b */
    public final u2f<ujq0> f189489b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f189490c;

    /* JADX INFO: renamed from: l.wjq0$a */
    public class C21134a extends u2f<ujq0> {
        public C21134a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p153l.u2f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo110277i(@NonNull r7h0 r7h0Var, @NonNull ujq0 ujq0Var) {
            r7h0Var.bindString(1, ujq0Var.getTag());
            r7h0Var.bindString(2, ujq0Var.getWorkSpecId());
        }
    }

    /* JADX INFO: renamed from: l.wjq0$b */
    public class C21135b extends SharedSQLiteStatement {
        public C21135b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public wjq0(@NonNull RoomDatabase roomDatabase) {
        this.f189488a = roomDatabase;
        this.f189489b = new C21134a(roomDatabase);
        this.f189490c = new C21135b(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static List<Class<?>> m206730e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.vjq0
    /* JADX INFO: renamed from: a */
    public void mo201547a(String str) {
        this.f189488a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f189490c.m3931b();
        r7h0VarM3931b.bindString(1, str);
        try {
            this.f189488a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f189488a.setTransactionSuccessful();
                this.f189488a.endTransaction();
                this.f189490c.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f189488a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f189490c.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.vjq0
    /* JADX INFO: renamed from: c */
    public List<String> mo201549c(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f189488a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f189488a, zkd0VarM220067d, false, null);
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

    @Override // p153l.vjq0
    /* JADX INFO: renamed from: d */
    public void mo201550d(ujq0 ujq0Var) {
        this.f189488a.assertNotSuspendingTransaction();
        this.f189488a.beginTransaction();
        try {
            this.f189489b.m194261j(ujq0Var);
            this.f189488a.setTransactionSuccessful();
        } finally {
            this.f189488a.endTransaction();
        }
    }
}
