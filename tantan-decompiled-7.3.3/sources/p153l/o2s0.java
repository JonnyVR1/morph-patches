package p153l;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.core.glcore.util.ErrorCode;
import com.google.android.gms.internal.ads.C2279u;
import com.google.android.gms.internal.ads.C2287v;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2271t;
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
public final class o2s0 implements r2s0 {

    /* JADX INFO: renamed from: r */
    @Nullable
    public static o2s0 f144768r;

    /* JADX INFO: renamed from: a */
    public final Context f144769a;

    /* JADX INFO: renamed from: b */
    public final njw0 f144770b;

    /* JADX INFO: renamed from: c */
    public final sjw0 f144771c;

    /* JADX INFO: renamed from: d */
    public final tjw0 f144772d;

    /* JADX INFO: renamed from: e */
    public final v3s0 f144773e;

    /* JADX INFO: renamed from: f */
    public final vhw0 f144774f;

    /* JADX INFO: renamed from: g */
    public final Executor f144775g;

    /* JADX INFO: renamed from: h */
    public final rjw0 f144776h;

    /* JADX INFO: renamed from: j */
    public final j4s0 f144778j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final c4s0 f144779k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final u3s0 f144780l;

    /* JADX INFO: renamed from: o */
    public volatile boolean f144783o;

    /* JADX INFO: renamed from: p */
    public volatile boolean f144784p;

    /* JADX INFO: renamed from: q */
    public final int f144785q;

    /* JADX INFO: renamed from: m */
    @VisibleForTesting
    public volatile long f144781m = 0;

    /* JADX INFO: renamed from: n */
    public final Object f144782n = new Object();

    /* JADX INFO: renamed from: i */
    public final CountDownLatch f144777i = new CountDownLatch(1);

    @VisibleForTesting
    public o2s0(@NonNull Context context, @NonNull vhw0 vhw0Var, @NonNull njw0 njw0Var, @NonNull sjw0 sjw0Var, @NonNull tjw0 tjw0Var, @NonNull v3s0 v3s0Var, @NonNull Executor executor, @NonNull qhw0 qhw0Var, int i, @Nullable j4s0 j4s0Var, @Nullable c4s0 c4s0Var, @Nullable u3s0 u3s0Var) {
        this.f144784p = false;
        this.f144769a = context;
        this.f144774f = vhw0Var;
        this.f144770b = njw0Var;
        this.f144771c = sjw0Var;
        this.f144772d = tjw0Var;
        this.f144773e = v3s0Var;
        this.f144775g = executor;
        this.f144785q = i;
        this.f144778j = j4s0Var;
        this.f144779k = c4s0Var;
        this.f144780l = u3s0Var;
        this.f144784p = false;
        this.f144776h = new c2s0(this, qhw0Var);
    }

