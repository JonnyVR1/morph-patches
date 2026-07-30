package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.ConversationCityCentreCardLayout;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VMarqueeText;

/* JADX INFO: loaded from: classes10.dex */
public class w66 {
    /* JADX INFO: renamed from: a */
    public static void m205080a(ConversationCityCentreCardLayout conversationCityCentreCardLayout, View view) {
        conversationCityCentreCardLayout.f25418a = (ConversationCityCentreCardLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        conversationCityCentreCardLayout.f25419b = (FrameLayout) viewGroup.getChildAt(0);
        conversationCityCentreCardLayout.f25420c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        conversationCityCentreCardLayout.f25421d = (RelativeLayout) viewGroup.getChildAt(1);
        conversationCityCentreCardLayout.f25422e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        conversationCityCentreCardLayout.f25423f = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        conversationCityCentreCardLayout.f25424g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        conversationCityCentreCardLayout.f25425h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        conversationCityCentreCardLayout.f25426i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        conversationCityCentreCardLayout.f25427j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        conversationCityCentreCardLayout.f25428k = (VMarqueeText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        conversationCityCentreCardLayout.f25429l = viewGroup.getChildAt(2);
        conversationCityCentreCardLayout.f25430m = (RelativeLayout) viewGroup.getChildAt(3);
        conversationCityCentreCardLayout.f25431n = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        conversationCityCentreCardLayout.f25432o = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        conversationCityCentreCardLayout.f25433p = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        conversationCityCentreCardLayout.f25434q = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        conversationCityCentreCardLayout.f25435r = (SVGAnimationView) viewGroup.getChildAt(4);
    }
}
