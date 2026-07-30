package com.momo.mcamera.mask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.cnw;
import p149l.etf;
import p149l.jcj;
import p149l.mcj;
import p149l.pjw;
import p149l.q7m;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class FaceDetectSingleLineGroup extends FaceDetectGroupFilter implements q7m {
    private ArrayList<etf> faceDetectGroupFilters = new ArrayList<>();
    private ArrayList<ts2> mFilters = new ArrayList<>();
    private CopyOnWriteArrayList<ts2> destroyList = new CopyOnWriteArrayList<>();

    public FaceDetectSingleLineGroup(List<ts2> list) {
        constructGroupFilter(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void constructGroupFilter(List<ts2> list) {
        if (list.size() > 0) {
            ts2 ts2Var = list.get(0);
            ts2 ts2Var2 = list.get(list.size() - 1);
            registerInitialFilter(ts2Var);
            ts2 ts2Var3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                ts2 ts2Var4 = list.get(i);
                if (ts2Var4 instanceof etf) {
                    this.faceDetectGroupFilters.add((etf) ts2Var4);
                }
                this.mFilters.add(ts2Var4);
                ts2Var4.getTargets().clear();
                if (ts2Var3 != null) {
                    ts2Var3.addTarget(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(ts2Var4);
                }
                ts2Var3 = list.get(i);
            }
            ts2Var2.addTarget(this);
            registerTerminalFilter(ts2Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void destructGroupFilter() {
        if (this.mFilters.size() > 0) {
            ts2 ts2Var = this.mFilters.get(0);
            ArrayList<ts2> arrayList = this.mFilters;
            ts2 ts2Var2 = arrayList.get(arrayList.size() - 1);
            removeTerminalFilter(ts2Var2);
            ts2Var2.clearTarget();
            for (int size = this.mFilters.size() - 1; size >= 0; size--) {
                ts2 ts2Var3 = this.mFilters.get(size);
                if (ts2Var3 instanceof etf) {
                    this.faceDetectGroupFilters.remove((etf) ts2Var3);
                }
                ts2Var3.clearTarget();
                if (size > 0 && size < this.mFilters.size() - 1) {
                    removeFilter(ts2Var3);
                }
            }
            removeInitialFilter(ts2Var);
            this.mFilters.clear();
        }
    }

    private void doDestroyFilters() {
        Iterator<ts2> it = this.destroyList.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.destroyList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void addEndFilter(ts2 ts2Var) {
        synchronized (getLockObject()) {
            try {
                if (this.mFilters.size() > 0 && ts2Var != 0) {
                    List<ts2> terminalFilters = getTerminalFilters();
                    if (terminalFilters.size() == 1) {
                        ts2 ts2Var2 = terminalFilters.get(0);
                        removeTerminalFilter(ts2Var2);
                        registerFilter(ts2Var2);
                        ts2Var2.getTargets().clear();
                        ts2Var2.addTarget(ts2Var);
                        ts2Var.addTarget(this);
                        registerTerminalFilter(ts2Var);
                        if (ts2Var instanceof etf) {
                            this.faceDetectGroupFilters.add((etf) ts2Var);
                        }
                        this.mFilters.add(ts2Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void addFilter(ts2 ts2Var) {
        synchronized (getLockObject()) {
            try {
                if (this.mFilters.size() <= 0 || ts2Var == null) {
                    registerInitialFilter(ts2Var);
                    ts2Var.addTarget(this);
                    registerTerminalFilter(ts2Var);
                    this.mFilters.add(ts2Var);
                } else {
                    List<ts2> initialFilters = getInitialFilters();
                    if (initialFilters.size() == 1) {
                        ts2 ts2Var2 = initialFilters.get(0);
                        removeInitialFilter(ts2Var2);
                        registerInitialFilter(ts2Var);
                        ts2Var.getTargets().clear();
                        ts2Var.addTarget(ts2Var2);
                        registerFilter(ts2Var2);
                        this.mFilters.add(0, ts2Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void addFilterToDestroy(ts2 ts2Var) {
        try {
            if (this.mFilters.contains(ts2Var)) {
                this.mFilters.remove(ts2Var);
            }
            CopyOnWriteArrayList<ts2> copyOnWriteArrayList = this.destroyList;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.add(ts2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        synchronized (getLockObject()) {
            try {
                super.newTextureReady(i, mcjVar, z);
                if (this.destroyList.size() > 0) {
                    doDestroyFilters();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void removeFilterFromLine(ts2 ts2Var) {
        synchronized (getLockObject()) {
            try {
                if (ts2Var == null) {
                    return;
                }
                int i = 0;
                while (i < this.mFilters.size()) {
                    ts2 ts2Var2 = this.mFilters.get(i);
                    if (ts2Var2 == ts2Var) {
                        ts2 ts2Var3 = i > 0 ? this.mFilters.get(i - 1) : null;
                        int i2 = i + 1;
                        ts2 ts2Var4 = i2 < this.mFilters.size() ? this.mFilters.get(i2) : null;
                        if (ts2Var3 == null && ts2Var4 != null) {
                            ts2Var2.getTargets().clear();
                            removeInitialFilter(ts2Var2);
                            registerInitialFilter(ts2Var4);
                        } else if (ts2Var4 == null && ts2Var3 != null) {
                            ts2Var3.getTargets().clear();
                            ts2Var2.getTargets().clear();
                            removeTerminalFilter(ts2Var2);
                            registerTerminalFilter(ts2Var3);
                            ts2Var3.addTarget(this);
                        } else if (ts2Var3 != null && ts2Var4 != null) {
                            ts2Var3.removeTarget(ts2Var2);
                            ts2Var2.removeTarget(ts2Var4);
                            removeFilter(ts2Var2);
                            ts2Var3.addTarget(ts2Var4);
                        }
                        this.mFilters.remove(ts2Var2);
                        CopyOnWriteArrayList<ts2> copyOnWriteArrayList = this.destroyList;
                        if (copyOnWriteArrayList != null) {
                            copyOnWriteArrayList.add(ts2Var2);
                        }
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized boolean resetFilter(ts2 ts2Var, ts2 ts2Var2) {
        synchronized (getLockObject()) {
            try {
                if (ts2Var2 == 0 || ts2Var == null || ts2Var == ts2Var2) {
                    return false;
                }
                int i = 0;
                boolean z = false;
                while (i < this.mFilters.size()) {
                    if (this.mFilters.get(i) == ts2Var) {
                        ts2 ts2Var3 = i > 0 ? this.mFilters.get(i - 1) : null;
                        int i2 = i + 1;
                        ts2 ts2Var4 = i2 < this.mFilters.size() ? this.mFilters.get(i2) : null;
                        if (ts2Var3 == null || ts2Var4 == null) {
                            if (ts2Var3 == null && ts2Var4 != null) {
                                ts2Var.clearTarget();
                                removeInitialFilter(ts2Var);
                                registerTerminalFilter(ts2Var2);
                                ts2Var2.addTarget(ts2Var4);
                            } else if (ts2Var4 == null && ts2Var3 != null) {
                                ts2Var3.clearTarget();
                                ts2Var.clearTarget();
                                removeTerminalFilter(ts2Var);
                                registerTerminalFilter(ts2Var2);
                                ts2Var3.addTarget(ts2Var2);
                                ts2Var2.addTarget(this);
                            } else if (ts2Var3 != null && ts2Var4 != null) {
                                ts2Var3.removeTarget(ts2Var);
                                ts2Var.removeTarget(ts2Var4);
                                removeFilter(ts2Var);
                                registerFilter(ts2Var2);
                                ts2Var3.addTarget(ts2Var2);
                                ts2Var2.addTarget(ts2Var4);
                            }
                        }
                        z = true;
                    }
                    i++;
                }
                if (!z) {
                    return false;
                }
                if (ts2Var instanceof etf) {
                    this.faceDetectGroupFilters.remove(ts2Var);
                }
                if (ts2Var2 instanceof etf) {
                    this.faceDetectGroupFilters.add((etf) ts2Var2);
                }
                this.mFilters.remove(ts2Var);
                this.mFilters.add(ts2Var2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized ArrayList<ts2> resetFilters(List<ts2> list) {
        ArrayList<ts2> arrayList;
        synchronized (getLockObject()) {
            arrayList = new ArrayList<>(this.mFilters);
            destructGroupFilter();
            constructGroupFilter(list);
        }
        return arrayList;
    }

    @Override // com.momo.mcamera.mask.FaceDetectGroupFilter, p149l.etf
    public synchronized void setMMCVInfo(pjw pjwVar) {
        synchronized (getLockObject()) {
            try {
                Iterator<etf> it = this.faceDetectGroupFilters.iterator();
                while (it.hasNext()) {
                    it.next().setMMCVInfo(pjwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void setPlayStatusChangeListener(cnw cnwVar) {
        synchronized (getLockObject()) {
            try {
                for (ts2 ts2Var : this.mFilters) {
                    if (ts2Var instanceof StickerAdjustFilter) {
                        ((StickerAdjustFilter) ts2Var).setplayStatusListener(cnwVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.q7m
    public synchronized void setTimeStamp(long j) {
        synchronized (getLockObject()) {
            try {
                for (jcj jcjVar : this.mFilters) {
                    if (jcjVar instanceof q7m) {
                        ((q7m) jcjVar).setTimeStamp(j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
