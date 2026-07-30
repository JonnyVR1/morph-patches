package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import com.p046p1.mobile.putong.live.external.page.fansgroup.FansGroupNoticeView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class veg {
    /* JADX INFO: renamed from: a */
    public static void m198180a(FansGroupNoticeView fansGroupNoticeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansGroupNoticeView.f45926c = (VNavigationBar) viewGroup.getChildAt(0);
        fansGroupNoticeView.f45927d = (FansGroupNoticeListView) viewGroup.getChildAt(1);
    }
}
