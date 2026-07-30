package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.likedusers.LikedUserItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ffr {
    /* JADX INFO: renamed from: a */
    public static void m121182a(LikedUserItemView likedUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likedUserItemView.f29973a = (VDraweeView) viewGroup.getChildAt(0);
        likedUserItemView.f29974b = (ConstraintLayout) viewGroup.getChildAt(1);
        likedUserItemView.f29975c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        likedUserItemView.f29976d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        likedUserItemView.f29977e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        likedUserItemView.f29978f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        likedUserItemView.f29979g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        likedUserItemView.f29980h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        likedUserItemView.f29981i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        likedUserItemView.f29982j = (VText) viewGroup.getChildAt(2);
        likedUserItemView.f29983k = (VText) viewGroup.getChildAt(3);
        likedUserItemView.f29984l = (VText) viewGroup.getChildAt(4);
        likedUserItemView.f29985m = (VText) viewGroup.getChildAt(5);
        likedUserItemView.f29986n = viewGroup.getChildAt(6);
    }
}
