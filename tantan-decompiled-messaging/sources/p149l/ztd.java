package p149l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ztd implements ytd {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f204710a;

    /* JADX INFO: renamed from: b */
    public final p1f<xtd> f204711b;

    /* JADX INFO: renamed from: l.ztd$a */
    public class C21762a extends p1f<xtd> {
        public C21762a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p149l.p1f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo95569i(@NonNull jzg0 jzg0Var, @NonNull xtd xtdVar) {
            jzg0Var.bindString(1, xtdVar.getWorkSpecId());
            jzg0Var.bindString(2, xtdVar.getPrerequisiteId());
        }
    }

    public ztd(@NonNull RoomDatabase roomDatabase) {
        this.f204710a = roomDatabase;
        this.f204711b = new C21762a(roomDatabase);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static List<Class<?>> m220122e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.ytd
    /* JADX INFO: renamed from: a */
    public List<String> mo216001a(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f204710a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f204710a, xcd0VarM208113d, false, null);
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

    @Override // p149l.ytd
    /* JADX INFO: renamed from: b */
    public boolean mo216002b(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f204710a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorM99746b = b0c.m99746b(this.f204710a, xcd0VarM208113d, false, null);
        try {
            if (cursorM99746b.moveToFirst()) {
                z = cursorM99746b.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorM99746b.close();
            xcd0VarM208113d.release();
        }
    }

    @Override // p149l.ytd
    /* JADX INFO: renamed from: c */
    public void mo216003c(xtd xtdVar) {
        this.f204710a.assertNotSuspendingTransaction();
        this.f204710a.beginTransaction();
        try {
            this.f204711b.m167058j(xtdVar);
            this.f204710a.setTransactionSuccessful();
        } finally {
            this.f204710a.endTransaction();
        }
    }

    @Override // p149l.ytd
    /* JADX INFO: renamed from: d */
    public boolean mo216004d(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f204710a.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor cursorM99746b = b0c.m99746b(this.f204710a, xcd0VarM208113d, false, null);
        try {
            if (cursorM99746b.moveToFirst()) {
                z = cursorM99746b.getInt(0) != 0;
            }
            return z;
        } finally {
            cursorM99746b.close();
            xcd0VarM208113d.release();
        }
    }
}
