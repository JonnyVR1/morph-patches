package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class jtq0 implements ltq0 {

    /* JADX INFO: renamed from: a */
    private final String f122610a;

    /* JADX INFO: renamed from: b */
    private final String f122611b;

    public jtq0(String str, String str2) {
        if (str == null) {
            wg3.m206174a("Name may not be null");
            throw null;
        }
        this.f122610a = str;
        this.f122611b = str2;
    }

    @Override // p153l.ltq0
    /* JADX INFO: renamed from: a */
    public String mo146917a() {
        return this.f122610a;
    }

    @Override // p153l.ltq0
    /* JADX INFO: renamed from: b */
    public String mo146918b() {
        return this.f122611b;
    }
}
