package p153l;

/* JADX INFO: loaded from: classes13.dex */
public class e9j implements a1j0 {

    /* JADX INFO: renamed from: a */
    public long f92642a;

    /* JADX INFO: renamed from: b */
    public int f92643b;

    @Override // p153l.a1j0
    /* JADX INFO: renamed from: a */
    public nyv mo95515a(nyv nyvVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f92643b++;
        long j = this.f92642a;
        if (j != 0 && jCurrentTimeMillis - j < msh0.m159793h() * 1000) {
            if (this.f92643b < msh0.m159792g() || jCurrentTimeMillis - this.f92642a >= msh0.m159793h() * 1000) {
                return nyvVar;
            }
            msh0.m159792g();
            return null;
        }
        this.f92642a = jCurrentTimeMillis;
        int iM159792g = this.f92643b - msh0.m159792g();
        if (iM159792g > 0) {
            nyvVar.f144357b += "  warning！ warning！ warning！上一次发生丢弃 共丢弃 ： " + iM159792g;
        }
        this.f92643b = 0;
        return nyvVar;
    }
}
