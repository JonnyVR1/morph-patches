package p149l;

import com.immomo.components.interfaces.IProcessOutput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class swf0 extends zdk implements r7m, dtf {

    /* JADX INFO: renamed from: H */
    public mwf0 f166661H;

    /* JADX INFO: renamed from: I */
    public InterfaceC20050a f166662I;

    /* JADX INFO: renamed from: J */
    maj0 f166663J;

    /* JADX INFO: renamed from: K */
    btf f166664K;

    /* JADX INFO: renamed from: L */
    tkf0 f166665L;

    /* JADX INFO: renamed from: M */
    private boolean f166666M;

    /* JADX INFO: renamed from: N */
    private Map<String, List> f166667N;

    /* JADX INFO: renamed from: l.swf0$a */
    public interface InterfaceC20050a {
        void playStateChanged(int i, boolean z);
    }

    /* JADX INFO: renamed from: W */
    public void m186162W() {
        btf btfVar = this.f166664K;
        if (btfVar != null) {
            btfVar.mo103827O();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m186163X() {
        if (this.f166666M) {
            if (this.f166662I != null && this.f166661H.m156624d() > 0) {
                this.f166662I.playStateChanged(this.f166661H.m156624d(), false);
            }
            this.f166666M = false;
        }
    }

    @Override // p149l.zdk, p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        super.mo102037c(i, ncjVar, z);
        if (!(this.f166663J instanceof y01) || ((exf0) this.f166664K).m118667S() == null) {
            return;
        }
        String[] strArrSplit = ((exf0) this.f166664K).m118667S().split("/");
        if (this.f166667N.containsKey(strArrSplit[strArrSplit.length - 1])) {
            ((y01) this.f166663J).m212027S(((Float) this.f166667N.get(strArrSplit[strArrSplit.length - 1]).get(0)).floatValue(), ((Float) this.f166667N.get(strArrSplit[strArrSplit.length - 1]).get(1)).floatValue());
        }
    }

    @Override // p149l.dtf
    /* JADX INFO: renamed from: d */
    public void mo104314d(IProcessOutput iProcessOutput) {
        if (iProcessOutput == null) {
            return;
        }
        maj0 maj0Var = this.f166663J;
        if (maj0Var != null) {
            maj0Var.mo104314d(iProcessOutput);
        }
        if (this.f166665L != null) {
            iProcessOutput.m18291b(0);
            this.f166665L.m189480O(false);
        }
        if (iProcessOutput.m18290a() == 0) {
            m186163X();
        }
    }

    @Override // p149l.zdk, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        m186162W();
    }

    @Override // p149l.r7m
    public void setTimeStamp(long j) {
        kcj kcjVar = this.f166664K;
        if (kcjVar == null || !(kcjVar instanceof r7m)) {
            return;
        }
        ((r7m) kcjVar).setTimeStamp(j);
    }
}
