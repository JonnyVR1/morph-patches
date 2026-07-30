package p153l;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus$State;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbpd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes6.dex */
public final class gdv0 {

    /* JADX INFO: renamed from: h */
    public static gdv0 f103737h;

    /* JADX INFO: renamed from: f */
    public mot0 f103743f;

    /* JADX INFO: renamed from: a */
    public final Object f103738a = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f103740c = false;

    /* JADX INFO: renamed from: d */
    public boolean f103741d = false;

    /* JADX INFO: renamed from: e */
    public final Object f103742e = new Object();

    /* JADX INFO: renamed from: g */
    @NonNull
    public RequestConfiguration f103744g = new RequestConfiguration.C2092a().m12282a();

    /* JADX INFO: renamed from: b */
    public final ArrayList f103739b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static gdv0 m129942f() {
        gdv0 gdv0Var;
        synchronized (gdv0.class) {
            try {
                if (f103737h == null) {
                    f103737h = new gdv0();
                }
                gdv0Var = f103737h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gdv0Var;
    }

    /* JADX INFO: renamed from: o */
    public static ium m129947o(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbpd zzbpdVar = (zzbpd) it.next();
            map.put(zzbpdVar.zza, new mss0(zzbpdVar.zzb ? AdapterStatus$State.READY : AdapterStatus$State.NOT_READY, zzbpdVar.zzd, zzbpdVar.zzc));
        }
        return new nss0(map);
    }

    /* JADX INFO: renamed from: a */
    public final void m129948a(Context context) {
        if (this.f103743f == null) {
            this.f103743f = (mot0) new iwr0(k6s0.m148568a(), context).m218609d(context, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m129949b(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.f103743f.mo156010G7(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            dct0.m115296e("Unable to set request configuration parcel.", e);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final RequestConfiguration m129950c() {
        return this.f103744g;
    }

    /* JADX INFO: renamed from: e */
    public final ium m129951e() {
        ium iumVarM129947o;
        synchronized (this.f103742e) {
            try {
                Preconditions.checkState(this.f103743f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    iumVarM129947o = m129947o(this.f103743f.zzg());
                } catch (RemoteException unused) {
                    dct0.m115295d("Unable to get Initialization status.");
                    return new ium() { // from class: l.t3v0
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iumVarM129947o;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m129952k(final Context context, @Nullable String str, @Nullable nm50 nm50Var) {
        synchronized (this.f103738a) {
            try {
                if (this.f103740c) {
                    if (nm50Var != null) {
                        this.f103739b.add(nm50Var);
                    }
                    return;
                }
                if (this.f103741d) {
                    if (nm50Var != null) {
                        nm50Var.mo157271a(m129951e());
                    }
                    return;
                }
                this.f103740c = true;
                if (nm50Var != null) {
                    this.f103739b.add(nm50Var);
                }
                if (context == null) {
                    wg3.m206174a("Context cannot be null.");
                    return;
                }
                synchronized (this.f103742e) {
                    xav0 xav0Var = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    try {
                        try {
                            m129948a(context);
                            this.f103743f.mo156016b5(new dcv0(this, xav0Var));
                            this.f103743f.mo156009C3(new qws0());
                            if (this.f103744g.m12279c() != -1 || this.f103744g.m12280d() != -1) {
                                m129949b(this.f103744g);
                            }
                        } catch (RemoteException e) {
                            dct0.m115299h("MobileAdsSettingManager initialization failed", e);
                        }
                        sgs0.m185829a(context);
                        if (((Boolean) wis0.f189384a.m149974e()).booleanValue()) {
                            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167986Fa)).booleanValue()) {
                                dct0.m115293b("Initializing on bg thread");
                                ThreadPoolExecutor threadPoolExecutor = kbt0.f124976a;
                                final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                threadPoolExecutor.execute(new Runnable(context, objArr3) { // from class: l.z4v0

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ Context f202985b;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f202984a.m129953l(this.f202985b, null);
                                    }
                                });
                            } else if (((Boolean) wis0.f189385b.m149974e()).booleanValue()) {
                                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167986Fa)).booleanValue()) {
                                    ExecutorService executorService = kbt0.f124977b;
                                    final Object[] objArr4 = objArr == true ? 1 : 0;
                                    executorService.execute(new Runnable(context, objArr4) { // from class: l.d6v0

                                        /* JADX INFO: renamed from: b */
                                        public final /* synthetic */ Context f85414b;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f85413a.m129954m(this.f85414b, null);
                                        }
                                    });
                                } else {
                                    dct0.m115293b("Initializing on calling thread");
                                    m129956p(context, null);
                                }
                            } else {
                                dct0.m115293b("Initializing on calling thread");
                                m129956p(context, null);
                            }
                        } else if (((Boolean) wis0.f189385b.m149974e()).booleanValue()) {
                            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167986Fa)).booleanValue()) {
                                ExecutorService executorService2 = kbt0.f124977b;
                                final String objArr5 = objArr == true ? 1 : 0;
                                executorService2.execute(new Runnable(context, objArr5) { // from class: l.d6v0

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ Context f85414b;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f85413a.m129954m(this.f85414b, null);
                                    }
                                });
                            } else {
                                dct0.m115293b("Initializing on calling thread");
                                m129956p(context, null);
                            }
                        } else {
                            dct0.m115293b("Initializing on calling thread");
                            m129956p(context, null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m129953l(Context context, String str) {
        synchronized (this.f103742e) {
            m129956p(context, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m129954m(Context context, String str) {
        synchronized (this.f103742e) {
            m129956p(context, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m129955n(String str) {
        synchronized (this.f103742e) {
            Preconditions.checkState(this.f103743f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f103743f.mo156018p6(str);
            } catch (RemoteException e) {
                dct0.m115296e("Unable to set plugin.", e);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m129956p(Context context, @Nullable String str) {
        try {
            mws0.m160595a().m160596b(context, null);
            this.f103743f.zzk();
            this.f103743f.mo156017j6(null, h950.m134038Y2(null));
        } catch (RemoteException e) {
            dct0.m115299h("MobileAdsSettingManager initialization failed", e);
        }
    }
}
