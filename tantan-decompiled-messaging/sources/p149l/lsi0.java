package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class lsi0 {

    /* JADX INFO: renamed from: b */
    public static WeakReference<Toast> f129870b;

    /* JADX INFO: renamed from: c */
    public static C18314a f129871c;

    /* JADX INFO: renamed from: a */
    public static hpd0 f129869a = new hpd0("DEBUG_TOAST_SWITCH", Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public static ArrayList<String> f129872d = new ArrayList<>();

    /* JADX INFO: renamed from: l.lsi0$a */
    public static class C18314a {

        /* JADX INFO: renamed from: a */
        public final String f129873a;

        /* JADX INFO: renamed from: b */
        public final long f129874b;

        /* JADX INFO: renamed from: c */
        public final boolean f129875c;

        public C18314a(String str, long j, boolean z) {
            this.f129873a = str;
            this.f129874b = j;
            this.f129875c = z;
        }

        public String toString() {
            return "ThrottleToastEvent{msg='" + this.f129873a + "', emitTimeInMills=" + this.f129874b + ", isMsgType=" + this.f129875c + '}';
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: A */
    public static void m151563A(String str, boolean z) {
        m151564B(str, z, false);
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public static void m151564B(String str, boolean z, boolean z2) {
        m151569G(null, str, null);
    }

    /* JADX INFO: renamed from: C */
    public static void m151565C(int i) {
        m151577g(hvc0.m133156c(i), true);
    }

    /* JADX INFO: renamed from: D */
    public static void m151566D(String str) {
        m151577g(str, true);
    }

    /* JADX INFO: renamed from: E */
    public static void m151567E(Activity activity, final Toast toast) {
        if (activity == null) {
            activity = (Act.foreground_() == null || Act.foreground_().f15343a == null) ? null : Act.foreground_().f15343a.get();
        }
        if (activity == null) {
            return;
        }
        if (!activity.isFinishing()) {
            e51.m114748M(new Runnable() { // from class: l.isi0
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
        for (ArrayList<Act.C4299r> arrayList : Act.globalLifeCycle_().values()) {
            if (!vwb.m200296J(arrayList)) {
                Iterator<Act.C4299r> it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity2 = it.next().f15343a.get();
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        e51.m114743H(App.f15369e, new Runnable() { // from class: l.hsi0
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
    public static void m151568F(Activity activity, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m151569G(activity, str, null);
    }

    /* JADX INFO: renamed from: G */
    public static void m151569G(final Activity activity, final String str, @ColorInt final Integer num) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e51.m114748M(new Runnable() { // from class: l.fsi0
            @Override // java.lang.Runnable
            public final void run() {
                lsi0.m151585o(activity, str, num);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m151570H(final String str, final Drawable drawable, final Drawable drawable2) {
        if (Act.foreground_() != null) {
            e51.m114748M(new Runnable() { // from class: l.jsi0
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m151575e(str, drawable, drawable2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m151574d(String str, Drawable drawable) {
        View viewInflate = LayoutInflater.from(App.f15369e).inflate(b6c0.f73775a, (ViewGroup) null);
        String strM138182c = it6.m138182c(str);
        ImageView imageView = (ImageView) viewInflate.findViewById(p4c0.f147095U);
        TextView textView = (TextView) viewInflate.findViewById(R.id.message);
        textView.setText(strM138182c);
        xdl0.m208344M(textView, !TextUtils.isEmpty(strM138182c));
        imageView.setBackgroundDrawable(drawable);
        Toast toastM151586p = m151586p();
        toastM151586p.setView(viewInflate);
        toastM151586p.setGravity(17, 0, 0);
        toastM151586p.setDuration(0);
        m151567E(null, toastM151586p);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m151575e(String str, Drawable drawable, Drawable drawable2) {
        Toast toastM151586p = m151586p();
        TextView textView = new TextView(App.f15369e);
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(t100.m186890d(18.0f));
        textView.setBackgroundDrawable(drawable2);
        textView.setTextColor(-1);
        textView.setTextSize(14.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        toastM151586p.setView(textView);
        toastM151586p.setDuration(1);
        m151567E(null, toastM151586p);
    }

    /* JADX INFO: renamed from: g */
    public static void m151577g(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C18314a c18314a = f129871c;
        if (c18314a == null || !TextUtils.equals(c18314a.f129873a, str) || jCurrentTimeMillis - f129871c.f129874b >= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            synchronized (lsi0.class) {
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C18314a c18314a2 = f129871c;
                    if (c18314a2 == null || !TextUtils.equals(c18314a2.f129873a, str) || jCurrentTimeMillis2 - f129871c.f129874b >= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                        C18314a c18314a3 = new C18314a(str, jCurrentTimeMillis2, z);
                        f129871c = c18314a3;
                        Objects.toString(c18314a3);
                        C18314a c18314a4 = f129871c;
                        if (c18314a4.f129875c) {
                            m151595y(c18314a4.f129873a);
                        } else {
                            m151580j(c18314a4.f129873a);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m151578h(int i) {
        m151581k(hvc0.m133156c(i), true);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static void m151579i(int i, boolean z) {
        m151581k(hvc0.m133156c(i), z);
    }

    /* JADX INFO: renamed from: j */
    public static void m151580j(String str) {
        m151581k(str, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static void m151581k(String str, boolean z) {
        m151569G(null, str, Integer.valueOf(App.f15369e.getResources().getColor(t0c0.f167169u)));
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public static void m151582l(String str, boolean z, boolean z2) {
        m151581k(str, z);
    }

    /* JADX INFO: renamed from: n */
    public static void m151584n(int i) {
        m151577g(hvc0.m133156c(i), false);
    }

    /* JADX INFO: renamed from: o */
    public static void m151585o(Activity activity, String str, @ColorInt Integer num) {
        m151589s();
        Toast toastM151592v = m151592v(str, num);
        f129870b = new WeakReference<>(toastM151592v);
        m151567E(activity, toastM151592v);
    }

    /* JADX INFO: renamed from: p */
    public static Toast m151586p() {
        return osi0.m165779c();
    }

    /* JADX INFO: renamed from: q */
    public static void m151587q(final String str, final Drawable drawable) {
        if (Act.foreground_() != null) {
            e51.m114748M(new Runnable() { // from class: l.ksi0
                @Override // java.lang.Runnable
                public final void run() {
                    lsi0.m151574d(str, drawable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m151589s() {
        WeakReference<Toast> weakReference = f129870b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f129870b.get().cancel();
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static Toast m151590t(String str) {
        return m151592v(str, Integer.valueOf(App.f15369e.getResources().getColor(t0c0.f167169u)));
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static Toast m151591u(String str) {
        return m151592v(str, null);
    }

    /* JADX INFO: renamed from: v */
    public static Toast m151592v(String str, @ColorInt Integer num) {
        View viewInflate = LayoutInflater.from(App.f15369e).inflate(b6c0.f73798x, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(p4c0.f147096U0);
        Drawable drawableMutate = viewFindViewById.getBackground().mutate();
        if (num != null && (drawableMutate instanceof GradientDrawable)) {
            ((GradientDrawable) drawableMutate).setColor(num.intValue());
            viewFindViewById.setBackground(drawableMutate);
        }
        ((TextView) viewInflate.findViewById(p4c0.f147098V0)).setText(it6.m138182c(str));
        Toast toastM151586p = m151586p();
        toastM151586p.setView(viewInflate);
        toastM151586p.setGravity(17, 0, 0);
        toastM151586p.setDuration(0);
        return toastM151586p;
    }

    /* JADX INFO: renamed from: w */
    public static void m151593w(int i) {
        m151563A(hvc0.m133156c(i), true);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static void m151594x(int i, boolean z) {
        m151563A(hvc0.m133156c(i), z);
    }

    /* JADX INFO: renamed from: y */
    public static void m151595y(String str) {
        m151563A(str, true);
    }

    /* JADX INFO: renamed from: z */
    public static void m151596z(final String str, final View view) {
        e51.m114748M(new Runnable() { // from class: l.gsi0
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                String str2 = str;
                syb.m186644g(view2, str2, (int) ((((double) str2.length()) * 0.04d) + 2000.0d), null).m186649j();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m151583m(String str) {
    }

    /* JADX INFO: renamed from: r */
    public static void m151588r(String str) {
    }
}
