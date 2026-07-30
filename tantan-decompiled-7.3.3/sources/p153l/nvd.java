package p153l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nvd implements mvd {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f143791a;

    /* JADX INFO: renamed from: b */
    public final u2f<lvd> f143792b;

    /* JADX INFO: renamed from: l.nvd$a */
    public class C18958a extends u2f<lvd> {
        public C18958a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p153l.u2f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo110277i(@NonNull r7h0 r7h0Var, @NonNull lvd lvdVar) {
            r7h0Var.bindString(1, lvdVar.getWorkSpecId());
            r7h0Var.bindString(2, lvdVar.getPrerequisiteId());
        }
    }

    public nvd(@NonNull RoomDatabase roomDatabase) {
        this.f143791a = roomDatabase;
        this.f143792b = new C18958a(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static List<Class<?>> m164870e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.mvd
    /* JADX INFO: renamed from: a */
    public List<String> mo160261a(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f143791a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f143791a, zkd0VarM220067d, false, null);
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

    @Override // p153l.mvd
    /* JADX INFO: renamed from: b */
    public boolean mo160262b(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f143791a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorM165592b = o1c.m165592b(this.f143791a, zkd0VarM220067d, false, null);
        try {
            if (cursorM165592b.moveToFirst()) {
                z = cursorM165592b.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorM165592b.close();
            zkd0VarM220067d.release();
        }
    }

    @Override // p153l.mvd
    /* JADX INFO: renamed from: c */
    public void mo160263c(lvd lvdVar) {
        this.f143791a.assertNotSuspendingTransaction();
        this.f143791a.beginTransaction();
        try {
            this.f143792b.m194261j(lvdVar);
            this.f143791a.setTransactionSuccessful();
        } finally {
            this.f143791a.endTransaction();
        }
    }

    @Override // p153l.mvd
    /* JADX INFO: renamed from: d */
    public boolean mo160264d(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f143791a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorM165592b = o1c.m165592b(this.f143791a, zkd0VarM220067d, false, null);
        try {
            if (cursorM165592b.moveToFirst()) {
                z = cursorM165592b.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorM165592b.close();
            zkd0VarM220067d.release();
        }
    }
}
