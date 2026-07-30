package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view.MultiCallPkBoardItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zd10 {
    /* JADX INFO: renamed from: a */
    public static void m27166a(MultiCallPkBoardItemView multiCallPkBoardItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        multiCallPkBoardItemView.d = viewGroup.getChildAt(0);
        multiCallPkBoardItemView.e = viewGroup.getChildAt(1);
        multiCallPkBoardItemView.f = viewGroup.getChildAt(2);
        multiCallPkBoardItemView.g = viewGroup.getChildAt(3);
        multiCallPkBoardItemView.h = viewGroup.getChildAt(4);
        multiCallPkBoardItemView.i = (LinearLayout) viewGroup.getChildAt(5);
        multiCallPkBoardItemView.j = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        multiCallPkBoardItemView.k = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
        multiCallPkBoardItemView.l = viewGroup.getChildAt(6);
    }
}
