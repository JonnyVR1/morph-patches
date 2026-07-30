package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightDetailDialogContentView;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class y9d0 {
    /* JADX INFO: renamed from: a */
    public static void m214818a(RightDetailDialogContentView rightDetailDialogContentView, View view) {
        rightDetailDialogContentView.f46884a = (RightDetailDialogContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightDetailDialogContentView.f46885b = viewGroup.getChildAt(0);
        rightDetailDialogContentView.f46886c = (CardView) viewGroup.getChildAt(1);
        rightDetailDialogContentView.f46887d = (LiveMkWebView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rightDetailDialogContentView.f46888e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
