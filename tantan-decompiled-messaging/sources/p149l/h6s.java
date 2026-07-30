package p149l;

import com.cosmos.mdlog.MDLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class h6s {

    /* JADX INFO: renamed from: a */
    private HashMap<String, Integer> f106113a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private InterfaceC17234b f106114b;

    /* JADX INFO: renamed from: l.h6s$a */
    public class RunnableC17233a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f106115a;

        public RunnableC17233a(String str) {
            this.f106115a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h6s.this.f106114b != null) {
                h6s.this.f106114b.mo127572b(this.f106115a);
            }
        }
    }

    /* JADX INFO: renamed from: l.h6s$b */
    public interface InterfaceC17234b {
        /* JADX INFO: renamed from: b */
        void mo127572b(String str);
    }

    /* JADX INFO: renamed from: d */
    private void m129522d(String str) {
        opw.m165383a(new RunnableC17233a(str));
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m129523b(String str) {
        try {
            Integer num = this.f106113a.get(str);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                iIntValue--;
            }
            this.f106113a.put(str, Integer.valueOf(iIntValue));
            MDLog.m7391e("LiveDetectorCounter", str + " ...计数器... " + iIntValue);
            if (iIntValue == 0) {
                m129522d(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m129524c(String str) {
        try {
            Integer num = this.f106113a.get(str);
            this.f106113a.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m129525e(InterfaceC17234b interfaceC17234b) {
        this.f106114b = interfaceC17234b;
    }
}
