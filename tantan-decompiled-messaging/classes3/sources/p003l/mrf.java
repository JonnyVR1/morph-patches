package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mrf extends jr2 {

    /* JADX INFO: renamed from: c */
    private final trf f5746c;

    public mrf() {
        lrf lrfVar = new lrf();
        trf trfVar = new trf(1.0f);
        this.f5746c = trfVar;
        trfVar.addTarget(lrfVar);
        lrfVar.addTarget(this);
        registerFilter(lrfVar);
        registerFilter(trfVar);
        registerEffectInnerFilter(lrfVar);
        registerEffectInnerFilter(trfVar);
        registerInitialFilter(trfVar);
        registerTerminalFilter(lrfVar);
    }

    @Override // p003l.jr2, p003l.vs2, p003l.uff0, p003l.AbstractC0341i4, p003l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        float f = j % 0.7f;
        double d = f;
        trf trfVar = this.f5746c;
        if (d < 0.2d) {
            trfVar.m7973S1(f * 50.0f);
        } else {
            trfVar.m7973S1(0.0f);
        }
    }
}
