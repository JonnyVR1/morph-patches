package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationCityCentreCardLayout;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VMarqueeText;

/* JADX INFO: loaded from: classes10.dex */
public class r56 {
    /* JADX INFO: renamed from: a */
    public static void m177881a(ConversationCityCentreCardLayout conversationCityCentreCardLayout, View view) {
        conversationCityCentreCardLayout.f24676a = (ConversationCityCentreCardLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationCityCentreCardLayout.f24677b = (FrameLayout) viewGroup.getChildAt(0);
        conversationCityCentreCardLayout.f24678c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationCityCentreCardLayout.f24679d = (RelativeLayout) viewGroup.getChildAt(1);
        conversationCityCentreCardLayout.f24680e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationCityCentreCardLayout.f24681f = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationCityCentreCardLayout.f24682g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationCityCentreCardLayout.f24683h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationCityCentreCardLayout.f24684i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        conversationCityCentreCardLayout.f24685j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        conversationCityCentreCardLayout.f24686k = (VMarqueeText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        conversationCityCentreCardLayout.f24687l = viewGroup.getChildAt(2);
        conversationCityCentreCardLayout.f24688m = (RelativeLayout) viewGroup.getChildAt(3);
        conversationCityCentreCardLayout.f24689n = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationCityCentreCardLayout.f24690o = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        conversationCityCentreCardLayout.f24691p = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        conversationCityCentreCardLayout.f24692q = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        conversationCityCentreCardLayout.f24693r = (SVGAnimationView) viewGroup.getChildAt(4);
    }
}
