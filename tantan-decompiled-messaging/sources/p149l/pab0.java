package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.DialogC8779d;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class pab0 {
    /* JADX INFO: renamed from: a */
    public static void m168083a(DialogC8779d dialogC8779d, View view) {
        dialogC8779d._root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dialogC8779d._svga_content = (FrameLayout) viewGroup.getChildAt(0);
        dialogC8779d._svga_background = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dialogC8779d._svga_avatars = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dialogC8779d._close = (VImage) viewGroup.getChildAt(1);
        dialogC8779d._content = (LinearLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m168084b(DialogC8779d dialogC8779d, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131543V1, viewGroup, false);
        m168083a(dialogC8779d, viewInflate);
        return viewInflate;
    }
}
