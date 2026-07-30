package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class a8e extends HandlerThread {

    /* JADX INFO: renamed from: c */
    private static volatile a8e f68037c;

    /* JADX INFO: renamed from: a */
    private Handler f68038a;

    /* JADX INFO: renamed from: b */
    private ArrayList<Runnable> f68039b;

    public a8e(String str) {
        super(str);
        this.f68039b = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public static a8e m95340a() {
        if (f68037c == null) {
            synchronized (a8e.class) {
                try {
                    if (f68037c == null) {
                        f68037c = new a8e("downloadhandler");
                        f68037c.start();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f68037c;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m95341b(Runnable runnable) {
        try {
            Handler handler = this.f68038a;
            if (handler == null) {
                this.f68039b.add(runnable);
            } else {
                handler.post(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m95342c() {
        try {
            Handler handler = this.f68038a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f68039b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.os.HandlerThread
    public synchronized void onLooperPrepared() {
        this.f68038a = new Handler();
        ArrayList arrayList = (ArrayList) this.f68039b.clone();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f68038a.post((Runnable) it.next());
            }
        }
    }

    @Override // android.os.HandlerThread
    public synchronized boolean quit() {
        m95342c();
        return super.quit();
    }

    @Override // android.os.HandlerThread
    public synchronized boolean quitSafely() {
        m95342c();
        return super.quitSafely();
    }
}
