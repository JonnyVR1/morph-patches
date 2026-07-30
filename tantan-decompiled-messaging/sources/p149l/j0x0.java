package p149l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.measurement.internal.C2456e;
import com.google.android.gms.measurement.internal.C2461j;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes6.dex */
public final class j0x0 extends hay0 {
    public j0x0(C2461j c2461j) {
        super(c2461j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: u */
    public static byte[] m139205u(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ pdy0 mo15138i() {
        return super.mo15138i();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ jny0 mo15139j() {
        return super.mo15139j();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ igr0 mo15140k() {
        return super.mo15140k();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2456e mo15141l() {
        return super.mo15141l();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ e7y0 mo15142m() {
        return super.mo15142m();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ pay0 mo15143n() {
        return super.mo15143n();
    }

    @Override // p149l.hay0
    /* JADX INFO: renamed from: r */
    public final boolean mo15144r() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final void m139207s(String str, URL url, byte[] bArr, Map<String, String> map, h3x0 h3x0Var) {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(bArr);
        Preconditions.checkNotNull(h3x0Var);
        zzl().m146303s(new y4x0(this, str, url, bArr, map, h3x0Var));
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final void m139208t(String str, uay0 uay0Var, zzfy$zzj zzfy_zzj, h3x0 h3x0Var) {
        j0x0 j0x0Var;
        String str2;
        mo15092h();
        m130251o();
        try {
            URL url = new URI(uay0Var.m192808b()).toURL();
            mo15138i();
            byte[] bArrM14254g = zzfy_zzj.m14254g();
            j0x0Var = this;
            str2 = str;
            try {
                zzl().m146303s(new y4x0(j0x0Var, str2, url, bArrM14254g, uay0Var.m192809c(), h3x0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                j0x0Var.zzj().m211412A().m123938c("Failed to parse URL. Not uploading MeasurementBatch. appId", xww0.m211405p(str2), uay0Var.m192808b());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            j0x0Var = this;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m139209w() {
        m130251o();
        ConnectivityManager connectivityManager = (ConnectivityManager) zza().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }
}
