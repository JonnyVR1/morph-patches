package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditUploadPhoto;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class kpa0 {
    /* JADX INFO: renamed from: a */
    public static void m150698a(ProfileLoopEditUploadPhoto profileLoopEditUploadPhoto, View view) {
        profileLoopEditUploadPhoto.f35047c = (ProfileLoopEditUploadPhoto) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopEditUploadPhoto.f35048d = (VLinear) viewGroup.getChildAt(2);
        profileLoopEditUploadPhoto.f35049e = (VFrame) viewGroup.getChildAt(3);
        profileLoopEditUploadPhoto.f35050f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        profileLoopEditUploadPhoto.f35051g = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
