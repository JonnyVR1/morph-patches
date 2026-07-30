package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.newui.view.ODiamondTagLabel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rx40 {
    /* JADX INFO: renamed from: a */
    public static void m13970a(ODiamondTagLabel oDiamondTagLabel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        oDiamondTagLabel.d = (FrameLayout) viewGroup.getChildAt(0);
        oDiamondTagLabel.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        oDiamondTagLabel.f = viewGroup.getChildAt(1);
    }
}
