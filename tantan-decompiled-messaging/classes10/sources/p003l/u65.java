package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.citytop.CityTopItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class u65 {
    /* JADX INFO: renamed from: a */
    public static void m9651a(CityTopItemView cityTopItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cityTopItemView.f1094a = viewGroup.getChildAt(0);
        cityTopItemView.f1095b = (LinearLayout) viewGroup.getChildAt(1);
        cityTopItemView.f1096c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cityTopItemView.f1097d = viewGroup.getChildAt(2);
        cityTopItemView.f1098e = viewGroup.getChildAt(3);
        cityTopItemView.f1099f = (RelativeLayout) viewGroup.getChildAt(4);
        cityTopItemView.f1100g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        cityTopItemView.f1101h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        cityTopItemView.f1102i = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        cityTopItemView.f1103j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        cityTopItemView.f1104k = viewGroup.getChildAt(5);
        cityTopItemView.f1105l = viewGroup.getChildAt(6);
    }
}
