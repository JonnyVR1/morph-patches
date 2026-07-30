package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkSuggestItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class oa80 {
    /* JADX INFO: renamed from: a */
    public static void m166828a(PkSuggestItemView pkSuggestItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkSuggestItemView.f52583a = (VDraweeView) viewGroup.getChildAt(0);
        pkSuggestItemView.f52584b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        pkSuggestItemView.f52585c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        pkSuggestItemView.f52586d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pkSuggestItemView.f52587e = (TextView) viewGroup.getChildAt(2);
    }
}
