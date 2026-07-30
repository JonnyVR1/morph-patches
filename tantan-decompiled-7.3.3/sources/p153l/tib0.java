package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.DialogC8942d;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class tib0 {
    /* JADX INFO: renamed from: a */
    public static void m191323a(DialogC8942d dialogC8942d, View view) {
        dialogC8942d._root = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        dialogC8942d._svga_content = (FrameLayout) viewGroup.getChildAt(0);
        dialogC8942d._svga_background = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dialogC8942d._svga_avatars = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dialogC8942d._close = (VImage) viewGroup.getChildAt(1);
        dialogC8942d._content = (LinearLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m191324b(DialogC8942d dialogC8942d, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162503V1, viewGroup, false);
        m191323a(dialogC8942d, viewInflate);
        return viewInflate;
    }
}
