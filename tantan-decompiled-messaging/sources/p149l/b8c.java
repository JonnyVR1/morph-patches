package p149l;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b8c {

    /* JADX INFO: renamed from: a */
    public String f74082a = "DbProvider";

    /* JADX INFO: renamed from: b */
    public ArrayList<orh0> f74083b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public abstract int mo100761c();

    /* JADX INFO: renamed from: d */
    public abstract int mo100762d();

    /* JADX INFO: renamed from: e */
    public abstract String mo100763e();

    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> mo100764f() {
        return this.f74083b;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo100765g();

    /* JADX INFO: renamed from: h */
    public abstract void mo100766h();

    /* JADX INFO: renamed from: j */
    public abstract void mo100768j(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* JADX INFO: renamed from: i */
    public void mo100767i() {
    }
}
