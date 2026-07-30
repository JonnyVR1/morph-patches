package com.momo.mcamera.filtermanager;

import android.graphics.PointF;
import com.momo.mcamera.mask.NormalFilter;
import java.util.ArrayList;
import java.util.List;
import p149l.etf;
import p149l.hpf0;
import p149l.jcj;
import p149l.pjw;
import p149l.ts2;
import p149l.ydk;

/* JADX INFO: loaded from: classes6.dex */
public class SplitChangeFilter extends ydk implements etf {
    ts2 curFilterA;
    ts2 curFilterB;
    boolean isStashed;
    ts2 mStashedA;
    ts2 mStashedB;
    hpf0 splitFilter;

    public SplitChangeFilter(ts2 ts2Var, ts2 ts2Var2) {
        hpf0 hpf0Var = new hpf0();
        this.splitFilter = hpf0Var;
        this.curFilterA = ts2Var;
        this.curFilterB = ts2Var2;
        ts2Var.addTarget(hpf0Var);
        ts2Var2.addTarget(this.splitFilter);
        this.splitFilter.registerFilterLocation(ts2Var, 0);
        this.splitFilter.registerFilterLocation(ts2Var2, 1);
        this.splitFilter.addTarget(this);
        registerInitialFilter(this.curFilterA);
        registerInitialFilter(this.curFilterB);
        registerTerminalFilter(this.splitFilter);
    }

    public void changeAngleAndCenter(float f, PointF pointF) {
        synchronized (getLockObject()) {
            this.splitFilter.m132334Q1(pointF, f);
        }
    }

    public ArrayList<ts2> changeFilter(ts2 ts2Var, ts2 ts2Var2) {
        synchronized (getLockObject()) {
            try {
                ArrayList<ts2> arrayList = new ArrayList<>();
                ts2 ts2Var3 = this.curFilterA;
                if (ts2Var3 == ts2Var && this.curFilterB == ts2Var2) {
                    return arrayList;
                }
                if (ts2Var3 != null) {
                    arrayList.add(ts2Var3);
                }
                ts2 ts2Var4 = this.curFilterB;
                if (ts2Var4 != null) {
                    arrayList.add(ts2Var4);
                }
                if (this.isStashed) {
                    this.mStashedA = ts2Var;
                    this.mStashedB = ts2Var2;
                }
                removeInitialFilter(this.curFilterA);
                removeInitialFilter(this.curFilterB);
                removeTerminalFilter(this.splitFilter);
                this.curFilterA.removeTarget(this.splitFilter);
                this.curFilterB.removeTarget(this.splitFilter);
                ts2Var.addTarget(this.splitFilter);
                ts2Var2.addTarget(this.splitFilter);
                this.splitFilter.registerFilterLocation(ts2Var, 0);
                this.splitFilter.registerFilterLocation(ts2Var2, 1);
                registerInitialFilter(ts2Var);
                registerInitialFilter(ts2Var2);
                registerTerminalFilter(this.splitFilter);
                this.curFilterA = ts2Var;
                this.curFilterB = ts2Var2;
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void changeMix(float f) {
        synchronized (getLockObject()) {
            this.splitFilter.m132335R1(f);
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        jcj jcjVar = this.curFilterA;
        if (jcjVar instanceof etf) {
            ((etf) jcjVar).setMMCVInfo(pjwVar);
        }
        jcj jcjVar2 = this.curFilterB;
        if (jcjVar2 instanceof etf) {
            ((etf) jcjVar2).setMMCVInfo(pjwVar);
        }
    }

    public void setVSplit(boolean z) {
        hpf0 hpf0Var = this.splitFilter;
        if (hpf0Var != null) {
            hpf0Var.m132336S1(z);
        }
    }

    public List<ts2> stash() {
        synchronized (getLockObject()) {
            try {
                if (this.isStashed) {
                    return new ArrayList();
                }
                this.mStashedA = this.curFilterA;
                this.mStashedB = this.curFilterB;
                ArrayList<ts2> arrayListChangeFilter = changeFilter(new NormalFilter(), new NormalFilter());
                this.isStashed = true;
                return arrayListChangeFilter;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<ts2> unStash() {
        synchronized (getLockObject()) {
            try {
                if (!this.isStashed) {
                    return new ArrayList();
                }
                this.isStashed = false;
                return changeFilter(this.mStashedA, this.mStashedB);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
