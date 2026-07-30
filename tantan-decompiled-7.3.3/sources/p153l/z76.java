package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationFoldView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationWeakenView;

/* JADX INFO: loaded from: classes10.dex */
public class z76 {
    /* JADX INFO: renamed from: a */
    public static void m218865a(ConversationFoldView conversationFoldView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationFoldView.f25459c = (FrameLayout) viewGroup.getChildAt(0);
        conversationFoldView.f25460d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationFoldView.f25461e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationFoldView.f25462f = (ConversationWeakenView) viewGroup.getChildAt(1);
    }
}
