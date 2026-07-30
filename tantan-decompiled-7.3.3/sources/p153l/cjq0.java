package p153l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cjq0 implements bjq0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f82207a;

    /* JADX INFO: renamed from: b */
    public final u2f<ajq0> f82208b;

    /* JADX INFO: renamed from: l.cjq0$a */
    public class C16289a extends u2f<ajq0> {
        public C16289a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p153l.u2f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo110277i(@NonNull r7h0 r7h0Var, @NonNull ajq0 ajq0Var) {
            r7h0Var.bindString(1, ajq0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
            r7h0Var.bindString(2, ajq0Var.getWorkSpecId());
        }
    }

    public cjq0(@NonNull RoomDatabase roomDatabase) {
        this.f82207a = roomDatabase;
        this.f82208b = new C16289a(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<Class<?>> m110276c() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.bjq0
    /* JADX INFO: renamed from: a */
    public List<String> mo104641a(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f82207a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f82207a, zkd0VarM220067d, false, null);
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

    @Override // p153l.bjq0
    /* JADX INFO: renamed from: b */
    public void mo104642b(ajq0 ajq0Var) {
        this.f82207a.assertNotSuspendingTransaction();
        this.f82207a.beginTransaction();
        try {
            this.f82208b.m194261j(ajq0Var);
            this.f82207a.setTransactionSuccessful();
        } finally {
            this.f82207a.endTransaction();
        }
    }
}
