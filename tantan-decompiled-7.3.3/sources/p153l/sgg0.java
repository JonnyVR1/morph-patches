package p153l;

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
public final class sgg0 {

    /* JADX INFO: renamed from: u */
    public static final String f167850u = "SudGIP ".concat(sgg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final aug0 f167851a;

    /* JADX INFO: renamed from: b */
    public final long f167852b;

    /* JADX INFO: renamed from: c */
    public final long f167853c;

    /* JADX INFO: renamed from: d */
    public final String f167854d;

    /* JADX INFO: renamed from: e */
    public final String f167855e;

    /* JADX INFO: renamed from: g */
    public final oqg0 f167857g;

    /* JADX INFO: renamed from: i */
    public prg0 f167859i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f167860j;

    /* JADX INFO: renamed from: k */
    public final WeakReference f167861k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f167862l;

    /* JADX INFO: renamed from: m */
    public ryg0 f167863m;

    /* JADX INFO: renamed from: n */
    public e0h0 f167864n;

    /* JADX INFO: renamed from: o */
    public final bxg0 f167865o;

    /* JADX INFO: renamed from: p */
    public long f167866p;

    /* JADX INFO: renamed from: q */
    public long f167867q;

    /* JADX INFO: renamed from: r */
    public long f167868r;

    /* JADX INFO: renamed from: s */
    public int f167869s;

    /* JADX INFO: renamed from: t */
    public final int f167870t;

    /* JADX INFO: renamed from: f */
    public int f167856f = 1;

    /* JADX INFO: renamed from: h */
    public PkgDownloadStatus f167858h = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;

    public sgg0(oqg0 oqg0Var, long j, String str, String str2, dzg0 dzg0Var) {
        ArrayList arrayList = new ArrayList();
        this.f167860j = arrayList;
        this.f167862l = new ArrayList();
        this.f167866p = 0L;
        this.f167867q = 0L;
        this.f167870t = 3;
        this.f167857g = oqg0Var;
        grg0 grg0Var = new grg0(oqg0Var.f148591d, str, str2);
        grg0Var.f106046k = 300;
        grg0Var.f106040e = 10;
        grg0Var.f106041f = 8192;
        grg0Var.f106042g = 32768;
        grg0Var.f106043h = 65536;
        grg0Var.f106044i = 2000;
        grg0Var.f106050o = 1;
        grg0Var.f106045j = true;
        grg0Var.f106048m = false;
        grg0Var.m131797a(HttpHeaders.REFERER, lwg0.m156044b(gxg0.m132863b(UUID.randomUUID().toString())));
        grg0Var.m131797a("sud-device-brand", opg0.m168673a(pqg0.m173348a()));
        grg0Var.m131797a("sud-os-version", pqg0.m173351d());
        grg0Var.m131797a("sud-device-id", pqg0.m173350c());
        bxg0 bxg0Var = new bxg0();
        this.f167865o = bxg0Var;
        if (grg0Var.f106039d == null) {
            grg0Var.f106039d = new HashMap();
        }
        grg0Var.f106039d.put(bxg0.class, bxg0Var);
        this.f167851a = new aug0(grg0Var.f106036a, grg0Var.f106037b, grg0Var.f106040e, grg0Var.f106041f, grg0Var.f106042g, grg0Var.f106043h, grg0Var.f106044i, grg0Var.f106045j, grg0Var.f106046k, grg0Var.f106038c, grg0Var.f106047l, grg0Var.f106048m, grg0Var.f106049n, grg0Var.f106050o, grg0Var.f106039d);
        arrayList.add(oqg0Var.f148589b);
        this.f167852b = oqg0Var.f148590c;
        this.f167853c = j;
        this.f167854d = str;
        this.f167855e = str2;
        this.f167861k = new WeakReference(dzg0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m185773a() {
        e0h0 e0h0Var = this.f167864n;
        if (e0h0Var != null) {
            e0h0Var.f91463a.clear();
            this.f167864n.cancel();
            this.f167864n = null;
        }
        keg0 keg0Var = (keg0) this.f167861k.get();
        if (keg0Var != null) {
            dzg0 dzg0Var = (dzg0) keg0Var;
            LogUtils.file("SudDownloadManager", "onTaskEnd:" + this.f167852b);
            SudLogger.m222811d(bhg0.f76783d, "onTaskEnd:" + this.f167852b);
            dzg0Var.f91357a.f76784a.remove(this);
            dzg0Var.f91357a.m104343c();
        }
        this.f167859i = null;
        this.f167862l.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m185774b(int i, String str) {
        LogUtils.file("SudDownloadTask", "onDownloadFailure mgId:" + this.f167852b + " listenerSize:" + this.f167862l.size());
        SudLogger.m222811d(f167850u, "onDownloadFailure mgId:" + this.f167852b + " listenerSize:" + this.f167862l.size());
        ArrayList arrayList = this.f167862l;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((wfg0) obj).mo154722e(i, str, this.f167865o);
        }
        m185773a();
    }

    /* JADX INFO: renamed from: c */
    public final void m185775c(wfg0 wfg0Var) {
        if (wfg0Var == null || this.f167862l.contains(wfg0Var)) {
            return;
        }
        this.f167862l.add(wfg0Var);
        this.f167860j.add(wfg0Var.mo154719b());
        PkgDownloadStatus pkgDownloadStatus = this.f167858h;
        if (pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE) {
            wfg0Var.mo154718a();
            wfg0Var.mo154720c(this.f167867q, this.f167866p, this.f167858h);
            wfg0Var.mo154721d(this.f167867q, this.f167866p);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m185776d(PkgDownloadStatus pkgDownloadStatus) {
        long j = this.f167867q;
        long j2 = this.f167866p;
        ArrayList arrayList = this.f167862l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((wfg0) arrayList.get(i)).mo154720c(j, j2, pkgDownloadStatus);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m185777e() {
        if (m185780h()) {
            return;
        }
        LogUtils.file("SudDownloadTask", "download:" + this.f167858h + "  mgId:" + this.f167852b + "  url:" + this.f167857g.f148591d + "  parentPath:" + this.f167854d + "  fileName:" + this.f167855e);
        String str = f167850u;
        StringBuilder sb = new StringBuilder("download:");
        sb.append(this.f167858h);
        sb.append("  mgId:");
        sb.append(this.f167852b);
        SudLogger.m222811d(str, sb.toString());
        this.f167856f = 1;
        PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_STARTED;
        this.f167858h = pkgDownloadStatus;
        this.f167868r = System.currentTimeMillis();
        m185776d(pkgDownloadStatus);
        ryg0 ryg0Var = this.f167863m;
        if (ryg0Var != null) {
            ryg0Var.f165436b.clear();
        }
        ryg0 ryg0Var2 = new ryg0(this);
        this.f167863m = ryg0Var2;
        this.f167851a.m100398m(ryg0Var2);
        e0h0 e0h0Var = this.f167864n;
        if (e0h0Var != null) {
            e0h0Var.f91463a.clear();
            this.f167864n.cancel();
            this.f167864n = null;
        }
        e0h0 e0h0Var2 = new e0h0(this);
        this.f167864n = e0h0Var2;
        e0h0Var2.start();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && sgg0.class == obj.getClass() && this.f167853c == ((sgg0) obj).f167853c;
    }

    /* JADX INFO: renamed from: f */
    public final void m185778f() {
        LogUtils.file("SudDownloadTask", "cancelDownload mgId:" + this.f167852b + "  status:" + this.f167858h);
        SudLogger.m222811d(f167850u, "cancelDownload mgId:" + this.f167852b + "  status:" + this.f167858h);
        if (this.f167858h == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE) {
            this.f167856f = 2;
            this.f167851a.m100399n();
            m185776d(PkgDownloadStatus.PKG_DOWNLOAD_CANCELED);
            this.f167862l.clear();
            return;
        }
        if (m185780h()) {
            this.f167856f = 2;
            this.f167851a.m100399n();
        }
        PkgDownloadStatus pkgDownloadStatus = PkgDownloadStatus.PKG_DOWNLOAD_CANCELED;
        this.f167858h = pkgDownloadStatus;
        this.f167868r = System.currentTimeMillis();
        m185776d(pkgDownloadStatus);
        m185773a();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m185779g() {
        ArrayList arrayList = this.f167860j;
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
    public final boolean m185780h() {
        PkgDownloadStatus pkgDownloadStatus = this.f167858h;
        return pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_STARTED || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_DOWNLOADING || pkgDownloadStatus == PkgDownloadStatus.PKG_DOWNLOAD_CHECK_FILE;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f167853c));
    }
}
