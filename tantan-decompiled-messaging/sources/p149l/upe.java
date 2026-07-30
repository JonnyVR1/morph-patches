package p149l;

import com.immomo.components.interfaces.IProcessOutput;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class upe extends zdk implements dtf, r7m {

    /* JADX INFO: renamed from: H */
    private final int f177590H = -1;

    /* JADX INFO: renamed from: I */
    private us2 f177591I;

    /* JADX INFO: renamed from: J */
    private us2 f177592J;

    /* JADX INFO: renamed from: K */
    private ConcurrentHashMap<String, AbstractC17684j4> f177593K;

    /* JADX INFO: renamed from: L */
    private CopyOnWriteArrayList<dcj> f177594L;

    public upe() {
        us2 us2Var = new us2();
        this.f177591I = us2Var;
        us2Var.m158945C(this);
        m218168R(this.f177591I);
        m218169S(this.f177591I);
        this.f177592J = this.f177591I;
        this.f177594L = new CopyOnWriteArrayList<>();
        this.f177593K = new ConcurrentHashMap<>();
    }

    @Override // p149l.zdk, p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        if (this.f177594L.size() > 0) {
            Iterator<dcj> it = this.f177594L.iterator();
            while (it.hasNext()) {
                it.next().mo102038f();
            }
            this.f177594L.clear();
        }
        super.mo102037c(i, ncjVar, z);
    }

    @Override // p149l.dtf
    /* JADX INFO: renamed from: d */
    public void mo104314d(IProcessOutput iProcessOutput) {
        if (this.f177593K.size() == 0) {
            return;
        }
        for (kcj kcjVar : this.f177593K.values()) {
            if (kcjVar instanceof dtf) {
                ((dtf) kcjVar).mo104314d(iProcessOutput);
            }
        }
    }

    @Override // p149l.zdk, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public synchronized void mo102038f() {
        try {
            super.mo102038f();
            this.f177593K.clear();
            if (this.f177594L.size() > 0) {
                Iterator<dcj> it = this.f177594L.iterator();
                while (it.hasNext()) {
                    it.next().mo102038f();
                }
                this.f177594L.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.r7m
    public void setTimeStamp(long j) {
        ConcurrentHashMap<String, AbstractC17684j4> concurrentHashMap = this.f177593K;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        Iterator<AbstractC17684j4> it = this.f177593K.values().iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
    }
}
