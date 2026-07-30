package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserHeaderView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dhr {
    /* JADX INFO: renamed from: a */
    public static void m115810a(LikedUserHeaderView likedUserHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserHeaderView.f30817a = (VText) viewGroup.getChildAt(0);
        likedUserHeaderView.f30818b = (LinearLayout) viewGroup.getChildAt(1);
        likedUserHeaderView.f30819c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        likedUserHeaderView.f30820d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
