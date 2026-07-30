package p149l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class raq0 implements qaq0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f158551a;

    /* JADX INFO: renamed from: b */
    public final p1f<paq0> f158552b;

    /* JADX INFO: renamed from: c */
    public final SharedSQLiteStatement f158553c;

    /* JADX INFO: renamed from: l.raq0$a */
    public class C19662a extends p1f<paq0> {
        public C19662a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p149l.p1f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo95569i(@NonNull jzg0 jzg0Var, @NonNull paq0 paq0Var) {
            jzg0Var.bindString(1, paq0Var.getTag());
            jzg0Var.bindString(2, paq0Var.getWorkSpecId());
        }
    }

    /* JADX INFO: renamed from: l.raq0$b */
    public class C19663b extends SharedSQLiteStatement {
        public C19663b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public raq0(@NonNull RoomDatabase roomDatabase) {
        this.f158551a = roomDatabase;
        this.f158552b = new C19662a(roomDatabase);
        this.f158553c = new C19663b(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static List<Class<?>> m178531e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.qaq0
    /* JADX INFO: renamed from: a */
    public void mo173770a(String str) {
        this.f158551a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f158553c.m3929b();
        jzg0VarM3929b.bindString(1, str);
        try {
            this.f158551a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f158551a.setTransactionSuccessful();
                this.f158551a.endTransaction();
                this.f158553c.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f158551a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f158553c.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.qaq0
    /* JADX INFO: renamed from: c */
    public List<String> mo173772c(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f158551a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f158551a, xcd0VarM208113d, false, null);
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

    @Override // p149l.qaq0
    /* JADX INFO: renamed from: d */
    public void mo173773d(paq0 paq0Var) {
        this.f158551a.assertNotSuspendingTransaction();
        this.f158551a.beginTransaction();
        try {
            this.f158552b.m167058j(paq0Var);
            this.f158551a.setTransactionSuccessful();
        } finally {
            this.f158551a.endTransaction();
        }
    }
}
