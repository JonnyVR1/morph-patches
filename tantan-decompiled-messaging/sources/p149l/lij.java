package p149l;

import android.text.TextUtils;
import com.immomo.downloader.DownloadManager;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.task.C3804c;
import immomo.com.mklibrary.core.offline.gameres.UnzipErrorException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lij {

    /* JADX INFO: renamed from: b */
    private static volatile lij f128214b;

    /* JADX INFO: renamed from: a */
    private List<String> f128215a = new ArrayList();

    /* JADX INFO: renamed from: l.lij$b */
    public class RunnableC18228b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f128221a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ kij f128222b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f128223c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f128224d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ uhj f128225e;

        public RunnableC18228b(String str, kij kijVar, String str2, boolean z, uhj uhjVar) {
            this.f128221a = str;
            this.f128222b = kijVar;
            this.f128223c = str2;
            this.f128224d = z;
            this.f128225e = uhjVar;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            File file = new File(this.f128221a);
            try {
                lij.this.m149907f(file, this.f128222b);
                lij.this.m149913o(this.f128223c, this.f128222b, file, this.f128224d, this.f128225e);
                this.f128225e.mo182484d(this.f128223c, 1);
            } catch (UnzipErrorException e) {
                this.f128225e.mo182483c(this.f128223c, 1, e);
            } catch (Exception e2) {
                this.f128225e.mo182483c(this.f128223c, 0, e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m149907f(File file, kij kijVar) throws Throwable {
        if (TextUtils.equals(kijVar.f123349e, pgw.m168921e(file))) {
            return;
        }
        file.delete();
        qkq0.m175383a("check file md5 failed!");
    }

    /* JADX INFO: renamed from: h */
    public static lij m149908h() {
        if (f128214b == null) {
            synchronized (lij.class) {
                try {
                    if (f128214b == null) {
                        f128214b = new lij();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f128214b;
    }

    /* JADX INFO: renamed from: i */
    private String m149909i(String str) {
        return b0g0.m99775h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m149910l(String str, q8e q8eVar, kij kijVar, boolean z, uhj uhjVar) {
        if (TextUtils.isEmpty(str) || q8eVar == null || uhjVar == null) {
            return;
        }
        this.f128215a.remove(m149909i(kijVar.f123346b));
        String strM173406u = q8eVar.m173406u();
        if (TextUtils.isEmpty(strM173406u)) {
            uhjVar.mo182483c(str, 0, new NullPointerException("savePath is null"));
        } else {
            C3804c.m18444d(2, new RunnableC18228b(strM173406u, kijVar, str, z, uhjVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m149911m(String str, Exception exc, uhj uhjVar) {
        if (TextUtils.isEmpty(str) || uhjVar == null) {
            return;
        }
        this.f128215a.remove(str);
        uhjVar.mo182483c(str, 0, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m149912n(String str, uhj uhjVar) {
        if (TextUtils.isEmpty(str) || uhjVar == null) {
            return;
        }
        uhjVar.mo182481a(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m149913o(String str, kij kijVar, File file, boolean z, uhj uhjVar) throws Throwable {
        File fileM154673a = mij.m154673a(str, kijVar);
        if (!mpj0.m155817f(str, file, fileM154673a.getAbsolutePath(), true, uhjVar)) {
            FileUtil.m18406c(fileM154673a);
            file.delete();
            throw new UnzipErrorException("unzip file " + file + " failed.");
        }
        if (kijVar.m146092a()) {
            m149917k(fileM154673a);
        }
        if (z) {
            mij.m154684l(str, kijVar, true);
        } else {
            mij.m154683k(str, kijVar);
        }
        file.delete();
    }

    /* JADX INFO: renamed from: p */
    private void m149914p(String str, String str2, kij kijVar, boolean z, boolean z2, uhj uhjVar) {
        if (TextUtils.isEmpty(kijVar.f123346b) || kijVar.f123346b == null) {
            if (uhjVar != null) {
                uhjVar.mo182483c(str, 0, new NullPointerException("url is null"));
                return;
            }
            return;
        }
        q8e q8eVar = new q8e();
        String strM149909i = m149909i(kijVar.f123346b);
        this.f128215a.add(strM149909i);
        q8eVar.f153161a = strM149909i;
        q8eVar.f153169i = 2;
        q8eVar.f153163c = kijVar.f123346b;
        q8eVar.f153179s = false;
        q8eVar.f153172l = str2;
        q8eVar.f153160C = z2;
        DownloadManager.m18308r().m18320f(q8eVar, false, new C18227a(uhjVar, str, kijVar, z));
    }

    /* JADX INFO: renamed from: g */
    public void m149915g(String str, kij kijVar, boolean z, boolean z2, uhj uhjVar) throws Throwable {
        if (kijVar == null || !kijVar.m146093b()) {
            if (uhjVar != null) {
                uhjVar.mo182483c(str, 0, new IllegalArgumentException("resource is null or not valid"));
                return;
            }
            return;
        }
        File fileM154675c = mij.m154675c(str, kijVar.f123351g);
        String strM154681i = mij.m154681i(kijVar.f123346b);
        if (TextUtils.isEmpty(strM154681i)) {
            if (uhjVar != null) {
                uhjVar.mo182483c(str, 0, new IllegalArgumentException("cannot get name by url: " + kijVar.f123346b));
                return;
            }
            return;
        }
        if (m149916j(m149909i(kijVar.f123346b))) {
            return;
        }
        File file = new File(fileM154675c, strM154681i);
        file.delete();
        if (z) {
            mij.m154684l(str, kijVar, false);
        }
        m149914p(str, file.getAbsolutePath(), kijVar, z, z2, uhjVar);
    }

    /* JADX INFO: renamed from: j */
    public boolean m149916j(String str) {
        return (TextUtils.isEmpty(str) || DownloadManager.m18308r().m18322l(str) == null) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public void m149917k(File file) {
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    file2.renameTo(mij.m154677e(absolutePath, file2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.lij$a */
    public class C18227a implements DownloadManager.InterfaceC3748a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ uhj f128216a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f128217b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ kij f128218c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f128219d;

        public C18227a(uhj uhjVar, String str, kij kijVar, boolean z) {
            this.f128216a = uhjVar;
            this.f128217b = str;
            this.f128218c = kijVar;
            this.f128219d = z;
        }

        @Override // com.immomo.downloader.DownloadManager.InterfaceC3748a
        /* JADX INFO: renamed from: a */
        public void mo18328a(DownloadManager downloadManager, q8e q8eVar, int i) {
            lij.this.m149911m(this.f128217b, new IllegalStateException("download failed"), this.f128216a);
        }

        @Override // com.immomo.downloader.DownloadManager.InterfaceC3748a
        /* JADX INFO: renamed from: b */
        public void mo18329b(DownloadManager downloadManager, q8e q8eVar) {
            lij.this.m149910l(this.f128217b, q8eVar, this.f128218c, this.f128219d, this.f128216a);
        }

        @Override // com.immomo.downloader.DownloadManager.InterfaceC3748a
        /* JADX INFO: renamed from: d */
        public void mo18331d(DownloadManager downloadManager, q8e q8eVar) {
            uhj uhjVar;
            if (q8eVar == null || (uhjVar = this.f128216a) == null) {
                return;
            }
            uhjVar.mo182482b(this.f128217b, 0, 0, q8eVar.m173411z(), q8eVar.m173393f());
        }

        @Override // com.immomo.downloader.DownloadManager.InterfaceC3748a
        /* JADX INFO: renamed from: f */
        public void mo18333f(DownloadManager downloadManager, q8e q8eVar) {
            lij.this.m149912n(this.f128217b, this.f128216a);
        }

        @Override // com.immomo.downloader.DownloadManager.InterfaceC3748a
        /* JADX INFO: renamed from: c */
        public void mo18330c(DownloadManager downloadManager, q8e q8eVar) {
        }

        @Override // com.immomo.downloader.DownloadManager.InterfaceC3748a
        /* JADX INFO: renamed from: e */
        public void mo18332e(DownloadManager downloadManager, q8e q8eVar) {
        }
    }
}
