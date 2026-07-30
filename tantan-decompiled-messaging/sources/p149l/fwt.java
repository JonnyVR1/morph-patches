package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeListView;

/* JADX INFO: loaded from: classes4.dex */
public class fwt {
    /* JADX INFO: renamed from: a */
    public static void m123556a(LiveSignPrizeListView liveSignPrizeListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignPrizeListView.f49369a = (DialogTitleBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSignPrizeListView.f49370b = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSignPrizeListView.f49371c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
