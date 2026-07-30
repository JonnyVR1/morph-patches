package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.dlg.views.OnlineMatchDlgItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ks50 {
    /* JADX INFO: renamed from: a */
    public static void m151147a(OnlineMatchDlgItemView onlineMatchDlgItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchDlgItemView.f29921c = (NewTalkProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        onlineMatchDlgItemView.f29922d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        onlineMatchDlgItemView.f29923e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        onlineMatchDlgItemView.f29924f = (VText) viewGroup.getChildAt(1);
    }
}
