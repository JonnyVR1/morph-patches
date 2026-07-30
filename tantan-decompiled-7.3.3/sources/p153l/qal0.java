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
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qal0 {
    /* JADX INFO: renamed from: a */
    public static void m175944a(pal0 pal0Var, View view) {
        pal0Var._video_call_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pal0Var._peer_surface_root = (FrameLayout) viewGroup.getChildAt(0);
        pal0Var._top_mask = viewGroup.getChildAt(1);
        pal0Var._bottom_mask = viewGroup.getChildAt(2);
        pal0Var._match_view = (LoveBuzzMatchView) viewGroup.getChildAt(3);
        pal0Var._vb_report = (VImage) viewGroup.getChildAt(4);
        pal0Var._progress_root = (FrameLayout) viewGroup.getChildAt(5);
        pal0Var._progress_root_call_progress = (ZebraProgress) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        pal0Var._countdown_time = (VText) viewGroup.getChildAt(6);
        pal0Var._peer_info_root = (VLinear) viewGroup.getChildAt(7);
        pal0Var._peer_info_root_peer_info = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        pal0Var._peer_info_root_peer_age = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        pal0Var._vb_control = (MediaBuzzCallControlView) viewGroup.getChildAt(8);
        pal0Var._no_face_tip = (BuzzNoFaceTipView) viewGroup.getChildAt(9);
    }

    /* JADX INFO: renamed from: b */
    public static View m175945b(pal0 pal0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136462E, viewGroup, false);
        m175944a(pal0Var, viewInflate);
        return viewInflate;
    }
}
