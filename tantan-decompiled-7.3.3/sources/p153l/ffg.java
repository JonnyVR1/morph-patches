package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import com.p051p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ffg {
    /* JADX INFO: renamed from: a */
    public static void m125370a(efg efgVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        efgVar.f93772k = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        efgVar.f93773l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        efgVar.f93774m = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        efgVar.f93775n = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        efgVar.f93776o = (FansGroupListView) viewGroup.getChildAt(1);
        efgVar.f93777p = (FansGroupNoticeListView) viewGroup.getChildAt(2);
    }
}
