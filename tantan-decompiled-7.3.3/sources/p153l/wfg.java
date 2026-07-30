package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class wfg {
    /* JADX INFO: renamed from: a */
    public static void m206118a(FansGroupListView fansGroupListView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansGroupListView.f45140a = (VRecyclerView) viewGroup.getChildAt(0);
        fansGroupListView.f45141b = (VRelative) viewGroup.getChildAt(1);
        fansGroupListView.f45142c = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fansGroupListView.f45143d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        fansGroupListView.f45144e = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        fansGroupListView.f45145f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        fansGroupListView.f45146g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
