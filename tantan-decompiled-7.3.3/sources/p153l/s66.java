package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationBoostDetailAct;
import p151v.VDraweeView;
import p151v.VPager;

/* JADX INFO: loaded from: classes10.dex */
public class s66 {
    /* JADX INFO: renamed from: a */
    public static void m184845a(ConversationBoostDetailAct conversationBoostDetailAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationBoostDetailAct.f25392c = (VDraweeView) viewGroup.getChildAt(0);
        conversationBoostDetailAct.f25393d = (ImageView) viewGroup.getChildAt(1);
        conversationBoostDetailAct.f25394e = (ImageView) viewGroup.getChildAt(2);
        conversationBoostDetailAct.f25395f = (TextView) viewGroup.getChildAt(3);
        conversationBoostDetailAct.f25396g = (TextView) viewGroup.getChildAt(4);
        conversationBoostDetailAct.f25397h = (VPager) viewGroup.getChildAt(5);
        conversationBoostDetailAct.f25398i = (NewPictureContainerIndicator) viewGroup.getChildAt(6);
        conversationBoostDetailAct.f25399j = (CardBottomBaseInfoView) viewGroup.getChildAt(8);
        conversationBoostDetailAct.f25400k = (CardUserContentView) viewGroup.getChildAt(9);
        conversationBoostDetailAct.f25401l = (TextView) viewGroup.getChildAt(10);
    }

    /* JADX INFO: renamed from: b */
    public static View m184846b(ConversationBoostDetailAct conversationBoostDetailAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125939m, viewGroup, false);
        m184845a(conversationBoostDetailAct, viewInflate);
        return viewInflate;
    }
}
