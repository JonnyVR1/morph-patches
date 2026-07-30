package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.likedusers.LikedUserHeaderView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cfr {
    /* JADX INFO: renamed from: a */
    public static void m5945a(LikedUserHeaderView likedUserHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserHeaderView.a = viewGroup.getChildAt(0);
        likedUserHeaderView.b = (LinearLayout) viewGroup.getChildAt(1);
        likedUserHeaderView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        likedUserHeaderView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
