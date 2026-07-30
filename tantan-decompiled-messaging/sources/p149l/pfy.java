package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzNoFaceTipView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.MediaBuzzCallControlView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.zebraprogress.ZebraProgress;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pfy {
    /* JADX INFO: renamed from: a */
    public static void m168658a(ofy ofyVar, View view) {
        ofyVar._memoji_call_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ofyVar._peer_surface_root = (FrameLayout) viewGroup.getChildAt(0);
        ofyVar._top_mask = viewGroup.getChildAt(1);
        ofyVar._bottom_mask = viewGroup.getChildAt(2);
        ofyVar._match_view = (LoveBuzzMatchView) viewGroup.getChildAt(3);
        ofyVar._vb_report = (VImage) viewGroup.getChildAt(4);
        ofyVar._progress_root = (FrameLayout) viewGroup.getChildAt(5);
        ofyVar._progress_root_call_progress = (ZebraProgress) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        ofyVar._countdown_time = (VText) viewGroup.getChildAt(6);
        ofyVar._peer_info_root = (VLinear) viewGroup.getChildAt(7);
        ofyVar._peer_info_root_peer_info = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        ofyVar._peer_info_root_peer_age = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        ofyVar._memoji_control = viewGroup.getChildAt(8);
        ofyVar._vb_control = (MediaBuzzCallControlView) viewGroup.getChildAt(9);
        ofyVar._memoji_tips = (VFrame) viewGroup.getChildAt(10);
        ofyVar._memoji_tips_count_down = (VText) ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(0);
        ofyVar._memoji_tips_count_tip = (VText) ((ViewGroup) viewGroup.getChildAt(10)).getChildAt(1);
        ofyVar._no_face_tip = (BuzzNoFaceTipView) viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m168659b(ofy ofyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106049z, viewGroup, false);
        m168658a(ofyVar, viewInflate);
        return viewInflate;
    }
}
