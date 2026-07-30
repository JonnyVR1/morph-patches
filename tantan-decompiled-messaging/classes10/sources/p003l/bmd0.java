package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.svip.SVIPLetterCoverView;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bmd0 {
    /* JADX INFO: renamed from: a */
    public static void m5743a(SVIPLetterCoverView sVIPLetterCoverView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sVIPLetterCoverView.d = (Space) viewGroup.getChildAt(0);
        sVIPLetterCoverView.e = (FrameLayout) viewGroup.getChildAt(1);
        sVIPLetterCoverView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sVIPLetterCoverView.g = view.findViewById(u4c0.L5);
        ViewGroup viewGroup2 = (ViewGroup) view;
        sVIPLetterCoverView.h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(2);
        sVIPLetterCoverView.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(4);
        sVIPLetterCoverView.j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(5);
        sVIPLetterCoverView.k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6);
        sVIPLetterCoverView.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(0);
        sVIPLetterCoverView.m = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(6)).getChildAt(1);
        sVIPLetterCoverView.n = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(0)).getChildAt(7);
        sVIPLetterCoverView.o = ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1);
        sVIPLetterCoverView.p = view.findViewById(u4c0.Q5);
        sVIPLetterCoverView.q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(2);
        sVIPLetterCoverView.r = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(3);
        sVIPLetterCoverView.s = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        sVIPLetterCoverView.t = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(3)).getChildAt(5);
        sVIPLetterCoverView.u = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(3)).getChildAt(6);
        sVIPLetterCoverView.v = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(4);
        sVIPLetterCoverView.w = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        sVIPLetterCoverView.x = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup2.getChildAt(1)).getChildAt(1)).getChildAt(4)).getChildAt(1);
        sVIPLetterCoverView.y = (TextView) viewGroup2.getChildAt(2);
        sVIPLetterCoverView.z = (TextView) viewGroup2.getChildAt(3);
        sVIPLetterCoverView.A = viewGroup2.getChildAt(4);
        sVIPLetterCoverView.B = (LinearLayout) viewGroup2.getChildAt(5);
        sVIPLetterCoverView.C = (TextView) ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(0);
        sVIPLetterCoverView.D = (TextView) ((ViewGroup) viewGroup2.getChildAt(5)).getChildAt(1);
        sVIPLetterCoverView.E = viewGroup2.getChildAt(6);
    }
}
