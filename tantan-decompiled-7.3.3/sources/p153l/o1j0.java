package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class o1j0 {

    /* JADX INFO: renamed from: b */
    public static WeakReference<Toast> f144661b;

    /* JADX INFO: renamed from: c */
    public static C19010a f144662c;

    /* JADX INFO: renamed from: a */
    public static jxd0 f144660a = new jxd0("DEBUG_TOAST_SWITCH", Boolean.TRUE);

    /* JADX INFO: renamed from: d */
    public static ArrayList<String> f144663d = new ArrayList<>();

    /* JADX INFO: renamed from: l.o1j0$a */
    public static class C19010a {

        /* JADX INFO: renamed from: a */
        public final String f144664a;

        /* JADX INFO: renamed from: b */
        public final long f144665b;

        /* JADX INFO: renamed from: c */
        public final boolean f144666c;

        public C19010a(String str, long j, boolean z) {
            this.f144664a = str;
            this.f144665b = j;
            this.f144666c = z;
        }

        public String toString() {
            return "ThrottleToastEvent{msg='" + this.f144664a + "', emitTimeInMills=" + this.f144665b + ", isMsgType=" + this.f144666c + '}';
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: A */
    public static void m165619A(String str, boolean z) {
        m165620B(str, z, false);
    }

    @Deprecated
    /* JADX INFO: renamed from: B */
    public static void m165620B(String str, boolean z, boolean z2) {
        m165625G(null, str, null);
    }

    /* JADX INFO: renamed from: C */
    public static void m165621C(int i) {
        m165633g(k3d0.m148007c(i), true);
    }

    /* JADX INFO: renamed from: D */
    public static void m165622D(String str) {
        m165633g(str, true);
    }

    /* JADX INFO: renamed from: E */
    public static void m165623E(Activity activity, final Toast toast) {
        if (activity == null) {
            activity = (Act.foreground_() == null || Act.foreground_().f16062a == null) ? null : Act.foreground_().f16062a.get();
        }
        if (activity == null) {
            return;
        }
        if (!activity.isFinishing()) {
            l51.m152893M(new Runnable() { // from class: l.l1j0
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
        for (ArrayList<Act.C4450r> arrayList : Act.globalLifeCycle_().values()) {
            if (!jyb.m147479J(arrayList)) {
                Iterator<Act.C4450r> it = arrayList.iterator();
                while (it.hasNext()) {
                    Activity activity2 = it.next().f16062a.get();
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        l51.m152888H(App.f16088e, new Runnable() { // from class: l.k1j0
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
    public static void m165624F(Activity activity, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m165625G(activity, str, null);
    }

    /* JADX INFO: renamed from: G */
    public static void m165625G(final Activity activity, final String str, @ColorInt final Integer num) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l51.m152893M(new Runnable() { // from class: l.i1j0
            @Override // java.lang.Runnable
            public final void run() {
                o1j0.m165641o(activity, str, num);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static void m165626H(final String str, final Drawable drawable, final Drawable drawable2) {
        if (Act.foreground_() != null) {
            l51.m152893M(new Runnable() { // from class: l.m1j0
                @Override // java.lang.Runnable
                public final void run() {
                    o1j0.m165631e(str, drawable, drawable2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m165630d(String str, Drawable drawable) {
        View viewInflate = LayoutInflater.from(App.f16088e).inflate(gec0.f103788a, (ViewGroup) null);
        String strM155847c = lu6.m155847c(str);
        ImageView imageView = (ImageView) viewInflate.findViewById(vcc0.f183395U);
        TextView textView = (TextView) viewInflate.findViewById(R.id.message);
        textView.setText(strM155847c);
        bnl0.m105524M(textView, !TextUtils.isEmpty(strM155847c));
        imageView.setBackgroundDrawable(drawable);
        Toast toastM165642p = m165642p();
        toastM165642p.setView(viewInflate);
        toastM165642p.setGravity(17, 0, 0);
        toastM165642p.setDuration(0);
        m165623E(null, toastM165642p);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m165631e(String str, Drawable drawable, Drawable drawable2) {
        Toast toastM165642p = m165642p();
        TextView textView = new TextView(App.f16088e);
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(qa00.m175859d(18.0f));
        textView.setBackgroundDrawable(drawable2);
        textView.setTextColor(-1);
        textView.setTextSize(14.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        toastM165642p.setView(textView);
        toastM165642p.setDuration(1);
        m165623E(null, toastM165642p);
    }

    /* JADX INFO: renamed from: g */
    public static void m165633g(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C19010a c19010a = f144662c;
        if (c19010a == null || !TextUtils.equals(c19010a.f144664a, str) || jCurrentTimeMillis - f144662c.f144665b >= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
            synchronized (o1j0.class) {
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C19010a c19010a2 = f144662c;
                    if (c19010a2 == null || !TextUtils.equals(c19010a2.f144664a, str) || jCurrentTimeMillis2 - f144662c.f144665b >= HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                        C19010a c19010a3 = new C19010a(str, jCurrentTimeMillis2, z);
                        f144662c = c19010a3;
                        Objects.toString(c19010a3);
                        C19010a c19010a4 = f144662c;
                        if (c19010a4.f144666c) {
                            m165651y(c19010a4.f144664a);
                        } else {
                            m165636j(c19010a4.f144664a);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m165634h(int i) {
        m165637k(k3d0.m148007c(i), true);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static void m165635i(int i, boolean z) {
        m165637k(k3d0.m148007c(i), z);
    }

    /* JADX INFO: renamed from: j */
    public static void m165636j(String str) {
        m165637k(str, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static void m165637k(String str, boolean z) {
        m165625G(null, str, Integer.valueOf(App.f16088e.getResources().getColor(z8c0.f203360u)));
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public static void m165638l(String str, boolean z, boolean z2) {
        m165637k(str, z);
    }

    /* JADX INFO: renamed from: n */
    public static void m165640n(int i) {
        m165633g(k3d0.m148007c(i), false);
    }

    /* JADX INFO: renamed from: o */
    public static void m165641o(Activity activity, String str, @ColorInt Integer num) {
        m165645s();
        Toast toastM165648v = m165648v(str, num);
        f144661b = new WeakReference<>(toastM165648v);
        m165623E(activity, toastM165648v);
    }

    /* JADX INFO: renamed from: p */
    public static Toast m165642p() {
        return r1j0.m179416c();
    }

    /* JADX INFO: renamed from: q */
    public static void m165643q(final String str, final Drawable drawable) {
        if (Act.foreground_() != null) {
            l51.m152893M(new Runnable() { // from class: l.n1j0
                @Override // java.lang.Runnable
                public final void run() {
                    o1j0.m165630d(str, drawable);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m165645s() {
        WeakReference<Toast> weakReference = f144661b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f144661b.get().cancel();
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public static Toast m165646t(String str) {
        return m165648v(str, Integer.valueOf(App.f16088e.getResources().getColor(z8c0.f203360u)));
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static Toast m165647u(String str) {
        return m165648v(str, null);
    }

    /* JADX INFO: renamed from: v */
    public static Toast m165648v(String str, @ColorInt Integer num) {
        View viewInflate = LayoutInflater.from(App.f16088e).inflate(gec0.f103811x, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(vcc0.f183396U0);
        Drawable drawableMutate = viewFindViewById.getBackground().mutate();
        if (num != null && (drawableMutate instanceof GradientDrawable)) {
            ((GradientDrawable) drawableMutate).setColor(num.intValue());
            viewFindViewById.setBackground(drawableMutate);
        }
        ((TextView) viewInflate.findViewById(vcc0.f183398V0)).setText(lu6.m155847c(str));
        Toast toastM165642p = m165642p();
        toastM165642p.setView(viewInflate);
        toastM165642p.setGravity(17, 0, 0);
        toastM165642p.setDuration(0);
        return toastM165642p;
    }

    /* JADX INFO: renamed from: w */
    public static void m165649w(int i) {
        m165619A(k3d0.m148007c(i), true);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static void m165650x(int i, boolean z) {
        m165619A(k3d0.m148007c(i), z);
    }

    /* JADX INFO: renamed from: y */
    public static void m165651y(String str) {
        m165619A(str, true);
    }

    /* JADX INFO: renamed from: z */
    public static void m165652z(final String str, final View view) {
        l51.m152893M(new Runnable() { // from class: l.j1j0
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                String str2 = str;
                g0c.m128410g(view2, str2, (int) ((((double) str2.length()) * 0.04d) + 2000.0d), null).m128415j();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m165639m(String str) {
    }

    /* JADX INFO: renamed from: r */
    public static void m165644r(String str) {
    }
}
