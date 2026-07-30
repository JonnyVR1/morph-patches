package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ku */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0946ku {
    /* JADX INFO: renamed from: a */
    public static void m18269a(C0905ju c0905ju, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c0905ju.f15399a = (ViewStub) viewGroup.getChildAt(0);
        c0905ju.f15400b = viewGroup.getChildAt(1);
        c0905ju.f15401c = viewGroup.getChildAt(3);
        c0905ju.f15402d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        c0905ju.f15403e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        c0905ju.f15404f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3);
        c0905ju.f15405g = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        c0905ju.f15406h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        c0905ju.f15407i = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4);
        c0905ju.f15408j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        c0905ju.f15409k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m18270b(C0905ju c0905ju, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9394D, viewGroup, false);
        m18269a(c0905ju, viewInflate);
        return viewInflate;
    }
}
