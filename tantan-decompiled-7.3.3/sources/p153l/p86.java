package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadLikerItemLayout;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p86 {
    /* JADX INFO: renamed from: a */
    public static void m171184a(ConversationHeadLikerItemLayout conversationHeadLikerItemLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationHeadLikerItemLayout.f25475a = (VFrame) viewGroup.getChildAt(0);
        conversationHeadLikerItemLayout.f25476b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationHeadLikerItemLayout.f25477c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationHeadLikerItemLayout.f25478d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationHeadLikerItemLayout.f25479e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationHeadLikerItemLayout.f25480f = (VText) viewGroup.getChildAt(1);
    }
}
