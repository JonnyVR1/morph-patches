package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.view.AdmissionMessageView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class v90 {
    /* JADX INFO: renamed from: a */
    public static void m197523a(AdmissionMessageView admissionMessageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        admissionMessageView.f51824a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        admissionMessageView.f51825b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        admissionMessageView.f51826c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        admissionMessageView.f51827d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        admissionMessageView.f51828e = (LiveGradientTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        admissionMessageView.f51829f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        admissionMessageView.f51830g = (VDraweeView) viewGroup.getChildAt(1);
    }
}
