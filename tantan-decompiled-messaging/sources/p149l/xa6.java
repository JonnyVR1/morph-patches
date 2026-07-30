package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.itemview.ConversationItemRightBtnView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xa6 {
    /* JADX INFO: renamed from: a */
    public static void m207529a(ConversationItemRightBtnView conversationItemRightBtnView, View view) {
        conversationItemRightBtnView.f25840a = (ConversationItemRightBtnView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationItemRightBtnView.f25841b = (VText) viewGroup.getChildAt(0);
        conversationItemRightBtnView.f25842c = (VText) viewGroup.getChildAt(1);
        conversationItemRightBtnView.f25843d = (VImage) viewGroup.getChildAt(2);
    }
}
