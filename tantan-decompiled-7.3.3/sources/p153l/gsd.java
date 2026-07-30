package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class gsd implements pp70 {

    /* JADX INFO: renamed from: a */
    public int f106268a;

    public gsd(int i) {
        this.f106268a = i;
    }

    @Override // p153l.pp70
    /* JADX INFO: renamed from: a */
    public boolean mo132023a() {
        return this.f106268a == 0 && gta.m132210e().m132214d().mo34801ak();
    }

    @Override // p153l.pp70
    /* JADX INFO: renamed from: b */
    public boolean mo132024b() {
        return false;
    }

    @Override // p153l.pp70
    /* JADX INFO: renamed from: c */
    public boolean mo132025c() {
        return gta.m132210e().m132214d().mo34759Ua();
    }

    @Override // p153l.pp70
    /* JADX INFO: renamed from: d */
    public boolean mo132026d() {
        if (this.f106268a == 0) {
            return gta.m132210e().m132214d().mo34801ak() || gta.m132210e().m132214d().mo34690Fl();
        }
        return false;
    }

    @Override // p153l.pp70
    /* JADX INFO: renamed from: e */
    public boolean mo132027e() {
        return this.f106268a == 0;
    }
}
