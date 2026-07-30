package p149l;

import com.cosmos.mdlog.MDLog;
import com.immomo.components.interfaces.IProcessOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class n5e extends ctf implements r7m {

    /* JADX INFO: renamed from: H */
    private CopyOnWriteArrayList<us2> f137206H = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: I */
    private CopyOnWriteArrayList<us2> f137207I = new CopyOnWriteArrayList<>();

    public n5e(List<us2> list) {
        m157989W(list);
    }

    /* JADX INFO: renamed from: W */
    private void m157989W(List<us2> list) {
        int size = list.size();
        if (size > 0) {
            int i = 0;
            us2 us2Var = list.get(0);
            int i2 = size - 1;
            us2 us2Var2 = list.get(i2);
            m218168R(us2Var);
            us2 us2Var3 = null;
            while (i < size) {
                us2 us2Var4 = list.get(i);
                us2Var4.m158948J().clear();
                if (us2Var3 != null) {
                    us2Var3.m158945C(list.get(i));
                }
                if (i > 0 && i < i2) {
                    m218167Q(us2Var4);
                }
                i++;
                us2Var3 = us2Var4;
            }
            us2Var2.m158945C(this);
            m218169S(us2Var2);
            this.f137206H.addAll(list);
        }
    }

    /* JADX INFO: renamed from: X */
    private void m157990X() {
        Iterator<us2> it = this.f137207I.iterator();
        while (it.hasNext()) {
            it.next().mo102038f();
        }
        this.f137207I.clear();
    }

    @Override // p149l.zdk, p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        synchronized (m158947I()) {
            try {
                super.mo102037c(i, ncjVar, z);
                if (this.f137207I.size() > 0) {
                    m157990X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo104314d(IProcessOutput iProcessOutput) {
        synchronized (m158947I()) {
            try {
                ArrayList arrayList = new ArrayList(this.f137206H);
                for (int i = 0; i < arrayList.size(); i++) {
                    kcj kcjVar = (us2) arrayList.get(i);
                    if (kcjVar instanceof dtf) {
                        ((dtf) kcjVar).mo104314d(iProcessOutput);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.zdk, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public synchronized void mo102038f() {
        try {
            super.mo102038f();
            if (this.f137207I.size() > 0) {
                m157990X();
            }
            this.f137206H.clear();
            MDLog.m7391e("MMEdiaSDK", "sigline group filter sdstrroy !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.r7m
    public synchronized void setTimeStamp(long j) {
        synchronized (m158947I()) {
            try {
                for (kcj kcjVar : this.f137206H) {
                    if (kcjVar instanceof r7m) {
                        ((r7m) kcjVar).setTimeStamp(j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
