package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class gk3 {
    /* JADX INFO: renamed from: a */
    public static void m130566a(BusinessConversationView businessConversationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        businessConversationView.f26476h = (VDraweeView) viewGroup.getChildAt(0);
        businessConversationView.f26477i = (ImageView) viewGroup.getChildAt(1);
        businessConversationView.f26478j = (FrameLayout) viewGroup.getChildAt(2);
        businessConversationView.f26479k = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        businessConversationView.f26480l = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        businessConversationView.f26481m = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        businessConversationView.f26482n = (VFrame) viewGroup.getChildAt(3);
        businessConversationView.f26483o = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        businessConversationView.f26484p = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        businessConversationView.f26485q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        businessConversationView.f26486r = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        businessConversationView.f26487s = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        businessConversationView.f26488t = (ViewStub) viewGroup.getChildAt(4);
        businessConversationView.f26489u = (VImage) viewGroup.getChildAt(5);
        businessConversationView.f26490v = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        businessConversationView.f26491w = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        businessConversationView.f26492x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        businessConversationView.f26493y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        businessConversationView.f26494z = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        businessConversationView.f26471A = (VText) viewGroup.getChildAt(7);
    }
}
