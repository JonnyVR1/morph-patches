package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.GPHomeMissMatchView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class eej {
    /* JADX INFO: renamed from: a */
    public static void m115970a(GPHomeMissMatchView gPHomeMissMatchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gPHomeMissMatchView.f21630a = (VFrame) viewGroup.getChildAt(0);
        gPHomeMissMatchView.f21631b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        gPHomeMissMatchView.f21632c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        gPHomeMissMatchView.f21633d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
    }
}
