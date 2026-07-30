package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.resdownloader.log.MLog;

/* JADX INFO: loaded from: classes7.dex */
public class agh0 {

    /* JADX INFO: renamed from: a */
    private final Object f69364a = new Object();

    /* JADX INFO: renamed from: b */
    private boolean f69365b = true;

    /* JADX INFO: renamed from: c */
    private boolean f69366c = false;

    /* JADX INFO: renamed from: d */
    private InterfaceC15613c f69367d;

    /* JADX INFO: renamed from: l.agh0$a */
    public class C15611a implements v8e.InterfaceC20597b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f69368a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C15612b f69369b;

        public C15611a(String str, C15612b c15612b) {
            this.f69368a = str;
            this.f69369b = c15612b;
        }

        @Override // p149l.v8e.InterfaceC20597b
        /* JADX INFO: renamed from: a */
        public void mo96315a(String str) {
            MLog.m19459d("SDKResource", "onDownloadFailed $s" + str, this.f69368a);
            this.f69369b.f69372b = str;
            agh0.this.m96312c(false);
        }

        @Override // p149l.v8e.InterfaceC20597b
        /* JADX INFO: renamed from: b */
        public void mo96316b() {
            MLog.m19459d("SDKResource", "onDownloadSuccess", this.f69368a);
            agh0.this.m96312c(true);
        }

        @Override // p149l.v8e.InterfaceC20597b
        public void onDownloading(int i) {
            MLog.m19459d("SDKResource", "onDownloading %d", Integer.valueOf(i));
            if (agh0.this.f69367d != null) {
                agh0.this.f69367d.mo96317a(i, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
        }
    }

    /* JADX INFO: renamed from: l.agh0$b */
    public static class C15612b {

        /* JADX INFO: renamed from: a */
        public boolean f69371a;

        /* JADX INFO: renamed from: b */
        public String f69372b;

        /* JADX INFO: renamed from: c */
        public String f69373c;
    }

    /* JADX INFO: renamed from: l.agh0$c */
    public interface InterfaceC15613c {
        /* JADX INFO: renamed from: a */
        void mo96317a(float f, double d);
    }

    public agh0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m96312c(boolean z) {
        synchronized (this.f69364a) {
            this.f69365b = false;
            this.f69366c = z;
            this.f69364a.notify();
        }
    }

    /* JADX INFO: renamed from: d */
    public C15612b m96313d(String str, String str2, String str3) throws InterruptedException {
        this.f69365b = true;
        this.f69366c = false;
        C15612b c15612b = new C15612b();
        MLog.m19459d("SDKResource", "start download %s", str);
        v8e.m197403d().m197404c(str, str2, new C15611a(str, c15612b));
        synchronized (this.f69364a) {
            while (this.f69365b) {
                try {
                    this.f69364a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c15612b.f69371a = this.f69366c;
        c15612b.f69373c = "下载异常";
        return c15612b;
    }

    /* JADX INFO: renamed from: e */
    public void m96314e(InterfaceC15613c interfaceC15613c) {
        this.f69367d = interfaceC15613c;
    }
}
