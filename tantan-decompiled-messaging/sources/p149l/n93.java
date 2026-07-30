package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.home.BoostRemainingCountView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class n93 {
    /* JADX INFO: renamed from: a */
    public static void m158529a(BoostRemainingCountView boostRemainingCountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostRemainingCountView.f21592a = (RelativeLayout) viewGroup.getChildAt(0);
        boostRemainingCountView.f21593b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostRemainingCountView.f21594c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        boostRemainingCountView.f21595d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        boostRemainingCountView.f21596e = (RelativeLayout) viewGroup.getChildAt(1);
        boostRemainingCountView.f21597f = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        boostRemainingCountView.f21598g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
