package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.AgeView;
import p151v.VButton_FakeShadow;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class sc0 {
    /* JADX INFO: renamed from: a */
    public static void m185357a(AgeView ageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ageView.f17105c = (VFrame) viewGroup.getChildAt(0);
        ageView.f17106d = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ageView.f17107e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ageView.f17108f = (VLinear) viewGroup.getChildAt(1);
        ageView.f17109g = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m185358b(AgeView ageView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109098Z, viewGroup, true);
        m185357a(ageView, viewInflate);
        return viewInflate;
    }
}
