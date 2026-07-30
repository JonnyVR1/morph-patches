package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import com.p051p1.mobile.putong.live.livingroom.common.fans.FansView;

/* JADX INFO: loaded from: classes4.dex */
public class tig {
    /* JADX INFO: renamed from: a */
    public static void m191330a(FansView fansView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansView.f49830a = (LiveFadeRecyclerView) viewGroup.getChildAt(0);
        fansView.f49831b = (FrameLayout) viewGroup.getChildAt(1);
        fansView.f49832c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
