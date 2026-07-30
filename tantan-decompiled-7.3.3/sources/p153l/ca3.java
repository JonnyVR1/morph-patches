package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.home.BoostRemainingCountView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ca3 {
    /* JADX INFO: renamed from: a */
    public static void m108471a(BoostRemainingCountView boostRemainingCountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostRemainingCountView.f22334a = (RelativeLayout) viewGroup.getChildAt(0);
        boostRemainingCountView.f22335b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostRemainingCountView.f22336c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostRemainingCountView.f22337d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        boostRemainingCountView.f22338e = (RelativeLayout) viewGroup.getChildAt(1);
        boostRemainingCountView.f22339f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        boostRemainingCountView.f22340g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
