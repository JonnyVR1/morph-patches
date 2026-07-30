package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkSuggestItemView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class i280 {
    /* JADX INFO: renamed from: a */
    public static void m134047a(PkSuggestItemView pkSuggestItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkSuggestItemView.f51735a = (VDraweeView) viewGroup.getChildAt(0);
        pkSuggestItemView.f51736b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        pkSuggestItemView.f51737c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        pkSuggestItemView.f51738d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        pkSuggestItemView.f51739e = (TextView) viewGroup.getChildAt(2);
    }
}
