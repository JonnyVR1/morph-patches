package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.citytop.CityTopItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v75 {
    /* JADX INFO: renamed from: a */
    public static void m200191a(CityTopItemView cityTopItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cityTopItemView.f29548a = (VDraweeView) viewGroup.getChildAt(0);
        cityTopItemView.f29549b = (LinearLayout) viewGroup.getChildAt(1);
        cityTopItemView.f29550c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        cityTopItemView.f29551d = (VImage) viewGroup.getChildAt(2);
        cityTopItemView.f29552e = (VImage) viewGroup.getChildAt(3);
        cityTopItemView.f29553f = (RelativeLayout) viewGroup.getChildAt(4);
        cityTopItemView.f29554g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        cityTopItemView.f29555h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        cityTopItemView.f29556i = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        cityTopItemView.f29557j = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        cityTopItemView.f29558k = (VText) viewGroup.getChildAt(5);
        cityTopItemView.f29559l = (VText) viewGroup.getChildAt(6);
    }
}
