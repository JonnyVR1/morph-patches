package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class v24 extends hk2<Boolean> {

    /* JADX INFO: renamed from: c */
    public int f182067c;

    public v24(int i, int i2) {
        super(i);
        this.f182067c = i2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m199115d() {
        return this.f182067c == 4;
    }

    /* JADX INFO: renamed from: e */
    public boolean m199116e() {
        return this.f182067c == 5;
    }

    /* JADX INFO: renamed from: f */
    public boolean m199117f() {
        int i = this.f182067c;
        return i == 2 || i == 6;
    }

    /* JADX INFO: renamed from: g */
    public boolean m199118g() {
        return this.f182067c == 3;
    }

    @Override // p153l.hk2, p153l.xsl
    public int getAction() {
        return this.f182067c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m199119h() {
        return this.f182067c == 1;
    }

    /* JADX INFO: renamed from: i */
    public boolean m199120i() {
        return this.f182067c == 2;
    }

    @Override // p153l.hk2
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean mo95616a() {
        return Boolean.FALSE;
    }
}
