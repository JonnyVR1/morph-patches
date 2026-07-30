package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p001ui.home.BounceButton;
import com.p1.mobile.putong.core.newui.home.LikersBoostRemainingCountView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jir {
    /* JADX INFO: renamed from: a */
    public static void m7422a(LikersBoostRemainingCountView likersBoostRemainingCountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersBoostRemainingCountView.a = (RelativeLayout) viewGroup.getChildAt(0);
        likersBoostRemainingCountView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersBoostRemainingCountView.c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersBoostRemainingCountView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        likersBoostRemainingCountView.e = (BounceButton) viewGroup.getChildAt(1);
    }
}
