package com.momo.mcamera.filtermanager.filterext;

import java.util.ArrayList;
import java.util.List;
import p149l.etf;
import p149l.j3w;
import p149l.jcj;
import p149l.pjw;
import p149l.q7m;
import p149l.ts2;
import p149l.ydk;

/* JADX INFO: loaded from: classes6.dex */
public class DetectSingleLineGroupFilter extends ydk implements etf, q7m {
    private List<ts2> mFilters;
    private List<j3w> mLookUpFilters = new ArrayList();

    public DetectSingleLineGroupFilter(List<ts2> list) {
        this.mFilters = list;
        if (list.size() > 0) {
            ts2 ts2Var = list.get(0);
            ts2 ts2Var2 = list.get(list.size() - 1);
            registerInitialFilter(ts2Var);
            ts2 ts2Var3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                ts2 ts2Var4 = list.get(i);
                ts2Var4.clearTarget();
                if (ts2Var3 != null) {
                    ts2Var3.addTarget(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(ts2Var4);
                }
                ts2Var3 = list.get(i);
                if (ts2Var4 instanceof j3w) {
                    this.mLookUpFilters.add((j3w) ts2Var4);
                }
            }
            ts2Var2.addTarget(this);
            registerTerminalFilter(ts2Var2);
        }
    }

    public List<ts2> getFilters() {
        return this.mFilters;
    }

    public synchronized void setIntensity(float f) {
        List<j3w> list = this.mLookUpFilters;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.mLookUpFilters.size(); i++) {
                this.mLookUpFilters.get(i).setIntensity(f);
            }
        }
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        for (jcj jcjVar : this.mFilters) {
            if (jcjVar instanceof etf) {
                ((etf) jcjVar).setMMCVInfo(pjwVar);
            }
        }
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        for (jcj jcjVar : this.mFilters) {
            if (jcjVar instanceof q7m) {
                ((q7m) jcjVar).setTimeStamp(j);
            }
        }
    }
}
