package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class kkc0 extends ogk {
    public kkc0() {
        jt2 b6xVar = new b6x();
        fqf fqfVar = new fqf(-1.0f);
        uq1 uq1Var = new uq1();
        gyk gykVar = new gyk();
        llj lljVar = new llj(9.7f);
        fqfVar.addTarget(uq1Var);
        uq1Var.addTarget(lljVar);
        uq1Var.addTarget(gykVar);
        lljVar.addTarget(gykVar);
        gykVar.registerFilterLocation(uq1Var, 0);
        gykVar.registerFilterLocation(lljVar, 1);
        gykVar.addTarget(b6xVar);
        b6xVar.addTarget(this);
        registerInitialFilter(fqfVar);
        registerFilter(lljVar);
        registerFilter(gykVar);
        registerFilter(uq1Var);
        registerTerminalFilter(b6xVar);
    }
}
