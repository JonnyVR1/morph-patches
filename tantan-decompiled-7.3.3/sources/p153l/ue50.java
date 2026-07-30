package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class ue50 {
    /* JADX INFO: renamed from: a */
    public static void m195656a(OfficialShowPlayBillView officialShowPlayBillView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowPlayBillView.f51981a = (TextView) viewGroup.getChildAt(0);
        officialShowPlayBillView.f51982b = (ConstraintLayout) viewGroup.getChildAt(1);
        officialShowPlayBillView.f51983c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        officialShowPlayBillView.f51984d = (LiveMainlandTagView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        officialShowPlayBillView.f51985e = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        officialShowPlayBillView.f51986f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        officialShowPlayBillView.f51987g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        officialShowPlayBillView.f51988h = (RecyclerView) viewGroup.getChildAt(2);
    }
}
