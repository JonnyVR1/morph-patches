package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.StepSeekBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class g8f0 {
    /* JADX INFO: renamed from: a */
    public static void m15626a(f8f0 f8f0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        f8f0Var.f12556c = viewGroup.getChildAt(0);
        f8f0Var.f12557d = (StepSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        f8f0Var.f12558e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        f8f0Var.f12559f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        f8f0Var.f12560g = viewGroup.getChildAt(1);
        f8f0Var.f12561h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        f8f0Var.f12562i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        f8f0Var.f12563j = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m15627b(f8f0 f8f0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9412V, viewGroup, false);
        m15626a(f8f0Var, viewInflate);
        return viewInflate;
    }
}
