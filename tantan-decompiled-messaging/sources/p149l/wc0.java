package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.AgeView;
import p147v.VButton_FakeShadow;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class wc0 {
    /* JADX INFO: renamed from: a */
    public static void m202588a(AgeView ageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ageView.f16386c = (VFrame) viewGroup.getChildAt(0);
        ageView.f16387d = (VEditText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ageView.f16388e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ageView.f16389f = (VLinear) viewGroup.getChildAt(1);
        ageView.f16390g = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m202589b(AgeView ageView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79486Z, viewGroup, true);
        m202588a(ageView, viewInflate);
        return viewInflate;
    }
}
