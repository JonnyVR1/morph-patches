package p149l;

import com.immomo.components.interfaces.IProcessOutput;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class jic0 extends n5e {

    /* JADX INFO: renamed from: J */
    private List<qw3> f118089J;

    public jic0(List<us2> list) {
        super(list);
        this.f118089J = new CopyOnWriteArrayList();
    }

    @Override // p149l.n5e, p149l.dtf
    /* JADX INFO: renamed from: d */
    public void mo104314d(IProcessOutput iProcessOutput) {
        super.mo104314d(iProcessOutput);
        for (qw3 qw3Var : this.f118089J) {
            if (qw3Var != null) {
                qw3Var.m176771a(iProcessOutput);
            }
        }
    }

    @Override // p149l.n5e, p149l.zdk, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public synchronized void mo102038f() {
        super.mo102038f();
        this.f118089J.clear();
    }
}
