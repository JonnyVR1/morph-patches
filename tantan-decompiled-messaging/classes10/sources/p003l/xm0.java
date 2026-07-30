package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.likedusers.anchor.AnchorLikedUserItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xm0 {
    /* JADX INFO: renamed from: a */
    public static void m10935a(AnchorLikedUserItemView anchorLikedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        anchorLikedUserItemView.a = (RelativeLayout) viewGroup.getChildAt(0);
        anchorLikedUserItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        anchorLikedUserItemView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        anchorLikedUserItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        anchorLikedUserItemView.e = (TextView) viewGroup.getChildAt(1);
    }
}
