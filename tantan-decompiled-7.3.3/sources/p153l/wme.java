package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.EditProfileGameImageView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class wme {
    /* JADX INFO: renamed from: a */
    public static void m207106a(EditProfileGameImageView editProfileGameImageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        editProfileGameImageView.f34946a = (VLinear) viewGroup.getChildAt(0);
        editProfileGameImageView.f34947b = (VFrame) viewGroup.getChildAt(1);
        editProfileGameImageView.f34948c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        editProfileGameImageView.f34949d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
