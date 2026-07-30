package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.vip.likers.LikersBigCardItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dir {
    /* JADX INFO: renamed from: a */
    public static void m6120a(LikersBigCardItemView likersBigCardItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likersBigCardItemView.a = viewGroup.getChildAt(0);
        likersBigCardItemView.b = viewGroup.getChildAt(1);
        likersBigCardItemView.c = (LinearLayout) viewGroup.getChildAt(2);
        likersBigCardItemView.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        likersBigCardItemView.e = viewGroup.getChildAt(3);
        likersBigCardItemView.f = viewGroup.getChildAt(4);
        likersBigCardItemView.g = viewGroup.getChildAt(5);
        likersBigCardItemView.h = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        likersBigCardItemView.i = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(0);
        likersBigCardItemView.j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0)).getChildAt(1);
        likersBigCardItemView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(0);
        likersBigCardItemView.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1);
        likersBigCardItemView.m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        likersBigCardItemView.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        likersBigCardItemView.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        likersBigCardItemView.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(3);
    }
}
