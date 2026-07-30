package p007l;

import android.R;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.ColorInt;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.App;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import l.hpd0;
import l.osi0;
import l.t100;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class lsi0 {

    /* JADX INFO: renamed from: b */
    public static WeakReference<Toast> f3246b;

    /* JADX INFO: renamed from: c */
    public static C0606a f3247c;

    /* JADX INFO: renamed from: a */
    public static hpd0 f3245a = new hpd0("DEBUG_TOAST_SWITCH", Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public static ArrayList<String> f3248d = new ArrayList<>();

    /* JADX INFO: renamed from: l.lsi0$a */
    public static class C0606a {

        /* JADX INFO: renamed from: a */
        public final String f3249a;

        /* JADX INFO: renamed from: b */
        public final long f3250b;

        /* JADX INFO: renamed from: c */
        public final boolean f3251c;

        public C0606a(String str, long j, boolean z) {
            this.f3249a = str;
            this.f3250b = j;
            this.f3251c = z;
        }

        public String toString() {
            return "ThrottleToastEvent{msg='" + this.f3249a + "', emitTimeInMills=" + this.f3250b + ", isMsgType=" + this.f3251c + '}';
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: A */
    public static void m9819A(String str, boolean z) {
        m9820B(str, z, false);
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public static void m9820B(String str, boolean z, boolean z2) {
        m9825G(null, str, null);
    }

    /* JADX INFO: renamed from: C */
    public static void m9821C(int i) {
        m9833g(hvc0.m9353c(i), true);
    }

    /* JADX INFO: renamed from: D */
    public static void m9822D(String str) {
        m9833g(str, true);
    }

    /* JADX INFO: renamed from: E */
    public static void m9823E(Activity activity, final Toast toast) {
        if (activity == null) {
            activity = (Act.foreground_() == null || Act.foreground_().f1042a == null) ? null : Act.foreground_().f1042a.get();
        }
        if (activity == null) {
            return;
        }
        if (!activity.isFinishing()) {
            e51.m9030M(new Runnable() { // from class: l.isi0
                @Override // java.lang.Runnable
                public final void run() {
                    toast.show();
                }
            });
            return;
        }
        if (Act.globalLifeCycle_().isEmpty() || Act.globalLifeCycle_().values().isEmpty()) {
            return;
        }
        for (ArrayList<Act.C0211r> arrayList : Act.globalLifeCycle_().values()) {
            if (!vwb.J(arrayList)) {
                Iterator<Act.C0211r> it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity2 = it.next().f1042a.get();
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        e51.m9025H(App.f1068e, new Runnable() { // from class: l.hsi0
                            @Override // java.lang.Runnable
                            public final void run() {
                                toast.show();
                            }
                        }, 300L);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m9824F(Activity activity, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m9825G(activity, str, null);
    }

    /* JADX INFO: renamed from: G */
    public static void m9825G(final Activity activity, final String str, @ColorInt final Integer num) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m9030M(new Runnable() { // from class: l.fsi0
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.m9841o(activity, str, num);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m9826H(final String str, final Drawable drawable, final Drawable drawable2) {
        if (Act.foreground_() != null) {
            e51.m9030M(new Runnable() { // from class: l.jsi0
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m9831e(str, drawable, drawable2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9830d(String str, Drawable drawable) {
        View viewInflate = LayoutInflater.from(App.f1068e).inflate(b6c0.f1915a, (ViewGroup) null);
        String strM9424c = it6.m9424c(str);
        ImageView imageView = (ImageView) viewInflate.findViewById(p4c0.f3643U);
        TextView textView = (TextView) viewInflate.findViewById(R.id.message);
        textView.setText(strM9424c);
        xdl0.M(textView, !TextUtils.isEmpty(strM9424c));
        imageView.setBackgroundDrawable(drawable);
        Toast toastM9842p = m9842p();
        toastM9842p.setView(viewInflate);
        toastM9842p.setGravity(17, 0, 0);
        toastM9842p.setDuration(0);
        m9823E(null, toastM9842p);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9831e(String str, Drawable drawable, Drawable drawable2) {
        Toast toastM9842p = m9842p();
        TextView textView = new TextView(App.f1068e);
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(t100.d(18.0f));
        textView.setBackgroundDrawable(drawable2);
        textView.setTextColor(-1);
        textView.setTextSize(14.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        toastM9842p.setView(textView);
        toastM9842p.setDuration(1);
        m9823E(null, toastM9842p);
    }

    /* JADX INFO: renamed from: g */
    public static void m9833g(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0606a c0606a = f3247c;
        if (c0606a == null || !TextUtils.equals(c0606a.f3249a, str) || jCurrentTimeMillis - f3247c.f3250b >= 30000) {
            synchronized (lsi0.class) {
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C0606a c0606a2 = f3247c;
                    if (c0606a2 == null || !TextUtils.equals(c0606a2.f3249a, str) || jCurrentTimeMillis2 - f3247c.f3250b >= 30000) {
                        C0606a c0606a3 = new C0606a(str, jCurrentTimeMillis2, z);
                        f3247c = c0606a3;
                        Objects.toString(c0606a3);
                        C0606a c0606a4 = f3247c;
                        if (c0606a4.f3251c) {
                            m9851y(c0606a4.f3249a);
                        } else {
                            m9836j(c0606a4.f3249a);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m9834h(int i) {
        m9837k(hvc0.m9353c(i), true);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static void m9835i(int i, boolean z) {
        m9837k(hvc0.m9353c(i), z);
    }

    /* JADX INFO: renamed from: j */
    public static void m9836j(String str) {
        m9837k(str, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static void m9837k(String str, boolean z) {
        m9825G(null, str, Integer.valueOf(App.f1068e.getResources().getColor(t0c0.f4237u)));
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public static void m9838l(String str, boolean z, boolean z2) {
        m9837k(str, z);
    }

    /* JADX INFO: renamed from: n */
    public static void m9840n(int i) {
        m9833g(hvc0.m9353c(i), false);
    }

    /* JADX INFO: renamed from: o */
    public static void m9841o(Activity activity, String str, @ColorInt Integer num) {
        m9845s();
        Toast toastM9848v = m9848v(str, num);
        f3246b = new WeakReference<>(toastM9848v);
        m9823E(activity, toastM9848v);
    }

    /* JADX INFO: renamed from: p */
    public static Toast m9842p() {
        return osi0.c();
    }

    /* JADX INFO: renamed from: q */
    public static void m9843q(final String str, final Drawable drawable) {
        if (Act.foreground_() != null) {
            e51.m9030M(new Runnable() { // from class: l.ksi0
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m9830d(str, drawable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m9845s() {
        WeakReference<Toast> weakReference = f3246b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f3246b.get().cancel();
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static Toast m9846t(String str) {
        return m9848v(str, Integer.valueOf(App.f1068e.getResources().getColor(t0c0.f4237u)));
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static Toast m9847u(String str) {
        return m9848v(str, null);
    }

    /* JADX INFO: renamed from: v */
    public static Toast m9848v(String str, @ColorInt Integer num) {
        View viewInflate = LayoutInflater.from(App.f1068e).inflate(b6c0.f1938x, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(p4c0.f3644U0);
        Drawable drawableMutate = viewFindViewById.getBackground().mutate();
        if (num != null && (drawableMutate instanceof GradientDrawable)) {
            ((GradientDrawable) drawableMutate).setColor(num.intValue());
            viewFindViewById.setBackground(drawableMutate);
        }
        ((TextView) viewInflate.findViewById(p4c0.f3646V0)).setText(it6.m9424c(str));
        Toast toastM9842p = m9842p();
        toastM9842p.setView(viewInflate);
        toastM9842p.setGravity(17, 0, 0);
        toastM9842p.setDuration(0);
        return toastM9842p;
    }

    /* JADX INFO: renamed from: w */
    public static void m9849w(int i) {
        m9819A(hvc0.m9353c(i), true);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static void m9850x(int i, boolean z) {
        m9819A(hvc0.m9353c(i), z);
    }

    /* JADX INFO: renamed from: y */
    public static void m9851y(String str) {
        m9819A(str, true);
    }

    /* JADX INFO: renamed from: z */
    public static void m9852z(final String str, final View view) {
        e51.m9030M(new Runnable() { // from class: l.gsi0
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                String str2 = str;
                syb.m10752g(view2, str2, (int) ((((double) str2.length()) * 0.04d) + 2000.0d), null).m10757j();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m9839m(String str) {
    }

    /* JADX INFO: renamed from: r */
    public static void m9844r(String str) {
    }
}
