package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.pop.BaseBuzzNotifyPop;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzProgressBar;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sf2 {
    /* JADX INFO: renamed from: a */
    public static void m183775a(BaseBuzzNotifyPop baseBuzzNotifyPop, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        baseBuzzNotifyPop._front_bg = (VImage) viewGroup.getChildAt(0);
        baseBuzzNotifyPop._peer_avatar_anim = (SVGAnimationView) viewGroup.getChildAt(1);
        baseBuzzNotifyPop._peer_info_ll = (VLinear) viewGroup.getChildAt(2);
        baseBuzzNotifyPop._peer_info_ll_peer_info = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        baseBuzzNotifyPop._peer_info_ll_peer_region = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        baseBuzzNotifyPop._peer_info_ll_buzz_desc = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        baseBuzzNotifyPop._refuse_buzz = (VText) viewGroup.getChildAt(3);
        baseBuzzNotifyPop._accept_buzz = (VText) viewGroup.getChildAt(4);
        baseBuzzNotifyPop._buzz_progress_bar = (BuzzProgressBar) viewGroup.getChildAt(5);
        baseBuzzNotifyPop._close_buzz = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m183776b(BaseBuzzNotifyPop baseBuzzNotifyPop, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106016A, viewGroup, true);
        m183775a(baseBuzzNotifyPop, viewInflate);
        return viewInflate;
    }
}
