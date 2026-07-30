package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.GenderView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class yij {
    /* JADX INFO: renamed from: a */
    public static void m214921a(GenderView genderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        genderView.f16400c = (LinearLayout) viewGroup.getChildAt(0);
        genderView.f16401d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        genderView.f16402e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        genderView.f16403f = (LinearLayout) viewGroup.getChildAt(1);
        genderView.f16404g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        genderView.f16405h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m214922b(GenderView genderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79490b0, viewGroup, true);
        m214921a(genderView, viewInflate);
        return viewInflate;
    }
}
