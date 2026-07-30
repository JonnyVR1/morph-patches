package p153l;

import com.immomo.components.interfaces.IProcessOutput;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class yqe extends pgk implements ruf, ham {

    /* JADX INFO: renamed from: H */
    private final int f201165H = -1;

    /* JADX INFO: renamed from: I */
    private kt2 f201166I;

    /* JADX INFO: renamed from: J */
    private kt2 f201167J;

    /* JADX INFO: renamed from: K */
    private ConcurrentHashMap<String, AbstractC17867j4> f201168K;

    /* JADX INFO: renamed from: L */
    private CopyOnWriteArrayList<xej> f201169L;

    public yqe() {
        kt2 kt2Var = new kt2();
        this.f201166I = kt2Var;
        kt2Var.m134795C(this);
        m172256R(this.f201166I);
        m172257S(this.f201166I);
        this.f201167J = this.f201166I;
        this.f201169L = new CopyOnWriteArrayList<>();
        this.f201168K = new ConcurrentHashMap<>();
    }

    @Override // p153l.pgk, p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        if (this.f201169L.size() > 0) {
            Iterator<xej> it = this.f201169L.iterator();
            while (it.hasNext()) {
                it.next().mo96080f();
            }
            this.f201169L.clear();
        }
        super.mo96079c(i, hfjVar, z);
    }

    @Override // p153l.ruf
    /* JADX INFO: renamed from: d */
    public void mo102835d(IProcessOutput iProcessOutput) {
        if (this.f201168K.size() == 0) {
            return;
        }
        for (ham hamVar : this.f201168K.values()) {
            if (hamVar instanceof ruf) {
                ((ruf) hamVar).mo102835d(iProcessOutput);
            }
        }
    }

    @Override // p153l.pgk, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public synchronized void mo96080f() {
        try {
            super.mo96080f();
            this.f201168K.clear();
            if (this.f201169L.size() > 0) {
                Iterator<xej> it = this.f201169L.iterator();
                while (it.hasNext()) {
                    it.next().mo96080f();
                }
                this.f201169L.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ham
    public void setTimeStamp(long j) {
        ConcurrentHashMap<String, AbstractC17867j4> concurrentHashMap = this.f201168K;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        Iterator<AbstractC17867j4> it = this.f201168K.values().iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
    }
}
