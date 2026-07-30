package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditUploadPhoto;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class gha0 {
    /* JADX INFO: renamed from: a */
    public static void m126162a(ProfileLoopEditUploadPhoto profileLoopEditUploadPhoto, View view) {
        profileLoopEditUploadPhoto.f34199c = (ProfileLoopEditUploadPhoto) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopEditUploadPhoto.f34200d = (VLinear) viewGroup.getChildAt(2);
        profileLoopEditUploadPhoto.f34201e = (VFrame) viewGroup.getChildAt(3);
        profileLoopEditUploadPhoto.f34202f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        profileLoopEditUploadPhoto.f34203g = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
