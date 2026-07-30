package p149l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import org.eclipse.jetty.http.HttpHeaders;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class lfg0 {

    /* JADX INFO: renamed from: m */
    public static final String f127872m = "SudGIP ".concat(lfg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final slg0 f127873a;

    /* JADX INFO: renamed from: b */
    public final String f127874b;

    /* JADX INFO: renamed from: c */
    public final String f127875c;

    /* JADX INFO: renamed from: e */
    public final ArrayList f127877e;

    /* JADX INFO: renamed from: f */
    public jbg0 f127878f;

    /* JADX INFO: renamed from: g */
    public uig0 f127879g;

    /* JADX INFO: renamed from: h */
    public final tog0 f127880h;

    /* JADX INFO: renamed from: k */
    public long f127883k;

    /* JADX INFO: renamed from: l */
    public final String f127884l;

    /* JADX INFO: renamed from: d */
    public PkgDownloadStatus f127876d = PkgDownloadStatus.PKG_DOWNLOAD_WAITING;

    /* JADX INFO: renamed from: i */
    public long f127881i = 0;

    /* JADX INFO: renamed from: j */
    public long f127882j = 0;

    public lfg0(String str, String str2, String str3) {
        this.f127884l = str;
        yig0 yig0Var = new yig0(str, str2, str3);
        yig0Var.f198493k = 300;
        yig0Var.f198487e = 10;
        yig0Var.f198488f = 8192;
        yig0Var.f198489g = 32768;
        yig0Var.f198490h = 65536;
        yig0Var.f198491i = 2000;
        yig0Var.f198497o = 1;
        yig0Var.f198492j = true;
        yig0Var.f198495m = true;
        yig0Var.m214904a(HttpHeaders.REFERER, dog0.m112806b(yog0.m215499b(UUID.randomUUID().toString())));
        yig0Var.m214904a("sud-device-brand", ghg0.m126182a(hig0.m131254a()));
        yig0Var.m214904a("sud-os-version", hig0.m131257d());
        yig0Var.m214904a("sud-device-id", hig0.m131256c());
        tog0 tog0Var = new tog0();
        this.f127880h = tog0Var;
        if (yig0Var.f198486d == null) {
            yig0Var.f198486d = new HashMap();
        }
        yig0Var.f198486d.put(tog0.class, tog0Var);
        this.f127873a = new slg0(yig0Var.f198483a, yig0Var.f198484b, yig0Var.f198487e, yig0Var.f198488f, yig0Var.f198489g, yig0Var.f198490h, yig0Var.f198491i, yig0Var.f198492j, yig0Var.f198493k, yig0Var.f198485c, yig0Var.f198494l, yig0Var.f198495m, yig0Var.f198496n, yig0Var.f198497o, yig0Var.f198486d);
        this.f127874b = str2;
        this.f127875c = str3;
        this.f127877e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m149678a(int i, String str) {
        LogUtils.file("DownloadFileTask", "onDownloadFailure  listenerSize:" + this.f127877e.size());
        SudLogger.m221565d(f127872m, "onDownloadFailure  listenerSize:" + this.f127877e.size());
        ArrayList arrayList = this.f127877e;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((o7g0) obj).mo111016e(i, str, this.f127880h);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m149679b(PkgDownloadStatus pkgDownloadStatus) {
        this.f127876d = pkgDownloadStatus;
        this.f127883k = System.currentTimeMillis();
        long j = this.f127882j;
        long j2 = this.f127881i;
        ArrayList arrayList = this.f127877e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o7g0) obj).mo111014c(j, j2, pkgDownloadStatus);
        }
    }
}
