package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class jc10 extends hk2<Boolean> {

    /* JADX INFO: renamed from: c */
    public final int f120017c;

    public jc10(int i, int i2) {
        super(i);
        this.f120017c = i2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m144342d() {
        return this.f120017c == 4;
    }

    /* JADX INFO: renamed from: e */
    public boolean m144343e() {
        return this.f120017c == 5;
    }

    /* JADX INFO: renamed from: f */
    public boolean m144344f() {
        int i = this.f120017c;
        return i == 2 || i == 6;
    }

    /* JADX INFO: renamed from: g */
    public boolean m144345g() {
        return this.f120017c == 1;
    }

    @Override // p153l.hk2, p153l.xsl
    public int getAction() {
        return this.f120017c;
    }

    @Override // p153l.hk2
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Boolean mo95616a() {
        return Boolean.FALSE;
    }
}
