package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike.UnDoLikedUserItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class psj0 {
    /* JADX INFO: renamed from: a */
    public static void m173658a(UnDoLikedUserItemView unDoLikedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        unDoLikedUserItemView.f30867a = (VDraweeView) viewGroup.getChildAt(0);
        unDoLikedUserItemView.f30868b = (ConstraintLayout) viewGroup.getChildAt(1);
        unDoLikedUserItemView.f30869c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        unDoLikedUserItemView.f30870d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        unDoLikedUserItemView.f30871e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        unDoLikedUserItemView.f30872f = (VText) viewGroup.getChildAt(2);
        unDoLikedUserItemView.f30873g = viewGroup.getChildAt(3);
    }
}
