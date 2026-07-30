package p149l;

import Sudabstract.Sudfor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.eclipse.jetty.http.HttpHeaders;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class k8g0 {

    /* JADX INFO: renamed from: u */
    public static final String f121811u = "SudGIP ".concat(k8g0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final slg0 f121812a;

    /* JADX INFO: renamed from: b */
    public final long f121813b;

    /* JADX INFO: renamed from: c */
    public final long f121814c;

    /* JADX INFO: renamed from: d */
    public final String f121815d;

    /* JADX INFO: renamed from: e */
    public final String f121816e;

    /* JADX INFO: renamed from: g */
    public final gig0 f121818g;

    /* JADX INFO: renamed from: i */
    public hjg0 f121820i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f121821j;

    /* JADX INFO: renamed from: k */
    public final WeakReference f121822k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f121823l;

    /* JADX INFO: renamed from: m */
    public jqg0 f121824m;

    /* JADX INFO: renamed from: n */
    public wrg0 f121825n;

    /* JADX INFO: renamed from: o */
    public final tog0 f121826o;

    /* JADX INFO: renamed from: p */
    public long f121827p;

    /* JADX INFO: renamed from: q */
    public long f121828q;

    /* JADX INFO: renamed from: r */
    public long f121829r;

    /* JADX INFO: renamed from: s */
    public int f121830s;

    /* JADX INFO: renamed from: t */
    public final int f121831t;

    /* JADX INFO: renamed from: f */
    public int f121817f = 1;

    /* JADX INFO: renamed from: h */
    public PkgDownloadStatus f121819h = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;

    public k8g0(gig0 gig0Var, long j, String str, String str2, vqg0 vqg0Var) {
        ArrayList arrayList = new ArrayList();
        this.f121821j = arrayList;
        this.f121823l = new ArrayList();
        this.f121827p = 0L;
        this.f121828q = 0L;
        this.f121831t = 3;
        this.f121818g = gig0Var;
        yig0 yig0Var = new yig0(gig0Var.f102896d, str, str2);
        yig0Var.f198493k = 300;
        yig0Var.f198487e = 10;
        yig0Var.f198488f = 8192;
        yig0Var.f198489g = 32768;
        yig0Var.f198490h = 65536;
        yig0Var.f198491i = 2000;
        yig0Var.f198497o = 1;
        yig0Var.f198492j = true;
        yig0Var.f198495m = false;
        yig0Var.m214904a(HttpHeaders.REFERER, dog0.m112806b(yog0.m215499b(UUID.randomUUID().toString())));
        yig0Var.m214904a("sud-device-brand", ghg0.m126182a(hig0.m131254a()));
        yig0Var.m214904a("sud-os-version", hig0.m131257d());
        yig0Var.m214904a("sud-device-id", hig0.m131256c());
        tog0 tog0Var = new tog0();
        this.f121826o = tog0Var;
        if (yig0Var.f198486d == null) {
            yig0Var.f198486d = new HashMap();
        }
        yig0Var.f198486d.put(tog0.class, tog0Var);
        this.f121812a = new slg0(yig0Var.f198483a, yig0Var.f198484b, yig0Var.f198487e, yig0Var.f198488f, yig0Var.f198489g, yig0Var.f198490h, yig0Var.f198491i, yig0Var.f198492j, yig0Var.f198493k, yig0Var.f198485c, yig0Var.f198494l, yig0Var.f198495m, yig0Var.f198496n, yig0Var.f198497o, yig0Var.f198486d);
        arrayList.add(gig0Var.f102894b);
        this.f121813b = gig0Var.f102895c;
        this.f121814c = j;
        this.f121815d = str;
        this.f121816e = str2;
        this.f121822k = new WeakReference(vqg0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m144935a() {
        wrg0 wrg0Var = this.f121825n;
        if (wrg0Var != null) {
            wrg0Var.f187795a.clear();
            this.f121825n.cancel();
            this.f121825n = null;
        }
        c6g0 c6g0Var = (c6g0) this.f121822k.get();
        if (c6g0Var != null) {
            vqg0 vqg0Var = (vqg0) c6g0Var;
            LogUtils.file("SudDownloadManager", "onTaskEnd:" + this.f121813b);
            SudLogger.m221565d(t8g0.f168916d, "onTaskEnd:" + this.f121813b);
            vqg0Var.f182648a.f168917a.remove(this);
            vqg0Var.f182648a.m187554c();
        }
        this.f121820i = null;
        this.f121823l.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m144936b(int i, String str) {
        LogUtils.file("SudDownloadTask", "onDownloadFailure mgId:" + this.f121813b + " listenerSize:" + this.f121823l.size());
        SudLogger.m221565d(f121811u, "onDownloadFailure mgId:" + this.f121813b + " listenerSize:" + this.f121823l.size());
        ArrayList arrayList = this.f121823l;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o7g0) obj).mo111016e(i, str, this.f121826o);
        }
        m144935a();
    }

    /* JADX INFO: renamed from: c */
    public final void m144937c(o7g0 o7g0Var) {
        if (o7g0Var == null || this.f121823l.contains(o7g0Var)) {
            return;
        }
        this.f121823l.add(o7g0Var);
        this.f121821j.add(o7g0Var.mo111013b());
        PkgDownloadStatus pkgDownloadStatus = this.f121819h;
        if (pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE) {
            o7g0Var.mo111012a();
            o7g0Var.mo111014c(this.f121828q, this.f121827p, this.f121819h);
            o7g0Var.mo111015d(this.f121828q, this.f121827p);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m144938d(PkgDownloadStatus pkgDownloadStatus) {
        long j = this.f121828q;
        long j2 = this.f121827p;
        ArrayList arrayList = this.f121823l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o7g0) arrayList.get(i)).mo111014c(j, j2, pkgDownloadStatus);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m144939e() {
        if (m144942h()) {
            return;
        }
        LogUtils.file("SudDownloadTask", "download:" + this.f121819h + "  mgId:" + this.f121813b + "  url:" + this.f121818g.f102896d + "  parentPath:" + this.f121815d + "  fileName:" + this.f121816e);
        String str = f121811u;
        StringBuilder sb = new StringBuilder("download:");
        sb.append(this.f121819h);
        sb.append("  mgId:");
        sb.append(this.f121813b);
        SudLogger.m221565d(str, sb.toString());
        this.f121817f = 1;
        PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_STARTED;
        this.f121819h = pkgDownloadStatus;
        this.f121829r = System.currentTimeMillis();
        m144938d(pkgDownloadStatus);
        jqg0 jqg0Var = this.f121824m;
        if (jqg0Var != null) {
            jqg0Var.f119279b.clear();
        }
        jqg0 jqg0Var2 = new jqg0(this);
        this.f121824m = jqg0Var2;
        this.f121812a.m184803m(jqg0Var2);
        wrg0 wrg0Var = this.f121825n;
        if (wrg0Var != null) {
            wrg0Var.f187795a.clear();
            this.f121825n.cancel();
            this.f121825n = null;
        }
        wrg0 wrg0Var2 = new wrg0(this);
        this.f121825n = wrg0Var2;
        wrg0Var2.start();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k8g0.class == obj.getClass() && this.f121814c == ((k8g0) obj).f121814c;
    }

    /* JADX INFO: renamed from: f */
    public final void m144940f() {
        LogUtils.file("SudDownloadTask", "cancelDownload mgId:" + this.f121813b + "  status:" + this.f121819h);
        SudLogger.m221565d(f121811u, "cancelDownload mgId:" + this.f121813b + "  status:" + this.f121819h);
        if (this.f121819h == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE) {
            this.f121817f = 2;
            this.f121812a.m184804n();
            m144938d(PkgDownloadStatus.PKG_DOWNLOAD_CANCELED);
            this.f121823l.clear();
            return;
        }
        if (m144942h()) {
            this.f121817f = 2;
            this.f121812a.m184804n();
        }
        PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_CANCELED;
        this.f121819h = pkgDownloadStatus;
        this.f121829r = System.currentTimeMillis();
        m144938d(pkgDownloadStatus);
        m144935a();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m144941g() {
        ArrayList arrayList = this.f121821j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Sudfor sudfor = (Sudfor) obj;
            if (sudfor == Sudfor.LoadMGPackageCore || sudfor == Sudfor.LoadMGPackageGamePackage) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m144942h() {
        PkgDownloadStatus pkgDownloadStatus = this.f121819h;
        return pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_STARTED || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f121814c));
    }
}
