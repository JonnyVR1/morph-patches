package com.momo.mcamera.filtermanager;

import android.graphics.PointF;
import com.momo.mcamera.mask.NormalFilter;
import java.util.ArrayList;
import java.util.List;
import p153l.jt2;
import p153l.ogk;
import p153l.omw;
import p153l.qxf0;
import p153l.suf;

/* JADX INFO: loaded from: classes6.dex */
public class SplitChangeFilter extends ogk implements suf {
    jt2 curFilterA;
    jt2 curFilterB;
    boolean isStashed;
    jt2 mStashedA;
    jt2 mStashedB;
    qxf0 splitFilter;

    public SplitChangeFilter(jt2 jt2Var, jt2 jt2Var2) {
        qxf0 qxf0Var = new qxf0();
        this.splitFilter = qxf0Var;
        this.curFilterA = jt2Var;
        this.curFilterB = jt2Var2;
        jt2Var.addTarget(qxf0Var);
        jt2Var2.addTarget(this.splitFilter);
        this.splitFilter.registerFilterLocation(jt2Var, 0);
        this.splitFilter.registerFilterLocation(jt2Var2, 1);
        this.splitFilter.addTarget(this);
        registerInitialFilter(this.curFilterA);
        registerInitialFilter(this.curFilterB);
        registerTerminalFilter(this.splitFilter);
    }

    public void changeAngleAndCenter(float f, PointF pointF) {
        synchronized (getLockObject()) {
            this.splitFilter.m178599Q1(pointF, f);
        }
    }

    public ArrayList<jt2> changeFilter(jt2 jt2Var, jt2 jt2Var2) {
        synchronized (getLockObject()) {
            try {
                ArrayList<jt2> arrayList = new ArrayList<>();
                jt2 jt2Var3 = this.curFilterA;
                if (jt2Var3 == jt2Var && this.curFilterB == jt2Var2) {
                    return arrayList;
                }
                if (jt2Var3 != null) {
                    arrayList.add(jt2Var3);
                }
                jt2 jt2Var4 = this.curFilterB;
                if (jt2Var4 != null) {
                    arrayList.add(jt2Var4);
                }
                if (this.isStashed) {
                    this.mStashedA = jt2Var;
                    this.mStashedB = jt2Var2;
                }
                removeInitialFilter(this.curFilterA);
                removeInitialFilter(this.curFilterB);
                removeTerminalFilter(this.splitFilter);
                this.curFilterA.removeTarget(this.splitFilter);
                this.curFilterB.removeTarget(this.splitFilter);
                jt2Var.addTarget(this.splitFilter);
                jt2Var2.addTarget(this.splitFilter);
                this.splitFilter.registerFilterLocation(jt2Var, 0);
                this.splitFilter.registerFilterLocation(jt2Var2, 1);
                registerInitialFilter(jt2Var);
                registerInitialFilter(jt2Var2);
                registerTerminalFilter(this.splitFilter);
                this.curFilterA = jt2Var;
                this.curFilterB = jt2Var2;
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void changeMix(float f) {
        synchronized (getLockObject()) {
            this.splitFilter.m178600R1(f);
        }
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        Object obj = this.curFilterA;
        if (obj instanceof suf) {
            ((suf) obj).setMMCVInfo(omwVar);
        }
        Object obj2 = this.curFilterB;
        if (obj2 instanceof suf) {
            ((suf) obj2).setMMCVInfo(omwVar);
        }
    }

    public void setVSplit(boolean z) {
        qxf0 qxf0Var = this.splitFilter;
        if (qxf0Var != null) {
            qxf0Var.m178601S1(z);
        }
    }

    public List<jt2> stash() {
        synchronized (getLockObject()) {
            try {
                if (this.isStashed) {
                    return new ArrayList();
                }
                this.mStashedA = this.curFilterA;
                this.mStashedB = this.curFilterB;
                ArrayList<jt2> arrayListChangeFilter = changeFilter(new NormalFilter(), new NormalFilter());
                this.isStashed = true;
                return arrayListChangeFilter;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<jt2> unStash() {
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
