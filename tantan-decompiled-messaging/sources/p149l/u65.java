package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.citytop.CityTopItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u65 {
    /* JADX INFO: renamed from: a */
    public static void m191954a(CityTopItemView cityTopItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cityTopItemView.f28700a = (VDraweeView) viewGroup.getChildAt(0);
        cityTopItemView.f28701b = (LinearLayout) viewGroup.getChildAt(1);
        cityTopItemView.f28702c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cityTopItemView.f28703d = (VImage) viewGroup.getChildAt(2);
        cityTopItemView.f28704e = (VImage) viewGroup.getChildAt(3);
        cityTopItemView.f28705f = (RelativeLayout) viewGroup.getChildAt(4);
        cityTopItemView.f28706g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        cityTopItemView.f28707h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        cityTopItemView.f28708i = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        cityTopItemView.f28709j = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        cityTopItemView.f28710k = (VText) viewGroup.getChildAt(5);
        cityTopItemView.f28711l = (VText) viewGroup.getChildAt(6);
    }
}
