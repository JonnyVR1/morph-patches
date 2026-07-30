package p149l;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;
import p149l.b9s0;
import p149l.ibt0;
import p149l.k2v0;
import p149l.kxv0;
import p149l.myv0;
import p149l.nxv0;
import p149l.p9t0;
import p149l.ptr0;
import p149l.rbt0;
import p149l.vny0;
import p149l.xzx0;
import p149l.z0r0;
import p149l.z2s0;

/* JADX INFO: loaded from: classes6.dex */
public final class dat0 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.q9t0] */
    /* JADX INFO: renamed from: a */
    public static final q9t0 m110631a(final Context context, final rbt0 rbt0Var, final String str, final boolean z, final boolean z2, @Nullable final ptr0 ptr0Var, @Nullable final b9s0 b9s0Var, final zzcei zzceiVar, @Nullable e8s0 e8s0Var, @Nullable final xzx0 xzx0Var, @Nullable final z0r0 z0r0Var, final z2s0 z2s0Var, @Nullable final kxv0 kxv0Var, @Nullable final nxv0 nxv0Var, @Nullable final k2v0 k2v0Var, @Nullable final myv0 myv0Var) throws zzcjw {
        m7s0.m153417a(context);
        try {
            final e8s0 e8s0Var2 = null;
            zfw0 zfw0Var = new zfw0(context, rbt0Var, str, z, z2, ptr0Var, b9s0Var, zzceiVar, e8s0Var2, xzx0Var, z0r0Var, z2s0Var, kxv0Var, nxv0Var, myv0Var, k2v0Var) { // from class: com.google.android.gms.internal.ads.i1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f9917a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ rbt0 f9918b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f9919c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f9920d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f9921e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ptr0 f9922f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ b9s0 f9923g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ zzcei f9924h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ xzx0 f9925i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ z0r0 f9926j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ z2s0 f9927k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ kxv0 f9928l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ nxv0 f9929m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ myv0 f9930n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ k2v0 f9931o;

                {
                    this.f9925i = xzx0Var;
                    this.f9926j = z0r0Var;
                    this.f9927k = z2s0Var;
                    this.f9928l = kxv0Var;
                    this.f9929m = nxv0Var;
                    this.f9930n = myv0Var;
                    this.f9931o = k2v0Var;
                }

                @Override // p149l.zfw0
                public final Object zza() {
                    rbt0 rbt0Var2 = this.f9918b;
                    String str2 = this.f9919c;
                    boolean z3 = this.f9920d;
                    z2s0 z2s0Var2 = this.f9927k;
                    boolean z4 = this.f9921e;
                    ptr0 ptr0Var2 = this.f9922f;
                    kxv0 kxv0Var2 = this.f9928l;
                    b9s0 b9s0Var2 = this.f9923g;
                    xzx0 xzx0Var2 = this.f9925i;
                    nxv0 nxv0Var2 = this.f9929m;
                    Context context2 = this.f9917a;
                    zzcei zzceiVar2 = this.f9924h;
                    z0r0 z0r0Var2 = this.f9926j;
                    myv0 myv0Var2 = this.f9930n;
                    k2v0 k2v0Var2 = this.f9931o;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzckf.f10174k0;
                        zzcka zzckaVar = new zzcka(new zzckf(new ibt0(context2), rbt0Var2, str2, z3, z4, ptr0Var2, b9s0Var2, zzceiVar2, null, xzx0Var2, z0r0Var2, z2s0Var2, kxv0Var2, nxv0Var2, myv0Var2));
                        zzckaVar.setWebViewClient(vny0.m199081s().mo112969c(zzckaVar, z2s0Var2, z4, k2v0Var2));
                        zzckaVar.setWebChromeClient(new p9t0(zzckaVar));
                        return zzckaVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return zfw0Var.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcjw("Webview initialization failed.", th);
        }
    }
}
