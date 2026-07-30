package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.home.LikersBoostRemainingCountView;
import com.p046p1.mobile.putong.core.p053ui.home.BounceButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jir {
    /* JADX INFO: renamed from: a */
    public static void m141664a(LikersBoostRemainingCountView likersBoostRemainingCountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersBoostRemainingCountView.f21671a = (RelativeLayout) viewGroup.getChildAt(0);
        likersBoostRemainingCountView.f21672b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersBoostRemainingCountView.f21673c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersBoostRemainingCountView.f21674d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        likersBoostRemainingCountView.f21675e = (BounceButton) viewGroup.getChildAt(1);
    }
}
