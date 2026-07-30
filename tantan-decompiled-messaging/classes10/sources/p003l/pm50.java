package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchNewUiCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pm50 {
    /* JADX INFO: renamed from: a */
    public static void m8760a(OnlineMatchNewUiCardView onlineMatchNewUiCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchNewUiCardView.a = viewGroup.getChildAt(1);
        onlineMatchNewUiCardView.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        onlineMatchNewUiCardView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        onlineMatchNewUiCardView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        onlineMatchNewUiCardView.e = viewGroup.getChildAt(2);
        onlineMatchNewUiCardView.f = viewGroup.getChildAt(3);
        onlineMatchNewUiCardView.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        onlineMatchNewUiCardView.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        onlineMatchNewUiCardView.i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(0);
        onlineMatchNewUiCardView.j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3)).getChildAt(1);
        onlineMatchNewUiCardView.k = (FrameLayout) viewGroup.getChildAt(4);
        onlineMatchNewUiCardView.l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
