package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.anchor.AnchorLikedUserItemView;
import com.p046p1.mobile.putong.core.p053ui.likedusers.anchor.LiveHaloAvatar;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class xm0 {
    /* JADX INFO: renamed from: a */
    public static void m210035a(AnchorLikedUserItemView anchorLikedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        anchorLikedUserItemView.f29989a = (RelativeLayout) viewGroup.getChildAt(0);
        anchorLikedUserItemView.f29990b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        anchorLikedUserItemView.f29991c = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        anchorLikedUserItemView.f29992d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        anchorLikedUserItemView.f29993e = (TextView) viewGroup.getChildAt(1);
    }
}
