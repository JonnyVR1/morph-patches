package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchCardView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cj50 {
    /* JADX INFO: renamed from: a */
    public static void m5953a(OnlineMatchCardView onlineMatchCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchCardView.a = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        onlineMatchCardView.b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        onlineMatchCardView.c = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        onlineMatchCardView.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        onlineMatchCardView.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        onlineMatchCardView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        onlineMatchCardView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        onlineMatchCardView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        onlineMatchCardView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        onlineMatchCardView.j = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        onlineMatchCardView.k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        onlineMatchCardView.l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        onlineMatchCardView.m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3);
        onlineMatchCardView.n = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3)).getChildAt(0);
        onlineMatchCardView.o = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(3)).getChildAt(1);
    }
}
