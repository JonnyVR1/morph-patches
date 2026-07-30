package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class dcc0 extends ydk {
    public dcc0() {
        ts2 c3xVar = new c3x();
        yof yofVar = new yof(-1.0f);
        nq1 nq1Var = new nq1();
        qvk qvkVar = new qvk();
        sij sijVar = new sij(9.7f);
        yofVar.addTarget(nq1Var);
        nq1Var.addTarget(sijVar);
        nq1Var.addTarget(qvkVar);
        sijVar.addTarget(qvkVar);
        qvkVar.registerFilterLocation(nq1Var, 0);
        qvkVar.registerFilterLocation(sijVar, 1);
        qvkVar.addTarget(c3xVar);
        c3xVar.addTarget(this);
        registerInitialFilter(yofVar);
        registerFilter(sijVar);
        registerFilter(qvkVar);
        registerFilter(nq1Var);
        registerTerminalFilter(c3xVar);
    }
}
