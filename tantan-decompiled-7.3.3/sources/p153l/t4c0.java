package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.item.QuickChatLoftChatItem;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t4c0 {
    /* JADX INFO: renamed from: a */
    public static void m189250a(s4c0 s4c0Var, View view) {
        s4c0Var._rootView = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        s4c0Var._background = (ImageView) viewGroup.getChildAt(0);
        s4c0Var._svga_bg = (SVGAnimationView) viewGroup.getChildAt(1);
        s4c0Var._navigation_bar = (VLinear) viewGroup.getChildAt(2);
        s4c0Var._back_btn = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        s4c0Var._title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        s4c0Var._content_view = (VScroll) viewGroup.getChildAt(3);
        s4c0Var._top_content = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        s4c0Var._top_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        s4c0Var._top_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        s4c0Var._sub_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        s4c0Var._text_chat_view = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        s4c0Var._text_chat_view_svg_anim = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        s4c0Var._text_chat_view_wave = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        s4c0Var._text_chat_view_view1 = (QuickChatLoftChatItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        s4c0Var._text_chat_view_view2 = (QuickChatLoftChatItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        s4c0Var._online_tip_button = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        s4c0Var._quick_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        s4c0Var._quick_text_count = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        s4c0Var._call_content = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3);
        s4c0Var._bottom_content_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        s4c0Var._total_layout = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        s4c0Var._total_layout_voice_call_content = (QuickChatPageItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        s4c0Var._total_layout_vedio_call_content = (QuickChatPageItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        s4c0Var._single_layout = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        s4c0Var._single_layout_desc = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        s4c0Var._single_layout_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(2);
        s4c0Var._mask = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m189251b(s4c0 s4c0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126002pb, viewGroup, false);
        m189250a(s4c0Var, viewInflate);
        return viewInflate;
    }
}
