package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.suggest.SuggesterItemView;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wug0 {
    /* JADX INFO: renamed from: a */
    public static void m205627a(SuggesterItemView suggesterItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggesterItemView.f26798a = (VDraweeView) viewGroup.getChildAt(0);
        suggesterItemView.f26799b = (VText) viewGroup.getChildAt(1);
        suggesterItemView.f26800c = (LinearLayout) viewGroup.getChildAt(2);
        suggesterItemView.f26801d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        suggesterItemView.f26802e = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        suggesterItemView.f26803f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        suggesterItemView.f26804g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        suggesterItemView.f26805h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
    }
}
