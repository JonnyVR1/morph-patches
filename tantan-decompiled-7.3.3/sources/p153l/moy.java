package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzNoFaceTipView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class moy {
    /* JADX INFO: renamed from: a */
    public static void m159325a(loy loyVar, View view) {
        loyVar._memoji_call_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        loyVar._peer_surface_root = (FrameLayout) viewGroup.getChildAt(0);
        loyVar._top_mask = viewGroup.getChildAt(1);
        loyVar._bottom_mask = viewGroup.getChildAt(2);
        loyVar._match_view = (LoveBuzzMatchView) viewGroup.getChildAt(3);
        loyVar._vb_report = (VImage) viewGroup.getChildAt(4);
        loyVar._progress_root = (FrameLayout) viewGroup.getChildAt(5);
        loyVar._progress_root_call_progress = (ZebraProgress) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        loyVar._countdown_time = (VText) viewGroup.getChildAt(6);
        loyVar._peer_info_root = (VLinear) viewGroup.getChildAt(7);
        loyVar._peer_info_root_peer_info = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        loyVar._peer_info_root_peer_age = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        loyVar._memoji_control = viewGroup.getChildAt(8);
        loyVar._vb_control = (MediaBuzzCallControlView) viewGroup.getChildAt(9);
        loyVar._memoji_tips = (VFrame) viewGroup.getChildAt(10);
        loyVar._memoji_tips_count_down = (VText) ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
        loyVar._memoji_tips_count_tip = (VText) ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(1);
        loyVar._no_face_tip = (BuzzNoFaceTipView) viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m159326b(loy loyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136491z, viewGroup, false);
        m159325a(loyVar, viewInflate);
        return viewInflate;
    }
}
