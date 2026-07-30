package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ghr {
    /* JADX INFO: renamed from: a */
    public static void m130260a(LikedUserItemView likedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserItemView.f30821a = (VDraweeView) viewGroup.getChildAt(0);
        likedUserItemView.f30822b = (ConstraintLayout) viewGroup.getChildAt(1);
        likedUserItemView.f30823c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        likedUserItemView.f30824d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        likedUserItemView.f30825e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        likedUserItemView.f30826f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        likedUserItemView.f30827g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        likedUserItemView.f30828h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        likedUserItemView.f30829i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        likedUserItemView.f30830j = (VText) viewGroup.getChildAt(2);
        likedUserItemView.f30831k = (VText) viewGroup.getChildAt(3);
        likedUserItemView.f30832l = (VText) viewGroup.getChildAt(4);
        likedUserItemView.f30833m = (VText) viewGroup.getChildAt(5);
        likedUserItemView.f30834n = viewGroup.getChildAt(6);
    }
}
