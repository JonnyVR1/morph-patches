package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationCityCentreCardLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationRealEcrGuideLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p046p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jq6 {
    /* JADX INFO: renamed from: a */
    public static void m142777a(ConversationsListHeadView conversationsListHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationsListHeadView.f25177m = viewGroup.getChildAt(0);
        conversationsListHeadView.f25178n = (PrivilegePromotionHeaderView) viewGroup.getChildAt(1);
        conversationsListHeadView.f25179o = (ConversationRealEcrGuideLayout) viewGroup.getChildAt(2);
        conversationsListHeadView.f25180p = (ConversationHeadRecommendLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationsListHeadView.f25181q = (ConversationCityCentreCardLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        conversationsListHeadView.f25182r = (FrameLayout) viewGroup.getChildAt(4);
        conversationsListHeadView.f25183s = viewGroup.getChildAt(5);
        conversationsListHeadView.f25184t = (LinearLayout) viewGroup.getChildAt(6);
        conversationsListHeadView.f25185u = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationsListHeadView.f25186v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        conversationsListHeadView.f25187w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        conversationsListHeadView.f25188x = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        conversationsListHeadView.f25189y = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        conversationsListHeadView.f25190z = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        conversationsListHeadView.f25151A = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        conversationsListHeadView.f25152B = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        conversationsListHeadView.f25153C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationsListHeadView.f25154D = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        conversationsListHeadView.f25155E = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        conversationsListHeadView.f25156F = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        conversationsListHeadView.f25157G = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
        conversationsListHeadView.f25158H = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(5);
        conversationsListHeadView.f25159I = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(6);
    }
}
