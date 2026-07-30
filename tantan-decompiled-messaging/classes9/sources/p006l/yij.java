package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.GenderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yij {
    /* JADX INFO: renamed from: a */
    public static void m28254a(GenderView genderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        genderView.f389c = (LinearLayout) viewGroup.getChildAt(0);
        genderView.f390d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        genderView.f391e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        genderView.f392f = (LinearLayout) viewGroup.getChildAt(1);
        genderView.f393g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        genderView.f394h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m28255b(GenderView genderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9420b0, viewGroup, true);
        m28254a(genderView, viewInflate);
        return viewInflate;
    }
}
