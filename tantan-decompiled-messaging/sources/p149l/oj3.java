package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class oj3 {
    /* JADX INFO: renamed from: a */
    public static void m164606a(BusinessConversationView businessConversationView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        businessConversationView.f25734h = (VDraweeView) viewGroup.getChildAt(0);
        businessConversationView.f25735i = (ImageView) viewGroup.getChildAt(1);
        businessConversationView.f25736j = (FrameLayout) viewGroup.getChildAt(2);
        businessConversationView.f25737k = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        businessConversationView.f25738l = (ViewStub) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        businessConversationView.f25739m = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        businessConversationView.f25740n = (VFrame) viewGroup.getChildAt(3);
        businessConversationView.f25741o = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        businessConversationView.f25742p = (TextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        businessConversationView.f25743q = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        businessConversationView.f25744r = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        businessConversationView.f25745s = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        businessConversationView.f25746t = (ViewStub) viewGroup.getChildAt(4);
        businessConversationView.f25747u = (VImage) viewGroup.getChildAt(5);
        businessConversationView.f25748v = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(0);
        businessConversationView.f25749w = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(0);
        businessConversationView.f25750x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(1);
        businessConversationView.f25751y = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(2);
        businessConversationView.f25752z = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        businessConversationView.f25729A = (VText) viewGroup.getChildAt(7);
    }
}
