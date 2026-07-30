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
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l1l0 {
    /* JADX INFO: renamed from: a */
    public static void m148193a(k1l0 k1l0Var, View view) {
        k1l0Var._video_call_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k1l0Var._peer_surface_root = (FrameLayout) viewGroup.getChildAt(0);
        k1l0Var._top_mask = viewGroup.getChildAt(1);
        k1l0Var._bottom_mask = viewGroup.getChildAt(2);
        k1l0Var._match_view = (LoveBuzzMatchView) viewGroup.getChildAt(3);
        k1l0Var._vb_report = (VImage) viewGroup.getChildAt(4);
        k1l0Var._progress_root = (FrameLayout) viewGroup.getChildAt(5);
        k1l0Var._progress_root_call_progress = (ZebraProgress) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        k1l0Var._countdown_time = (VText) viewGroup.getChildAt(6);
        k1l0Var._peer_info_root = (VLinear) viewGroup.getChildAt(7);
        k1l0Var._peer_info_root_peer_info = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        k1l0Var._peer_info_root_peer_age = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        k1l0Var._vb_control = (MediaBuzzCallControlView) viewGroup.getChildAt(8);
        k1l0Var._no_face_tip = (BuzzNoFaceTipView) viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m148194b(k1l0 k1l0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106020E, viewGroup, false);
        m148193a(k1l0Var, viewInflate);
        return viewInflate;
    }
}
