package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.campus.detailinfo.C8298a;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VMaterialEdit_FakeSpinner;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e2g0 {
    /* JADX INFO: renamed from: a */
    public static void m114500a(C8298a c8298a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8298a.f28678a = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8298a.f28679b = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8298a.f28680c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8298a.f28681d = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        c8298a.f28682e = (VMaterialEdit_FakeSpinner) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        c8298a.f28683f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        c8298a.f28684g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        c8298a.f28685h = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        c8298a.f28686i = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        c8298a.f28687j = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        c8298a.f28688k = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        c8298a.f28689l = (VFrame) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        c8298a.f28690m = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        c8298a.f28691n = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        c8298a.f28692o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        c8298a.f28693p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(2)).getChildAt(1);
        c8298a.f28694q = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(3);
        c8298a.f28695r = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m114501b(C8298a c8298a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95601Ue, viewGroup, false);
        m114500a(c8298a, viewInflate);
        return viewInflate;
    }
}
