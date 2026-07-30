package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.resdownloader.log.MLog;

/* JADX INFO: loaded from: classes7.dex */
public class ioh0 {

    /* JADX INFO: renamed from: a */
    private final Object f116151a = new Object();

    /* JADX INFO: renamed from: b */
    private boolean f116152b = true;

    /* JADX INFO: renamed from: c */
    private boolean f116153c = false;

    /* JADX INFO: renamed from: d */
    private InterfaceC17761c f116154d;

    /* JADX INFO: renamed from: l.ioh0$a */
    public class C17759a implements eae.InterfaceC16743b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f116155a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C17760b f116156b;

        public C17759a(String str, C17760b c17760b) {
            this.f116155a = str;
            this.f116156b = c17760b;
        }

        @Override // p153l.eae.InterfaceC16743b
        /* JADX INFO: renamed from: a */
        public void mo120045a(String str) {
            MLog.m20458d("SDKResource", "onDownloadFailed $s" + str, this.f116155a);
            this.f116156b.f116159b = str;
            ioh0.this.m141305c(false);
        }

        @Override // p153l.eae.InterfaceC16743b
        /* JADX INFO: renamed from: b */
        public void mo120046b() {
            MLog.m20458d("SDKResource", "onDownloadSuccess", this.f116155a);
            ioh0.this.m141305c(true);
        }

        @Override // p153l.eae.InterfaceC16743b
        public void onDownloading(int i) {
            MLog.m20458d("SDKResource", "onDownloading %d", Integer.valueOf(i));
            if (ioh0.this.f116154d != null) {
                ioh0.this.f116154d.mo141308a(i, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
        }
    }

    /* JADX INFO: renamed from: l.ioh0$b */
    public static class C17760b {

        /* JADX INFO: renamed from: a */
        public boolean f116158a;

        /* JADX INFO: renamed from: b */
        public String f116159b;

        /* JADX INFO: renamed from: c */
        public String f116160c;
    }

    /* JADX INFO: renamed from: l.ioh0$c */
    public interface InterfaceC17761c {
        /* JADX INFO: renamed from: a */
        void mo141308a(float f, double d);
    }

    public ioh0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m141305c(boolean z) {
        synchronized (this.f116151a) {
            this.f116152b = false;
            this.f116153c = z;
            this.f116151a.notify();
        }
    }

    /* JADX INFO: renamed from: d */
    public C17760b m141306d(String str, String str2, String str3) throws InterruptedException {
        this.f116152b = true;
        this.f116153c = false;
        C17760b c17760b = new C17760b();
        MLog.m20458d("SDKResource", "start download %s", str);
        eae.m120043d().m120044c(str, str2, new C17759a(str, c17760b));
        synchronized (this.f116151a) {
            while (this.f116152b) {
                try {
                    this.f116151a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c17760b.f116158a = this.f116153c;
        c17760b.f116160c = "下载异常";
        return c17760b;
    }

    /* JADX INFO: renamed from: e */
    public void m141307e(InterfaceC17761c interfaceC17761c) {
        this.f116154d = interfaceC17761c;
    }
}
