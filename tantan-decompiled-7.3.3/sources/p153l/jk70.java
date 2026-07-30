package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.view.PicCertGuideView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jk70 {
    /* JADX INFO: renamed from: a */
    public static void m145156a(PicCertGuideView picCertGuideView, View view) {
        picCertGuideView.f27807d = (PicCertGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        picCertGuideView.f27808e = (VImage) viewGroup.getChildAt(0);
        picCertGuideView.f27809f = (VText) viewGroup.getChildAt(1);
        picCertGuideView.f27810g = (VText) viewGroup.getChildAt(2);
    }
}
