package p153l;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.work.Data;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fjq0 implements ejq0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f99406a;

    /* JADX INFO: renamed from: b */
    public final u2f<djq0> f99407b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f99408c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f99409d;

    /* JADX INFO: renamed from: l.fjq0$a */
    public class C16990a extends u2f<djq0> {
        public C16990a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p153l.u2f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo110277i(@NonNull r7h0 r7h0Var, @NonNull djq0 djq0Var) {
            r7h0Var.bindString(1, djq0Var.getWorkSpecId());
            r7h0Var.bindBlob(2, Data.m4317g(djq0Var.getProgress()));
        }
    }

    /* JADX INFO: renamed from: l.fjq0$b */
    public class C16991b extends SharedSQLiteStatement {
        public C16991b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: l.fjq0$c */
    public class C16992c extends SharedSQLiteStatement {
        public C16992c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public fjq0(@NonNull RoomDatabase roomDatabase) {
        this.f99406a = roomDatabase;
        this.f99407b = new C16990a(roomDatabase);
        this.f99408c = new C16991b(roomDatabase);
        this.f99409d = new C16992c(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<Class<?>> m125864c() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.ejq0
    /* JADX INFO: renamed from: a */
    public void mo120985a(djq0 djq0Var) {
        this.f99406a.assertNotSuspendingTransaction();
        this.f99406a.beginTransaction();
        try {
            this.f99407b.m194261j(djq0Var);
            this.f99406a.setTransactionSuccessful();
        } finally {
            this.f99406a.endTransaction();
        }
    }

    @Override // p153l.ejq0
    /* JADX INFO: renamed from: b */
    public void mo120986b() {
        this.f99406a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f99409d.m3931b();
        try {
            this.f99406a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f99406a.setTransactionSuccessful();
                this.f99406a.endTransaction();
                this.f99409d.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f99406a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f99409d.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.ejq0
    public void delete(String str) {
        this.f99406a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f99408c.m3931b();
        r7h0VarM3931b.bindString(1, str);
        try {
            this.f99406a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f99406a.setTransactionSuccessful();
                this.f99406a.endTransaction();
                this.f99408c.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f99406a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f99408c.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }
}
