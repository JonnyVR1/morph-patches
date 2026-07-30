package p149l;

import android.content.ContentValues;
import com.p046p1.mobile.putong.data.TableProviderInfo;
import com.tantanapp.common.data.DbObject;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fza0 extends b8c {

    /* JADX INFO: renamed from: c */
    public orh0<TableProviderInfo> f99944c;

    /* JADX INFO: renamed from: d */
    public HashMap<String, TableProviderInfo> f99945d = new HashMap<>();

    @Override // p149l.b8c
    /* JADX INFO: renamed from: c */
    public int mo100761c() {
        return 213;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: d */
    public int mo100762d() {
        return 0;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: e */
    public String mo100763e() {
        return null;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> mo100764f() {
        return super.mo100764f();
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: h */
    public void mo100766h() {
        orh0<TableProviderInfo> orh0Var = new orh0<>(null, "providerInfo", TableProviderInfo.DB_ADAPTER, null, 1000);
        this.f99944c = orh0Var;
        orh0Var.f145285f = false;
    }

    /* JADX INFO: renamed from: k */
    public void m123818k() {
        this.f99945d.clear();
    }

    /* JADX INFO: renamed from: l */
    public void m123819l(SQLiteDatabase sQLiteDatabase) {
        orh0<TableProviderInfo> orh0Var = this.f99944c;
        sQLiteDatabase.execSQL(orh0Var.f145281b.CREATE_TABLE(orh0Var));
    }

    /* JADX INFO: renamed from: m */
    public int m123820m() {
        return 212;
    }

    /* JADX INFO: renamed from: n */
    public TableProviderInfo m123821n(String str) {
        if (this.f99945d.get(str) != null) {
            return this.f99945d.get(str);
        }
        List<T> listM165607z = this.f99944c.m165607z(TableProviderInfo.NAME.mo60175EQ(str), null, 1, false);
        if (vwb.m200296J(listM165607z)) {
            return null;
        }
        this.f99945d.put(str, (TableProviderInfo) listM165607z.get(0));
        return (TableProviderInfo) listM165607z.get(0);
    }

    /* JADX INFO: renamed from: o */
    public void m123822o() {
        List<T> listM165607z = this.f99944c.m165607z(null, null, -1, false);
        if (listM165607z != 0) {
            for (T t : listM165607z) {
                this.f99945d.put(t.name, t);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m123823p(SQLiteDatabase sQLiteDatabase, TableProviderInfo tableProviderInfo, boolean z) {
        if (z) {
            ContentValues contentValues = new ContentValues();
            TableProviderInfo.DB_ADAPTER.write(tableProviderInfo, contentValues);
            sQLiteDatabase.insert(this.f99944c.f145283d, null, contentValues);
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        TableProviderInfo.DB_ADAPTER.write(tableProviderInfo, contentValues2);
        sQLiteDatabase.update(this.f99944c.f145283d, contentValues2, DbObject.f56009ID + " = ?", new String[]{tableProviderInfo.f56011id});
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: g */
    public void mo100765g() {
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: j */
    public void mo100768j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
