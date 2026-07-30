package com.momo.mcamera.mask;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.gfj;
import p153l.jt2;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class FaceFilterPipeline extends FaceDetectGroupFilter {
    private List<jt2> mFilters = new CopyOnWriteArrayList();

    public void addTerminalFilter(jt2 jt2Var) {
        if (this.mFilters.size() == 0 && getTerminalFilters().size() == 0) {
            jt2Var.addTarget(this);
            registerInitialFilter(jt2Var);
            registerTerminalFilter(jt2Var);
            this.mFilters.add(jt2Var);
            return;
        }
        jt2 jt2Var2 = getTerminalFilters().get(0);
        List<jt2> list = this.mFilters;
        if (list.get(list.size() - 1) == jt2Var2) {
            jt2Var2.removeTarget(this);
            removeTerminalFilter(jt2Var2);
            jt2Var2.addTarget(jt2Var);
            jt2Var.addTarget(this);
            registerFilter(jt2Var2);
            registerTerminalFilter(jt2Var);
            this.mFilters.add(jt2Var);
        }
    }

    public void constructGroupFilter(List<jt2> list) {
        int size = list.size();
        if (size > 0) {
            int i = 0;
            jt2 jt2Var = list.get(0);
            int i2 = size - 1;
            jt2 jt2Var2 = list.get(i2);
            registerInitialFilter(jt2Var);
            gfj gfjVar = null;
            while (i < size) {
                jt2 jt2Var3 = list.get(i);
                jt2Var3.clearTarget();
                if (gfjVar != null) {
                    gfjVar.addTarget(jt2Var3);
                }
                if (i > 0 && i < i2) {
                    registerFilter(jt2Var3);
                }
                i++;
                gfjVar = jt2Var3;
            }
            jt2Var2.addTarget(this);
            registerTerminalFilter(jt2Var2);
            this.mFilters.addAll(list);
        }
    }

    public void destructGroupFilter() {
        int size = this.mFilters.size();
        if (size > 0) {
            jt2 jt2Var = this.mFilters.get(0);
            int i = size - 1;
            jt2 jt2Var2 = this.mFilters.get(i);
            while (i >= 0) {
                jt2 jt2Var3 = this.mFilters.get(i);
                jt2Var3.clearTarget();
                removeFilter(jt2Var3);
                i--;
            }
            jt2Var2.clearTarget();
            removeInitialFilter(jt2Var);
            removeTerminalFilter(jt2Var2);
            this.mFilters.clear();
        }
    }

    public List<jt2> getFilters() {
        return this.mFilters;
    }

    public void insertFilter(jt2 jt2Var, jt2 jt2Var2) {
        int size = this.mFilters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.mFilters.get(i) == jt2Var) {
                jt2 jt2Var3 = i < size + (-1) ? this.mFilters.get(i + 1) : null;
                if (jt2Var3 == null) {
                    jt2Var.removeTarget(this);
                    removeTerminalFilter(jt2Var);
                    jt2Var.addTarget(jt2Var2);
                    jt2Var2.addTarget(this);
                    registerFilter(jt2Var);
                    registerTerminalFilter(jt2Var2);
                    break;
                }
                jt2Var.removeTarget(jt2Var3);
                jt2Var.addTarget(jt2Var2);
                jt2Var2.addTarget(jt2Var3);
                registerFilter(jt2Var2);
                break;
            }
            i++;
        }
        if (i > 0) {
            this.mFilters.add(i + 1, jt2Var2);
        }
    }

    public boolean removeDstFilter(jt2 jt2Var) {
        int size = this.mFilters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (jt2Var == this.mFilters.get(i)) {
                jt2 jt2Var2 = i > 0 ? this.mFilters.get(i - 1) : null;
                jt2 jt2Var3 = i < size - 1 ? this.mFilters.get(i + 1) : null;
                if (jt2Var2 == null && jt2Var3 != null) {
                    jt2Var.removeTarget(jt2Var3);
                    removeInitialFilter(jt2Var);
                    registerInitialFilter(jt2Var3);
                    break;
                }
                if (jt2Var2 != null && jt2Var3 == null) {
                    jt2Var2.removeTarget(jt2Var);
                    jt2Var2.addTarget(this);
                    removeTerminalFilter(jt2Var);
                    registerTerminalFilter(jt2Var2);
                    break;
                }
                if (jt2Var2 != null && jt2Var3 != null) {
                    jt2Var2.removeTarget(jt2Var);
                    jt2Var.removeTarget(jt2Var3);
                    jt2Var2.addTarget(jt2Var3);
                    removeFilter(jt2Var);
                    break;
                }
                break;
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        this.mFilters.remove(jt2Var);
        return true;
    }

    public boolean resetFilter(jt2 jt2Var, jt2 jt2Var2) {
        if (jt2Var == jt2Var2) {
            return false;
        }
        int size = this.mFilters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.mFilters.get(i) == jt2Var) {
                jt2 jt2Var3 = i > 0 ? this.mFilters.get(i - 1) : null;
                jt2 jt2Var4 = i < size - 1 ? this.mFilters.get(i + 1) : null;
                if (jt2Var3 != null || jt2Var4 != null) {
                    if (jt2Var3 != null) {
                        if (jt2Var4 != null) {
                            jt2Var3.removeTarget(jt2Var);
                            jt2Var.removeTarget(jt2Var4);
                            removeFilter(jt2Var);
                            jt2Var3.addTarget(jt2Var2);
                            jt2Var2.addTarget(jt2Var4);
                            registerFilter(jt2Var2);
                            break;
                        }
                        jt2Var3.removeTarget(jt2Var);
                        jt2Var.removeTarget(this);
                        removeTerminalFilter(jt2Var);
                        jt2Var3.addTarget(jt2Var2);
                        jt2Var2.addTarget(this);
                        registerTerminalFilter(jt2Var2);
                        break;
                    }
                    jt2Var.removeTarget(jt2Var4);
                    removeInitialFilter(jt2Var);
                    jt2Var2.addTarget(jt2Var4);
                    registerInitialFilter(jt2Var2);
                    break;
                }
                jt2Var.removeTarget(this);
                removeInitialFilter(jt2Var);
                removeTerminalFilter(jt2Var);
                jt2Var2.addTarget(this);
                registerInitialFilter(jt2Var2);
                registerTerminalFilter(jt2Var2);
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        this.mFilters.remove(jt2Var);
        this.mFilters.add(i, jt2Var2);
        return true;
    }

    @Override // com.momo.mcamera.mask.FaceDetectGroupFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
    }
}
