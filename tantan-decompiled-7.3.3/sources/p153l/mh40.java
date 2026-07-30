package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.C8318a;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.widget.QuickChatPullHeadAnim;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mh40 {
    /* JADX INFO: renamed from: a */
    public static void m158411a(C8318a c8318a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8318a._pullbg_svga = (SVGAnimationView) viewGroup.getChildAt(0);
        c8318a._pullbg_svga_flash = (SVGAnimationView) viewGroup.getChildAt(1);
        c8318a._tips_layout = (VLinear) viewGroup.getChildAt(2);
        c8318a._tips_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c8318a._tips_text = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        c8318a._quickchat_pullhead_anim = (QuickChatPullHeadAnim) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m158412b(C8318a c8318a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126087ub, viewGroup, true);
        m158411a(c8318a, viewInflate);
        return viewInflate;
    }
}
