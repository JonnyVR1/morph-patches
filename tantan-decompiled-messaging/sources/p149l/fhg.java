package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p046p1.mobile.putong.live.livingroom.common.fans.FansView;

/* JADX INFO: loaded from: classes4.dex */
public class fhg {
    /* JADX INFO: renamed from: a */
    public static void m121355a(FansView fansView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansView.f48982a = (LiveFadeRecyclerView) viewGroup.getChildAt(0);
        fansView.f48983b = (FrameLayout) viewGroup.getChildAt(1);
        fansView.f48984c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
