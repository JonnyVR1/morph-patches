package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserHeaderView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cfr {
    /* JADX INFO: renamed from: a */
    public static void m106597a(LikedUserHeaderView likedUserHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserHeaderView.f29969a = (VText) viewGroup.getChildAt(0);
        likedUserHeaderView.f29970b = (LinearLayout) viewGroup.getChildAt(1);
        likedUserHeaderView.f29971c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        likedUserHeaderView.f29972d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
