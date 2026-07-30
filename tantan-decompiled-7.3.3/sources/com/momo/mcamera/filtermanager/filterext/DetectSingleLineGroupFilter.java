package com.momo.mcamera.filtermanager.filterext;

import java.util.ArrayList;
import java.util.List;
import p153l.gam;
import p153l.h5w;
import p153l.jt2;
import p153l.ogk;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes6.dex */
public class DetectSingleLineGroupFilter extends ogk implements suf, gam {
    private List<jt2> mFilters;
    private List<h5w> mLookUpFilters = new ArrayList();

    public DetectSingleLineGroupFilter(List<jt2> list) {
        this.mFilters = list;
        if (list.size() > 0) {
            jt2 jt2Var = list.get(0);
            jt2 jt2Var2 = list.get(list.size() - 1);
            registerInitialFilter(jt2Var);
            jt2 jt2Var3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                jt2 jt2Var4 = list.get(i);
                jt2Var4.clearTarget();
                if (jt2Var3 != null) {
                    jt2Var3.addTarget(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(jt2Var4);
                }
                jt2Var3 = list.get(i);
                if (jt2Var4 instanceof h5w) {
                    this.mLookUpFilters.add((h5w) jt2Var4);
                }
            }
            jt2Var2.addTarget(this);
            registerTerminalFilter(jt2Var2);
        }
    }

    public List<jt2> getFilters() {
        return this.mFilters;
    }

    public synchronized void setIntensity(float f) {
        List<h5w> list = this.mLookUpFilters;
        if (list != null && list.size() > 0) {
            for (int i = 0; i < this.mLookUpFilters.size(); i++) {
                this.mLookUpFilters.get(i).setIntensity(f);
            }
        }
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        for (Object obj : this.mFilters) {
            if (obj instanceof suf) {
                ((suf) obj).setMMCVInfo(omwVar);
            }
        }
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        for (Object obj : this.mFilters) {
            if (obj instanceof gam) {
                ((gam) obj).setTimeStamp(j);
            }
        }
    }
}
