package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzCallEndFrag;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pf2 {
    /* JADX INFO: renamed from: a */
    public static void m168583a(BaseBuzzCallEndFrag baseBuzzCallEndFrag, View view) {
        baseBuzzCallEndFrag._call_end_root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        baseBuzzCallEndFrag._call_end_title = (VText) viewGroup.getChildAt(0);
        baseBuzzCallEndFrag._call_duration = (VText) viewGroup.getChildAt(1);
        baseBuzzCallEndFrag._vb_peer_avatar = (VDraweeView) viewGroup.getChildAt(2);
        baseBuzzCallEndFrag._vb_peer_name = (VText) viewGroup.getChildAt(3);
        baseBuzzCallEndFrag._vb_peer_info = (VText) viewGroup.getChildAt(4);
        baseBuzzCallEndFrag._call_back = (VText) viewGroup.getChildAt(5);
        baseBuzzCallEndFrag._continue_call = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m168584b(BaseBuzzCallEndFrag baseBuzzCallEndFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106024a, viewGroup, false);
        m168583a(baseBuzzCallEndFrag, viewInflate);
        return viewInflate;
    }
}
