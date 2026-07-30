package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.EditProfileGameImageView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class sle {
    /* JADX INFO: renamed from: a */
    public static void m184799a(EditProfileGameImageView editProfileGameImageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        editProfileGameImageView.f34098a = (VLinear) viewGroup.getChildAt(0);
        editProfileGameImageView.f34099b = (VFrame) viewGroup.getChildAt(1);
        editProfileGameImageView.f34100c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        editProfileGameImageView.f34101d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
