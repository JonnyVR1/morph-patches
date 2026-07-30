package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class rrf0 extends ogk {
    public rrf0(jt2 jt2Var) {
        prf0 prf0Var = new prf0();
        prf0Var.addTarget(jt2Var);
        jt2Var.addTarget(this);
        registerInitialFilter(prf0Var);
        registerTerminalFilter(jt2Var);
    }

    @Override // p153l.gfj
    public int getTextOutID() {
        jt2 jt2Var = getTerminalFilters().get(0);
        if (jt2Var != null) {
            return jt2Var.getTextOutID();
        }
        return 0;
    }
}
