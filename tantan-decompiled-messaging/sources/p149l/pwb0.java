package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item.QuickChatLoftChatItem;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.newquickchat.secondfloor.item.QuickChatPageItem;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pwb0 {
    /* JADX INFO: renamed from: a */
    public static void m171709a(owb0 owb0Var, View view) {
        owb0Var._rootView = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        owb0Var._background = (ImageView) viewGroup.getChildAt(0);
        owb0Var._svga_bg = (SVGAnimationView) viewGroup.getChildAt(1);
        owb0Var._navigation_bar = (VLinear) viewGroup.getChildAt(2);
        owb0Var._back_btn = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        owb0Var._title = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        owb0Var._content_view = (VScroll) viewGroup.getChildAt(3);
        owb0Var._top_content = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        owb0Var._top_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        owb0Var._top_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        owb0Var._sub_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        owb0Var._text_chat_view = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        owb0Var._text_chat_view_svg_anim = (SVGAnimationView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        owb0Var._text_chat_view_wave = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        owb0Var._text_chat_view_view1 = (QuickChatLoftChatItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        owb0Var._text_chat_view_view2 = (QuickChatLoftChatItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        owb0Var._online_tip_button = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2);
        owb0Var._quick_text = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        owb0Var._quick_text_count = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        owb0Var._call_content = (VRelative) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3);
        owb0Var._bottom_content_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        owb0Var._total_layout = (VLinear) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        owb0Var._total_layout_voice_call_content = (QuickChatPageItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        owb0Var._total_layout_vedio_call_content = (QuickChatPageItem) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(1)).getChildAt(2);
        owb0Var._single_layout = (VRelative) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        owb0Var._single_layout_desc = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        owb0Var._single_layout_icon = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(3)).getChildAt(2)).getChildAt(2);
        owb0Var._mask = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m171710b(owb0 owb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95830ib, viewGroup, false);
        m171709a(owb0Var, viewInflate);
        return viewInflate;
    }
}
