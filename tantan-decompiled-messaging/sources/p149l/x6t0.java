package p149l;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbbb;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class x6t0 implements z4x0 {

    /* JADX INFO: renamed from: a */
    public final Context f191273a;

    /* JADX INFO: renamed from: b */
    public final z4x0 f191274b;

    /* JADX INFO: renamed from: c */
    public final String f191275c;

    /* JADX INFO: renamed from: d */
    public final int f191276d;

    /* JADX INFO: renamed from: f */
    public InputStream f191278f;

    /* JADX INFO: renamed from: g */
    public boolean f191279g;

    /* JADX INFO: renamed from: h */
    public Uri f191280h;

    /* JADX INFO: renamed from: i */
    public volatile zzbbb f191281i;

    /* JADX INFO: renamed from: m */
    public uax0 f191285m;

    /* JADX INFO: renamed from: j */
    public boolean f191282j = false;

    /* JADX INFO: renamed from: k */
    public boolean f191283k = false;

    /* JADX INFO: renamed from: l */
    public final AtomicLong f191284l = new AtomicLong(-1);

    /* JADX INFO: renamed from: e */
    public final boolean f191277e = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132038Q1)).booleanValue();

    public x6t0(Context context, z4x0 z4x0Var, String str, int i, vjx0 vjx0Var, w6t0 w6t0Var) {
        this.f191273a = context;
        this.f191274b = z4x0Var;
        this.f191275c = str;
        this.f191276d = i;
    }

    @Override // p149l.hpy0
    /* JADX INFO: renamed from: a */
    public final int mo12727a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f191279g) {
            InputStream inputStream = this.f191278f;
            return inputStream != null ? inputStream.read(bArr, i, i2) : this.f191274b.mo12727a(bArr, i, i2);
        }
        rhg0.m179353a("Attempt to read closed CacheDataSource.");
        return 0;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: e */
    public final long mo12728e(uax0 uax0Var) throws IOException {
        Long l2;
        if (this.f191279g) {
            rhg0.m179353a("Attempt to open an already open CacheDataSource.");
            return 0L;
        }
        this.f191279g = true;
        Uri uri = uax0Var.f175648a;
        this.f191280h = uri;
        this.f191285m = uax0Var;
        this.f191281i = zzbbb.m13546g(uri);
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132278j4)).booleanValue();
        zzbbb zzbbbVar = this.f191281i;
        zzbay zzbayVarM100027b = null;
        if (!zBooleanValue) {
            if (zzbbbVar != null) {
                this.f191281i.zzh = uax0Var.f175653f;
                this.f191281i.zzi = yfw0.m214595c(this.f191275c);
                this.f191281i.zzj = this.f191276d;
                zzbayVarM100027b = vny0.m199067e().m100027b(this.f191281i);
            }
            if (zzbayVarM100027b != null && zzbayVarM100027b.zze()) {
                this.f191282j = zzbayVarM100027b.m13545g0();
                this.f191283k = zzbayVarM100027b.m13544J();
                if (!m207210j()) {
                    this.f191278f = zzbayVarM100027b.m13543I();
                    return -1L;
                }
            }
        } else if (zzbbbVar != null) {
            this.f191281i.zzh = uax0Var.f175653f;
            this.f191281i.zzi = yfw0.m214595c(this.f191275c);
            this.f191281i.zzj = this.f191276d;
            if (this.f191281i.zzg) {
                l2 = (Long) d1s0.m109677c().m144697a(m7s0.f132304l4);
            } else {
                l2 = (Long) d1s0.m109677c().m144697a(m7s0.f132291k4);
            }
            long jLongValue = l2.longValue();
            vny0.m199064b().elapsedRealtime();
            vny0.m199068f();
            Future futureM201215a = w2s0.m201215a(this.f191273a, this.f191281i);
            try {
                try {
                    x2s0 x2s0Var = (x2s0) futureM201215a.get(jLongValue, TimeUnit.MILLISECONDS);
                    x2s0Var.m206860d();
                    this.f191282j = x2s0Var.m206862f();
                    this.f191283k = x2s0Var.m206861e();
                    x2s0Var.m206858a();
                    if (!m207210j()) {
                        this.f191278f = x2s0Var.m206859c();
                    }
                } catch (InterruptedException unused) {
                    futureM201215a.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureM201215a.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            vny0.m199064b().elapsedRealtime();
            throw null;
        }
        if (this.f191281i != null) {
            this.f191285m = new uax0(Uri.parse(this.f191281i.zza), null, uax0Var.f175652e, uax0Var.f175653f, uax0Var.f175654g, null, uax0Var.f175656i);
        }
        return this.f191274b.mo12728e(this.f191285m);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m207210j() {
        if (!this.f191277e) {
            return false;
        }
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132317m4)).booleanValue() || this.f191282j) {
            return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132330n4)).booleanValue() && !this.f191283k;
        }
        return true;
    }

    @Override // p149l.z4x0
    public final Uri zzc() {
        return this.f191280h;
    }

    @Override // p149l.z4x0
    public final void zzd() throws IOException {
        if (!this.f191279g) {
            rhg0.m179353a("Attempt to close an already closed CacheDataSource.");
            return;
        }
        this.f191279g = false;
        this.f191280h = null;
        InputStream inputStream = this.f191278f;
        if (inputStream == null) {
            this.f191274b.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.f191278f = null;
        }
    }

    @Override // p149l.z4x0, p149l.djx0
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // p149l.z4x0
    /* JADX INFO: renamed from: f */
    public final void mo128921f(vjx0 vjx0Var) {
    }
}
