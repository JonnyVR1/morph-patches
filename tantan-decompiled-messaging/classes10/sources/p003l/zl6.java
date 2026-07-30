package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationWeakenView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class zl6 {
    /* JADX INFO: renamed from: a */
    public static void m11433a(ConversationWeakenView conversationWeakenView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        conversationWeakenView.c = viewGroup.getChildAt(0);
        conversationWeakenView.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationWeakenView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationWeakenView.f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationWeakenView.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }
}
