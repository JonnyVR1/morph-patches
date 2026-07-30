package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class jqf0 extends hqf0 implements gam {

    /* JADX INFO: renamed from: c */
    private List<jt2> f122206c;

    /* JADX INFO: renamed from: d */
    private List<jt2> f122207d;

    /* JADX INFO: renamed from: e */
    private long f122208e;

    /* JADX INFO: renamed from: f */
    private CopyOnWriteArrayList<jt2> f122209f;

    /* JADX INFO: renamed from: g */
    private List<jt2> f122210g;

    /* JADX INFO: renamed from: i */
    private boolean f122211i;

    public jqf0(List<jt2> list) {
        super(list);
        this.f122209f = new CopyOnWriteArrayList<>();
        this.f122211i = true;
        this.f122206c = list;
        if (this.f122207d == null) {
            this.f122207d = new ArrayList();
        }
        for (jt2 jt2Var : this.f122206c) {
            if (jt2Var instanceof gam) {
                this.f122207d.add(jt2Var);
            }
        }
    }

    /* JADX INFO: renamed from: S1 */
    private void m146576S1(List<jt2> list) {
        List<jt2> list2 = this.f122206c;
        if (list2 != null && list2.size() > 0) {
            for (jt2 jt2Var : this.f122206c) {
                removeInitialFilter(jt2Var);
                removeTerminalFilter(jt2Var);
                removeFilter(jt2Var);
                jt2Var.clearTarget();
                CopyOnWriteArrayList<jt2> copyOnWriteArrayList = this.f122209f;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(jt2Var);
                }
            }
        }
        List<jt2> list3 = this.f122207d;
        if (list3 != null) {
            list3.clear();
        }
        this.f122206c = list;
        if (list.size() > 0) {
            jt2 jt2Var2 = list.get(0);
            jt2 jt2Var3 = list.get(list.size() - 1);
            registerInitialFilter(jt2Var2);
            jt2 jt2Var4 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                jt2 jt2Var5 = list.get(i);
                jt2Var5.clearTarget();
                if (jt2Var4 != null) {
                    jt2Var4.addTarget(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    registerFilter(jt2Var5);
                }
                jt2Var4 = list.get(i);
            }
            jt2Var3.addTarget(this);
            registerTerminalFilter(jt2Var3);
        }
        for (jt2 jt2Var6 : this.f122206c) {
            if (jt2Var6 instanceof gam) {
                this.f122207d.add(jt2Var6);
            }
        }
    }

    private void doDestroyFilters() {
        Iterator<jt2> it = this.f122209f.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.f122209f.clear();
    }

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m146577Q1(boolean z) {
        synchronized (getFilters()) {
            this.f122211i = z;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m146578R1(List<jt2> list) {
        if (list != null) {
            if (list.size() > 0) {
                this.f122210g = list;
            }
        }
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        try {
            super.destroy();
            CopyOnWriteArrayList<jt2> copyOnWriteArrayList = this.f122209f;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                doDestroyFilters();
            }
            List<jt2> list = this.f122206c;
            if (list != null && list.size() > 0) {
                this.f122206c.clear();
                this.f122206c = null;
            }
            List<jt2> list2 = this.f122207d;
            if (list2 != null && list2.size() > 0) {
                this.f122207d.clear();
                this.f122207d = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public List<jt2> getFilters() {
        return this.f122206c;
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public synchronized void newTextureReady(int i, gfj gfjVar, boolean z) {
        try {
            List<jt2> list = this.f122210g;
            if (list != null) {
                m146576S1(list);
                this.f122210g = null;
            }
            Iterator<jt2> it = this.f122207d.iterator();
            while (it.hasNext()) {
                ((gam) ((jt2) it.next())).setTimeStamp(this.f122208e);
            }
            CopyOnWriteArrayList<jt2> copyOnWriteArrayList = this.f122209f;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && this.f122211i) {
                doDestroyFilters();
            }
            super.newTextureReady(i, gfjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        this.f122208e = j;
    }
}
