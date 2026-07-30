package com.momo.mcamera.mask;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.mcj;
import p149l.pjw;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class FaceFilterPipeline extends FaceDetectGroupFilter {
    private List<ts2> mFilters = new CopyOnWriteArrayList();

    public void addTerminalFilter(ts2 ts2Var) {
        if (this.mFilters.size() == 0 && getTerminalFilters().size() == 0) {
            ts2Var.addTarget(this);
            registerInitialFilter(ts2Var);
            registerTerminalFilter(ts2Var);
            this.mFilters.add(ts2Var);
            return;
        }
        ts2 ts2Var2 = getTerminalFilters().get(0);
        List<ts2> list = this.mFilters;
        if (list.get(list.size() - 1) == ts2Var2) {
            ts2Var2.removeTarget(this);
            removeTerminalFilter(ts2Var2);
            ts2Var2.addTarget(ts2Var);
            ts2Var.addTarget(this);
            registerFilter(ts2Var2);
            registerTerminalFilter(ts2Var);
            this.mFilters.add(ts2Var);
        }
    }

    public void constructGroupFilter(List<ts2> list) {
        int size = list.size();
        if (size > 0) {
            int i = 0;
            ts2 ts2Var = list.get(0);
            int i2 = size - 1;
            ts2 ts2Var2 = list.get(i2);
            registerInitialFilter(ts2Var);
            mcj mcjVar = null;
            while (i < size) {
                ts2 ts2Var3 = list.get(i);
                ts2Var3.clearTarget();
                if (mcjVar != null) {
                    mcjVar.addTarget(ts2Var3);
                }
                if (i > 0 && i < i2) {
                    registerFilter(ts2Var3);
                }
                i++;
                mcjVar = ts2Var3;
            }
            ts2Var2.addTarget(this);
            registerTerminalFilter(ts2Var2);
            this.mFilters.addAll(list);
        }
    }

    public void destructGroupFilter() {
        int size = this.mFilters.size();
        if (size > 0) {
            ts2 ts2Var = this.mFilters.get(0);
            int i = size - 1;
            ts2 ts2Var2 = this.mFilters.get(i);
            while (i >= 0) {
                ts2 ts2Var3 = this.mFilters.get(i);
                ts2Var3.clearTarget();
                removeFilter(ts2Var3);
                i--;
            }
            ts2Var2.clearTarget();
            removeInitialFilter(ts2Var);
            removeTerminalFilter(ts2Var2);
            this.mFilters.clear();
        }
    }

    public List<ts2> getFilters() {
        return this.mFilters;
    }

    public void insertFilter(ts2 ts2Var, ts2 ts2Var2) {
        int size = this.mFilters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.mFilters.get(i) == ts2Var) {
                ts2 ts2Var3 = i < size + (-1) ? this.mFilters.get(i + 1) : null;
                if (ts2Var3 == null) {
                    ts2Var.removeTarget(this);
                    removeTerminalFilter(ts2Var);
                    ts2Var.addTarget(ts2Var2);
                    ts2Var2.addTarget(this);
                    registerFilter(ts2Var);
                    registerTerminalFilter(ts2Var2);
                    break;
                }
                ts2Var.removeTarget(ts2Var3);
                ts2Var.addTarget(ts2Var2);
                ts2Var2.addTarget(ts2Var3);
                registerFilter(ts2Var2);
                break;
            }
            i++;
        }
        if (i > 0) {
            this.mFilters.add(i + 1, ts2Var2);
        }
    }

    public boolean removeDstFilter(ts2 ts2Var) {
        int size = this.mFilters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (ts2Var == this.mFilters.get(i)) {
                ts2 ts2Var2 = i > 0 ? this.mFilters.get(i - 1) : null;
                ts2 ts2Var3 = i < size - 1 ? this.mFilters.get(i + 1) : null;
                if (ts2Var2 == null && ts2Var3 != null) {
                    ts2Var.removeTarget(ts2Var3);
                    removeInitialFilter(ts2Var);
                    registerInitialFilter(ts2Var3);
                    break;
                }
                if (ts2Var2 != null && ts2Var3 == null) {
                    ts2Var2.removeTarget(ts2Var);
                    ts2Var2.addTarget(this);
                    removeTerminalFilter(ts2Var);
                    registerTerminalFilter(ts2Var2);
                    break;
                }
                if (ts2Var2 != null && ts2Var3 != null) {
                    ts2Var2.removeTarget(ts2Var);
                    ts2Var.removeTarget(ts2Var3);
                    ts2Var2.addTarget(ts2Var3);
                    removeFilter(ts2Var);
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
        this.mFilters.remove(ts2Var);
        return true;
    }

    public boolean resetFilter(ts2 ts2Var, ts2 ts2Var2) {
        if (ts2Var == ts2Var2) {
            return false;
        }
        int size = this.mFilters.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (this.mFilters.get(i) == ts2Var) {
                ts2 ts2Var3 = i > 0 ? this.mFilters.get(i - 1) : null;
                ts2 ts2Var4 = i < size - 1 ? this.mFilters.get(i + 1) : null;
                if (ts2Var3 != null || ts2Var4 != null) {
                    if (ts2Var3 != null) {
                        if (ts2Var4 != null) {
                            ts2Var3.removeTarget(ts2Var);
                            ts2Var.removeTarget(ts2Var4);
                            removeFilter(ts2Var);
                            ts2Var3.addTarget(ts2Var2);
                            ts2Var2.addTarget(ts2Var4);
                            registerFilter(ts2Var2);
                            break;
                        }
                        ts2Var3.removeTarget(ts2Var);
                        ts2Var.removeTarget(this);
                        removeTerminalFilter(ts2Var);
                        ts2Var3.addTarget(ts2Var2);
                        ts2Var2.addTarget(this);
                        registerTerminalFilter(ts2Var2);
                        break;
                    }
                    ts2Var.removeTarget(ts2Var4);
                    removeInitialFilter(ts2Var);
                    ts2Var2.addTarget(ts2Var4);
                    registerInitialFilter(ts2Var2);
                    break;
                }
                ts2Var.removeTarget(this);
                removeInitialFilter(ts2Var);
                removeTerminalFilter(ts2Var);
                ts2Var2.addTarget(this);
                registerInitialFilter(ts2Var2);
                registerTerminalFilter(ts2Var2);
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        this.mFilters.remove(ts2Var);
        this.mFilters.add(i, ts2Var2);
        return true;
    }

    @Override // com.momo.mcamera.mask.FaceDetectGroupFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
    }
}
