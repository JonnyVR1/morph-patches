package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class aif0 extends yhf0 implements q7m {

    /* JADX INFO: renamed from: c */
    private List<ts2> f69981c;

    /* JADX INFO: renamed from: d */
    private List<ts2> f69982d;

    /* JADX INFO: renamed from: e */
    private long f69983e;

    /* JADX INFO: renamed from: f */
    private CopyOnWriteArrayList<ts2> f69984f;

    /* JADX INFO: renamed from: g */
    private List<ts2> f69985g;

    /* JADX INFO: renamed from: i */
    private boolean f69986i;

    public aif0(List<ts2> list) {
        super(list);
        this.f69984f = new CopyOnWriteArrayList<>();
        this.f69986i = true;
        this.f69981c = list;
        if (this.f69982d == null) {
            this.f69982d = new ArrayList();
        }
        for (ts2 ts2Var : this.f69981c) {
            if (ts2Var instanceof q7m) {
                this.f69982d.add(ts2Var);
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    private void m96811S1(List<ts2> list) {
        List<ts2> list2 = this.f69981c;
        if (list2 != null && list2.size() > 0) {
            for (ts2 ts2Var : this.f69981c) {
                removeInitialFilter(ts2Var);
                removeTerminalFilter(ts2Var);
                removeFilter(ts2Var);
                ts2Var.clearTarget();
                CopyOnWriteArrayList<ts2> copyOnWriteArrayList = this.f69984f;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(ts2Var);
                }
            }
        }
        List<ts2> list3 = this.f69982d;
        if (list3 != null) {
            list3.clear();
        }
        this.f69981c = list;
        if (list.size() > 0) {
            ts2 ts2Var2 = list.get(0);
            ts2 ts2Var3 = list.get(list.size() - 1);
            registerInitialFilter(ts2Var2);
            ts2 ts2Var4 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                ts2 ts2Var5 = list.get(i);
                ts2Var5.clearTarget();
                if (ts2Var4 != null) {
                    ts2Var4.addTarget(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(ts2Var5);
                }
                ts2Var4 = list.get(i);
            }
            ts2Var3.addTarget(this);
            registerTerminalFilter(ts2Var3);
        }
        for (ts2 ts2Var6 : this.f69981c) {
            if (ts2Var6 instanceof q7m) {
                this.f69982d.add(ts2Var6);
            }
        }
    }

    private void doDestroyFilters() {
        Iterator<ts2> it = this.f69984f.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.f69984f.clear();
    }

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m96812Q1(boolean z) {
        synchronized (getFilters()) {
            this.f69986i = z;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m96813R1(List<ts2> list) {
        if (list != null) {
            if (list.size() > 0) {
                this.f69985g = list;
            }
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            CopyOnWriteArrayList<ts2> copyOnWriteArrayList = this.f69984f;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                doDestroyFilters();
            }
            List<ts2> list = this.f69981c;
            if (list != null && list.size() > 0) {
                this.f69981c.clear();
                this.f69981c = null;
            }
            List<ts2> list2 = this.f69982d;
            if (list2 != null && list2.size() > 0) {
                this.f69982d.clear();
                this.f69982d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<ts2> getFilters() {
        return this.f69981c;
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            List<ts2> list = this.f69985g;
            if (list != null) {
                m96811S1(list);
                this.f69985g = null;
            }
            Iterator<ts2> it = this.f69982d.iterator();
            while (it.hasNext()) {
                ((q7m) ((ts2) it.next())).setTimeStamp(this.f69983e);
            }
            CopyOnWriteArrayList<ts2> copyOnWriteArrayList = this.f69984f;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && this.f69986i) {
                doDestroyFilters();
            }
            super.newTextureReady(i, mcjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        this.f69983e = j;
    }
}
