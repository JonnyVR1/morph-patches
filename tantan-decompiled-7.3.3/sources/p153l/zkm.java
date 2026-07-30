package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.account.p055ui.accountnew.ImageVerificationView;
import com.p051p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes9.dex */
public class zkm {
    /* JADX INFO: renamed from: a */
    public static void m220117a(ImageVerificationView imageVerificationView, View view) {
        imageVerificationView.f17148a = (ImageVerificationView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        imageVerificationView.f17149b = (FrameLayout) viewGroup.getChildAt(0);
        imageVerificationView.f17150c = (LinearLayout) viewGroup.getChildAt(1);
        imageVerificationView.f17151d = (WebViewX) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
