package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike.UnDoLikedUserItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mjj0 {
    /* JADX INFO: renamed from: a */
    public static void m154845a(UnDoLikedUserItemView unDoLikedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        unDoLikedUserItemView.f30019a = (VDraweeView) viewGroup.getChildAt(0);
        unDoLikedUserItemView.f30020b = (ConstraintLayout) viewGroup.getChildAt(1);
        unDoLikedUserItemView.f30021c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        unDoLikedUserItemView.f30022d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        unDoLikedUserItemView.f30023e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        unDoLikedUserItemView.f30024f = (VText) viewGroup.getChildAt(2);
        unDoLikedUserItemView.f30025g = viewGroup.getChildAt(3);
    }
}
