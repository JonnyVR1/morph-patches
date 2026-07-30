package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditProfileUploadImageView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class xef {
    /* JADX INFO: renamed from: a */
    public static void m210675a(ExpEditProfileUploadImageView expEditProfileUploadImageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        expEditProfileUploadImageView.f33990a = (VLinear) viewGroup.getChildAt(0);
        expEditProfileUploadImageView.f33991b = (VFrame) viewGroup.getChildAt(1);
        expEditProfileUploadImageView.f33992c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        expEditProfileUploadImageView.f33993d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
