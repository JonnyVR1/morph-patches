package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.seepage.likers.FakeLikersItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uyf {
    /* JADX INFO: renamed from: a */
    public static void m9791a(FakeLikersItem fakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fakeLikersItem.h = viewGroup.getChildAt(0);
        fakeLikersItem.i = viewGroup.getChildAt(2);
        fakeLikersItem.j = (FrameLayout) viewGroup.getChildAt(3);
        fakeLikersItem.k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        fakeLikersItem.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        fakeLikersItem.m = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
