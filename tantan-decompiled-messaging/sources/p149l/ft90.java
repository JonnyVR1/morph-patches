package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.breaking.ProfileLikeLifePhotoAct;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ft90 {
    /* JADX INFO: renamed from: a */
    public static void m123029a(ProfileLikeLifePhotoAct profileLikeLifePhotoAct, View view) {
        profileLikeLifePhotoAct.f28626d = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileLikeLifePhotoAct.f28627e = viewGroup.getChildAt(0);
        profileLikeLifePhotoAct.f28628f = (VLinear) viewGroup.getChildAt(1);
        profileLikeLifePhotoAct.f28629g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileLikeLifePhotoAct.f28630h = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileLikeLifePhotoAct.f28631i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        profileLikeLifePhotoAct.f28632j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        profileLikeLifePhotoAct.f28633k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        profileLikeLifePhotoAct.f28634l = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        profileLikeLifePhotoAct.f28635m = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123030b(ProfileLikeLifePhotoAct profileLikeLifePhotoAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126351N4, viewGroup, false);
        m123029a(profileLikeLifePhotoAct, viewInflate);
        return viewInflate;
    }
}
