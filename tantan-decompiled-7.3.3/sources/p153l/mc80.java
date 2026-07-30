package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkAnchorWinTimesView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkOtherWinTimesView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.wintimes.PkWinTimesContainerView;

/* JADX INFO: loaded from: classes4.dex */
public class mc80 {
    /* JADX INFO: renamed from: a */
    public static void m157918a(PkWinTimesContainerView pkWinTimesContainerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkWinTimesContainerView.f52639a = (PkAnchorWinTimesView) viewGroup.getChildAt(0);
        pkWinTimesContainerView.f52640b = (PkOtherWinTimesView) viewGroup.getChildAt(1);
    }
}
