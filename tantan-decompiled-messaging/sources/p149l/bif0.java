package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class bif0 extends zhf0 implements r7m {

    /* JADX INFO: renamed from: J */
    private List<us2> f75750J;

    /* JADX INFO: renamed from: K */
    private List<us2> f75751K;

    /* JADX INFO: renamed from: L */
    private long f75752L;

    /* JADX INFO: renamed from: M */
    private CopyOnWriteArrayList<us2> f75753M;

    /* JADX INFO: renamed from: N */
    private List<us2> f75754N;

    /* JADX INFO: renamed from: O */
    private boolean f75755O;

    public bif0(List<us2> list) {
        super(list);
        this.f75753M = new CopyOnWriteArrayList<>();
        this.f75755O = true;
        this.f75750J = new ArrayList(list);
        if (this.f75751K == null) {
            this.f75751K = new ArrayList();
        }
        for (us2 us2Var : this.f75750J) {
            if (us2Var instanceof r7m) {
                this.f75751K.add(us2Var);
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m102032Y() {
        Iterator<us2> it = this.f75753M.iterator();
        while (it.hasNext()) {
            it.next().mo102038f();
        }
        this.f75753M.clear();
    }

    /* JADX INFO: renamed from: a0 */
    private void m102033a0(List<us2> list) {
        List<us2> list2 = this.f75750J;
        if (list2 != null && list2.size() > 0) {
            for (us2 us2Var : this.f75750J) {
                m218171U(us2Var);
                m218172V(us2Var);
                m218170T(us2Var);
                us2Var.m158946D();
                CopyOnWriteArrayList<us2> copyOnWriteArrayList = this.f75753M;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(us2Var);
                }
            }
        }
        List<us2> list3 = this.f75751K;
        if (list3 != null) {
            list3.clear();
        }
        this.f75750J = new ArrayList(list);
        if (list.size() > 0) {
            us2 us2Var2 = list.get(0);
            us2 us2Var3 = list.get(list.size() - 1);
            m218168R(us2Var2);
            us2 us2Var4 = null;
            for (int i = 0; i <= list.size() - 1; i++) {
                us2 us2Var5 = list.get(i);
                us2Var5.m158946D();
                if (us2Var4 != null) {
                    us2Var4.m158945C(list.get(i));
                }
                if (i > 0 && i < list.size() - 1) {
                    m218167Q(us2Var5);
                }
                us2Var4 = list.get(i);
            }
            us2Var3.m158945C(this);
            m218169S(us2Var3);
        }
        for (us2 us2Var6 : this.f75750J) {
            if (us2Var6 instanceof r7m) {
                this.f75751K.add(us2Var6);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public synchronized void m102034W(us2 us2Var) {
        synchronized (m158947I()) {
            if (us2Var != null) {
                try {
                    List<us2> list = this.f75750J;
                    if (list != null) {
                        if (list.size() > 0) {
                            List<us2> listM218166P = m218166P();
                            if (listM218166P.size() == 1) {
                                us2 us2Var2 = listM218166P.get(0);
                                m218172V(us2Var2);
                                m218167Q(us2Var2);
                                us2Var2.m158948J().clear();
                                us2Var2.m158945C(us2Var);
                                us2Var.m158945C(this);
                                m218169S(us2Var);
                                this.f75750J.add(us2Var);
                            }
                        } else {
                            m218168R(us2Var);
                            us2Var.m158945C(this);
                            m218169S(us2Var);
                            this.f75750J.add(us2Var);
                        }
                        List<us2> list2 = this.f75751K;
                        if (list2 != null) {
                            list2.clear();
                        }
                        for (us2 us2Var3 : this.f75750J) {
                            if (us2Var3 instanceof r7m) {
                                this.f75751K.add(us2Var3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public synchronized void m102035X(us2 us2Var) {
        synchronized (m158947I()) {
            try {
                if (this.f75750J.size() <= 0 || us2Var == null) {
                    m218168R(us2Var);
                    us2Var.m158945C(this);
                    m218169S(us2Var);
                    this.f75750J.add(0, us2Var);
                } else {
                    List<us2> listM218165O = m218165O();
                    if (listM218165O.size() == 1) {
                        us2 us2Var2 = listM218165O.get(0);
                        m218171U(us2Var2);
                        m218168R(us2Var);
                        us2Var.m158948J().clear();
                        us2Var.m158945C(us2Var2);
                        m218167Q(us2Var2);
                        this.f75750J.add(0, us2Var);
                    }
                }
                List<us2> list = this.f75751K;
                if (list != null) {
                    list.clear();
                }
                for (us2 us2Var3 : this.f75750J) {
                    if (us2Var3 instanceof r7m) {
                        this.f75751K.add(us2Var3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public List<us2> m102036Z() {
        return this.f75750J;
    }

    @Override // p149l.zdk, p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public synchronized void mo102037c(int i, ncj ncjVar, boolean z) {
        try {
            List<us2> list = this.f75754N;
            if (list != null) {
                m102033a0(list);
                this.f75754N = null;
            }
            Iterator<us2> it = this.f75751K.iterator();
            while (it.hasNext()) {
                ((r7m) ((us2) it.next())).setTimeStamp(this.f75752L);
            }
            CopyOnWriteArrayList<us2> copyOnWriteArrayList = this.f75753M;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && this.f75755O) {
                m102032Y();
            }
            super.mo102037c(i, ncjVar, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.zdk, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public synchronized void mo102038f() {
        try {
            super.mo102038f();
            CopyOnWriteArrayList<us2> copyOnWriteArrayList = this.f75753M;
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                m102032Y();
            }
            List<us2> list = this.f75750J;
            if (list != null && list.size() > 0) {
                this.f75750J.clear();
                this.f75750J = null;
            }
            List<us2> list2 = this.f75751K;
            if (list2 != null && list2.size() > 0) {
                this.f75751K.clear();
                this.f75751K = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.r7m
    public void setTimeStamp(long j) {
        this.f75752L = j;
    }
}
