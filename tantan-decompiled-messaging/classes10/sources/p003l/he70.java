package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.vip.picks.view.PicksGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class he70 {
    /* JADX INFO: renamed from: a */
    public static void m6952a(PicksGuideView picksGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksGuideView.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        picksGuideView.b = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        picksGuideView.c = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        picksGuideView.d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
