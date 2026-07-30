package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.UserTagsView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cak0 {
    /* JADX INFO: renamed from: a */
    public static void m105929a(UserTagsView userTagsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userTagsView.f34247a = (ConstraintLayout) viewGroup.getChildAt(0);
        userTagsView.f34248b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userTagsView.f34249c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userTagsView.f34250d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        userTagsView.f34251e = (ConstraintLayout) viewGroup.getChildAt(1);
        userTagsView.f34252f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userTagsView.f34253g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userTagsView.f34254h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        userTagsView.f34255i = (VText) viewGroup.getChildAt(2);
        userTagsView.f34256j = (VImage) viewGroup.getChildAt(3);
    }
}
