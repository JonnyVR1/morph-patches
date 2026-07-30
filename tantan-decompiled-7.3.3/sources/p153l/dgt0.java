package p153l;

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
public final class dgt0 implements fex0 {

    /* JADX INFO: renamed from: a */
    public final Context f88378a;

    /* JADX INFO: renamed from: b */
    public final fex0 f88379b;

    /* JADX INFO: renamed from: c */
    public final String f88380c;

    /* JADX INFO: renamed from: d */
    public final int f88381d;

    /* JADX INFO: renamed from: f */
    public InputStream f88383f;

    /* JADX INFO: renamed from: g */
    public boolean f88384g;

    /* JADX INFO: renamed from: h */
    public Uri f88385h;

    /* JADX INFO: renamed from: i */
    public volatile zzbbb f88386i;

    /* JADX INFO: renamed from: m */
    public akx0 f88390m;

    /* JADX INFO: renamed from: j */
    public boolean f88387j = false;

    /* JADX INFO: renamed from: k */
    public boolean f88388k = false;

    /* JADX INFO: renamed from: l */
    public final AtomicLong f88389l = new AtomicLong(-1);

    /* JADX INFO: renamed from: e */
    public final boolean f88382e = ((Boolean) jas0.m144075c().m176505a(sgs0.f168109Q1)).booleanValue();

    public dgt0(Context context, fex0 fex0Var, String str, int i, btx0 btx0Var, cgt0 cgt0Var) {
        this.f88378a = context;
        this.f88379b = fex0Var;
        this.f88380c = str;
        this.f88381d = i;
    }

    @Override // p153l.nyy0
    /* JADX INFO: renamed from: a */
    public final int mo12781a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f88384g) {
            InputStream inputStream = this.f88383f;
            return inputStream != null ? inputStream.read(bArr, i, i2) : this.f88379b.mo12781a(bArr, i, i2);
        }
        zpg0.m220844a("Attempt to read closed CacheDataSource.");
        return 0;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: e */
    public final long mo12782e(akx0 akx0Var) throws IOException {
        Long l2;
        if (this.f88384g) {
            zpg0.m220844a("Attempt to open an already open CacheDataSource.");
            return 0L;
        }
        this.f88384g = true;
        Uri uri = akx0Var.f72047a;
        this.f88385h = uri;
        this.f88390m = akx0Var;
        this.f88386i = zzbbb.m13600g(uri);
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168349j4)).booleanValue();
        zzbbb zzbbbVar = this.f88386i;
        zzbay zzbayVarM134422b = null;
        if (!zBooleanValue) {
            if (zzbbbVar != null) {
                this.f88386i.zzh = akx0Var.f72052f;
                this.f88386i.zzi = epw0.m121874c(this.f88380c);
                this.f88386i.zzj = this.f88381d;
                zzbayVarM134422b = bxy0.m106921e().m134422b(this.f88386i);
            }
            if (zzbayVarM134422b != null && zzbayVarM134422b.zze()) {
                this.f88387j = zzbayVarM134422b.m13599h0();
                this.f88388k = zzbayVarM134422b.m13598J();
                if (!m115751j()) {
                    this.f88383f = zzbayVarM134422b.m13597I();
                    return -1L;
                }
            }
        } else if (zzbbbVar != null) {
            this.f88386i.zzh = akx0Var.f72052f;
            this.f88386i.zzi = epw0.m121874c(this.f88380c);
            this.f88386i.zzj = this.f88381d;
            if (this.f88386i.zzg) {
                l2 = (Long) jas0.m144075c().m176505a(sgs0.f168375l4);
            } else {
                l2 = (Long) jas0.m144075c().m176505a(sgs0.f168362k4);
            }
            long jLongValue = l2.longValue();
            bxy0.m106918b().elapsedRealtime();
            bxy0.m106922f();
            Future futureM109060a = ccs0.m109060a(this.f88378a, this.f88386i);
            try {
                try {
                    dcs0 dcs0Var = (dcs0) futureM109060a.get(jLongValue, TimeUnit.MILLISECONDS);
                    dcs0Var.m115286d();
                    this.f88387j = dcs0Var.m115288f();
                    this.f88388k = dcs0Var.m115287e();
                    dcs0Var.m115284a();
                    if (!m115751j()) {
                        this.f88383f = dcs0Var.m115285c();
                    }
                } catch (InterruptedException unused) {
                    futureM109060a.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureM109060a.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            bxy0.m106918b().elapsedRealtime();
            throw null;
        }
        if (this.f88386i != null) {
            this.f88390m = new akx0(Uri.parse(this.f88386i.zza), null, akx0Var.f72051e, akx0Var.f72052f, akx0Var.f72053g, null, akx0Var.f72055i);
        }
        return this.f88379b.mo12782e(this.f88390m);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m115751j() {
        if (!this.f88382e) {
            return false;
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168388m4)).booleanValue() || this.f88387j) {
            return ((Boolean) jas0.m144075c().m176505a(sgs0.f168401n4)).booleanValue() && !this.f88388k;
        }
        return true;
    }

    @Override // p153l.fex0
    public final Uri zzc() {
        return this.f88385h;
    }

    @Override // p153l.fex0
    public final void zzd() throws IOException {
        if (!this.f88384g) {
            zpg0.m220844a("Attempt to close an already closed CacheDataSource.");
            return;
        }
        this.f88384g = false;
        this.f88385h = null;
        InputStream inputStream = this.f88383f;
        if (inputStream == null) {
            this.f88379b.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.f88383f = null;
        }
    }

    @Override // p153l.fex0, p153l.jsx0
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // p153l.fex0
    /* JADX INFO: renamed from: f */
    public final void mo101236f(btx0 btx0Var) {
    }
}
