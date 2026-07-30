package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class vcw0 extends rdw0 {

    /* JADX INFO: renamed from: a */
    public int f180993a;

    /* JADX INFO: renamed from: b */
    public String f180994b;

    /* JADX INFO: renamed from: c */
    public byte f180995c;

    @Override // p149l.rdw0
    /* JADX INFO: renamed from: a */
    public final rdw0 mo179016a(String str) {
        this.f180994b = str;
        return this;
    }

    @Override // p149l.rdw0
    /* JADX INFO: renamed from: b */
    public final rdw0 mo179017b(int i) {
        this.f180993a = i;
        this.f180995c = (byte) 1;
        return this;
    }

    @Override // p149l.rdw0
    /* JADX INFO: renamed from: c */
    public final sdw0 mo179018c() {
        if (this.f180995c == 1) {
            return new xcw0(this.f180993a, this.f180994b, null);
        }
        qkq0.m175383a("Missing required properties: statusCode");
        return null;
    }
}
