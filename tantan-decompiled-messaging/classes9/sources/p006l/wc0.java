package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.AgeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wc0 {
    /* JADX INFO: renamed from: a */
    public static void m26349a(AgeView ageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ageView.f375c = viewGroup.getChildAt(0);
        ageView.f376d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ageView.f377e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ageView.f378f = viewGroup.getChildAt(1);
        ageView.f379g = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m26350b(AgeView ageView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9416Z, viewGroup, true);
        m26349a(ageView, viewInflate);
        return viewInflate;
    }
}
