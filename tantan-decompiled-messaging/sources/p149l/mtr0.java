package p149l;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2120d;
import com.google.android.gms.internal.ads.C2200n;
import com.google.android.gms.internal.ads.zzavz;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mtr0 implements ltr0 {

    /* JADX INFO: renamed from: u */
    public static volatile vur0 f135672u;

    /* JADX INFO: renamed from: a */
    public MotionEvent f135673a;

    /* JADX INFO: renamed from: j */
    public double f135682j;

    /* JADX INFO: renamed from: k */
    public double f135683k;

    /* JADX INFO: renamed from: l */
    public double f135684l;

    /* JADX INFO: renamed from: m */
    public float f135685m;

    /* JADX INFO: renamed from: n */
    public float f135686n;

    /* JADX INFO: renamed from: o */
    public float f135687o;

    /* JADX INFO: renamed from: p */
    public float f135688p;

    /* JADX INFO: renamed from: s */
    public DisplayMetrics f135691s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public our0 f135692t;

    /* JADX INFO: renamed from: b */
    public final LinkedList f135674b = new LinkedList();

    /* JADX INFO: renamed from: c */
    public long f135675c = 0;

    /* JADX INFO: renamed from: d */
    public long f135676d = 0;

    /* JADX INFO: renamed from: e */
    public long f135677e = 0;

    /* JADX INFO: renamed from: f */
    public long f135678f = 0;

    /* JADX INFO: renamed from: g */
    public long f135679g = 0;

    /* JADX INFO: renamed from: h */
    public long f135680h = 0;

    /* JADX INFO: renamed from: i */
    public long f135681i = 0;

    /* JADX INFO: renamed from: q */
    public boolean f135689q = false;

    /* JADX INFO: renamed from: r */
    public boolean f135690r = false;

    public mtr0(Context context) {
        try {
            mrr0.m156075d();
            this.f135691s = context.getResources().getDisplayMetrics();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132477z2)).booleanValue()) {
                this.f135692t = new our0();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: a */
    public final String mo136904a(Context context) {
        if (!yur0.m216156c()) {
            return m156357o(context, null, 1, null, null, null);
        }
        qkq0.m175383a("The caller must not be called from the UI thread.");
        return null;
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo136905b(int i, int i2, int i3) {
        try {
            if (this.f135673a != null) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132354p2)).booleanValue()) {
                    m156356n();
                } else {
                    this.f135673a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f135691s;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f135673a = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f135673a = null;
            }
            this.f135690r = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: c */
    public final String mo136906c(Context context, @Nullable String str, @Nullable View view) {
        return m156357o(context, str, 3, view, null, null);
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: d */
    public final void mo136907d(StackTraceElement[] stackTraceElementArr) {
        our0 our0Var;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132477z2)).booleanValue() || (our0Var = this.f135692t) == null) {
            return;
        }
        our0Var.m166129b(Arrays.asList(stackTraceElementArr));
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: f */
    public final synchronized void mo136909f(@Nullable MotionEvent motionEvent) {
        Long l2;
        try {
            if (this.f135689q) {
                m156356n();
                this.f135689q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f135682j = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                this.f135683k = motionEvent.getRawX();
                this.f135684l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.f135683k;
                double d2 = rawY - this.f135684l;
                this.f135682j += Math.sqrt((d * d) + (d2 * d2));
                this.f135683k = rawX;
                this.f135684l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f135673a = motionEventObtain;
                        this.f135674b.add(motionEventObtain);
                        if (this.f135674b.size() > 6) {
                            ((MotionEvent) this.f135674b.remove()).recycle();
                        }
                        this.f135677e++;
                        this.f135679g = mo156351i(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f135676d += (long) (motionEvent.getHistorySize() + 1);
                        xur0 xur0VarMo156355m = mo156355m(motionEvent);
                        Long l3 = xur0VarMo156355m.f194548d;
                        if (l3 != null && xur0VarMo156355m.f194551g != null) {
                            this.f135680h += l3.longValue() + xur0VarMo156355m.f194551g.longValue();
                        }
                        if (this.f135691s != null && (l2 = xur0VarMo156355m.f194549e) != null && xur0VarMo156355m.f194552h != null) {
                            this.f135681i += l2.longValue() + xur0VarMo156355m.f194552h.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f135678f++;
                    }
                } catch (zzavz unused) {
                }
            } else {
                this.f135685m = motionEvent.getX();
                this.f135686n = motionEvent.getY();
                this.f135687o = motionEvent.getRawX();
                this.f135688p = motionEvent.getRawY();
                this.f135675c++;
            }
            this.f135690r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: g */
    public final String mo136910g(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return m156357o(context, str, 3, view, activity, null);
    }

    @Override // p149l.ltr0
    /* JADX INFO: renamed from: h */
    public final String mo136911h(Context context, @Nullable View view, @Nullable Activity activity) {
        return m156357o(context, null, 2, view, activity, null);
    }

    /* JADX INFO: renamed from: i */
    public abstract long mo156351i(StackTraceElement[] stackTraceElementArr) throws zzavz;

    /* JADX INFO: renamed from: j */
    public abstract zpr0 mo156352j(Context context, View view, Activity activity);

    /* JADX INFO: renamed from: k */
    public abstract zpr0 mo156353k(Context context, C2120d c2120d);

    /* JADX INFO: renamed from: l */
    public abstract zpr0 mo156354l(Context context, View view, Activity activity);

    /* JADX INFO: renamed from: m */
    public abstract xur0 mo156355m(MotionEvent motionEvent) throws zzavz;

    /* JADX INFO: renamed from: n */
    public final void m156356n() {
        this.f135679g = 0L;
        this.f135675c = 0L;
        this.f135676d = 0L;
        this.f135677e = 0L;
        this.f135678f = 0L;
        this.f135680h = 0L;
        this.f135681i = 0L;
        if (this.f135674b.isEmpty()) {
            MotionEvent motionEvent = this.f135673a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.f135674b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f135674b.clear();
        }
        this.f135673a = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX INFO: renamed from: o */
    public final String m156357o(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        ktr0 ktr0VarM200103d;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        String strM156072a;
        int i5;
        int i6;
        zpr0 zpr0VarMo156353k;
        int i7;
        int i8;
        int i9 = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132380r2)).booleanValue();
        zpr0 zpr0VarMo156352j = null;
        if (zBooleanValue) {
            ktr0VarM200103d = f135672u != null ? f135672u.m200103d() : null;
            str2 = "be";
        } else {
            ktr0VarM200103d = null;
            str2 = null;
        }
        try {
            if (i9 == 3) {
                zpr0VarMo156352j = mo156352j(context, view, activity);
                try {
                    this.f135689q = true;
                    i8 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (zBooleanValue) {
                        if (i9 == i2) {
                            i4 = 1003;
                        } else {
                            if (i9 == 2) {
                                i4 = 1009;
                            } else {
                                i3 = 1001;
                                i9 = 1;
                            }
                            ktr0VarM200103d.m147219c(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i3 = i4;
                        ktr0VarM200103d.m147219c(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            } else {
                if (i9 == 2) {
                    zpr0VarMo156353k = mo156354l(context, view, activity);
                    i7 = 1008;
                } else {
                    zpr0VarMo156353k = mo156353k(context, null);
                    i7 = 1000;
                }
                zpr0VarMo156352j = zpr0VarMo156353k;
                i8 = i7;
            }
            if (!zBooleanValue || ktr0VarM200103d == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    ktr0VarM200103d.m147219c(i8, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (zBooleanValue && ktr0VarM200103d != null) {
                        if (i9 == i2) {
                            i4 = 1003;
                        } else {
                            if (i9 == 2) {
                                i4 = 1009;
                            } else {
                                i3 = 1001;
                                i9 = 1;
                            }
                            ktr0VarM200103d.m147219c(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i3 = i4;
                        ktr0VarM200103d.m147219c(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (zpr0VarMo156352j != null) {
            try {
                if (((C2200n) zpr0VarMo156352j.m153521m()).zzaz() == 0) {
                    strM156072a = Integer.toString(5);
                } else {
                    C2200n c2200n = (C2200n) zpr0VarMo156352j.m153521m();
                    boolean z = mrr0.f135403a;
                    strM156072a = mrr0.m156072a(c2200n.m12744h(), str);
                    if (zBooleanValue && ktr0VarM200103d != null) {
                        if (i9 == i2) {
                            i5 = 1006;
                        } else {
                            i5 = i9 == 2 ? 1010 : 1004;
                        }
                        ktr0 ktr0Var = ktr0VarM200103d;
                        String str3 = str2;
                        try {
                            ktr0Var.m147219c(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str3, null);
                        } catch (Exception e4) {
                            e = e4;
                            ktr0VarM200103d = ktr0Var;
                            str2 = str3;
                            String string = Integer.toString(7);
                            if (zBooleanValue && ktr0VarM200103d != null) {
                                if (i9 == i2) {
                                    i6 = 1007;
                                } else {
                                    i6 = i9 == 2 ? 1011 : 1005;
                                }
                                ktr0VarM200103d.m147219c(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e);
                            }
                            return string;
                        }
                    }
                }
            } catch (Exception e5) {
                e = e5;
            }
        } else {
            strM156072a = Integer.toString(5);
        }
        return strM156072a;
    }
}
