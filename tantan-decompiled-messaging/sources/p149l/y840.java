package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.C8167a;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.widget.QuickChatPullHeadAnim;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y840 {
    /* JADX INFO: renamed from: a */
    public static void m213361a(C8167a c8167a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8167a._pullbg_svga = (SVGAnimationView) viewGroup.getChildAt(0);
        c8167a._pullbg_svga_flash = (SVGAnimationView) viewGroup.getChildAt(1);
        c8167a._tips_layout = (VLinear) viewGroup.getChildAt(2);
        c8167a._tips_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        c8167a._tips_text = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        c8167a._quickchat_pullhead_anim = (QuickChatPullHeadAnim) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m213362b(C8167a c8167a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95914nb, viewGroup, true);
        m213361a(c8167a, viewInflate);
        return viewInflate;
    }
}
