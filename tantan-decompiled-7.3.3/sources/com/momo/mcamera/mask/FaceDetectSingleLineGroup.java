package com.momo.mcamera.mask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.aqw;
import p153l.gam;
import p153l.gfj;
import p153l.jt2;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class FaceDetectSingleLineGroup extends FaceDetectGroupFilter implements gam {
    private ArrayList<suf> faceDetectGroupFilters = new ArrayList<>();
    private ArrayList<jt2> mFilters = new ArrayList<>();
    private CopyOnWriteArrayList<jt2> destroyList = new CopyOnWriteArrayList<>();

    public FaceDetectSingleLineGroup(List<jt2> list) {
        constructGroupFilter(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void constructGroupFilter(List<jt2> list) {
        if (list.size() > 0) {
            jt2 jt2Var = list.get(0);
            jt2 jt2Var2 = list.get(list.size() - 1);
            registerInitialFilter(jt2Var);
            jt2 jt2Var3 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                jt2 jt2Var4 = list.get(i);
                if (jt2Var4 instanceof suf) {
                    this.faceDetectGroupFilters.add((suf) jt2Var4);
                }
                this.mFilters.add(jt2Var4);
                jt2Var4.getTargets().clear();
                if (jt2Var3 != null) {
                    jt2Var3.addTarget(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(jt2Var4);
                }
                jt2Var3 = list.get(i);
            }
            jt2Var2.addTarget(this);
            registerTerminalFilter(jt2Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void destructGroupFilter() {
        if (this.mFilters.size() > 0) {
            jt2 jt2Var = this.mFilters.get(0);
            ArrayList<jt2> arrayList = this.mFilters;
            jt2 jt2Var2 = arrayList.get(arrayList.size() - 1);
            removeTerminalFilter(jt2Var2);
            jt2Var2.clearTarget();
            for (int size = this.mFilters.size() - 1; size >= 0; size--) {
                jt2 jt2Var3 = this.mFilters.get(size);
                if (jt2Var3 instanceof suf) {
                    this.faceDetectGroupFilters.remove((suf) jt2Var3);
                }
                jt2Var3.clearTarget();
                if (size > 0 && size < this.mFilters.size() - 1) {
                    removeFilter(jt2Var3);
                }
            }
            removeInitialFilter(jt2Var);
            this.mFilters.clear();
        }
    }

    private void doDestroyFilters() {
        Iterator<jt2> it = this.destroyList.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.destroyList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void addEndFilter(jt2 jt2Var) {
        synchronized (getLockObject()) {
            try {
                if (this.mFilters.size() > 0 && jt2Var != 0) {
                    List<jt2> terminalFilters = getTerminalFilters();
                    if (terminalFilters.size() == 1) {
                        jt2 jt2Var2 = terminalFilters.get(0);
                        removeTerminalFilter(jt2Var2);
                        registerFilter(jt2Var2);
                        jt2Var2.getTargets().clear();
                        jt2Var2.addTarget(jt2Var);
                        jt2Var.addTarget(this);
                        registerTerminalFilter(jt2Var);
                        if (jt2Var instanceof suf) {
                            this.faceDetectGroupFilters.add((suf) jt2Var);
                        }
                        this.mFilters.add(jt2Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void addFilter(jt2 jt2Var) {
        synchronized (getLockObject()) {
            try {
                if (this.mFilters.size() <= 0 || jt2Var == null) {
                    registerInitialFilter(jt2Var);
                    jt2Var.addTarget(this);
                    registerTerminalFilter(jt2Var);
                    this.mFilters.add(jt2Var);
                } else {
                    List<jt2> initialFilters = getInitialFilters();
                    if (initialFilters.size() == 1) {
                        jt2 jt2Var2 = initialFilters.get(0);
                        removeInitialFilter(jt2Var2);
                        registerInitialFilter(jt2Var);
                        jt2Var.getTargets().clear();
                        jt2Var.addTarget(jt2Var2);
                        registerFilter(jt2Var2);
                        this.mFilters.add(0, jt2Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void addFilterToDestroy(jt2 jt2Var) {
        try {
            if (this.mFilters.contains(jt2Var)) {
                this.mFilters.remove(jt2Var);
            }
            CopyOnWriteArrayList<jt2> copyOnWriteArrayList = this.destroyList;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.add(jt2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        synchronized (getLockObject()) {
            try {
                super.newTextureReady(i, gfjVar, z);
                if (this.destroyList.size() > 0) {
                    doDestroyFilters();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void removeFilterFromLine(jt2 jt2Var) {
        synchronized (getLockObject()) {
            try {
                if (jt2Var == null) {
                    return;
                }
                int i = 0;
                while (i < this.mFilters.size()) {
                    jt2 jt2Var2 = this.mFilters.get(i);
                    if (jt2Var2 == jt2Var) {
                        jt2 jt2Var3 = i > 0 ? this.mFilters.get(i - 1) : null;
                        int i2 = i + 1;
                        jt2 jt2Var4 = i2 < this.mFilters.size() ? this.mFilters.get(i2) : null;
                        if (jt2Var3 == null && jt2Var4 != null) {
                            jt2Var2.getTargets().clear();
                            removeInitialFilter(jt2Var2);
                            registerInitialFilter(jt2Var4);
                        } else if (jt2Var4 == null && jt2Var3 != null) {
                            jt2Var3.getTargets().clear();
                            jt2Var2.getTargets().clear();
                            removeTerminalFilter(jt2Var2);
                            registerTerminalFilter(jt2Var3);
                            jt2Var3.addTarget(this);
                        } else if (jt2Var3 != null && jt2Var4 != null) {
                            jt2Var3.removeTarget(jt2Var2);
                            jt2Var2.removeTarget(jt2Var4);
                            removeFilter(jt2Var2);
                            jt2Var3.addTarget(jt2Var4);
                        }
                        this.mFilters.remove(jt2Var2);
                        CopyOnWriteArrayList<jt2> copyOnWriteArrayList = this.destroyList;
                        if (copyOnWriteArrayList != null) {
                            copyOnWriteArrayList.add(jt2Var2);
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
    public synchronized boolean resetFilter(jt2 jt2Var, jt2 jt2Var2) {
        synchronized (getLockObject()) {
            try {
                if (jt2Var2 == 0 || jt2Var == null || jt2Var == jt2Var2) {
                    return false;
                }
                int i = 0;
                boolean z = false;
                while (i < this.mFilters.size()) {
                    if (this.mFilters.get(i) == jt2Var) {
                        jt2 jt2Var3 = i > 0 ? this.mFilters.get(i - 1) : null;
                        int i2 = i + 1;
                        jt2 jt2Var4 = i2 < this.mFilters.size() ? this.mFilters.get(i2) : null;
                        if (jt2Var3 == null || jt2Var4 == null) {
                            if (jt2Var3 == null && jt2Var4 != null) {
                                jt2Var.clearTarget();
                                removeInitialFilter(jt2Var);
                                registerTerminalFilter(jt2Var2);
                                jt2Var2.addTarget(jt2Var4);
                            } else if (jt2Var4 == null && jt2Var3 != null) {
                                jt2Var3.clearTarget();
                                jt2Var.clearTarget();
                                removeTerminalFilter(jt2Var);
                                registerTerminalFilter(jt2Var2);
                                jt2Var3.addTarget(jt2Var2);
                                jt2Var2.addTarget(this);
                            } else if (jt2Var3 != null && jt2Var4 != null) {
                                jt2Var3.removeTarget(jt2Var);
                                jt2Var.removeTarget(jt2Var4);
                                removeFilter(jt2Var);
                                registerFilter(jt2Var2);
                                jt2Var3.addTarget(jt2Var2);
                                jt2Var2.addTarget(jt2Var4);
                            }
                        }
                        z = true;
                    }
                    i++;
                }
                if (!z) {
                    return false;
                }
                if (jt2Var instanceof suf) {
                    this.faceDetectGroupFilters.remove(jt2Var);
                }
                if (jt2Var2 instanceof suf) {
                    this.faceDetectGroupFilters.add((suf) jt2Var2);
                }
                this.mFilters.remove(jt2Var);
                this.mFilters.add(jt2Var2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized ArrayList<jt2> resetFilters(List<jt2> list) {
        ArrayList<jt2> arrayList;
        synchronized (getLockObject()) {
            arrayList = new ArrayList<>(this.mFilters);
            destructGroupFilter();
            constructGroupFilter(list);
        }
        return arrayList;
    }

    @Override // com.momo.mcamera.mask.FaceDetectGroupFilter, p153l.suf
    public synchronized void setMMCVInfo(omw omwVar) {
        synchronized (getLockObject()) {
            try {
                Iterator<suf> it = this.faceDetectGroupFilters.iterator();
                while (it.hasNext()) {
                    it.next().setMMCVInfo(omwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void setPlayStatusChangeListener(aqw aqwVar) {
        synchronized (getLockObject()) {
            try {
                for (jt2 jt2Var : this.mFilters) {
                    if (jt2Var instanceof StickerAdjustFilter) {
                        ((StickerAdjustFilter) jt2Var).setplayStatusListener(aqwVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.gam
    public synchronized void setTimeStamp(long j) {
        synchronized (getLockObject()) {
            try {
                for (Object obj : this.mFilters) {
                    if (obj instanceof gam) {
                        ((gam) obj).setTimeStamp(j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
