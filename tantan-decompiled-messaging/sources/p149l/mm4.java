package p149l;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;

/* JADX INFO: loaded from: classes5.dex */
public class mm4 {
    /* JADX INFO: renamed from: a */
    public static boolean m155297a(p1k0 p1k0Var) {
        return p1k0Var != null && p1k0Var.m167093m().enableNewPrivilege;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m155298b(p1k0 p1k0Var) {
        return p1k0Var != null && p1k0Var.m167098r().enableNewPrivilege;
    }

    /* JADX INFO: renamed from: c */
    public static void m155299c(p1k0 p1k0Var, AnimEffectPlayer animEffectPlayer, boolean z, boolean z2, long j, long j2) {
        String str;
        if (i7n.m134916b()) {
            return;
        }
        if (p1k0Var != null && p1k0Var.m167090j() != null) {
            boolean zM155298b = z ? m155298b(p1k0Var) : m155297a(p1k0Var);
            boolean z3 = false;
            if (!z2 ? !TextUtils.isEmpty(p1k0Var.m167090j().openEffect) : !TextUtils.isEmpty(p1k0Var.m167090j().turnEffect)) {
                z3 = true;
            }
            if (zM155298b && z3) {
                animEffectPlayer.m68500j(z2 ? p1k0Var.m167090j().turnEffect : p1k0Var.m167090j().openEffect, 1);
                return;
            }
        }
        if (j == 0) {
            str = z2 ? "https://auto.tancdn.com/v1/raw/81a73e1a-7d60-4bc0-891d-48bf7e68419610.pdf" : "https://auto.tancdn.com/v1/raw/24311607-0c58-49d2-858b-96a481f33c6911.pdf";
        } else if (j2 >= 0) {
            str = z2 ? "https://auto.tancdn.com/v1/raw/7320cd6c-1be3-4f9f-b153-c63ac5ec91e111.pdf" : "https://auto.tancdn.com/v1/raw/140f3c16-81ea-4681-ba27-d3bf722a291c11.pdf";
        } else {
            str = z2 ? "https://auto.tancdn.com/v1/raw/abac945c-3e7f-4b82-b505-baa370fdd5f211.pdf" : "https://auto.tancdn.com/v1/raw/09f6502c-a77f-485f-bc1f-282d39a43cab11.pdf";
        }
        animEffectPlayer.mo68502l(str, z2 ? 1 : 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m155300d(int i, boolean z, View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(11.0f));
        gradientDrawable.setColor(kvc0.m147352a(i));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: e */
    public static void m155301e(String str, boolean z, View view) {
        view.setBackground(zb2.m217814b(str, 11));
    }

    /* JADX INFO: renamed from: f */
    public static void m155302f(p1k0 p1k0Var, boolean z, long j, View view) {
        int i;
        if ((z ? m155298b(p1k0Var) : m155297a(p1k0Var)) && !TextUtils.isEmpty(p1k0Var.m167090j().progressColor)) {
            m155301e(p1k0Var.m167090j().progressColor, true, view);
            return;
        }
        if (j == 0) {
            i = h1c0.f105402s;
        } else if (j < 5) {
            i = h1c0.f105308G;
        } else if (j < 10) {
            i = h1c0.f105346Z;
        } else if (j < 20) {
            i = h1c0.f105376j0;
        } else if (j < 25) {
            i = h1c0.f105305E0;
        } else if (j < 30) {
            i = h1c0.f105299B0;
        } else {
            i = j < 35 ? h1c0.f105418x0 : h1c0.f105406t0;
        }
        m155300d(i, false, view);
    }

    /* JADX INFO: renamed from: g */
    public static void m155303g(p1k0 p1k0Var, boolean z, long j, TextView textView) {
        int i;
        if ((z ? m155298b(p1k0Var) : m155297a(p1k0Var)) && !TextUtils.isEmpty(p1k0Var.m167090j().gradeColor)) {
            textView.setTextColor(kvc0.m147359h(p1k0Var.m167090j().gradeColor, kvc0.m147352a(h1c0.f105360e)));
            return;
        }
        if (j == 0) {
            i = h1c0.f105362e1;
        } else if (j < 5) {
            i = h1c0.f105334T;
        } else if (j < 10) {
            i = h1c0.f105379k0;
        } else if (j < 20) {
            i = h1c0.f105338V;
        } else {
            i = j < 30 ? h1c0.f105313I0 : h1c0.f105329Q0;
        }
        textView.setTextColor(kvc0.m147352a(i));
    }

    /* JADX INFO: renamed from: h */
    public static void m155304h(p1k0 p1k0Var, boolean z, TextView textView) {
        if (!(z ? m155298b(p1k0Var) : m155297a(p1k0Var)) || TextUtils.isEmpty(p1k0Var.m167090j().gradeColor)) {
            textView.setTextColor(kvc0.m147352a(h1c0.f105329Q0));
        } else {
            textView.setTextColor(kvc0.m147359h(p1k0Var.m167090j().gradeColor, kvc0.m147352a(h1c0.f105329Q0)));
        }
    }
}
