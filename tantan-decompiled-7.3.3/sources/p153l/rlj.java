package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.GenderView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rlj {
    /* JADX INFO: renamed from: a */
    public static void m181994a(GenderView genderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        genderView.f17119c = (LinearLayout) viewGroup.getChildAt(0);
        genderView.f17120d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        genderView.f17121e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        genderView.f17122f = (LinearLayout) viewGroup.getChildAt(1);
        genderView.f17123g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        genderView.f17124h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m181995b(GenderView genderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109102b0, viewGroup, true);
        m181994a(genderView, viewInflate);
        return viewInflate;
    }
}
