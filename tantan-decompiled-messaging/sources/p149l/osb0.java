package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatAudioHeaderView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.state.CoreAutoScrollView;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.view.DropDownBgView;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class osb0 {
    /* JADX INFO: renamed from: a */
    public static void m165739a(QuickChatAudioHeaderView quickChatAudioHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        quickChatAudioHeaderView._background = (DropDownBgView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        quickChatAudioHeaderView._svga_loading = (SVGAnimationView) viewGroup.getChildAt(1);
        quickChatAudioHeaderView._svga_hey_tips = (SVGAnimationView) viewGroup.getChildAt(2);
        quickChatAudioHeaderView._hey_pull = (SVGAnimationView) viewGroup.getChildAt(3);
        quickChatAudioHeaderView._scroll_view_state = (CoreAutoScrollView) viewGroup.getChildAt(4);
        quickChatAudioHeaderView._oof_layout = (FrameLayout) viewGroup.getChildAt(5);
        quickChatAudioHeaderView._oof_layout_icon = (SVGAnimationView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        quickChatAudioHeaderView._oof_layout_txt = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        quickChatAudioHeaderView._bottom_pull_text = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m165740b(QuickChatAudioHeaderView quickChatAudioHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95897mb, viewGroup, true);
        m165739a(quickChatAudioHeaderView, viewInflate);
        return viewInflate;
    }
}
