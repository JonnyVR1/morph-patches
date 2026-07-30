package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class dtf extends zr2 {
    public dtf() {
        xsf xsfVar = new xsf();
        xsfVar.m212975R1(-1626018);
        xsfVar.m212974Q1(-13750176);
        etf etfVar = new etf();
        etfVar.m122438Q1(0.8f);
        qsf qsfVar = new qsf();
        qsfVar.m177796S1(1.3f);
        qsfVar.m177794Q1(1.3f);
        qsfVar.m177795R1(1.0f);
        xsfVar.addTarget(etfVar);
        etfVar.addTarget(qsfVar);
        qsfVar.addTarget(this);
        registerEffectInnerFilter(xsfVar);
        registerEffectInnerFilter(etfVar);
        registerEffectInnerFilter(qsfVar);
        registerFilter(xsfVar);
        registerFilter(etfVar);
        registerFilter(qsfVar);
        registerInitialFilter(xsfVar);
        registerTerminalFilter(qsfVar);
    }
}
