package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.UserTagsView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ijk0 {
    /* JADX INFO: renamed from: a */
    public static void m140210a(UserTagsView userTagsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        userTagsView.f35095a = (ConstraintLayout) viewGroup.getChildAt(0);
        userTagsView.f35096b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        userTagsView.f35097c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        userTagsView.f35098d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        userTagsView.f35099e = (ConstraintLayout) viewGroup.getChildAt(1);
        userTagsView.f35100f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        userTagsView.f35101g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        userTagsView.f35102h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        userTagsView.f35103i = (VText) viewGroup.getChildAt(2);
        userTagsView.f35104j = (VImage) viewGroup.getChildAt(3);
    }
}
