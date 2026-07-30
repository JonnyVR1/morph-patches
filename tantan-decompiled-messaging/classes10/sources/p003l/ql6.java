package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.main.ConversationView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ql6 {
    /* JADX INFO: renamed from: a */
    public static void m9012a(ConversationView conversationView, View view) {
        conversationView.a = (ConversationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        conversationView.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        conversationView.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        conversationView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        conversationView.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        conversationView.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(6);
        conversationView.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(7);
        conversationView.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(8);
        conversationView.k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(9);
        conversationView.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        conversationView.m = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        conversationView.n = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationView.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationView.p = viewGroup.getChildAt(2);
    }
}
