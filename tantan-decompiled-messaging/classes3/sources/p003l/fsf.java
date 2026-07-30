package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class fsf extends jr2 {
    public fsf() {
        ksf ksfVar = new ksf();
        ksfVar.m5779Q1(2.0f);
        ksfVar.m5780R1(0.04f);
        ksfVar.m5781S1(0.1f);
        xrf xrfVar = new xrf();
        xrfVar.m8738Q1(0.05f);
        ksfVar.addTarget(xrfVar);
        krf krfVar = new krf();
        krfVar.m5767R1(0.4f);
        krfVar.m5766Q1(0.0f);
        xrfVar.addTarget(krfVar);
        registerFilter(ksfVar);
        registerFilter(xrfVar);
        registerFilter(krfVar);
        registerEffectInnerFilter(ksfVar);
        registerEffectInnerFilter(xrfVar);
        registerEffectInnerFilter(krfVar);
        krfVar.addTarget(this);
        registerInitialFilter(ksfVar);
        registerTerminalFilter(krfVar);
    }
}
