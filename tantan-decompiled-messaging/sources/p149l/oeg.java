package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class oeg {
    /* JADX INFO: renamed from: a */
    public static void m163953a(FansGroupNoticeListView fansGroupNoticeListView, View view) {
        fansGroupNoticeListView.f44305a = (SwipeRefreshLayout) ((ViewGroup) view).getChildAt(0);
        fansGroupNoticeListView.f44306b = (VRecyclerView) view.findViewById(d5c0.f84523y0);
        ViewGroup viewGroup = (ViewGroup) view;
        fansGroupNoticeListView.f44307c = (VLinear) viewGroup.getChildAt(1);
        fansGroupNoticeListView.f44308d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fansGroupNoticeListView.f44309e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
