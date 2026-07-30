package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.likeminded.LikeMindedCardTabView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ddr {
    /* JADX INFO: renamed from: a */
    public static void m111058a(LikeMindedCardTabView likeMindedCardTabView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeMindedCardTabView._image = (VDraweeView) viewGroup.getChildAt(0);
        likeMindedCardTabView._title = (TextView) viewGroup.getChildAt(1);
    }
}
