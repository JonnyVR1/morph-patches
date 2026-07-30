package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.home.LikersBoostRemainingCountView;
import com.p051p1.mobile.putong.core.p058ui.home.BounceButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kkr {
    /* JADX INFO: renamed from: a */
    public static void m150330a(LikersBoostRemainingCountView likersBoostRemainingCountView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersBoostRemainingCountView.f22413a = (RelativeLayout) viewGroup.getChildAt(0);
        likersBoostRemainingCountView.f22414b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        likersBoostRemainingCountView.f22415c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        likersBoostRemainingCountView.f22416d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        likersBoostRemainingCountView.f22417e = (BounceButton) viewGroup.getChildAt(1);
    }
}
