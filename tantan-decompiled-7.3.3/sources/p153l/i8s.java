package p153l;

import com.cosmos.mdlog.MDLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class i8s {

    /* JADX INFO: renamed from: a */
    private HashMap<String, Integer> f113367a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private InterfaceC17666b f113368b;

    /* JADX INFO: renamed from: l.i8s$a */
    public class RunnableC17665a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f113369a;

        public RunnableC17665a(String str) {
            this.f113369a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i8s.this.f113368b != null) {
                i8s.this.f113368b.mo139027b(this.f113369a);
            }
        }
    }

    /* JADX INFO: renamed from: l.i8s$b */
    public interface InterfaceC17666b {
        /* JADX INFO: renamed from: b */
        void mo139027b(String str);
    }

    /* JADX INFO: renamed from: d */
    private void m139023d(String str) {
        nsw.m164645a(new RunnableC17665a(str));
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m139024b(String str) {
        try {
            Integer num = this.f113367a.get(str);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                iIntValue--;
            }
            this.f113367a.put(str, Integer.valueOf(iIntValue));
            MDLog.m7445e("LiveDetectorCounter", str + " ...计数器... " + iIntValue);
            if (iIntValue == 0) {
                m139023d(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m139025c(String str) {
        try {
            Integer num = this.f113367a.get(str);
            this.f113367a.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m139026e(InterfaceC17666b interfaceC17666b) {
        this.f113368b = interfaceC17666b;
    }
}
