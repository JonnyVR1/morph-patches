package p153l;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;
import p153l.bxy0;
import p153l.d9y0;
import p153l.far0;
import p153l.fcs0;
import p153l.his0;
import p153l.okt0;
import p153l.q6w0;
import p153l.qbv0;
import p153l.s7w0;
import p153l.t6w0;
import p153l.v2s0;
import p153l.vit0;
import p153l.xkt0;

/* JADX INFO: loaded from: classes6.dex */
public final class jjt0 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.wit0] */
    /* JADX INFO: renamed from: a */
    public static final wit0 m145141a(final Context context, final xkt0 xkt0Var, final String str, final boolean z, final boolean z2, @Nullable final v2s0 v2s0Var, @Nullable final his0 his0Var, final zzcei zzceiVar, @Nullable khs0 khs0Var, @Nullable final d9y0 d9y0Var, @Nullable final far0 far0Var, final fcs0 fcs0Var, @Nullable final q6w0 q6w0Var, @Nullable final t6w0 t6w0Var, @Nullable final qbv0 qbv0Var, @Nullable final s7w0 s7w0Var) throws zzcjw {
        sgs0.m185829a(context);
        try {
            final khs0 khs0Var2 = null;
            fpw0 fpw0Var = new fpw0(context, xkt0Var, str, z, z2, v2s0Var, his0Var, zzceiVar, khs0Var2, d9y0Var, far0Var, fcs0Var, q6w0Var, t6w0Var, s7w0Var, qbv0Var) { // from class: com.google.android.gms.internal.ads.i1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Context f9954a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ xkt0 f9955b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f9956c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f9957d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f9958e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ v2s0 f9959f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ his0 f9960g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ zzcei f9961h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ d9y0 f9962i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ far0 f9963j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ fcs0 f9964k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ q6w0 f9965l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ t6w0 f9966m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ s7w0 f9967n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ qbv0 f9968o;

                {
                    this.f9962i = d9y0Var;
                    this.f9963j = far0Var;
                    this.f9964k = fcs0Var;
                    this.f9965l = q6w0Var;
                    this.f9966m = t6w0Var;
                    this.f9967n = s7w0Var;
                    this.f9968o = qbv0Var;
                }

                @Override // p153l.fpw0
                public final Object zza() {
                    xkt0 xkt0Var2 = this.f9955b;
                    String str2 = this.f9956c;
                    boolean z3 = this.f9957d;
                    fcs0 fcs0Var2 = this.f9964k;
                    boolean z4 = this.f9958e;
                    v2s0 v2s0Var2 = this.f9959f;
                    q6w0 q6w0Var2 = this.f9965l;
                    his0 his0Var2 = this.f9960g;
                    d9y0 d9y0Var2 = this.f9962i;
                    t6w0 t6w0Var2 = this.f9966m;
                    Context context2 = this.f9954a;
                    zzcei zzceiVar2 = this.f9961h;
                    far0 far0Var2 = this.f9963j;
                    s7w0 s7w0Var2 = this.f9967n;
                    qbv0 qbv0Var2 = this.f9968o;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzckf.f10211k0;
                        zzcka zzckaVar = new zzcka(new zzckf(new okt0(context2), xkt0Var2, str2, z3, z4, v2s0Var2, his0Var2, zzceiVar2, null, d9y0Var2, far0Var2, fcs0Var2, q6w0Var2, t6w0Var2, s7w0Var2));
                        zzckaVar.setWebViewClient(bxy0.m106935s().mo109052c(zzckaVar, fcs0Var2, z4, qbv0Var2));
                        zzckaVar.setWebChromeClient(new vit0(zzckaVar));
                        return zzckaVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return fpw0Var.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcjw("Webview initialization failed.", th);
        }
    }
}
