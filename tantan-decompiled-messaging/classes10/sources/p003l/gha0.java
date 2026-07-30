package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.views.ProfileLoopEditUploadPhoto;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gha0 {
    /* JADX INFO: renamed from: a */
    public static void m6638a(ProfileLoopEditUploadPhoto profileLoopEditUploadPhoto, View view) {
        profileLoopEditUploadPhoto.c = (ProfileLoopEditUploadPhoto) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopEditUploadPhoto.d = viewGroup.getChildAt(2);
        profileLoopEditUploadPhoto.e = viewGroup.getChildAt(3);
        profileLoopEditUploadPhoto.f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        profileLoopEditUploadPhoto.g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
