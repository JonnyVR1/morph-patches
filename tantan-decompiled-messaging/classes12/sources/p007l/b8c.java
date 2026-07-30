package p007l;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class b8c {

    /* JADX INFO: renamed from: a */
    public String f6172a = "DbProvider";

    /* JADX INFO: renamed from: b */
    public ArrayList<orh0> f6173b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public abstract int mo8745c();

    /* JADX INFO: renamed from: d */
    public abstract int mo8746d();

    /* JADX INFO: renamed from: e */
    public abstract String mo8747e();

    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> mo8748f() {
        return this.f6173b;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo8749g();

    /* JADX INFO: renamed from: h */
    public abstract void mo8750h();

    /* JADX INFO: renamed from: j */
    public abstract void mo8752j(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* JADX INFO: renamed from: i */
    public void mo8751i() {
    }
}
