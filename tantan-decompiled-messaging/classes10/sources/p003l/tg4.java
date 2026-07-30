package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tg4 {
    /* JADX INFO: renamed from: a */
    public static void m9575a(CardBottomBaseInfoView cardBottomBaseInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomBaseInfoView.c = viewGroup.getChildAt(0);
        cardBottomBaseInfoView.d = viewGroup.getChildAt(1);
        cardBottomBaseInfoView.e = viewGroup.getChildAt(2);
        cardBottomBaseInfoView.f = viewGroup.getChildAt(3);
        cardBottomBaseInfoView.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cardBottomBaseInfoView.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        cardBottomBaseInfoView.i = (LinearLayout) viewGroup.getChildAt(4);
        cardBottomBaseInfoView.j = viewGroup.getChildAt(5);
    }
}
