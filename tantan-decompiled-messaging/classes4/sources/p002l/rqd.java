package p002l;

import l.ura;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rqd implements jh70 {

    /* JADX INFO: renamed from: a */
    public int f18644a;

    public rqd(int i) {
        this.f18644a = i;
    }

    @Override // p002l.jh70
    /* JADX INFO: renamed from: a */
    public boolean mo15910a() {
        return this.f18644a == 0 && ura.e().d().ak();
    }

    @Override // p002l.jh70
    /* JADX INFO: renamed from: b */
    public boolean mo15911b() {
        return false;
    }

    @Override // p002l.jh70
    /* JADX INFO: renamed from: c */
    public boolean mo15912c() {
        return ura.e().d().Ua();
    }

    @Override // p002l.jh70
    /* JADX INFO: renamed from: d */
    public boolean mo15913d() {
        if (this.f18644a == 0) {
            return ura.e().d().ak() || ura.e().d().Fl();
        }
        return false;
    }

    @Override // p002l.jh70
    /* JADX INFO: renamed from: e */
    public boolean mo15914e() {
        return this.f18644a == 0;
    }
}
