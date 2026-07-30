package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class rei implements tei {

    /* JADX INFO: renamed from: a */
    private volatile pei f159056a;

    public rei(String str) {
        this.f159056a = pei.m168514c(str);
    }

    @Override // p149l.tei
    /* JADX INFO: renamed from: a */
    public String mo179044a() {
        if (this.f159056a != null) {
            return this.f159056a.m168516b();
        }
        return null;
    }

    @Override // p149l.tei
    /* JADX INFO: renamed from: b */
    public AbstractC17922k4 mo179045b(String str, String str2) {
        Map<String, AbstractC17922k4> mapM168515a;
        if (this.f159056a == null || (mapM168515a = this.f159056a.m168515a()) == null || mapM168515a.get(str) == null) {
            return null;
        }
        AbstractC17922k4 abstractC17922k4 = mapM168515a.get(str);
        if (!(abstractC17922k4 instanceof am10) || abstractC17922k4.m144450a(str2)) {
            return abstractC17922k4;
        }
        return null;
    }

    @Override // p149l.tei
    /* JADX INFO: renamed from: c */
    public void mo179046c(String str) {
        this.f159056a = pei.m168514c(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m179047d(String str, String str2, long j) {
        AbstractC17922k4 abstractC17922k4Mo179045b;
        if (this.f159056a == null || (abstractC17922k4Mo179045b = mo179045b(str2, str)) == null || nhw.m159463f(j, abstractC17922k4Mo179045b.m144455f(str))) {
            return false;
        }
        AbstractC17922k4 abstractC17922k4 = this.f159056a.m168515a().get(str2);
        if (abstractC17922k4 instanceof am10) {
            abstractC17922k4.m144451b(str, str2);
            return false;
        }
        this.f159056a.m168515a().remove(str2);
        return false;
    }
}
