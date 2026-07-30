package p153l;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ztd extends ytd {

    /* JADX INFO: renamed from: b */
    public final Object f205996b = new Object();

    /* JADX INFO: renamed from: f */
    public final Runnable f206000f = new RunnableC21892a();

    /* JADX INFO: renamed from: d */
    public ArrayList<ytd.InterfaceC21682a> f205998d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<ytd.InterfaceC21682a> f205999e = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final Handler f205997c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.ztd$a */
    public class RunnableC21892a implements Runnable {
        public RunnableC21892a() {
        }

        @Override // java.lang.Runnable
        @MainThread
        public void run() {
            synchronized (ztd.this.f205996b) {
                ArrayList arrayList = ztd.this.f205999e;
                ztd ztdVar = ztd.this;
                ztdVar.f205999e = ztdVar.f205998d;
                ztd.this.f205998d = arrayList;
            }
            int size = ztd.this.f205999e.size();
            int i = 0;
            while (true) {
                ztd ztdVar2 = ztd.this;
                if (i >= size) {
                    ztdVar2.f205999e.clear();
                    return;
                } else {
                    ((ytd.InterfaceC21682a) ztdVar2.f205999e.get(i)).release();
                    i++;
                }
            }
        }
    }

    @Override // p153l.ytd
    @AnyThread
    /* JADX INFO: renamed from: a */
    public void mo217303a(ytd.InterfaceC21682a interfaceC21682a) {
        synchronized (this.f205996b) {
            this.f205998d.remove(interfaceC21682a);
        }
    }

    @Override // p153l.ytd
    @AnyThread
    /* JADX INFO: renamed from: d */
    public void mo217304d(ytd.InterfaceC21682a interfaceC21682a) {
        if (!ytd.m217302c()) {
            interfaceC21682a.release();
            return;
        }
        synchronized (this.f205996b) {
            try {
                if (this.f205998d.contains(interfaceC21682a)) {
                    return;
                }
                this.f205998d.add(interfaceC21682a);
                boolean z = true;
                if (this.f205998d.size() != 1) {
                    z = false;
                }
                if (z) {
                    this.f205997c.post(this.f206000f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
