package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetLikersItemView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetPromotionItemView;
import p151v.VImage;
import p151v.VPullUpRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ecy {
    /* JADX INFO: renamed from: a */
    public static void m120411a(MeetLikersItemView meetLikersItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersItemView.f26941a = (VImage) viewGroup.getChildAt(0);
        meetLikersItemView.f26942b = (RelativeLayout) viewGroup.getChildAt(1);
        meetLikersItemView.f26943c = (MeetItemLikerHeadView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetLikersItemView.f26944d = (MeetPromotionItemView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        meetLikersItemView.f26945e = (VPullUpRecyclerView) viewGroup.getChildAt(2);
        meetLikersItemView.f26946f = (VText) viewGroup.getChildAt(3);
    }
}
