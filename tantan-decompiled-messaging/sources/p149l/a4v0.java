package p149l;

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
public final class a4v0 {

    /* JADX INFO: renamed from: h */
    public static a4v0 f67560h;

    /* JADX INFO: renamed from: f */
    public gft0 f67566f;

    /* JADX INFO: renamed from: a */
    public final Object f67561a = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f67563c = false;

    /* JADX INFO: renamed from: d */
    public boolean f67564d = false;

    /* JADX INFO: renamed from: e */
    public final Object f67565e = new Object();

    /* JADX INFO: renamed from: g */
    @NonNull
    public RequestConfiguration f67567g = new RequestConfiguration.C2069a().m12228a();

    /* JADX INFO: renamed from: b */
    public final ArrayList f67562b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static a4v0 m94931f() {
        a4v0 a4v0Var;
        synchronized (a4v0.class) {
            try {
                if (f67560h == null) {
                    f67560h = new a4v0();
                }
                a4v0Var = f67560h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a4v0Var;
    }

    /* JADX INFO: renamed from: o */
    public static gsm m94936o(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbpd zzbpdVar = (zzbpd) it.next();
            map.put(zzbpdVar.zza, new gjs0(zzbpdVar.zzb ? AdapterStatus$State.READY : AdapterStatus$State.NOT_READY, zzbpdVar.zzd, zzbpdVar.zzc));
        }
        return new hjs0(map);
    }

    /* JADX INFO: renamed from: a */
    public final void m94937a(Context context) {
        if (this.f67566f == null) {
            this.f67566f = (gft0) new cnr0(exr0.m118702a(), context).m190780d(context, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m94938b(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.f67566f.mo122261G7(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            x2t0.m206867e("Unable to set request configuration parcel.", e);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final RequestConfiguration m94939c() {
        return this.f67567g;
    }

    /* JADX INFO: renamed from: e */
    public final gsm m94940e() {
        gsm gsmVarM94936o;
        synchronized (this.f67565e) {
            try {
                Preconditions.checkState(this.f67566f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    gsmVarM94936o = m94936o(this.f67566f.zzg());
                } catch (RemoteException unused) {
                    x2t0.m206866d("Unable to get Initialization status.");
                    return new gsm() { // from class: l.nuu0
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gsmVarM94936o;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m94941k(final Context context, @Nullable String str, @Nullable ge50 ge50Var) {
        synchronized (this.f67561a) {
            try {
                if (this.f67563c) {
                    if (ge50Var != null) {
                        this.f67562b.add(ge50Var);
                    }
                    return;
                }
                if (this.f67564d) {
                    if (ge50Var != null) {
                        ge50Var.mo125679a(m94940e());
                    }
                    return;
                }
                this.f67563c = true;
                if (ge50Var != null) {
                    this.f67562b.add(ge50Var);
                }
                if (context == null) {
                    ig3.m135964a("Context cannot be null.");
                    return;
                }
                synchronized (this.f67565e) {
                    r1v0 r1v0Var = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    try {
                        try {
                            m94937a(context);
                            this.f67566f.mo122267b5(new x2v0(this, r1v0Var));
                            this.f67566f.mo122260C3(new kns0());
                            if (this.f67567g.m12225c() != -1 || this.f67567g.m12226d() != -1) {
                                m94938b(this.f67567g);
                            }
                        } catch (RemoteException e) {
                            x2t0.m206870h("MobileAdsSettingManager initialization failed", e);
                        }
                        m7s0.m153417a(context);
                        if (((Boolean) q9s0.f153470a.m115379e()).booleanValue()) {
                            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131915Fa)).booleanValue()) {
                                x2t0.m206864b("Initializing on bg thread");
                                ThreadPoolExecutor threadPoolExecutor = e2t0.f88942a;
                                final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                threadPoolExecutor.execute(new Runnable(context, objArr3) { // from class: l.tvu0

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ Context f172343b;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f172342a.m94942l(this.f172343b, null);
                                    }
                                });
                            } else if (((Boolean) q9s0.f153471b.m115379e()).booleanValue()) {
                                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131915Fa)).booleanValue()) {
                                    ExecutorService executorService = e2t0.f88943b;
                                    final Object[] objArr4 = objArr == true ? 1 : 0;
                                    executorService.execute(new Runnable(context, objArr4) { // from class: l.xwu0

                                        /* JADX INFO: renamed from: b */
                                        public final /* synthetic */ Context f194771b;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.f194770a.m94943m(this.f194771b, null);
                                        }
                                    });
                                } else {
                                    x2t0.m206864b("Initializing on calling thread");
                                    m94945p(context, null);
                                }
                            } else {
                                x2t0.m206864b("Initializing on calling thread");
                                m94945p(context, null);
                            }
                        } else if (((Boolean) q9s0.f153471b.m115379e()).booleanValue()) {
                            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131915Fa)).booleanValue()) {
                                ExecutorService executorService2 = e2t0.f88943b;
                                final String objArr5 = objArr == true ? 1 : 0;
                                executorService2.execute(new Runnable(context, objArr5) { // from class: l.xwu0

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ Context f194771b;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f194770a.m94943m(this.f194771b, null);
                                    }
                                });
                            } else {
                                x2t0.m206864b("Initializing on calling thread");
                                m94945p(context, null);
                            }
                        } else {
                            x2t0.m206864b("Initializing on calling thread");
                            m94945p(context, null);
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
    public final /* synthetic */ void m94942l(Context context, String str) {
        synchronized (this.f67565e) {
            m94945p(context, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m94943m(Context context, String str) {
        synchronized (this.f67565e) {
            m94945p(context, null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m94944n(String str) {
        synchronized (this.f67565e) {
            Preconditions.checkState(this.f67566f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f67566f.mo122269p6(str);
            } catch (RemoteException e) {
                x2t0.m206867e("Unable to set plugin.", e);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m94945p(Context context, @Nullable String str) {
        try {
            gns0.m127186a().m127187b(context, null);
            this.f67566f.zzk();
            this.f67566f.mo122268j6(null, s050.m181848Y2(null));
        } catch (RemoteException e) {
            x2t0.m206870h("MobileAdsSettingManager initialization failed", e);
        }
    }
}
