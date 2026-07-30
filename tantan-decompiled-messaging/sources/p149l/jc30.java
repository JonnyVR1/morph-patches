package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;
import com.p046p1.mobile.putong.core.newui.view.ShimmerOptLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class jc30 {
    /* JADX INFO: renamed from: a */
    public static void m140867a(NewMatchItemLayout newMatchItemLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newMatchItemLayout.f25929a = (VDraweeView) viewGroup.getChildAt(0);
        newMatchItemLayout.f25930b = (VDraweeView) viewGroup.getChildAt(1);
        newMatchItemLayout.f25931c = (VFrame) viewGroup.getChildAt(2);
        newMatchItemLayout.f25932d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        newMatchItemLayout.f25933e = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        newMatchItemLayout.f25934f = (ShimmerOptLayout) viewGroup.getChildAt(3);
        newMatchItemLayout.f25935g = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
    }
}
