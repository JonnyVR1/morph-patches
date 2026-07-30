package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class wrf extends jr2 {
    public wrf() {
        qrf qrfVar = new qrf();
        qrfVar.m175988R1(-1626018);
        qrfVar.m175987Q1(-13750176);
        xrf xrfVar = new xrf();
        xrfVar.m210676Q1(0.8f);
        jrf jrfVar = new jrf();
        jrfVar.m142928S1(1.3f);
        jrfVar.m142926Q1(1.3f);
        jrfVar.m142927R1(1.0f);
        qrfVar.addTarget(xrfVar);
        xrfVar.addTarget(jrfVar);
        jrfVar.addTarget(this);
        registerEffectInnerFilter(qrfVar);
        registerEffectInnerFilter(xrfVar);
        registerEffectInnerFilter(jrfVar);
        registerFilter(qrfVar);
        registerFilter(xrfVar);
        registerFilter(jrfVar);
        registerInitialFilter(qrfVar);
        registerTerminalFilter(jrfVar);
    }
}
