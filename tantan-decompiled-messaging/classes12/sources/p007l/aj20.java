package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.mediapicker.EditTextInScrollView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class aj20 {
    /* JADX INFO: renamed from: a */
    public static void m8577a(zi20 zi20Var, View view) {
        zi20Var.f15753a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zi20Var.f15754b = (EditTextInScrollView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        zi20Var.f15755c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        zi20Var.f15756d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        zi20Var.f15757e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        zi20Var.f15758f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        zi20Var.f15759g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        zi20Var.f15760h = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8578b(zi20 zi20Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11191c5, viewGroup, false);
        m8577a(zi20Var, viewInflate);
        return viewInflate;
    }
}
