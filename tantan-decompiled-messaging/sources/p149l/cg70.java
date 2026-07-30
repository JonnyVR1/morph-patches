package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksStateExpandView;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cg70 {
    /* JADX INFO: renamed from: a */
    public static void m106697a(PicksStateExpandView picksStateExpandView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksStateExpandView._title_layout = (LinearLayout) viewGroup.getChildAt(0);
        picksStateExpandView._title_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        picksStateExpandView._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        picksStateExpandView._close = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        picksStateExpandView._list = (VPullUpRecyclerView) viewGroup.getChildAt(1);
        picksStateExpandView._goto_picks = (VText) viewGroup.getChildAt(2);
    }
}
