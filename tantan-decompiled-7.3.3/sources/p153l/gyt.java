package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignPrizeListView;

/* JADX INFO: loaded from: classes4.dex */
public class gyt {
    /* JADX INFO: renamed from: a */
    public static void m133010a(LiveSignPrizeListView liveSignPrizeListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignPrizeListView.f50217a = (DialogTitleBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveSignPrizeListView.f50218b = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveSignPrizeListView.f50219c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
