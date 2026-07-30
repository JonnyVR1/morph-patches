package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.view.diamond.BlackDiamondTagView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j33 {
    /* JADX INFO: renamed from: a */
    public static void m7332a(BlackDiamondTagView blackDiamondTagView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        blackDiamondTagView.f2623d = (LinearLayout) viewGroup.getChildAt(0);
        blackDiamondTagView.f2624e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        blackDiamondTagView.f2625f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        blackDiamondTagView.f2626g = viewGroup.getChildAt(1);
        blackDiamondTagView.f2627h = viewGroup.getChildAt(2);
    }
}
