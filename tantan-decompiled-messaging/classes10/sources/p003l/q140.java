package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.NewPictureView;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class q140 {
    /* JADX INFO: renamed from: a */
    public static void m8849a(NewPictureView newPictureView, View view) {
        newPictureView.a = view.findViewById(u4c0.L5);
        newPictureView.b = view.findViewById(u4c0.O0);
        newPictureView.c = (ImageView) view.findViewById(u4c0.oa);
        newPictureView.d = view.findViewById(u4c0.D7);
        newPictureView.e = (ImageView) view.findViewById(u4c0.r9);
        newPictureView.f = (LinearLayout) view.findViewById(u4c0.Q6);
        ViewGroup viewGroup = (ViewGroup) view;
        newPictureView.g = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newPictureView.h = view.findViewById(u4c0.ka);
        newPictureView.i = view.findViewById(u4c0.s8);
        newPictureView.j = view.findViewById(u4c0.o9);
        newPictureView.k = (LinearLayout) viewGroup.getChildAt(3);
        newPictureView.l = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        newPictureView.m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
