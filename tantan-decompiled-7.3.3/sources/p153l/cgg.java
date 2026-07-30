package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class cgg {
    /* JADX INFO: renamed from: a */
    public static void m109688a(FansGroupNoticeListView fansGroupNoticeListView, View view) {
        fansGroupNoticeListView.f45153a = (SwipeRefreshLayout) ((ViewGroup) view).getChildAt(0);
        fansGroupNoticeListView.f45154b = (VRecyclerView) view.findViewById(jdc0.f120241y0);
        ViewGroup viewGroup = (ViewGroup) view;
        fansGroupNoticeListView.f45155c = (VLinear) viewGroup.getChildAt(1);
        fansGroupNoticeListView.f45156d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fansGroupNoticeListView.f45157e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
