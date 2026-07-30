package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class kqf0 extends iqf0 implements ham {

    /* JADX INFO: renamed from: J */
    private List<kt2> f128218J;

    /* JADX INFO: renamed from: K */
    private List<kt2> f128219K;

    /* JADX INFO: renamed from: L */
    private long f128220L;

    /* JADX INFO: renamed from: M */
    private CopyOnWriteArrayList<kt2> f128221M;

    /* JADX INFO: renamed from: N */
    private List<kt2> f128222N;

    /* JADX INFO: renamed from: O */
    private boolean f128223O;

    public kqf0(List<kt2> list) {
        super(list);
        this.f128221M = new CopyOnWriteArrayList<>();
        this.f128223O = true;
        this.f128218J = new ArrayList(list);
        if (this.f128219K == null) {
            this.f128219K = new ArrayList();
        }
        for (kt2 kt2Var : this.f128218J) {
            if (kt2Var instanceof ham) {
                this.f128219K.add(kt2Var);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m150858Y() {
        Iterator<kt2> it = this.f128221M.iterator();
        while (it.hasNext()) {
            it.next().mo96080f();
        }
        this.f128221M.clear();
    }

    /* JADX INFO: renamed from: a0 */
    private void m150859a0(List<kt2> list) {
        List<kt2> list2 = this.f128218J;
        if (list2 != null && list2.size() > 0) {
            for (kt2 kt2Var : this.f128218J) {
                m172259U(kt2Var);
                m172260V(kt2Var);
                m172258T(kt2Var);
                kt2Var.m134796D();
                CopyOnWriteArrayList<kt2> copyOnWriteArrayList = this.f128221M;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(kt2Var);
                }
            }
        }
        List<kt2> list3 = this.f128219K;
        if (list3 != null) {
            list3.clear();
        }
        this.f128218J = new ArrayList(list);
        if (list.size() > 0) {
            kt2 kt2Var2 = list.get(0);
            kt2 kt2Var3 = list.get(list.size() - 1);
            m172256R(kt2Var2);
            kt2 kt2Var4 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                kt2 kt2Var5 = list.get(i);
                kt2Var5.m134796D();
                if (kt2Var4 != null) {
                    kt2Var4.m134795C(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    m172255Q(kt2Var5);
                }
                kt2Var4 = list.get(i);
            }
            kt2Var3.m134795C(this);
            m172257S(kt2Var3);
        }
        for (kt2 kt2Var6 : this.f128218J) {
            if (kt2Var6 instanceof ham) {
                this.f128219K.add(kt2Var6);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public synchronized void m150860W(kt2 kt2Var) {
        try {
            synchronized (m134800I()) {
                if (kt2Var != null) {
                    try {
                        List<kt2> list = this.f128218J;
                        if (list != null) {
                            if (list.size() > 0) {
                                List<kt2> listM172254P = m172254P();
                                if (listM172254P.size() == 1) {
                                    kt2 kt2Var2 = listM172254P.get(0);
                                    m172260V(kt2Var2);
                                    m172255Q(kt2Var2);
                                    kt2Var2.m134801J().clear();
                                    kt2Var2.m134795C(kt2Var);
                                    kt2Var.m134795C(this);
                                    m172257S(kt2Var);
                                    this.f128218J.add(kt2Var);
                                }
                            } else {
                                m172256R(kt2Var);
                                kt2Var.m134795C(this);
                                m172257S(kt2Var);
                                this.f128218J.add(kt2Var);
                            }
                            List<kt2> list2 = this.f128219K;
                            if (list2 != null) {
                                list2.clear();
                            }
                            for (kt2 kt2Var3 : this.f128218J) {
                                if (kt2Var3 instanceof ham) {
                                    this.f128219K.add(kt2Var3);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: X */
    public synchronized void m150861X(kt2 kt2Var) {
        synchronized (m134800I()) {
            try {
                if (this.f128218J.size() <= 0 || kt2Var == null) {
                    m172256R(kt2Var);
                    kt2Var.m134795C(this);
                    m172257S(kt2Var);
                    this.f128218J.add(0, kt2Var);
                } else {
                    List<kt2> listM172253O = m172253O();
                    if (listM172253O.size() == 1) {
                        kt2 kt2Var2 = listM172253O.get(0);
                        m172259U(kt2Var2);
                        m172256R(kt2Var);
                        kt2Var.m134801J().clear();
                        kt2Var.m134795C(kt2Var2);
                        m172255Q(kt2Var2);
                        this.f128218J.add(0, kt2Var);
                    }
                }
                List<kt2> list = this.f128219K;
                if (list != null) {
                    list.clear();
                }
                for (kt2 kt2Var3 : this.f128218J) {
                    if (kt2Var3 instanceof ham) {
                        this.f128219K.add(kt2Var3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public List<kt2> m150862Z() {
        return this.f128218J;
    }

    @Override // p153l.pgk, p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public synchronized void mo96079c(int i, hfj hfjVar, boolean z) {
        try {
            List<kt2> list = this.f128222N;
            if (list != null) {
                m150859a0(list);
                this.f128222N = null;
            }
            Iterator<kt2> it = this.f128219K.iterator();
            while (it.hasNext()) {
                ((ham) ((kt2) it.next())).setTimeStamp(this.f128220L);
            }
            CopyOnWriteArrayList<kt2> copyOnWriteArrayList = this.f128221M;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && this.f128223O) {
                m150858Y();
            }
            super.mo96079c(i, hfjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.pgk, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public synchronized void mo96080f() {
        try {
            super.mo96080f();
            CopyOnWriteArrayList<kt2> copyOnWriteArrayList = this.f128221M;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                m150858Y();
            }
            List<kt2> list = this.f128218J;
            if (list != null && list.size() > 0) {
                this.f128218J.clear();
                this.f128218J = null;
            }
            List<kt2> list2 = this.f128219K;
            if (list2 != null && list2.size() > 0) {
                this.f128219K.clear();
                this.f128219K = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ham
    public void setTimeStamp(long j) {
        this.f128220L = j;
    }
}
