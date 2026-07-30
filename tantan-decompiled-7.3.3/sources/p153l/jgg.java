package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import com.p051p1.mobile.putong.live.external.page.fansgroup.FansGroupNoticeView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class jgg {
    /* JADX INFO: renamed from: a */
    public static void m144772a(FansGroupNoticeView fansGroupNoticeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fansGroupNoticeView.f46774c = (VNavigationBar) viewGroup.getChildAt(0);
        fansGroupNoticeView.f46775d = (FansGroupNoticeListView) viewGroup.getChildAt(1);
    }
}
