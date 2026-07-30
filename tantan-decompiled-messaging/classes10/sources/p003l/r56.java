package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.messages.ConversationCityCentreCardLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r56 {
    /* JADX INFO: renamed from: a */
    public static void m9088a(ConversationCityCentreCardLayout conversationCityCentreCardLayout, View view) {
        conversationCityCentreCardLayout.a = (ConversationCityCentreCardLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationCityCentreCardLayout.b = (FrameLayout) viewGroup.getChildAt(0);
        conversationCityCentreCardLayout.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationCityCentreCardLayout.d = (RelativeLayout) viewGroup.getChildAt(1);
        conversationCityCentreCardLayout.e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationCityCentreCardLayout.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationCityCentreCardLayout.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationCityCentreCardLayout.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationCityCentreCardLayout.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        conversationCityCentreCardLayout.j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        conversationCityCentreCardLayout.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        conversationCityCentreCardLayout.l = viewGroup.getChildAt(2);
        conversationCityCentreCardLayout.m = (RelativeLayout) viewGroup.getChildAt(3);
        conversationCityCentreCardLayout.n = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationCityCentreCardLayout.o = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        conversationCityCentreCardLayout.p = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        conversationCityCentreCardLayout.q = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        conversationCityCentreCardLayout.r = viewGroup.getChildAt(4);
    }
}
