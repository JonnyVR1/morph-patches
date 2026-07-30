package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetPromotionItemView;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class h3y {
    /* JADX INFO: renamed from: a */
    public static void m129194a(MeetLikersItemView meetLikersItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersItemView.f26199a = (VImage) viewGroup.getChildAt(0);
        meetLikersItemView.f26200b = (RelativeLayout) viewGroup.getChildAt(1);
        meetLikersItemView.f26201c = (MeetItemLikerHeadView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetLikersItemView.f26202d = (MeetPromotionItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        meetLikersItemView.f26203e = (VPullUpRecyclerView) viewGroup.getChildAt(2);
        meetLikersItemView.f26204f = (VText) viewGroup.getChildAt(3);
    }
}
