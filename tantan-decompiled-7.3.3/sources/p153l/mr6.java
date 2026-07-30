package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationCityCentreCardLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationRealEcrGuideLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p051p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mr6 {
    /* JADX INFO: renamed from: a */
    public static void m159621a(ConversationsListHeadView conversationsListHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationsListHeadView.f25919m = viewGroup.getChildAt(0);
        conversationsListHeadView.f25920n = (PrivilegePromotionHeaderView) viewGroup.getChildAt(1);
        conversationsListHeadView.f25921o = (ConversationRealEcrGuideLayout) viewGroup.getChildAt(2);
        conversationsListHeadView.f25922p = (ConversationHeadRecommendLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationsListHeadView.f25923q = (ConversationCityCentreCardLayout) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        conversationsListHeadView.f25924r = (FrameLayout) viewGroup.getChildAt(4);
        conversationsListHeadView.f25925s = viewGroup.getChildAt(5);
        conversationsListHeadView.f25926t = (LinearLayout) viewGroup.getChildAt(6);
        conversationsListHeadView.f25927u = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        conversationsListHeadView.f25928v = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(0);
        conversationsListHeadView.f25929w = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(1);
        conversationsListHeadView.f25930x = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(2);
        conversationsListHeadView.f25931y = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(3);
        conversationsListHeadView.f25932z = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0)).getChildAt(4);
        conversationsListHeadView.f25893A = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        conversationsListHeadView.f25894B = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        conversationsListHeadView.f25895C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationsListHeadView.f25896D = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        conversationsListHeadView.f25897E = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(2);
        conversationsListHeadView.f25898F = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(3);
        conversationsListHeadView.f25899G = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(4);
        conversationsListHeadView.f25900H = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(5);
        conversationsListHeadView.f25901I = (ViewStub) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(6);
    }
}
