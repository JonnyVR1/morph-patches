package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditProfileUploadImageView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class rdf {
    /* JADX INFO: renamed from: a */
    public static void m178961a(ExpEditProfileUploadImageView expEditProfileUploadImageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        expEditProfileUploadImageView.f33142a = (VLinear) viewGroup.getChildAt(0);
        expEditProfileUploadImageView.f33143b = (VFrame) viewGroup.getChildAt(1);
        expEditProfileUploadImageView.f33144c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        expEditProfileUploadImageView.f33145d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
