package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import com.p051p1.mobile.putong.live.external.page.fansgroup.FansGroupView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class sgg {
    /* JADX INFO: renamed from: a */
    public static void m185772a(FansGroupView fansGroupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansGroupView.f46776d = (VNavigationBar) viewGroup.getChildAt(0);
        fansGroupView.f46777e = (FansGroupListView) viewGroup.getChildAt(1);
        fansGroupView.f46778f = (VRelative) viewGroup.getChildAt(2);
        fansGroupView.f46779g = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
