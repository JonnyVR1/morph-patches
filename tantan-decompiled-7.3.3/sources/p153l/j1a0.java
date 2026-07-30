package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.breaking.ProfileLikeLifePhotoAct;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j1a0 {
    /* JADX INFO: renamed from: a */
    public static void m143110a(ProfileLikeLifePhotoAct profileLikeLifePhotoAct, View view) {
        profileLikeLifePhotoAct.f29474d = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileLikeLifePhotoAct.f29475e = viewGroup.getChildAt(0);
        profileLikeLifePhotoAct.f29476f = (VLinear) viewGroup.getChildAt(1);
        profileLikeLifePhotoAct.f29477g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileLikeLifePhotoAct.f29478h = (SVGAnimationView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileLikeLifePhotoAct.f29479i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        profileLikeLifePhotoAct.f29480j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
        profileLikeLifePhotoAct.f29481k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(2);
        profileLikeLifePhotoAct.f29482l = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        profileLikeLifePhotoAct.f29483m = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m143111b(ProfileLikeLifePhotoAct profileLikeLifePhotoAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156907N4, viewGroup, false);
        m143110a(profileLikeLifePhotoAct, viewInflate);
        return viewInflate;
    }
}
