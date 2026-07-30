package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.ui.PictureView;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bi70 {
    /* JADX INFO: renamed from: a */
    public static void m5723a(PictureView pictureView, View view) {
        pictureView.a = view.findViewById(u4c0.L5);
        pictureView.b = view.findViewById(u4c0.W5);
        ViewGroup viewGroup = (ViewGroup) view;
        pictureView.c = viewGroup.getChildAt(2);
        pictureView.d = (LinearLayout) viewGroup.getChildAt(3);
        pictureView.e = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pictureView.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        pictureView.g = view.findViewById(u4c0.O0);
        pictureView.h = view.findViewById(u4c0.oa);
        pictureView.i = view.findViewById(u4c0.D7);
        pictureView.j = view.findViewById(u4c0.r9);
        pictureView.k = (LinearLayout) view.findViewById(u4c0.Q6);
        pictureView.l = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        pictureView.m = view.findViewById(u4c0.ka);
        pictureView.n = view.findViewById(u4c0.s8);
        pictureView.o = view.findViewById(u4c0.o9);
        pictureView.p = (LinearLayout) view.findViewById(u4c0.e5);
        pictureView.q = view.findViewById(u4c0.g5);
        pictureView.r = view.findViewById(u4c0.f5);
        pictureView.s = viewGroup.getChildAt(7);
        pictureView.t = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        pictureView.u = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
        pictureView.v = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(2);
        pictureView.w = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(3);
        pictureView.x = ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(4);
        pictureView.y = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(5);
        pictureView.z = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(5)).getChildAt(0);
        pictureView.A = (LinearLayout) viewGroup.getChildAt(8);
        pictureView.B = ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
        pictureView.C = (ImageView) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(1);
        pictureView.D = viewGroup.getChildAt(9);
    }
}
