package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.C8778c;
import p147v.VImage;
import p147v.VScroll_Fill_BottomAligned;

/* JADX INFO: loaded from: classes10.dex */
public class z9b0 {
    /* JADX INFO: renamed from: a */
    public static void m217666a(C8778c c8778c, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c8778c._content = (VScroll_Fill_BottomAligned) viewGroup.getChildAt(0);
        c8778c._privilege = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        c8778c._showcase = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        c8778c._payment = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        c8778c._close = (VImage) viewGroup.getChildAt(1);
        c8778c._agreements = (FrameLayout) viewGroup.getChildAt(2);
    }
}
