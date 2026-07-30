package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tg4 {
    /* JADX INFO: renamed from: a */
    public static void m188803a(CardBottomBaseInfoView cardBottomBaseInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomBaseInfoView.f23424c = (VText) viewGroup.getChildAt(0);
        cardBottomBaseInfoView.f23425d = (VDraweeView) viewGroup.getChildAt(1);
        cardBottomBaseInfoView.f23426e = (VText) viewGroup.getChildAt(2);
        cardBottomBaseInfoView.f23427f = (VFrame) viewGroup.getChildAt(3);
        cardBottomBaseInfoView.f23428g = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cardBottomBaseInfoView.f23429h = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        cardBottomBaseInfoView.f23430i = (LinearLayout) viewGroup.getChildAt(4);
        cardBottomBaseInfoView.f23431j = (VImage) viewGroup.getChildAt(5);
    }
}
