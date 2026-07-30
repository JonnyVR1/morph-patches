package p149l;

/* JADX INFO: loaded from: classes5.dex */
public class z310 extends zj2<Boolean> {

    /* JADX INFO: renamed from: c */
    public final int f201299c;

    public z310(int i, int i2) {
        super(i);
        this.f201299c = i2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m217006d() {
        return this.f201299c == 4;
    }

    /* JADX INFO: renamed from: e */
    public boolean m217007e() {
        return this.f201299c == 5;
    }

    /* JADX INFO: renamed from: f */
    public boolean m217008f() {
        int i = this.f201299c;
        return i == 2 || i == 6;
    }

    /* JADX INFO: renamed from: g */
    public boolean m217009g() {
        return this.f201299c == 1;
    }

    @Override // p149l.zj2, p149l.lql
    public int getAction() {
        return this.f201299c;
    }

    @Override // p149l.zj2
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Boolean mo94647a() {
        return Boolean.FALSE;
    }
}
