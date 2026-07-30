package p149l;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.work.Data;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aaq0 implements z9q0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f68594a;

    /* JADX INFO: renamed from: b */
    public final p1f<y9q0> f68595b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f68596c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f68597d;

    /* JADX INFO: renamed from: l.aaq0$a */
    public class C15562a extends p1f<y9q0> {
        public C15562a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // p149l.p1f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo95569i(@NonNull jzg0 jzg0Var, @NonNull y9q0 y9q0Var) {
            jzg0Var.bindString(1, y9q0Var.getWorkSpecId());
            jzg0Var.bindBlob(2, Data.m4315g(y9q0Var.getProgress()));
        }
    }

    /* JADX INFO: renamed from: l.aaq0$b */
    public class C15563b extends SharedSQLiteStatement {
        public C15563b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* JADX INFO: renamed from: l.aaq0$c */
    public class C15564c extends SharedSQLiteStatement {
        public C15564c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public aaq0(@NonNull RoomDatabase roomDatabase) {
        this.f68594a = roomDatabase;
        this.f68595b = new C15562a(roomDatabase);
        this.f68596c = new C15563b(roomDatabase);
        this.f68597d = new C15564c(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<Class<?>> m95566c() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.z9q0
    /* JADX INFO: renamed from: a */
    public void mo95567a(y9q0 y9q0Var) {
        this.f68594a.assertNotSuspendingTransaction();
        this.f68594a.beginTransaction();
        try {
            this.f68595b.m167058j(y9q0Var);
            this.f68594a.setTransactionSuccessful();
        } finally {
            this.f68594a.endTransaction();
        }
    }

    @Override // p149l.z9q0
    /* JADX INFO: renamed from: b */
    public void mo95568b() {
        this.f68594a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f68597d.m3929b();
        try {
            this.f68594a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f68594a.setTransactionSuccessful();
                this.f68594a.endTransaction();
                this.f68597d.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f68594a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f68597d.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.z9q0
    public void delete(String str) {
        this.f68594a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f68596c.m3929b();
        jzg0VarM3929b.bindString(1, str);
        try {
            this.f68594a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f68594a.setTransactionSuccessful();
                this.f68594a.endTransaction();
                this.f68596c.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f68594a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f68596c.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }
}
