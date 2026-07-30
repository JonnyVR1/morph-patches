package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.home.BoostRemainingCountView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n93 {
    /* JADX INFO: renamed from: a */
    public static void m8321a(BoostRemainingCountView boostRemainingCountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostRemainingCountView.a = (RelativeLayout) viewGroup.getChildAt(0);
        boostRemainingCountView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostRemainingCountView.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostRemainingCountView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        boostRemainingCountView.e = (RelativeLayout) viewGroup.getChildAt(1);
        boostRemainingCountView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        boostRemainingCountView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
