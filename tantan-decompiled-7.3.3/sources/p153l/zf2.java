package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.pop.BaseBuzzNotifyPop;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzProgressBar;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class zf2 {
    /* JADX INFO: renamed from: a */
    public static void m219520a(BaseBuzzNotifyPop baseBuzzNotifyPop, View view) {
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
    public static View m219521b(BaseBuzzNotifyPop baseBuzzNotifyPop, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136458A, viewGroup, true);
        m219520a(baseBuzzNotifyPop, viewInflate);
        return viewInflate;
    }
}
