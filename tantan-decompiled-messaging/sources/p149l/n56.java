package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct;
import p147v.VDraweeView;
import p147v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class n56 {
    /* JADX INFO: renamed from: a */
    public static void m157986a(ConversationBoostDetailAct conversationBoostDetailAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationBoostDetailAct.f24650c = (VDraweeView) viewGroup.getChildAt(0);
        conversationBoostDetailAct.f24651d = (ImageView) viewGroup.getChildAt(1);
        conversationBoostDetailAct.f24652e = (ImageView) viewGroup.getChildAt(2);
        conversationBoostDetailAct.f24653f = (TextView) viewGroup.getChildAt(3);
        conversationBoostDetailAct.f24654g = (TextView) viewGroup.getChildAt(4);
        conversationBoostDetailAct.f24655h = (VPager) viewGroup.getChildAt(5);
        conversationBoostDetailAct.f24656i = (NewPictureContainerIndicator) viewGroup.getChildAt(6);
        conversationBoostDetailAct.f24657j = (CardBottomBaseInfoView) viewGroup.getChildAt(8);
        conversationBoostDetailAct.f24658k = (CardUserContentView) viewGroup.getChildAt(9);
        conversationBoostDetailAct.f24659l = (TextView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m157987b(ConversationBoostDetailAct conversationBoostDetailAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95885m, viewGroup, false);
        m157986a(conversationBoostDetailAct, viewInflate);
        return viewInflate;
    }
}
