package p153l;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h9c {

    /* JADX INFO: renamed from: a */
    public String f108329a = "DbProvider";

    /* JADX INFO: renamed from: b */
    public ArrayList<wzh0> f108330b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public abstract int mo133945c();

    /* JADX INFO: renamed from: d */
    public abstract int mo133946d();

    /* JADX INFO: renamed from: e */
    public abstract String mo133947e();

    /* JADX INFO: renamed from: f */
    public ArrayList<wzh0> mo134045f() {
        return this.f108330b;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo133948g();

    /* JADX INFO: renamed from: h */
    public abstract void mo133949h();

    /* JADX INFO: renamed from: j */
    public abstract void mo133951j(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* JADX INFO: renamed from: i */
    public void mo133950i() {
    }
}
