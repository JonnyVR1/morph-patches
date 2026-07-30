package p007l;

import android.content.ContentValues;
import com.p000p1.mobile.putong.data.TableProviderInfo;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.tantanapp.common.data.DbObject;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fza0 extends b8c {

    /* JADX INFO: renamed from: c */
    public orh0<TableProviderInfo> f8278c;

    /* JADX INFO: renamed from: d */
    public HashMap<String, TableProviderInfo> f8279d = new HashMap<>();

    @Override // p007l.b8c
    /* JADX INFO: renamed from: c */
    public int mo8745c() {
        return 213;
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: d */
    public int mo8746d() {
        return 0;
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: e */
    public String mo8747e() {
        return null;
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> mo8748f() {
        return super.mo8748f();
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: h */
    public void mo8750h() {
        orh0<TableProviderInfo> orh0Var = new orh0<>(null, "providerInfo", TableProviderInfo.DB_ADAPTER, null, MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f8278c = orh0Var;
        orh0Var.f11574f = false;
    }

    /* JADX INFO: renamed from: k */
    public void m10332k() {
        this.f8279d.clear();
    }

    /* JADX INFO: renamed from: l */
    public void m10333l(SQLiteDatabase sQLiteDatabase) {
        orh0<TableProviderInfo> orh0Var = this.f8278c;
        sQLiteDatabase.execSQL(orh0Var.f11570b.CREATE_TABLE(orh0Var));
    }

    /* JADX INFO: renamed from: m */
    public int m10334m() {
        return 212;
    }

    /* JADX INFO: renamed from: n */
    public TableProviderInfo m10335n(String str) {
        if (this.f8279d.get(str) != null) {
            return this.f8279d.get(str);
        }
        List<T> listM12784z = this.f8278c.m12784z(TableProviderInfo.NAME.EQ(str), null, 1, false);
        if (vwb.J(listM12784z)) {
            return null;
        }
        this.f8279d.put(str, (TableProviderInfo) listM12784z.get(0));
        return (TableProviderInfo) listM12784z.get(0);
    }

    /* JADX INFO: renamed from: o */
    public void m10336o() {
        List<T> listM12784z = this.f8278c.m12784z(null, null, -1, false);
        if (listM12784z != 0) {
            for (T t : listM12784z) {
                this.f8279d.put(t.name, t);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m10337p(SQLiteDatabase sQLiteDatabase, TableProviderInfo tableProviderInfo, boolean z) {
        if (z) {
            ContentValues contentValues = new ContentValues();
            TableProviderInfo.DB_ADAPTER.write(tableProviderInfo, contentValues);
            sQLiteDatabase.insert(this.f8278c.f11572d, (String) null, contentValues);
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        TableProviderInfo.DB_ADAPTER.write(tableProviderInfo, contentValues2);
        sQLiteDatabase.update(this.f8278c.f11572d, contentValues2, DbObject.ID + " = ?", new String[]{((DbObject) tableProviderInfo).id});
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: g */
    public void mo8749g() {
    }

    @Override // p007l.b8c
    /* JADX INFO: renamed from: j */
    public void mo8752j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
