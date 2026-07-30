package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class dkq0 implements fkq0 {

    /* JADX INFO: renamed from: a */
    private final String f86694a;

    /* JADX INFO: renamed from: b */
    private final String f86695b;

    public dkq0(String str, String str2) {
        if (str == null) {
            ig3.m135964a("Name may not be null");
            throw null;
        }
        this.f86694a = str;
        this.f86695b = str2;
    }

    @Override // p149l.fkq0
    /* JADX INFO: renamed from: a */
    public String mo112271a() {
        return this.f86694a;
    }

    @Override // p149l.fkq0
    /* JADX INFO: renamed from: b */
    public String mo112272b() {
        return this.f86695b;
    }
}
