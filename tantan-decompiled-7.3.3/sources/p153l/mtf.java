package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class mtf extends zr2 {
    public mtf() {
        rtf rtfVar = new rtf();
        rtfVar.m183111Q1(2.0f);
        rtfVar.m183112R1(0.04f);
        rtfVar.m183113S1(0.1f);
        etf etfVar = new etf();
        etfVar.m122438Q1(0.05f);
        rtfVar.addTarget(etfVar);
        rsf rsfVar = new rsf();
        rsfVar.m182956R1(0.4f);
        rsfVar.m182955Q1(0.0f);
        etfVar.addTarget(rsfVar);
        registerFilter(rtfVar);
        registerFilter(etfVar);
        registerFilter(rsfVar);
        registerEffectInnerFilter(rtfVar);
        registerEffectInnerFilter(etfVar);
        registerEffectInnerFilter(rsfVar);
        rsfVar.addTarget(this);
        registerInitialFilter(rtfVar);
        registerTerminalFilter(rsfVar);
    }
}
