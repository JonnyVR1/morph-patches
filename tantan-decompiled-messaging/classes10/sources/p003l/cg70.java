package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.vip.picks.view.header.PicksStateExpandView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cg70 {
    /* JADX INFO: renamed from: a */
    public static void m5947a(PicksStateExpandView picksStateExpandView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksStateExpandView.d = (LinearLayout) viewGroup.getChildAt(0);
        picksStateExpandView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        picksStateExpandView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        picksStateExpandView.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        picksStateExpandView.h = viewGroup.getChildAt(1);
        picksStateExpandView.i = viewGroup.getChildAt(2);
    }
}
