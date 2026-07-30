package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.OnlineMatchDlgItemView;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.OnlineMatchDlgView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jk50 {
    /* JADX INFO: renamed from: a */
    public static void m141827a(OnlineMatchDlgView onlineMatchDlgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchDlgView.f29077c = (VText) viewGroup.getChildAt(0);
        onlineMatchDlgView.f29078d = (VText) viewGroup.getChildAt(1);
        onlineMatchDlgView.f29079e = (VLinear) viewGroup.getChildAt(2);
        onlineMatchDlgView.f29080f = (OnlineMatchDlgItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        onlineMatchDlgView.f29081g = (OnlineMatchDlgItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        onlineMatchDlgView.f29082h = (OnlineMatchDlgItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
