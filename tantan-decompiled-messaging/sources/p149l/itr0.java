package p149l;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.core.glcore.util.ErrorCode;
import com.google.android.gms.internal.ads.C2256u;
import com.google.android.gms.internal.ads.C2264v;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2248t;
import com.google.android.gms.internal.ads.zzawc;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.android.gms.internal.ads.zzfso;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import com.tencent.liteav.TXLiteAVCode;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class itr0 implements ltr0 {

    /* JADX INFO: renamed from: r */
    @Nullable
    public static itr0 f114911r;

    /* JADX INFO: renamed from: a */
    public final Context f114912a;

    /* JADX INFO: renamed from: b */
    public final haw0 f114913b;

    /* JADX INFO: renamed from: c */
    public final maw0 f114914c;

    /* JADX INFO: renamed from: d */
    public final naw0 f114915d;

    /* JADX INFO: renamed from: e */
    public final pur0 f114916e;

    /* JADX INFO: renamed from: f */
    public final p8w0 f114917f;

    /* JADX INFO: renamed from: g */
    public final Executor f114918g;

    /* JADX INFO: renamed from: h */
    public final law0 f114919h;

    /* JADX INFO: renamed from: j */
    public final dvr0 f114921j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final wur0 f114922k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final our0 f114923l;

    /* JADX INFO: renamed from: o */
    public volatile boolean f114926o;

    /* JADX INFO: renamed from: p */
    public volatile boolean f114927p;

    /* JADX INFO: renamed from: q */
    public final int f114928q;

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public volatile long f114924m = 0;

    /* JADX INFO: renamed from: n */
    public final Object f114925n = new Object();

    /* JADX INFO: renamed from: i */
    public final CountDownLatch f114920i = new CountDownLatch(1);

    @VisibleForTesting
    public itr0(@NonNull Context context, @NonNull p8w0 p8w0Var, @NonNull haw0 haw0Var, @NonNull maw0 maw0Var, @NonNull naw0 naw0Var, @NonNull pur0 pur0Var, @NonNull Executor executor, @NonNull k8w0 k8w0Var, int i, @Nullable dvr0 dvr0Var, @Nullable wur0 wur0Var, @Nullable our0 our0Var) {
        this.f114927p = false;
        this.f114912a = context;
        this.f114917f = p8w0Var;
        this.f114913b = haw0Var;
        this.f114914c = maw0Var;
        this.f114915d = naw0Var;
        this.f114916e = pur0Var;
        this.f114918g = executor;
        this.f114928q = i;
        this.f114921j = dvr0Var;
        this.f114922k = wur0Var;
        this.f114923l = our0Var;
        this.f114927p = false;
        this.f114919h = new wsr0(this, k8w0Var);
    }

    /* JADX INFO: renamed from: i */
    public static synchronized itr0 m138238i(@NonNull String str, @NonNull Context context, boolean z, boolean z2) {
        return m138239j(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static synchronized itr0 m138239j(@NonNull String str, @NonNull Context context, @NonNull Executor executor, boolean z, boolean z2) {
        try {
            if (f114911r == null) {
                q8w0 q8w0VarM178286a = r8w0.m178286a();
                q8w0VarM178286a.mo173572a(str);
                q8w0VarM178286a.mo173574c(z);
                r8w0 r8w0VarMo173575d = q8w0VarM178286a.mo173575d();
                p8w0 p8w0VarM167824a = p8w0.m167824a(context, executor, z2);
                str0 str0VarM185968c = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132264i3)).booleanValue() ? str0.m185968c(context) : null;
                dvr0 dvr0VarM113811d = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132277j3)).booleanValue() ? dvr0.m113811d(context, executor) : null;
                wur0 wur0Var = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132453x2)).booleanValue() ? new wur0() : null;
                our0 our0Var = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132477z2)).booleanValue() ? new our0() : null;
                m9w0 m9w0VarM153620e = m9w0.m153620e(context, executor, p8w0VarM167824a, r8w0VarMo173575d);
                zzawc zzawcVar = new zzawc(context);
                wur0 wur0Var2 = wur0Var;
                pur0 pur0Var = new pur0(r8w0VarMo173575d, m9w0VarM153620e, new ViewOnAttachStateChangeListenerC2248t(context, zzawcVar), zzawcVar, str0VarM185968c, dvr0VarM113811d, wur0Var2, our0Var);
                int iM187684b = t9w0.m187684b(context, p8w0VarM167824a);
                k8w0 k8w0Var = new k8w0();
                itr0 itr0Var = new itr0(context, p8w0VarM167824a, new haw0(context, iM187684b), new maw0(context, iM187684b, new vsr0(p8w0VarM167824a), ((Boolean) d1s0.m109677c().m144697a(m7s0.f132237g2)).booleanValue()), new naw0(context, pur0Var, p8w0VarM167824a, k8w0Var), pur0Var, executor, k8w0Var, iM187684b, dvr0VarM113811d, wur0Var2, our0Var);
                f114911r = itr0Var;
                itr0Var.m138245o();
                f114911r.m138246p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f114911r;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: all -> 0x009d, zzhag -> 0x00a0, TryCatch #2 {zzhag -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:60:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[Catch: all -> 0x009d, zzhag -> 0x00a0, TryCatch #2 {zzhag -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:60:0x0021, outer: #1 }] */
    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m138243n(itr0 itr0Var) {
        String str;
        String strM13368T;
        int length;
        boolean zM130245a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        gaw0 gaw0VarM138249t = itr0Var.m138249t(1);
        if (gaw0VarM138249t != null) {
            String strM13369U = gaw0VarM138249t.m125036a().m13369U();
            strM13368T = gaw0VarM138249t.m125036a().m13368T();
            str = strM13369U;
        } else {
            str = null;
            strM13368T = null;
        }
        try {
            try {
                zzfsk zzfskVarM110494a = d9w0.m110494a(itr0Var.f114912a, 1, itr0Var.f114928q, str, strM13368T, "1", itr0Var.f114917f);
                byte[] bArr = zzfskVarM110494a.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    itr0Var.f114917f.m167828d(ErrorCode.EDIT_RESUME_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        C2256u c2256uM13331M = C2256u.m13331M(zzgyl.zzv(bArr, 0, length), d8x0.m110397a());
                        if (c2256uM13331M.m13332N().m13369U().isEmpty() || c2256uM13331M.m13332N().m13368T().isEmpty() || c2256uM13331M.m13333O().zzA().length == 0) {
                            itr0Var.f114917f.m167828d(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            gaw0 gaw0VarM138249t2 = itr0Var.m138249t(1);
                            if (gaw0VarM138249t2 != null) {
                                C2264v c2264vM125036a = gaw0VarM138249t2.m125036a();
                                if (c2256uM13331M.m13332N().m13369U().equals(c2264vM125036a.m13369U()) && c2256uM13331M.m13332N().m13368T().equals(c2264vM125036a.m13368T())) {
                                    itr0Var.f114917f.m167828d(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                                }
                            }
                            law0 law0Var = itr0Var.f114919h;
                            int i = zzfskVarM110494a.zzc;
                            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132211e2)).booleanValue()) {
                                zM130245a = itr0Var.f114913b.m130245a(c2256uM13331M, law0Var);
                            } else if (i == 3) {
                                zM130245a = itr0Var.f114914c.m153844a(c2256uM13331M);
                            } else if (i == 4) {
                                zM130245a = itr0Var.f114914c.m153845b(c2256uM13331M, law0Var);
                            } else {
                                itr0Var.f114917f.m167828d(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zM130245a) {
                                gaw0 gaw0VarM138249t3 = itr0Var.m138249t(1);
                                if (gaw0VarM138249t3 != null) {
                                    if (itr0Var.f114915d.m158723c(gaw0VarM138249t3)) {
                                        itr0Var.f114927p = true;
                                    }
                                    itr0Var.f114924m = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                itr0Var.f114917f.m167828d(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        itr0Var.f114917f.m167828d(TXLiteAVCode.EVT_AUDIO_DEVICE_ROUTE_CHANGED, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzhag e) {
                itr0Var.f114917f.m167827c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            itr0Var.f114920i.countDown();
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: a */
    public final String mo136904a(Context context) {
        m138248s();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132453x2)).booleanValue()) {
            this.f114922k.m205679j();
        }
        m138246p();
        s8w0 s8w0VarM158721a = this.f114915d.m158721a();
        if (s8w0VarM158721a == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strMo120309a = s8w0VarM158721a.mo120309a(context, null);
        this.f114917f.m167830f(5001, System.currentTimeMillis() - jCurrentTimeMillis, strMo120309a, null);
        return strMo120309a;
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: b */
    public final void mo136905b(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132363pb)).booleanValue() || (displayMetrics = this.f114912a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo136909f(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo136909f(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo136909f(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: c */
    public final String mo136906c(Context context, @Nullable String str, @Nullable View view) {
        return mo136910g(context, str, view, null);
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: d */
    public final void mo136907d(StackTraceElement[] stackTraceElementArr) {
        our0 our0Var = this.f114923l;
        if (our0Var != null) {
            our0Var.m166129b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: e */
    public final void mo136908e(@Nullable View view) {
        this.f114916e.m171476a(view);
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: f */
    public final void mo136909f(@Nullable MotionEvent motionEvent) {
        s8w0 s8w0VarM158721a = this.f114915d.m158721a();
        if (s8w0VarM158721a != null) {
            try {
                s8w0VarM158721a.mo120310b(null, motionEvent);
            } catch (zzfso e) {
                this.f114917f.m167827c(e.zza(), -1L, e);
            }
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: g */
    public final String mo136910g(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        m138248s();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132453x2)).booleanValue()) {
            this.f114922k.m205678i();
        }
        m138246p();
        s8w0 s8w0VarM158721a = this.f114915d.m158721a();
        if (s8w0VarM158721a == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strMo120312d = s8w0VarM158721a.mo120312d(context, null, str, view, activity);
        this.f114917f.m167830f(5000, System.currentTimeMillis() - jCurrentTimeMillis, strMo120312d, null);
        return strMo120312d;
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: h */
    public final String mo136911h(Context context, @Nullable View view, @Nullable Activity activity) {
        m138248s();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132453x2)).booleanValue()) {
            this.f114922k.m205680k(context, view);
        }
        m138246p();
        s8w0 s8w0VarM158721a = this.f114915d.m158721a();
        if (s8w0VarM158721a == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strMo120311c = s8w0VarM158721a.mo120311c(context, null, view, activity);
        this.f114917f.m167830f(5002, System.currentTimeMillis() - jCurrentTimeMillis, strMo120311c, null);
        return strMo120311c;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m138245o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        gaw0 gaw0VarM138249t = m138249t(1);
        if (gaw0VarM138249t == null) {
            this.f114917f.m167828d(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f114915d.m158723c(gaw0VarM138249t)) {
            this.f114927p = true;
            this.f114920i.countDown();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m138246p() {
        if (this.f114926o) {
            return;
        }
        synchronized (this.f114925n) {
            try {
                if (!this.f114926o) {
                    if ((System.currentTimeMillis() / 1000) - this.f114924m < 3600) {
                        return;
                    }
                    gaw0 gaw0VarM158722b = this.f114915d.m158722b();
                    if ((gaw0VarM158722b == null || gaw0VarM158722b.m125039d(3600L)) && t9w0.m187683a(this.f114928q)) {
                        this.f114918g.execute(new htr0(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final synchronized boolean m138247r() {
        return this.f114927p;
    }

    /* JADX INFO: renamed from: s */
    public final void m138248s() {
        dvr0 dvr0Var = this.f114921j;
        if (dvr0Var != null) {
            dvr0Var.m113817h();
        }
    }

    /* JADX INFO: renamed from: t */
    public final gaw0 m138249t(int i) {
        if (t9w0.m187683a(this.f114928q)) {
            return ((Boolean) d1s0.m109677c().m144697a(m7s0.f132211e2)).booleanValue() ? this.f114914c.m153846c(1) : this.f114913b.m130247c(1);
        }
        return null;
    }
}
