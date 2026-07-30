package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ieg {
    /* JADX INFO: renamed from: a */
    public static void m135688a(FansGroupListView fansGroupListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansGroupListView.f44292a = (VRecyclerView) viewGroup.getChildAt(0);
        fansGroupListView.f44293b = (VRelative) viewGroup.getChildAt(1);
        fansGroupListView.f44294c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fansGroupListView.f44295d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        fansGroupListView.f44296e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        fansGroupListView.f44297f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        fansGroupListView.f44298g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
