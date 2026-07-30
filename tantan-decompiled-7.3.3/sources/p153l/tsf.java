package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class tsf extends zr2 {

    /* JADX INFO: renamed from: c */
    private final atf f175990c;

    public tsf() {
        ssf ssfVar = new ssf();
        atf atfVar = new atf(1.0f);
        this.f175990c = atfVar;
        atfVar.addTarget(ssfVar);
        ssfVar.addTarget(this);
        registerFilter(ssfVar);
        registerFilter(atfVar);
        registerEffectInnerFilter(ssfVar);
        registerEffectInnerFilter(atfVar);
        registerInitialFilter(atfVar);
        registerTerminalFilter(ssfVar);
    }

    @Override // p153l.zr2, p153l.lt2, p153l.bof0, p153l.AbstractC17634i4, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        float f = j % 0.7f;
        double d = f;
        atf atfVar = this.f175990c;
        if (d < 0.2d) {
            atfVar.m100183S1(f * 50.0f);
        } else {
            atfVar.m100183S1(0.0f);
        }
    }
}
