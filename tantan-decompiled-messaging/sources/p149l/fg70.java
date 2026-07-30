package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksStateHideView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fg70 {
    /* JADX INFO: renamed from: a */
    public static void m121205a(PicksStateHideView picksStateHideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picksStateHideView._avatar = (VDraweeView) viewGroup.getChildAt(0);
        picksStateHideView._title = (VText) viewGroup.getChildAt(1);
        picksStateHideView._title_icon = (VImage) viewGroup.getChildAt(2);
        picksStateHideView._subtitle = (VText) viewGroup.getChildAt(3);
        picksStateHideView._more = (VText) viewGroup.getChildAt(4);
    }
}
