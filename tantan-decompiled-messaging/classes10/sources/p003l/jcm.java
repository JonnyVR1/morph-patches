package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jcm {
    /* JADX INFO: renamed from: a */
    public static void m7392a(IdentifyView identifyView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        identifyView.c = (RelativeLayout) viewGroup.getChildAt(0);
        identifyView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        identifyView.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        identifyView.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        identifyView.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        identifyView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        identifyView.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
