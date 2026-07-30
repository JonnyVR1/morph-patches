package p153l;

import com.immomo.components.interfaces.IProcessOutput;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class qqc0 extends b7e {

    /* JADX INFO: renamed from: J */
    private List<px3> f158977J;

    public qqc0(List<kt2> list) {
        super(list);
        this.f158977J = new CopyOnWriteArrayList();
    }

    @Override // p153l.b7e, p153l.ruf
    /* JADX INFO: renamed from: d */
    public void mo102835d(IProcessOutput iProcessOutput) {
        super.mo102835d(iProcessOutput);
        for (px3 px3Var : this.f158977J) {
            if (px3Var != null) {
                px3Var.m174105a(iProcessOutput);
            }
        }
    }

    @Override // p153l.b7e, p153l.pgk, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public synchronized void mo96080f() {
        super.mo96080f();
        this.f158977J.clear();
    }
}
