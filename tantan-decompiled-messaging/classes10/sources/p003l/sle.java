package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.views.EditProfileGameImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sle {
    /* JADX INFO: renamed from: a */
    public static void m9361a(EditProfileGameImageView editProfileGameImageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        editProfileGameImageView.a = viewGroup.getChildAt(0);
        editProfileGameImageView.b = viewGroup.getChildAt(1);
        editProfileGameImageView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        editProfileGameImageView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
