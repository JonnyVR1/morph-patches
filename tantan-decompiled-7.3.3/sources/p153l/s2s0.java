package p153l;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2143d;
import com.google.android.gms.internal.ads.C2223n;
import com.google.android.gms.internal.ads.zzavz;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s2s0 implements r2s0 {

    /* JADX INFO: renamed from: u */
    public static volatile b4s0 f165910u;

    /* JADX INFO: renamed from: a */
    public MotionEvent f165911a;

    /* JADX INFO: renamed from: j */
    public double f165920j;

    /* JADX INFO: renamed from: k */
    public double f165921k;

    /* JADX INFO: renamed from: l */
    public double f165922l;

    /* JADX INFO: renamed from: m */
    public float f165923m;

    /* JADX INFO: renamed from: n */
    public float f165924n;

    /* JADX INFO: renamed from: o */
    public float f165925o;

    /* JADX INFO: renamed from: p */
    public float f165926p;

    /* JADX INFO: renamed from: s */
    public DisplayMetrics f165929s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public u3s0 f165930t;

    /* JADX INFO: renamed from: b */
    public final LinkedList f165912b = new LinkedList();

    /* JADX INFO: renamed from: c */
    public long f165913c = 0;

    /* JADX INFO: renamed from: d */
    public long f165914d = 0;

    /* JADX INFO: renamed from: e */
    public long f165915e = 0;

    /* JADX INFO: renamed from: f */
    public long f165916f = 0;

    /* JADX INFO: renamed from: g */
    public long f165917g = 0;

    /* JADX INFO: renamed from: h */
    public long f165918h = 0;

    /* JADX INFO: renamed from: i */
    public long f165919i = 0;

    /* JADX INFO: renamed from: q */
    public boolean f165927q = false;

    /* JADX INFO: renamed from: r */
    public boolean f165928r = false;

    public s2s0(Context context) {
        try {
            s0s0.m183974d();
            this.f165929s = context.getResources().getDisplayMetrics();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168548z2)).booleanValue()) {
                this.f165930t = new u3s0();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: a */
    public final String mo165754a(Context context) {
        if (!e4s0.m119479c()) {
            return m184143o(context, null, 1, null, null, null);
        }
        wtq0.m207906a("The caller must not be called from the UI thread.");
        return null;
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo165755b(int i, int i2, int i3) {
        try {
            if (this.f165911a != null) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168425p2)).booleanValue()) {
                    m184142n();
                } else {
                    this.f165911a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f165929s;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f165911a = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f165911a = null;
            }
            this.f165928r = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: c */
    public final String mo165756c(Context context, @Nullable String str, @Nullable View view) {
        return m184143o(context, str, 3, view, null, null);
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: d */
    public final void mo165757d(StackTraceElement[] stackTraceElementArr) {
        u3s0 u3s0Var;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168548z2)).booleanValue() || (u3s0Var = this.f165930t) == null) {
            return;
        }
        u3s0Var.m194420b(Arrays.asList(stackTraceElementArr));
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: f */
    public final synchronized void mo165759f(@Nullable MotionEvent motionEvent) {
        Long l2;
        try {
            if (this.f165927q) {
                m184142n();
                this.f165927q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f165920j = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                this.f165921k = motionEvent.getRawX();
                this.f165922l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.f165921k;
                double d2 = rawY - this.f165922l;
                this.f165920j += Math.sqrt((d * d) + (d2 * d2));
                this.f165921k = rawX;
                this.f165922l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f165911a = motionEventObtain;
                        this.f165912b.add(motionEventObtain);
                        if (this.f165912b.size() > 6) {
                            ((MotionEvent) this.f165912b.remove()).recycle();
                        }
                        this.f165915e++;
                        this.f165917g = mo184137i(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f165914d += (long) (motionEvent.getHistorySize() + 1);
                        d4s0 d4s0VarMo184141m = mo184141m(motionEvent);
                        Long l3 = d4s0VarMo184141m.f85072d;
                        if (l3 != null && d4s0VarMo184141m.f85075g != null) {
                            this.f165918h += l3.longValue() + d4s0VarMo184141m.f85075g.longValue();
                        }
                        if (this.f165929s != null && (l2 = d4s0VarMo184141m.f85073e) != null && d4s0VarMo184141m.f85076h != null) {
                            this.f165919i += l2.longValue() + d4s0VarMo184141m.f85076h.longValue();
                        }
                    } else if (action2 == 3) {
                        this.f165916f++;
                    }
                } catch (zzavz unused) {
                }
            } else {
                this.f165923m = motionEvent.getX();
                this.f165924n = motionEvent.getY();
                this.f165925o = motionEvent.getRawX();
                this.f165926p = motionEvent.getRawY();
                this.f165913c++;
            }
            this.f165928r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: g */
    public final String mo165760g(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return m184143o(context, str, 3, view, activity, null);
    }

    @Override // p153l.r2s0
    /* JADX INFO: renamed from: h */
    public final String mo165761h(Context context, @Nullable View view, @Nullable Activity activity) {
        return m184143o(context, null, 2, view, activity, null);
    }

    /* JADX INFO: renamed from: i */
    public abstract long mo184137i(StackTraceElement[] stackTraceElementArr) throws zzavz;

    /* JADX INFO: renamed from: j */
    public abstract fzr0 mo184138j(Context context, View view, Activity activity);

    /* JADX INFO: renamed from: k */
    public abstract fzr0 mo184139k(Context context, C2143d c2143d);

    /* JADX INFO: renamed from: l */
    public abstract fzr0 mo184140l(Context context, View view, Activity activity);

    /* JADX INFO: renamed from: m */
    public abstract d4s0 mo184141m(MotionEvent motionEvent) throws zzavz;

    /* JADX INFO: renamed from: n */
    public final void m184142n() {
        this.f165917g = 0L;
        this.f165913c = 0L;
        this.f165914d = 0L;
        this.f165915e = 0L;
        this.f165916f = 0L;
        this.f165918h = 0L;
        this.f165919i = 0L;
        if (this.f165912b.isEmpty()) {
            MotionEvent motionEvent = this.f165911a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.f165912b.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f165912b.clear();
        }
        this.f165911a = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX INFO: renamed from: o */
    public final String m184143o(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        q2s0 q2s0VarM102519d;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        String strM183971a;
        int i5;
        int i6;
        fzr0 fzr0VarMo184139k;
        int i7;
        int i8;
        int i9 = i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168451r2)).booleanValue();
        fzr0 fzr0VarMo184138j = null;
        if (zBooleanValue) {
            q2s0VarM102519d = f165910u != null ? f165910u.m102519d() : null;
            str2 = "be";
        } else {
            q2s0VarM102519d = null;
            str2 = null;
        }
        try {
            if (i9 == 3) {
                fzr0VarMo184138j = mo184138j(context, view, activity);
                try {
                    this.f165927q = true;
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
                            q2s0VarM102519d.m175096c(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i3 = i4;
                        q2s0VarM102519d.m175096c(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            } else {
                if (i9 == 2) {
                    fzr0VarMo184139k = mo184140l(context, view, activity);
                    i7 = 1008;
                } else {
                    fzr0VarMo184139k = mo184139k(context, null);
                    i7 = 1000;
                }
                fzr0VarMo184138j = fzr0VarMo184139k;
                i8 = i7;
            }
            if (!zBooleanValue || q2s0VarM102519d == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    q2s0VarM102519d.m175096c(i8, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    if (zBooleanValue && q2s0VarM102519d != null) {
                        if (i9 == i2) {
                            i4 = 1003;
                        } else {
                            if (i9 == 2) {
                                i4 = 1009;
                            } else {
                                i3 = 1001;
                                i9 = 1;
                            }
                            q2s0VarM102519d.m175096c(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i3 = i4;
                        q2s0VarM102519d.m175096c(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            i2 = 3;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (fzr0VarMo184138j != null) {
            try {
                if (((C2223n) fzr0VarMo184138j.m185950m()).zzaz() == 0) {
                    strM183971a = Integer.toString(5);
                } else {
                    C2223n c2223n = (C2223n) fzr0VarMo184138j.m185950m();
                    boolean z = s0s0.f165725a;
                    strM183971a = s0s0.m183971a(c2223n.m12798h(), str);
                    if (zBooleanValue && q2s0VarM102519d != null) {
                        if (i9 == i2) {
                            i5 = 1006;
                        } else {
                            i5 = i9 == 2 ? 1010 : 1004;
                        }
                        q2s0 q2s0Var = q2s0VarM102519d;
                        String str3 = str2;
                        try {
                            q2s0Var.m175096c(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str3, null);
                        } catch (Exception e4) {
                            e = e4;
                            q2s0VarM102519d = q2s0Var;
                            str2 = str3;
                            String string = Integer.toString(7);
                            if (zBooleanValue && q2s0VarM102519d != null) {
                                if (i9 == i2) {
                                    i6 = 1007;
                                } else {
                                    i6 = i9 == 2 ? 1011 : 1005;
                                }
                                q2s0VarM102519d.m175096c(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e);
                            }
                            return string;
                        }
                    }
                }
            } catch (Exception e5) {
                e = e5;
            }
        } else {
            strM183971a = Integer.toString(5);
        }
        return strM183971a;
    }
}
