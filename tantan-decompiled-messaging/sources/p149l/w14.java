package p149l;

/* JADX INFO: loaded from: classes5.dex */
public class w14 extends zj2<Boolean> {

    /* JADX INFO: renamed from: c */
    public int f183971c;

    public w14(int i, int i2) {
        super(i);
        this.f183971c = i2;
    }

    /* JADX INFO: renamed from: d */
    public boolean m200912d() {
        return this.f183971c == 4;
    }

    /* JADX INFO: renamed from: e */
    public boolean m200913e() {
        return this.f183971c == 5;
    }

    /* JADX INFO: renamed from: f */
    public boolean m200914f() {
        int i = this.f183971c;
        return i == 2 || i == 6;
    }

    /* JADX INFO: renamed from: g */
    public boolean m200915g() {
        return this.f183971c == 3;
    }

    @Override // p149l.zj2, p149l.lql
    public int getAction() {
        return this.f183971c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m200916h() {
        return this.f183971c == 1;
    }

    /* JADX INFO: renamed from: i */
    public boolean m200917i() {
        return this.f183971c == 2;
    }

    @Override // p149l.zj2
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean mo94647a() {
        return Boolean.FALSE;
    }
}
