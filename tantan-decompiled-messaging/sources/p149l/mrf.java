package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class mrf extends jr2 {

    /* JADX INFO: renamed from: c */
    private final trf f135361c;

    public mrf() {
        lrf lrfVar = new lrf();
        trf trfVar = new trf(1.0f);
        this.f135361c = trfVar;
        trfVar.addTarget(lrfVar);
        lrfVar.addTarget(this);
        registerFilter(lrfVar);
        registerFilter(trfVar);
        registerEffectInnerFilter(lrfVar);
        registerEffectInnerFilter(trfVar);
        registerInitialFilter(trfVar);
        registerTerminalFilter(lrfVar);
    }

    @Override // p149l.jr2, p149l.vs2, p149l.uff0, p149l.AbstractC17477i4, p149l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        float f = j % 0.7f;
        double d = f;
        trf trfVar = this.f135361c;
        if (d < 0.2d) {
            trfVar.m190412S1(f * 50.0f);
        } else {
            trfVar.m190412S1(0.0f);
        }
    }
}
