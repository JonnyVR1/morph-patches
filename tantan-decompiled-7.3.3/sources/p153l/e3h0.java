package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.suggest.SuggesterItemView;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class e3h0 {
    /* JADX INFO: renamed from: a */
    public static void m119287a(SuggesterItemView suggesterItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggesterItemView.f27646a = (VDraweeView) viewGroup.getChildAt(0);
        suggesterItemView.f27647b = (VText) viewGroup.getChildAt(1);
        suggesterItemView.f27648c = (LinearLayout) viewGroup.getChildAt(2);
        suggesterItemView.f27649d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        suggesterItemView.f27650e = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        suggesterItemView.f27651f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        suggesterItemView.f27652g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        suggesterItemView.f27653h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(2);
    }
}
