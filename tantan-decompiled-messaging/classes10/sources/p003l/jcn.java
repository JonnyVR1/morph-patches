package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.seepage.likers.IntlFakeLikersItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jcn {
    /* JADX INFO: renamed from: a */
    public static void m7393a(IntlFakeLikersItem intlFakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlFakeLikersItem.h = viewGroup.getChildAt(0);
        intlFakeLikersItem.i = (FrameLayout) viewGroup.getChildAt(2);
        intlFakeLikersItem.j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        intlFakeLikersItem.k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        intlFakeLikersItem.l = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
