package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class cjw extends bhw {

    /* JADX INFO: renamed from: k */
    private long f81238k;

    @Override // p149l.xul
    /* JADX INFO: renamed from: c */
    public String mo107257c() {
        return "wolfgame_start_time";
    }

    @Override // p149l.bhw
    /* JADX INFO: renamed from: f */
    public void mo101937f() {
        m101941j("wolfgame_start_time", Long.valueOf(this.f81238k));
    }

    /* JADX INFO: renamed from: n */
    public void m107258n(long j) {
        this.f81238k = j;
    }

    public String toString() {
        return String.format("canrecord: %b, record: %s", Boolean.valueOf(mo101935a()), mo101936e().toString());
    }
}
