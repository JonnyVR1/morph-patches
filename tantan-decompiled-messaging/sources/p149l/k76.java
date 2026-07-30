package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadLikerItemLayout;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k76 {
    /* JADX INFO: renamed from: a */
    public static void m144648a(ConversationHeadLikerItemLayout conversationHeadLikerItemLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationHeadLikerItemLayout.f24733a = (VFrame) viewGroup.getChildAt(0);
        conversationHeadLikerItemLayout.f24734b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationHeadLikerItemLayout.f24735c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationHeadLikerItemLayout.f24736d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        conversationHeadLikerItemLayout.f24737e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        conversationHeadLikerItemLayout.f24738f = (VText) viewGroup.getChildAt(1);
    }
}
