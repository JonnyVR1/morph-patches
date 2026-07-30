package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.breaking.ProfileLikeLifePhotoAct;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ft90 {
    /* JADX INFO: renamed from: a */
    public static void m6505a(ProfileLikeLifePhotoAct profileLikeLifePhotoAct, View view) {
        profileLikeLifePhotoAct.f1020d = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileLikeLifePhotoAct.f1021e = viewGroup.getChildAt(0);
        profileLikeLifePhotoAct.f1022f = viewGroup.getChildAt(1);
        profileLikeLifePhotoAct.f1023g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileLikeLifePhotoAct.f1024h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileLikeLifePhotoAct.f1025i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        profileLikeLifePhotoAct.f1026j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        profileLikeLifePhotoAct.f1027k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        profileLikeLifePhotoAct.f1028l = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        profileLikeLifePhotoAct.f1029m = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6506b(ProfileLikeLifePhotoAct profileLikeLifePhotoAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5860N4, viewGroup, false);
        m6505a(profileLikeLifePhotoAct, viewInflate);
        return viewInflate;
    }
}
