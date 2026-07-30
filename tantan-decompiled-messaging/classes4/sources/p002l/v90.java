package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.view.AdmissionMessageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v90 {
    /* JADX INFO: renamed from: a */
    public static void m23801a(AdmissionMessageView admissionMessageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        admissionMessageView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        admissionMessageView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        admissionMessageView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        admissionMessageView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        admissionMessageView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        admissionMessageView.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
        admissionMessageView.g = viewGroup.getChildAt(1);
    }
}
