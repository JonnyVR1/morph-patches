package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class wrf extends jr2 {
    public wrf() {
        qrf qrfVar = new qrf();
        qrfVar.m7027R1(-1626018);
        qrfVar.m7026Q1(-13750176);
        xrf xrfVar = new xrf();
        xrfVar.m8738Q1(0.8f);
        jrf jrfVar = new jrf();
        jrfVar.m5418S1(1.3f);
        jrfVar.m5416Q1(1.3f);
        jrfVar.m5417R1(1.0f);
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
