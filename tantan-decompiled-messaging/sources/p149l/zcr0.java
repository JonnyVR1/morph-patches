package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class zcr0 implements wcr0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f202570a;

    /* JADX INFO: renamed from: b */
    public final int f202571b;

    /* JADX INFO: renamed from: c */
    public final int f202572c;

    /* JADX INFO: renamed from: d */
    public int f202573d;

    /* JADX INFO: renamed from: e */
    public int f202574e;

    public zcr0(scr0 scr0Var) {
        v6w0 v6w0Var = scr0Var.f163765b;
        this.f202570a = v6w0Var;
        v6w0Var.m197262k(12);
        this.f202572c = v6w0Var.m197241E() & 255;
        this.f202571b = v6w0Var.m197241E();
    }

    @Override // p149l.wcr0
    public final int zza() {
        return -1;
    }

    @Override // p149l.wcr0
    public final int zzb() {
        return this.f202571b;
    }

    @Override // p149l.wcr0
    public final int zzc() {
        int i = this.f202572c;
        if (i == 8) {
            return this.f202570a.m197238B();
        }
        if (i == 16) {
            return this.f202570a.m197242F();
        }
        int i2 = this.f202573d;
        this.f202573d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f202574e & 15;
        }
        int iM197238B = this.f202570a.m197238B();
        this.f202574e = iM197238B;
        return (iM197238B & 240) >> 4;
    }
}
