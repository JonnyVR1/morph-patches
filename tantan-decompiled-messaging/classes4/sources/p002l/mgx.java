package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel.MedalLabelPageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mgx {
    /* JADX INFO: renamed from: a */
    public static void m17946a(MedalLabelPageView medalLabelPageView, View view) {
        medalLabelPageView.d = (MedalLabelPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        medalLabelPageView.e = viewGroup.getChildAt(0);
        medalLabelPageView.f = viewGroup.getChildAt(1);
        medalLabelPageView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        medalLabelPageView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
