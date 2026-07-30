package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.view.AdmissionMessageView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r90 {
    /* JADX INFO: renamed from: a */
    public static void m180289a(AdmissionMessageView admissionMessageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        admissionMessageView.f52672a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        admissionMessageView.f52673b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        admissionMessageView.f52674c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        admissionMessageView.f52675d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        admissionMessageView.f52676e = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        admissionMessageView.f52677f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        admissionMessageView.f52678g = (VDraweeView) viewGroup.getChildAt(1);
    }
}
