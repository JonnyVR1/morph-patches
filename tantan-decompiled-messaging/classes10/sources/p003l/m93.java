package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.newui.view.boost.view.BoostRemainingCountViewOpt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m93 {
    /* JADX INFO: renamed from: a */
    public static void m8006a(BoostRemainingCountViewOpt boostRemainingCountViewOpt, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostRemainingCountViewOpt.a = (ImageView) viewGroup.getChildAt(0);
        boostRemainingCountViewOpt.b = viewGroup.getChildAt(1);
    }
}
