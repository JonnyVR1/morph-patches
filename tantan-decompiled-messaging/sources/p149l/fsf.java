package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class fsf extends jr2 {
    public fsf() {
        ksf ksfVar = new ksf();
        ksfVar.m147064Q1(2.0f);
        ksfVar.m147065R1(0.04f);
        ksfVar.m147066S1(0.1f);
        xrf xrfVar = new xrf();
        xrfVar.m210676Q1(0.05f);
        ksfVar.addTarget(xrfVar);
        krf krfVar = new krf();
        krfVar.m146973R1(0.4f);
        krfVar.m146972Q1(0.0f);
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
