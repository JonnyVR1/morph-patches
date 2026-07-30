package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.ComboNumView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pe5 {
    /* JADX INFO: renamed from: a */
    public static void m8740a(ComboNumView comboNumView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        comboNumView.a = viewGroup.getChildAt(0);
        comboNumView.b = (ImageView) viewGroup.getChildAt(1);
        comboNumView.c = (LinearLayout) viewGroup.getChildAt(2);
        comboNumView.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        comboNumView.e = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        comboNumView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        comboNumView.g = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        comboNumView.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        comboNumView.i = (LinearLayout) viewGroup.getChildAt(3);
        comboNumView.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        comboNumView.k = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        comboNumView.l = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        comboNumView.m = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        comboNumView.n = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
    }
}
