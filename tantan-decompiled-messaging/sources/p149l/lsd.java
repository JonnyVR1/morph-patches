package p149l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class lsd extends ksd {

    /* JADX INFO: renamed from: b */
    public final Object f129845b = new Object();

    /* JADX INFO: renamed from: f */
    public final Runnable f129849f = new RunnableC18313a();

    /* JADX INFO: renamed from: d */
    public ArrayList<ksd.InterfaceC18070a> f129847d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<ksd.InterfaceC18070a> f129848e = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Handler f129846c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.lsd$a */
    public class RunnableC18313a implements Runnable {
        public RunnableC18313a() {
        }

        @Override // java.lang.Runnable
        @MainThread
        public void run() {
            synchronized (lsd.this.f129845b) {
                ArrayList arrayList = lsd.this.f129848e;
                lsd lsdVar = lsd.this;
                lsdVar.f129848e = lsdVar.f129847d;
                lsd.this.f129847d = arrayList;
            }
            int size = lsd.this.f129848e.size();
            int i = 0;
            while (true) {
                lsd lsdVar2 = lsd.this;
                if (i >= size) {
                    lsdVar2.f129848e.clear();
                    return;
                } else {
                    ((ksd.InterfaceC18070a) lsdVar2.f129848e.get(i)).release();
                    i++;
                }
            }
        }
    }

    @Override // p149l.ksd
    @AnyThread
    /* JADX INFO: renamed from: a */
    public void mo147053a(ksd.InterfaceC18070a interfaceC18070a) {
        synchronized (this.f129845b) {
            this.f129847d.remove(interfaceC18070a);
        }
    }

    @Override // p149l.ksd
    @AnyThread
    /* JADX INFO: renamed from: d */
    public void mo147054d(ksd.InterfaceC18070a interfaceC18070a) {
        if (!ksd.m147052c()) {
            interfaceC18070a.release();
            return;
        }
        synchronized (this.f129845b) {
            try {
                if (this.f129847d.contains(interfaceC18070a)) {
                    return;
                }
                this.f129847d.add(interfaceC18070a);
                boolean z = true;
                if (this.f129847d.size() != 1) {
                    z = false;
                }
                if (z) {
                    this.f129846c.post(this.f129849f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
