package p153l;

import androidx.annotation.CallSuper;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class fux0 {

    /* JADX INFO: renamed from: a */
    public int f100957a;

    /* JADX INFO: renamed from: a */
    public final void m127550a(int i) {
        this.f100957a = i | this.f100957a;
    }

    @CallSuper
    /* JADX INFO: renamed from: b */
    public void mo122858b() {
        this.f100957a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m127551c(int i) {
        this.f100957a = i;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m127552d(int i) {
        return (this.f100957a & i) == i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m127553e() {
        return m127552d(SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m127554f() {
        return m127552d(4);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m127555g() {
        return m127552d(1);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m127556h() {
        return m127552d(536870912);
    }
}
