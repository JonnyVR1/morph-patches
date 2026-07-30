package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightNormalTypeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class r4d0 {
    /* JADX INFO: renamed from: a */
    public static void m177786a(RightNormalTypeView rightNormalTypeView, View view) {
        rightNormalTypeView.f46102d = (RightNormalTypeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightNormalTypeView.f46103e = (VText) viewGroup.getChildAt(0);
        rightNormalTypeView.f46104f = (VText) viewGroup.getChildAt(1);
        rightNormalTypeView.f46105g = (VImage) viewGroup.getChildAt(2);
    }
}
