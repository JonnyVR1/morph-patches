package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupListView;
import com.p046p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rdg {
    /* JADX INFO: renamed from: a */
    public static void m178962a(qdg qdgVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qdgVar.f153917k = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qdgVar.f153918l = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qdgVar.f153919m = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qdgVar.f153920n = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qdgVar.f153921o = (FansGroupListView) viewGroup.getChildAt(1);
        qdgVar.f153922p = (FansGroupNoticeListView) viewGroup.getChildAt(2);
    }
}
