package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.anchor.AnchorLikedUserItemView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.anchor.LiveHaloAvatar;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class tm0 {
    /* JADX INFO: renamed from: a */
    public static void m191702a(AnchorLikedUserItemView anchorLikedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        anchorLikedUserItemView.f30837a = (RelativeLayout) viewGroup.getChildAt(0);
        anchorLikedUserItemView.f30838b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        anchorLikedUserItemView.f30839c = (LiveHaloAvatar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        anchorLikedUserItemView.f30840d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        anchorLikedUserItemView.f30841e = (TextView) viewGroup.getChildAt(1);
    }
}
