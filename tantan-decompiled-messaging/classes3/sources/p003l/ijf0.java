package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ijf0 extends ydk {
    public ijf0(ts2 ts2Var) {
        gjf0 gjf0Var = new gjf0();
        gjf0Var.addTarget(ts2Var);
        ts2Var.addTarget(this);
        registerInitialFilter(gjf0Var);
        registerTerminalFilter(ts2Var);
    }

    @Override // p003l.mcj
    public int getTextOutID() {
        ts2 ts2Var = getTerminalFilters().get(0);
        if (ts2Var != null) {
            return ts2Var.getTextOutID();
        }
        return 0;
    }
}
