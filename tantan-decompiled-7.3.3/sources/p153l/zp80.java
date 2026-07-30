package p153l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zp80 implements yp80 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f205432a;

    /* JADX INFO: renamed from: b */
    public final u2f<xp80> f205433b;

    /* JADX INFO: renamed from: l.zp80$a */
    public class C21850a extends u2f<xp80> {
        public C21850a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // p153l.u2f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo110277i(@NonNull r7h0 r7h0Var, @NonNull xp80 xp80Var) {
            r7h0Var.bindString(1, xp80Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String());
            if (xp80Var.getValue() == null) {
                r7h0Var.bindNull(2);
            } else {
                r7h0Var.bindLong(2, xp80Var.getValue().longValue());
            }
        }
    }

    public zp80(@NonNull RoomDatabase roomDatabase) {
        this.f205432a = roomDatabase;
        this.f205433b = new C21850a(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List<Class<?>> m220823c() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.yp80
    /* JADX INFO: renamed from: a */
    public void mo217005a(xp80 xp80Var) {
        this.f205432a.assertNotSuspendingTransaction();
        this.f205432a.beginTransaction();
        try {
            this.f205433b.m194261j(xp80Var);
            this.f205432a.setTransactionSuccessful();
        } finally {
            this.f205432a.endTransaction();
        }
    }

    @Override // p153l.yp80
    /* JADX INFO: renamed from: b */
    public Long mo217006b(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT long_value FROM Preference where `key`=?", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f205432a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorM165592b = o1c.m165592b(this.f205432a, zkd0VarM220067d, false, null);
        try {
            if (cursorM165592b.moveToFirst() && !cursorM165592b.isNull(0)) {
                lValueOf = Long.valueOf(cursorM165592b.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorM165592b.close();
            zkd0VarM220067d.release();
        }
    }
}
