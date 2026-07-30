package p153l;

import android.content.ContentValues;
import com.p051p1.mobile.putong.data.TableProviderInfo;
import com.tantanapp.common.data.DbObject;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class j7b0 extends h9c {

    /* JADX INFO: renamed from: c */
    public wzh0<TableProviderInfo> f118670c;

    /* JADX INFO: renamed from: d */
    public HashMap<String, TableProviderInfo> f118671d = new HashMap<>();

    @Override // p153l.h9c
    /* JADX INFO: renamed from: c */
    public int mo133945c() {
        return 213;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: d */
    public int mo133946d() {
        return 0;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: e */
    public String mo133947e() {
        return null;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: f */
    public ArrayList<wzh0> mo134045f() {
        return super.mo134045f();
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: h */
    public void mo133949h() {
        wzh0<TableProviderInfo> wzh0Var = new wzh0<>(null, "providerInfo", TableProviderInfo.DB_ADAPTER, null, 1000);
        this.f118670c = wzh0Var;
        wzh0Var.f191762f = false;
    }

    /* JADX INFO: renamed from: k */
    public void m143768k() {
        this.f118671d.clear();
    }

    /* JADX INFO: renamed from: l */
    public void m143769l(SQLiteDatabase sQLiteDatabase) {
        wzh0<TableProviderInfo> wzh0Var = this.f118670c;
        sQLiteDatabase.execSQL(wzh0Var.f191758b.CREATE_TABLE(wzh0Var));
    }

    /* JADX INFO: renamed from: m */
    public int m143770m() {
        return 212;
    }

    /* JADX INFO: renamed from: n */
    public TableProviderInfo m143771n(String str) {
        if (this.f118671d.get(str) != null) {
            return this.f118671d.get(str);
        }
        List<T> listM208664z = this.f118670c.m208664z(TableProviderInfo.NAME.mo61359EQ(str), null, 1, false);
        if (jyb.m147479J(listM208664z)) {
            return null;
        }
        this.f118671d.put(str, (TableProviderInfo) listM208664z.get(0));
        return (TableProviderInfo) listM208664z.get(0);
    }

    /* JADX INFO: renamed from: o */
    public void m143772o() {
        List<T> listM208664z = this.f118670c.m208664z(null, null, -1, false);
        if (listM208664z != 0) {
            for (T t : listM208664z) {
                this.f118671d.put(t.name, t);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m143773p(SQLiteDatabase sQLiteDatabase, TableProviderInfo tableProviderInfo, boolean z) {
        if (z) {
            ContentValues contentValues = new ContentValues();
            TableProviderInfo.DB_ADAPTER.write(tableProviderInfo, contentValues);
            sQLiteDatabase.insert(this.f118670c.f191760d, null, contentValues);
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        TableProviderInfo.DB_ADAPTER.write(tableProviderInfo, contentValues2);
        sQLiteDatabase.update(this.f118670c.f191760d, contentValues2, DbObject.f56857ID + " = ?", new String[]{tableProviderInfo.f56859id});
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: g */
    public void mo133948g() {
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: j */
    public void mo133951j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
