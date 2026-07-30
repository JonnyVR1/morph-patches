package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.OnlineMatchDlgItemView;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.OnlineMatchDlgView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ps50 {
    /* JADX INFO: renamed from: a */
    public static void m173589a(OnlineMatchDlgView onlineMatchDlgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchDlgView.f29925c = (VText) viewGroup.getChildAt(0);
        onlineMatchDlgView.f29926d = (VText) viewGroup.getChildAt(1);
        onlineMatchDlgView.f29927e = (VLinear) viewGroup.getChildAt(2);
        onlineMatchDlgView.f29928f = (OnlineMatchDlgItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        onlineMatchDlgView.f29929g = (OnlineMatchDlgItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        onlineMatchDlgView.f29930h = (OnlineMatchDlgItemView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
