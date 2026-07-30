package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchNewUiCardViewReform;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class om50 {
    /* JADX INFO: renamed from: a */
    public static void m8505a(OnlineMatchNewUiCardViewReform onlineMatchNewUiCardViewReform, View view) {
        onlineMatchNewUiCardViewReform.a = (OnlineMatchNewUiCardViewReform) view;
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchNewUiCardViewReform.b = viewGroup.getChildAt(0);
        onlineMatchNewUiCardViewReform.c = (TextView) viewGroup.getChildAt(2);
        onlineMatchNewUiCardViewReform.d = (TextView) viewGroup.getChildAt(3);
        onlineMatchNewUiCardViewReform.e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        onlineMatchNewUiCardViewReform.f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(0);
        onlineMatchNewUiCardViewReform.g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0)).getChildAt(1);
        onlineMatchNewUiCardViewReform.h = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2);
        onlineMatchNewUiCardViewReform.i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        onlineMatchNewUiCardViewReform.j = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        onlineMatchNewUiCardViewReform.k = (RelativeLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        onlineMatchNewUiCardViewReform.l = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        onlineMatchNewUiCardViewReform.m = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2)).getChildAt(1)).getChildAt(3);
        onlineMatchNewUiCardViewReform.n = (TextView) viewGroup.getChildAt(5);
    }
}
