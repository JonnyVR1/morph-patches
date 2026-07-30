package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import com.p046p1.mobile.putong.live.external.page.fansgroup.FansGroupView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class efg {
    /* JADX INFO: renamed from: a */
    public static void m116036a(FansGroupView fansGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansGroupView.f45928d = (VNavigationBar) viewGroup.getChildAt(0);
        fansGroupView.f45929e = (FansGroupListView) viewGroup.getChildAt(1);
        fansGroupView.f45930f = (VRelative) viewGroup.getChildAt(2);
        fansGroupView.f45931g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
