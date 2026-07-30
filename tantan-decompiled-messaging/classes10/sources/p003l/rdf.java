package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.exp.ExpEditProfileUploadImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class rdf {
    /* JADX INFO: renamed from: a */
    public static void m9130a(ExpEditProfileUploadImageView expEditProfileUploadImageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        expEditProfileUploadImageView.a = viewGroup.getChildAt(0);
        expEditProfileUploadImageView.b = viewGroup.getChildAt(1);
        expEditProfileUploadImageView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        expEditProfileUploadImageView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
