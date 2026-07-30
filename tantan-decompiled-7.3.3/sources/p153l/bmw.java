package p153l;

/* JADX INFO: loaded from: classes7.dex */
public class bmw extends djw {

    /* JADX INFO: renamed from: j */
    private long f77410j;

    @Override // p153l.pxl
    /* JADX INFO: renamed from: c */
    public String mo105270c() {
        return "wolfgame_start_time";
    }

    @Override // p153l.djw
    /* JADX INFO: renamed from: e */
    public void mo105271e() {
        m116158h("wolfgame_start_time", Long.valueOf(this.f77410j));
    }

    /* JADX INFO: renamed from: l */
    public void m105272l(long j) {
        this.f77410j = j;
    }

    public String toString() {
        return String.format("canrecord: %b, record: %s", Boolean.valueOf(mo116154a()), mo116155d().toString());
    }
}
