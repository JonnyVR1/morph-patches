package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.account.p050ui.accountnew.ImageVerificationView;
import com.p046p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes9.dex */
public class wim {
    /* JADX INFO: renamed from: a */
    public static void m203341a(ImageVerificationView imageVerificationView, View view) {
        imageVerificationView.f16429a = (ImageVerificationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        imageVerificationView.f16430b = (FrameLayout) viewGroup.getChildAt(0);
        imageVerificationView.f16431c = (LinearLayout) viewGroup.getChildAt(1);
        imageVerificationView.f16432d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
