package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.C8941c;
import p151v.VImage;
import p151v.VScroll_Fill_BottomAligned;

/* JADX INFO: loaded from: classes10.dex */
public class dib0 {
    /* JADX INFO: renamed from: a */
    public static void m115871a(C8941c c8941c, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8941c._content = (VScroll_Fill_BottomAligned) viewGroup.getChildAt(0);
        c8941c._privilege = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8941c._showcase = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8941c._payment = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        c8941c._close = (VImage) viewGroup.getChildAt(1);
        c8941c._agreements = (FrameLayout) viewGroup.getChildAt(2);
    }
}
