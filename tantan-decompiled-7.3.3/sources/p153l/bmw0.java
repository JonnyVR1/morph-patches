package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class bmw0 extends xmw0 {

    /* JADX INFO: renamed from: a */
    public int f77411a;

    /* JADX INFO: renamed from: b */
    public String f77412b;

    /* JADX INFO: renamed from: c */
    public byte f77413c;

    @Override // p153l.xmw0
    /* JADX INFO: renamed from: a */
    public final xmw0 mo105273a(String str) {
        this.f77412b = str;
        return this;
    }

    @Override // p153l.xmw0
    /* JADX INFO: renamed from: b */
    public final xmw0 mo105274b(int i) {
        this.f77411a = i;
        this.f77413c = (byte) 1;
        return this;
    }

    @Override // p153l.xmw0
    /* JADX INFO: renamed from: c */
    public final ymw0 mo105275c() {
        if (this.f77413c == 1) {
            return new dmw0(this.f77411a, this.f77412b, null);
        }
        wtq0.m207906a("Missing required properties: statusCode");
        return null;
    }
}
