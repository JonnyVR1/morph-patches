package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.core.p053ui.dlg.views.OnlineMatchDlgItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ek50 {
    /* JADX INFO: renamed from: a */
    public static void m116923a(OnlineMatchDlgItemView onlineMatchDlgItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchDlgItemView.f29073c = (NewTalkProgressView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        onlineMatchDlgItemView.f29074d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        onlineMatchDlgItemView.f29075e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        onlineMatchDlgItemView.f29076f = (VText) viewGroup.getChildAt(1);
    }
}
