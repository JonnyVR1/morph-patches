package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard.MeetSeeCardItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f6y {
    /* JADX INFO: renamed from: a */
    public static void m119700a(MeetSeeCardItem meetSeeCardItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetSeeCardItem.f26278a = (VDraweeView) viewGroup.getChildAt(0);
        meetSeeCardItem.f26279b = (LinearLayout) viewGroup.getChildAt(1);
        meetSeeCardItem.f26280c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetSeeCardItem.f26281d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
