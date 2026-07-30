package p149l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uh80 implements th80 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f176537a;

    /* JADX INFO: renamed from: b */
    public final p1f<sh80> f176538b;

    /* JADX INFO: renamed from: l.uh80$a */
    public class C20427a extends p1f<sh80> {
        public C20427a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p149l.p1f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo95569i(@NonNull jzg0 jzg0Var, @NonNull sh80 sh80Var) {
            jzg0Var.bindString(1, sh80Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
            if (sh80Var.getValue() == null) {
                jzg0Var.bindNull(2);
            } else {
                jzg0Var.bindLong(2, sh80Var.getValue().longValue());
            }
        }
    }

    public uh80(@NonNull RoomDatabase roomDatabase) {
        this.f176537a = roomDatabase;
        this.f176538b = new C20427a(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<Class<?>> m193702c() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.th80
    /* JADX INFO: renamed from: a */
    public void mo188876a(sh80 sh80Var) {
        this.f176537a.assertNotSuspendingTransaction();
        this.f176537a.beginTransaction();
        try {
            this.f176538b.m167058j(sh80Var);
            this.f176537a.setTransactionSuccessful();
        } finally {
            this.f176537a.endTransaction();
        }
    }

    @Override // p149l.th80
    /* JADX INFO: renamed from: b */
    public Long mo188877b(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT long_value FROM Preference where `key`=?", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f176537a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorM99746b = b0c.m99746b(this.f176537a, xcd0VarM208113d, false, null);
        try {
            if (cursorM99746b.moveToFirst() && !cursorM99746b.isNull(0)) {
                lValueOf = Long.valueOf(cursorM99746b.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM99746b.close();
            xcd0VarM208113d.release();
        }
    }
}
