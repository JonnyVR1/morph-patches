package p003l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class aif0 extends yhf0 implements q7m {

    /* JADX INFO: renamed from: c */
    private List<ts2> f2212c;

    /* JADX INFO: renamed from: d */
    private List<ts2> f2213d;

    /* JADX INFO: renamed from: e */
    private long f2214e;

    /* JADX INFO: renamed from: f */
    private CopyOnWriteArrayList<ts2> f2215f;

    /* JADX INFO: renamed from: g */
    private List<ts2> f2216g;

    /* JADX INFO: renamed from: i */
    private boolean f2217i;

    public aif0(List<ts2> list) {
        super(list);
        this.f2215f = new CopyOnWriteArrayList<>();
        this.f2217i = true;
        this.f2212c = list;
        if (this.f2213d == null) {
            this.f2213d = new ArrayList();
        }
        for (ts2 ts2Var : this.f2212c) {
            if (ts2Var instanceof q7m) {
                this.f2213d.add(ts2Var);
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    private void m2882S1(List<ts2> list) {
        List<ts2> list2 = this.f2212c;
        if (list2 != null && list2.size() > 0) {
            for (ts2 ts2Var : this.f2212c) {
                removeInitialFilter(ts2Var);
                removeTerminalFilter(ts2Var);
                removeFilter(ts2Var);
                ts2Var.clearTarget();
                CopyOnWriteArrayList<ts2> copyOnWriteArrayList = this.f2215f;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(ts2Var);
                }
            }
        }
        List<ts2> list3 = this.f2213d;
        if (list3 != null) {
            list3.clear();
        }
        this.f2212c = list;
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
        for (ts2 ts2Var6 : this.f2212c) {
            if (ts2Var6 instanceof q7m) {
                this.f2213d.add(ts2Var6);
            }
        }
    }

    private void doDestroyFilters() {
        Iterator<ts2> it = this.f2215f.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.f2215f.clear();
    }

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m2883Q1(boolean z) {
        synchronized (getFilters()) {
            this.f2217i = z;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m2884R1(List<ts2> list) {
        if (list != null) {
            if (list.size() > 0) {
                this.f2216g = list;
            }
        }
    }

    @Override // p003l.ydk, p003l.mcj, p003l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            CopyOnWriteArrayList<ts2> copyOnWriteArrayList = this.f2215f;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                doDestroyFilters();
            }
            List<ts2> list = this.f2212c;
            if (list != null && list.size() > 0) {
                this.f2212c.clear();
                this.f2212c = null;
            }
            List<ts2> list2 = this.f2213d;
            if (list2 != null && list2.size() > 0) {
                this.f2213d.clear();
                this.f2213d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<ts2> getFilters() {
        return this.f2212c;
    }

    @Override // p003l.ydk, p003l.ts2, p003l.jcj
    public synchronized void newTextureReady(int i, mcj mcjVar, boolean z) {
        try {
            List<ts2> list = this.f2216g;
            if (list != null) {
                m2882S1(list);
                this.f2216g = null;
            }
            Iterator<ts2> it = this.f2213d.iterator();
            while (it.hasNext()) {
                ((q7m) ((ts2) it.next())).setTimeStamp(this.f2214e);
            }
            CopyOnWriteArrayList<ts2> copyOnWriteArrayList = this.f2215f;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && this.f2217i) {
                doDestroyFilters();
            }
            super.newTextureReady(i, mcjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p003l.q7m
    public void setTimeStamp(long j) {
        this.f2214e = j;
    }
}
