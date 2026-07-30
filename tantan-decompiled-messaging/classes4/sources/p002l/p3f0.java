package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.SignInMainFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p3f0 {
    /* JADX INFO: renamed from: a */
    public static void m20019a(SignInMainFrame signInMainFrame, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        signInMainFrame.f5351a = viewGroup.getChildAt(0);
        signInMainFrame.f5352b = viewGroup.getChildAt(1);
        signInMainFrame.f5353c = (LinearLayout) viewGroup.getChildAt(2);
        signInMainFrame.f5354d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        signInMainFrame.f5355e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        signInMainFrame.f5356f = viewGroup.getChildAt(3);
        signInMainFrame.f5357g = viewGroup.getChildAt(4);
    }
}
