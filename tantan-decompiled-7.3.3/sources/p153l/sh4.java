package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class sh4 {
    /* JADX INFO: renamed from: a */
    public static void m185859a(CardBottomBaseInfoView cardBottomBaseInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cardBottomBaseInfoView.f24166c = (VText) viewGroup.getChildAt(0);
        cardBottomBaseInfoView.f24167d = (VDraweeView) viewGroup.getChildAt(1);
        cardBottomBaseInfoView.f24168e = (VText) viewGroup.getChildAt(2);
        cardBottomBaseInfoView.f24169f = (VFrame) viewGroup.getChildAt(3);
        cardBottomBaseInfoView.f24170g = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cardBottomBaseInfoView.f24171h = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        cardBottomBaseInfoView.f24172i = (LinearLayout) viewGroup.getChildAt(4);
        cardBottomBaseInfoView.f24173j = (VImage) viewGroup.getChildAt(5);
    }
}
