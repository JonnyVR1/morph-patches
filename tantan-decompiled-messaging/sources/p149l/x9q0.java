package p149l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x9q0 implements w9q0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f191640a;

    /* JADX INFO: renamed from: b */
    public final p1f<v9q0> f191641b;

    /* JADX INFO: renamed from: l.x9q0$a */
    public class C21047a extends p1f<v9q0> {
        public C21047a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p149l.p1f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo95569i(@NonNull jzg0 jzg0Var, @NonNull v9q0 v9q0Var) {
            jzg0Var.bindString(1, v9q0Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String());
            jzg0Var.bindString(2, v9q0Var.getWorkSpecId());
        }
    }

    public x9q0(@NonNull RoomDatabase roomDatabase) {
        this.f191640a = roomDatabase;
        this.f191641b = new C21047a(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<Class<?>> m207509c() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.w9q0
    /* JADX INFO: renamed from: a */
    public List<String> mo202341a(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f191640a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f191640a, xcd0VarM208113d, false, null);
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

    @Override // p149l.w9q0
    /* JADX INFO: renamed from: b */
    public void mo202342b(v9q0 v9q0Var) {
        this.f191640a.assertNotSuspendingTransaction();
        this.f191640a.beginTransaction();
        try {
            this.f191641b.m167058j(v9q0Var);
            this.f191640a.setTransactionSuccessful();
        } finally {
            this.f191640a.endTransaction();
        }
    }
}
