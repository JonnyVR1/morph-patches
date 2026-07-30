package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class f650 {
    /* JADX INFO: renamed from: a */
    public static void m119582a(OfficialShowPlayBillView officialShowPlayBillView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowPlayBillView.f51133a = (TextView) viewGroup.getChildAt(0);
        officialShowPlayBillView.f51134b = (ConstraintLayout) viewGroup.getChildAt(1);
        officialShowPlayBillView.f51135c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        officialShowPlayBillView.f51136d = (LiveMainlandTagView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        officialShowPlayBillView.f51137e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        officialShowPlayBillView.f51138f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        officialShowPlayBillView.f51139g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        officialShowPlayBillView.f51140h = (RecyclerView) viewGroup.getChildAt(2);
    }
}
