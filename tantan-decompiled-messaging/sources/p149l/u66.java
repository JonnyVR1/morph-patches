package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationFoldView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationWeakenView;

/* JADX INFO: loaded from: classes10.dex */
public class u66 {
    /* JADX INFO: renamed from: a */
    public static void m191955a(ConversationFoldView conversationFoldView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationFoldView.f24717c = (FrameLayout) viewGroup.getChildAt(0);
        conversationFoldView.f24718d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationFoldView.f24719e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationFoldView.f24720f = (ConversationWeakenView) viewGroup.getChildAt(1);
    }
}
