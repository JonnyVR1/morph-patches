package p153l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.eclipse.jetty.http.HttpHeaders;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class tng0 {

    /* JADX INFO: renamed from: m */
    public static final String f175249m = "SudGIP ".concat(tng0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final aug0 f175250a;

    /* JADX INFO: renamed from: b */
    public final String f175251b;

    /* JADX INFO: renamed from: c */
    public final String f175252c;

    /* JADX INFO: renamed from: e */
    public final ArrayList f175254e;

    /* JADX INFO: renamed from: f */
    public rjg0 f175255f;

    /* JADX INFO: renamed from: g */
    public crg0 f175256g;

    /* JADX INFO: renamed from: h */
    public final bxg0 f175257h;

    /* JADX INFO: renamed from: k */
    public long f175260k;

    /* JADX INFO: renamed from: l */
    public final String f175261l;

    /* JADX INFO: renamed from: d */
    public PkgDownloadStatus f175253d = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;

    /* JADX INFO: renamed from: i */
    public long f175258i = 0;

    /* JADX INFO: renamed from: j */
    public long f175259j = 0;

    public tng0(String str, String str2, String str3) {
        this.f175261l = str;
        grg0 grg0Var = new grg0(str, str2, str3);
        grg0Var.f106046k = 300;
        grg0Var.f106040e = 10;
        grg0Var.f106041f = 8192;
        grg0Var.f106042g = 32768;
        grg0Var.f106043h = 65536;
        grg0Var.f106044i = 2000;
        grg0Var.f106050o = 1;
        grg0Var.f106045j = true;
        grg0Var.f106048m = true;
        grg0Var.m131797a(HttpHeaders.REFERER, lwg0.m156044b(gxg0.m132863b(UUID.randomUUID().toString())));
        grg0Var.m131797a("sud-device-brand", opg0.m168673a(pqg0.m173348a()));
        grg0Var.m131797a("sud-os-version", pqg0.m173351d());
        grg0Var.m131797a("sud-device-id", pqg0.m173350c());
        bxg0 bxg0Var = new bxg0();
        this.f175257h = bxg0Var;
        if (grg0Var.f106039d == null) {
            grg0Var.f106039d = new HashMap();
        }
        grg0Var.f106039d.put(bxg0.class, bxg0Var);
        this.f175250a = new aug0(grg0Var.f106036a, grg0Var.f106037b, grg0Var.f106040e, grg0Var.f106041f, grg0Var.f106042g, grg0Var.f106043h, grg0Var.f106044i, grg0Var.f106045j, grg0Var.f106046k, grg0Var.f106038c, grg0Var.f106047l, grg0Var.f106048m, grg0Var.f106049n, grg0Var.f106050o, grg0Var.f106039d);
        this.f175251b = str2;
        this.f175252c = str3;
        this.f175254e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m191885a(int i, String str) {
        LogUtils.file("DownloadFileTask", "onDownloadFailure  listenerSize:" + this.f175254e.size());
        SudLogger.m222811d(f175249m, "onDownloadFailure  listenerSize:" + this.f175254e.size());
        ArrayList arrayList = this.f175254e;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((wfg0) obj).mo154722e(i, str, this.f175257h);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m191886b(PkgDownloadStatus pkgDownloadStatus) {
        this.f175253d = pkgDownloadStatus;
        this.f175260k = System.currentTimeMillis();
        long j = this.f175259j;
        long j2 = this.f175258i;
        ArrayList arrayList = this.f175254e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((wfg0) obj).mo154720c(j, j2, pkgDownloadStatus);
        }
    }
}
