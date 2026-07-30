package p149l;

/* JADX INFO: loaded from: classes13.dex */
public class k6j implements xri0 {

    /* JADX INFO: renamed from: a */
    public long f121472a;

    /* JADX INFO: renamed from: b */
    public int f121473b;

    @Override // p149l.xri0
    /* JADX INFO: renamed from: a */
    public nwv mo138899a(nwv nwvVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f121473b++;
        long j = this.f121472a;
        if (j != 0 && jCurrentTimeMillis - j < fkh0.m121862h() * 1000) {
            if (this.f121473b < fkh0.m121861g() || jCurrentTimeMillis - this.f121472a >= fkh0.m121862h() * 1000) {
                return nwvVar;
            }
            fkh0.m121861g();
            return null;
        }
        this.f121472a = jCurrentTimeMillis;
        int iM121861g = this.f121473b - fkh0.m121861g();
        if (iM121861g > 0) {
            nwvVar.f140978b += "  warning！ warning！ warning！上一次发生丢弃 共丢弃 ： " + iM121861g;
        }
        this.f121473b = 0;
        return nwvVar;
    }
}
