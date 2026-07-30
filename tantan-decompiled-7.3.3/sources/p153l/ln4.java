package p153l;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;

/* JADX INFO: loaded from: classes5.dex */
public class ln4 {
    /* JADX INFO: renamed from: a */
    public static boolean m154944a(vak0 vak0Var) {
        return vak0Var != null && vak0Var.m200538m().enableNewPrivilege;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m154945b(vak0 vak0Var) {
        return vak0Var != null && vak0Var.m200543r().enableNewPrivilege;
    }

    /* JADX INFO: renamed from: c */
    public static void m154946c(vak0 vak0Var, AnimEffectPlayer animEffectPlayer, boolean z, boolean z2, long j, long j2) {
        String str;
        if (i9n.m139127b()) {
            return;
        }
        if (vak0Var != null && vak0Var.m200535j() != null) {
            boolean zM154945b = z ? m154945b(vak0Var) : m154944a(vak0Var);
            boolean z3 = false;
            if (!z2 ? !TextUtils.isEmpty(vak0Var.m200535j().openEffect) : !TextUtils.isEmpty(vak0Var.m200535j().turnEffect)) {
                z3 = true;
            }
            if (zM154945b && z3) {
                animEffectPlayer.m69683j(z2 ? vak0Var.m200535j().turnEffect : vak0Var.m200535j().openEffect, 1);
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
        animEffectPlayer.mo69685l(str, z2 ? 1 : 2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m154947d(int i, boolean z, View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(11.0f));
        gradientDrawable.setColor(n3d0.m161277a(i));
        view.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: e */
    public static void m154948e(String str, boolean z, View view) {
        view.setBackground(gc2.m129823b(str, 11));
    }

    /* JADX INFO: renamed from: f */
    public static void m154949f(vak0 vak0Var, boolean z, long j, View view) {
        int i;
        if ((z ? m154945b(vak0Var) : m154944a(vak0Var)) && !TextUtils.isEmpty(vak0Var.m200535j().progressColor)) {
            m154948e(vak0Var.m200535j().progressColor, true, view);
            return;
        }
        if (j == 0) {
            i = n9c0.f140863s;
        } else if (j < 5) {
            i = n9c0.f140769G;
        } else if (j < 10) {
            i = n9c0.f140807Z;
        } else if (j < 20) {
            i = n9c0.f140837j0;
        } else if (j < 25) {
            i = n9c0.f140766E0;
        } else if (j < 30) {
            i = n9c0.f140760B0;
        } else {
            i = j < 35 ? n9c0.f140879x0 : n9c0.f140867t0;
        }
        m154947d(i, false, view);
    }

    /* JADX INFO: renamed from: g */
    public static void m154950g(vak0 vak0Var, boolean z, long j, TextView textView) {
        int i;
        if ((z ? m154945b(vak0Var) : m154944a(vak0Var)) && !TextUtils.isEmpty(vak0Var.m200535j().gradeColor)) {
            textView.setTextColor(n3d0.m161284h(vak0Var.m200535j().gradeColor, n3d0.m161277a(n9c0.f140821e)));
            return;
        }
        if (j == 0) {
            i = n9c0.f140823e1;
        } else if (j < 5) {
            i = n9c0.f140795T;
        } else if (j < 10) {
            i = n9c0.f140840k0;
        } else if (j < 20) {
            i = n9c0.f140799V;
        } else {
            i = j < 30 ? n9c0.f140774I0 : n9c0.f140790Q0;
        }
        textView.setTextColor(n3d0.m161277a(i));
    }

    /* JADX INFO: renamed from: h */
    public static void m154951h(vak0 vak0Var, boolean z, TextView textView) {
        if (!(z ? m154945b(vak0Var) : m154944a(vak0Var)) || TextUtils.isEmpty(vak0Var.m200535j().gradeColor)) {
            textView.setTextColor(n3d0.m161277a(n9c0.f140790Q0));
        } else {
            textView.setTextColor(n3d0.m161284h(vak0Var.m200535j().gradeColor, n3d0.m161277a(n9c0.f140790Q0)));
        }
    }
}