    /* JADX INFO: renamed from: i */
    public static synchronized o2s0 m165747i(@NonNull String str, @NonNull Context context, boolean z, boolean z2) {
        return m165748j(str, context, Executors.newCachedThreadPool(), z, z2);
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static synchronized o2s0 m165748j(@NonNull String str, @NonNull Context context, @NonNull Executor executor, boolean z, boolean z2) {
        try {
            if (f144768r == null) {
                whw0 whw0VarM211081a = xhw0.m211081a();
                whw0VarM211081a.mo206520a(str);
                whw0VarM211081a.mo206522c(z);
                xhw0 xhw0VarMo206523d = whw0VarM211081a.mo206523d();
                vhw0 vhw0VarM201299a = vhw0.m201299a(context, executor, z2);
                y2s0 y2s0VarM214100c = ((Boolean) jas0.m144075c().m176505a(sgs0.f168335i3)).booleanValue() ? y2s0.m214100c(context) : null;
                j4s0 j4s0VarM143448d = ((Boolean) jas0.m144075c().m176505a(sgs0.f168348j3)).booleanValue() ? j4s0.m143448d(context, executor) : null;
                c4s0 c4s0Var = ((Boolean) jas0.m144075c().m176505a(sgs0.f168524x2)).booleanValue() ? new c4s0() : null;
                u3s0 u3s0Var = ((Boolean) jas0.m144075c().m176505a(sgs0.f168548z2)).booleanValue() ? new u3s0() : null;
                siw0 siw0VarM186040e = siw0.m186040e(context, executor, vhw0VarM201299a, xhw0VarMo206523d);
                zzawc zzawcVar = new zzawc(context);
                c4s0 c4s0Var2 = c4s0Var;
                v3s0 v3s0Var = new v3s0(xhw0VarMo206523d, siw0VarM186040e, new ViewOnAttachStateChangeListenerC2271t(context, zzawcVar), zzawcVar, y2s0VarM214100c, j4s0VarM143448d, c4s0Var2, u3s0Var);
                int iM219950b = ziw0.m219950b(context, vhw0VarM201299a);
                qhw0 qhw0Var = new qhw0();
                o2s0 o2s0Var = new o2s0(context, vhw0VarM201299a, new njw0(context, iM219950b), new sjw0(context, iM219950b, new b2s0(vhw0VarM201299a), ((Boolean) jas0.m144075c().m176505a(sgs0.f168308g2)).booleanValue()), new tjw0(context, v3s0Var, vhw0VarM201299a, qhw0Var), v3s0Var, executor, qhw0Var, iM219950b, j4s0VarM143448d, c4s0Var2, u3s0Var);
                f144768r = o2s0Var;
                o2s0Var.m165762o();
                f144768r.m165763p();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f144768r;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: all -> 0x009d, zzhag -> 0x00a0, TryCatch #2 {zzhag -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:60:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[Catch: all -> 0x009d, zzhag -> 0x00a0, TryCatch #2 {zzhag -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:60:0x0021, outer: #1 }] */
    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m165752n(o2s0 o2s0Var) {
        String str;
        String strM13422T;
        int length;
        boolean zM163476a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        mjw0 mjw0VarM165766t = o2s0Var.m165766t(1);
        if (mjw0VarM165766t != null) {
            String strM13423U = mjw0VarM165766t.m158642a().m13423U();
            strM13422T = mjw0VarM165766t.m158642a().m13422T();
            str = strM13423U;
        } else {
            str = null;
            strM13422T = null;
        }
        try {
            try {
                zzfsk zzfskVarM144994a = jiw0.m144994a(o2s0Var.f144769a, 1, o2s0Var.f144785q, str, strM13422T, "1", o2s0Var.f144774f);
                byte[] bArr = zzfskVarM144994a.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    o2s0Var.f144774f.m201303d(ErrorCode.EDIT_RESUME_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        C2279u c2279uM13385M = C2279u.m13385M(zzgyl.zzv(bArr, 0, length), jhx0.m144944a());
                        if (c2279uM13385M.m13386N().m13423U().isEmpty() || c2279uM13385M.m13386N().m13422T().isEmpty() || c2279uM13385M.m13387O().zzA().length == 0) {
                            o2s0Var.f144774f.m201303d(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            mjw0 mjw0VarM165766t2 = o2s0Var.m165766t(1);
                            if (mjw0VarM165766t2 != null) {
                                C2287v c2287vM158642a = mjw0VarM165766t2.m158642a();
                                if (c2279uM13385M.m13386N().m13423U().equals(c2287vM158642a.m13423U()) && c2279uM13385M.m13386N().m13422T().equals(c2287vM158642a.m13422T())) {
                                    o2s0Var.f144774f.m201303d(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                                }
                            }
                            rjw0 rjw0Var = o2s0Var.f144776h;
                            int i = zzfskVarM144994a.zzc;
                            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168282e2)).booleanValue()) {
                                zM163476a = o2s0Var.f144770b.m163476a(c2279uM13385M, rjw0Var);
                            } else if (i == 3) {
                                zM163476a = o2s0Var.f144771c.m186336a(c2279uM13385M);
                            } else if (i == 4) {
                                zM163476a = o2s0Var.f144771c.m186337b(c2279uM13385M, rjw0Var);
                            } else {
                                o2s0Var.f144774f.m201303d(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zM163476a) {
                                mjw0 mjw0VarM165766t3 = o2s0Var.m165766t(1);
                                if (mjw0VarM165766t3 != null) {
                                    if (o2s0Var.f144772d.m191463c(mjw0VarM165766t3)) {
                                        o2s0Var.f144784p = true;
                                    }
                                    o2s0Var.f144781m = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                o2s0Var.f144774f.m201303d(ErrorCode.CAMERA_TAKE_PHOTO_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        o2s0Var.f144774f.m201303d(TXLiteAVCode.EVT_AUDIO_DEVICE_ROUTE_CHANGED, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzhag e) {
                o2s0Var.f144774f.m201302c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            o2s0Var.f144777i.countDown();
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: a */
    public final String mo165754a(Context context) {
        m165765s();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168524x2)).booleanValue()) {
            this.f144779k.m107969j();
        }
        m165763p();
        yhw0 yhw0VarM191461a = this.f144772d.m191461a();
        if (yhw0VarM191461a == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strMo154583a = yhw0VarM191461a.mo154583a(context, null);
        this.f144774f.m201305f(5001, System.currentTimeMillis() - jCurrentTimeMillis, strMo154583a, null);
        return strMo154583a;
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: b */
    public final void mo165755b(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168434pb)).booleanValue() || (displayMetrics = this.f144769a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo165759f(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo165759f(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        mo165759f(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: c */
    public final String mo165756c(Context context, @Nullable String str, @Nullable View view) {
        return mo165760g(context, str, view, null);
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: d */
    public final void mo165757d(StackTraceElement[] stackTraceElementArr) {
        u3s0 u3s0Var = this.f144780l;
        if (u3s0Var != null) {
            u3s0Var.m194420b(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: e */
    public final void mo165758e(@Nullable View view) {
        this.f144773e.m199627a(view);
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: f */
    public final void mo165759f(@Nullable MotionEvent motionEvent) {
        yhw0 yhw0VarM191461a = this.f144772d.m191461a();
        if (yhw0VarM191461a != null) {
            try {
                yhw0VarM191461a.mo154584b(null, motionEvent);
            } catch (zzfso e) {
                this.f144774f.m201302c(e.zza(), -1L, e);
            }
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: g */
    public final String mo165760g(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        m165765s();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168524x2)).booleanValue()) {
            this.f144779k.m107968i();
        }
        m165763p();
        yhw0 yhw0VarM191461a = this.f144772d.m191461a();
        if (yhw0VarM191461a == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strMo154586d = yhw0VarM191461a.mo154586d(context, null, str, view, activity);
        this.f144774f.m201305f(5000, System.currentTimeMillis() - jCurrentTimeMillis, strMo154586d, null);
        return strMo154586d;
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: h */
    public final String mo165761h(Context context, @Nullable View view, @Nullable Activity activity) {
        m165765s();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168524x2)).booleanValue()) {
            this.f144779k.m107970k(context, view);
        }
        m165763p();
        yhw0 yhw0VarM191461a = this.f144772d.m191461a();
        if (yhw0VarM191461a == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strMo154585c = yhw0VarM191461a.mo154585c(context, null, view, activity);
        this.f144774f.m201305f(5002, System.currentTimeMillis() - jCurrentTimeMillis, strMo154585c, null);
        return strMo154585c;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m165762o() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        mjw0 mjw0VarM165766t = m165766t(1);
        if (mjw0VarM165766t == null) {
            this.f144774f.m201303d(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f144772d.m191463c(mjw0VarM165766t)) {
            this.f144784p = true;
            this.f144777i.countDown();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m165763p() {
        if (this.f144783o) {
            return;
        }
        synchronized (this.f144782n) {
            try {
                if (!this.f144783o) {
                    if ((System.currentTimeMillis() / 1000) - this.f144781m < 3600) {
                        return;
                    }
                    mjw0 mjw0VarM191462b = this.f144772d.m191462b();
                    if ((mjw0VarM191462b == null || mjw0VarM191462b.m158645d(3600L)) && ziw0.m219949a(this.f144785q)) {
                        this.f144775g.execute(new n2s0(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final synchronized boolean m165764r() {
        return this.f144784p;
    }

    /* JADX INFO: renamed from: s */
    public final void m165765s() {
        j4s0 j4s0Var = this.f144778j;
        if (j4s0Var != null) {
            j4s0Var.m143454h();
        }
    }

    /* JADX INFO: renamed from: t */
    public final mjw0 m165766t(int i) {
        if (ziw0.m219949a(this.f144785q)) {
            return ((Boolean) jas0.m144075c().m176505a(sgs0.f168282e2)).booleanValue() ? this.f144771c.m186338c(1) : this.f144770b.m163478c(1);
        }
        return null;
    }
}
