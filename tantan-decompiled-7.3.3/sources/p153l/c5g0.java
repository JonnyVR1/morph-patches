package p153l;

import com.immomo.components.interfaces.IProcessOutput;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class c5g0 extends pgk implements ham, ruf {

    /* JADX INFO: renamed from: H */
    public w4g0 f79857H;

    /* JADX INFO: renamed from: I */
    public InterfaceC16197a f79858I;

    /* JADX INFO: renamed from: J */
    qjj0 f79859J;

    /* JADX INFO: renamed from: K */
    puf f79860K;

    /* JADX INFO: renamed from: L */
    ctf0 f79861L;

    /* JADX INFO: renamed from: M */
    private boolean f79862M;

    /* JADX INFO: renamed from: N */
    private Map<String, List> f79863N;

    /* JADX INFO: renamed from: l.c5g0$a */
    public interface InterfaceC16197a {
        void playStateChanged(int i, boolean z);
    }

    /* JADX INFO: renamed from: W */
    public void m108053W() {
        puf pufVar = this.f79860K;
        if (pufVar != null) {
            pufVar.mo166121O();
        }
    }

    /* JADX INFO: renamed from: X */
    public void m108054X() {
        if (this.f79862M) {
            if (this.f79858I != null && this.f79857H.m204887d() > 0) {
                this.f79858I.playStateChanged(this.f79857H.m204887d(), false);
            }
            this.f79862M = false;
        }
    }

    @Override // p153l.pgk, p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        super.mo96079c(i, hfjVar, z);
        if (!(this.f79859J instanceof f11) || ((o5g0) this.f79860K).m166125S() == null) {
            return;
        }
        String[] strArrSplit = ((o5g0) this.f79860K).m166125S().split("/");
        if (this.f79863N.containsKey(strArrSplit[strArrSplit.length - 1])) {
            ((f11) this.f79859J).m123542S(((Float) this.f79863N.get(strArrSplit[strArrSplit.length - 1]).get(0)).floatValue(), ((Float) this.f79863N.get(strArrSplit[strArrSplit.length - 1]).get(1)).floatValue());
        }
    }

    @Override // p153l.ruf
    /* JADX INFO: renamed from: d */
    public void mo102835d(IProcessOutput iProcessOutput) {
        if (iProcessOutput == null) {
            return;
        }
        qjj0 qjj0Var = this.f79859J;
        if (qjj0Var != null) {
            qjj0Var.mo102835d(iProcessOutput);
        }
        if (this.f79861L != null) {
            iProcessOutput.m19368b(0);
            this.f79861L.m112465O(false);
        }
        if (iProcessOutput.m19367a() == 0) {
            m108054X();
        }
    }

    @Override // p153l.pgk, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        m108053W();
    }

    @Override // p153l.ham
    public void setTimeStamp(long j) {
        ruf rufVar = this.f79860K;
        if (rufVar == null || !(rufVar instanceof ham)) {
            return;
        }
        ((ham) rufVar).setTimeStamp(j);
    }
}
