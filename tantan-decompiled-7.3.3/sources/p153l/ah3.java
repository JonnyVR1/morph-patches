package p153l;

import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class ah3 {

    /* JADX INFO: renamed from: a */
    public int f71314a;

    /* JADX INFO: renamed from: h */
    public final void m97774h(int i) {
        this.f71314a = i | this.f71314a;
    }

    /* JADX INFO: renamed from: i */
    public void mo9857i() {
        this.f71314a = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m97775j(int i) {
        this.f71314a = (~i) & this.f71314a;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m97776m(int i) {
        return (this.f71314a & i) == i;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m97777n() {
        return m97776m(SQLiteDatabase.CREATE_IF_NECESSARY);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m97778o() {
        return m97776m(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m97779p() {
        return m97776m(4);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m97780q() {
        return m97776m(134217728);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m97781r() {
        return m97776m(1);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m97782s() {
        return m97776m(536870912);
    }

    /* JADX INFO: renamed from: t */
    public final void m97783t(int i) {
        this.f71314a = i;
    }
}
