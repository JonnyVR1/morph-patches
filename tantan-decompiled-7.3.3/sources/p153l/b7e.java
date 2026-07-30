package p153l;

import com.cosmos.mdlog.MDLog;
import com.immomo.components.interfaces.IProcessOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class b7e extends quf implements ham {

    /* JADX INFO: renamed from: H */
    private CopyOnWriteArrayList<kt2> f75279H = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: I */
    private CopyOnWriteArrayList<kt2> f75280I = new CopyOnWriteArrayList<>();

    public b7e(List<kt2> list) {
        m102833W(list);
    }

    /* JADX INFO: renamed from: W */
    private void m102833W(List<kt2> list) {
        int size = list.size();
        if (size > 0) {
            int i = 0;
            kt2 kt2Var = list.get(0);
            int i2 = size - 1;
            kt2 kt2Var2 = list.get(i2);
            m172256R(kt2Var);
            kt2 kt2Var3 = null;
            while (i < size) {
                kt2 kt2Var4 = list.get(i);
                kt2Var4.m134801J().clear();
                if (kt2Var3 != null) {
                    kt2Var3.m134795C(list.get(i));
                }
                if (i > 0 && i < i2) {
                    m172255Q(kt2Var4);
                }
                i++;
                kt2Var3 = kt2Var4;
            }
            kt2Var2.m134795C(this);
            m172257S(kt2Var2);
            this.f75279H.addAll(list);
        }
    }

    /* JADX INFO: renamed from: X */
    private void m102834X() {
        Iterator<kt2> it = this.f75280I.iterator();
        while (it.hasNext()) {
            it.next().mo96080f();
        }
        this.f75280I.clear();
    }

    @Override // p153l.pgk, p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        synchronized (m134800I()) {
            try {
                super.mo96079c(i, hfjVar, z);
                if (this.f75280I.size() > 0) {
                    m102834X();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.ruf
    /* JADX INFO: renamed from: d */
    public void mo102835d(IProcessOutput iProcessOutput) {
        synchronized (m134800I()) {
            try {
                ArrayList arrayList = new ArrayList(this.f75279H);
                for (int i = 0; i < arrayList.size(); i++) {
                    Object obj = (kt2) arrayList.get(i);
                    if (obj instanceof ruf) {
                        ((ruf) obj).mo102835d(iProcessOutput);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.pgk, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public synchronized void mo96080f() {
        try {
            super.mo96080f();
            if (this.f75280I.size() > 0) {
                m102834X();
            }
            this.f75279H.clear();
            MDLog.m7445e("MMEdiaSDK", "sigline group filter sdstrroy !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ham
    public synchronized void setTimeStamp(long j) {
        synchronized (m134800I()) {
            try {
                for (Object obj : this.f75279H) {
                    if (obj instanceof ham) {
                        ((ham) obj).setTimeStamp(j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
