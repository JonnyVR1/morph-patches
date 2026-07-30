package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.account.p002ui.accountnew.ImageVerificationView;
import com.p000p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wim {
    /* JADX INFO: renamed from: a */
    public static void m26413a(ImageVerificationView imageVerificationView, View view) {
        imageVerificationView.f418a = (ImageVerificationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        imageVerificationView.f419b = (FrameLayout) viewGroup.getChildAt(0);
        imageVerificationView.f420c = (LinearLayout) viewGroup.getChildAt(1);
        imageVerificationView.f421d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
