package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightDetailDialogContentView;
import p147v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class v1d0 {
    /* JADX INFO: renamed from: a */
    public static void m196547a(RightDetailDialogContentView rightDetailDialogContentView, View view) {
        rightDetailDialogContentView.f46036a = (RightDetailDialogContentView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightDetailDialogContentView.f46037b = viewGroup.getChildAt(0);
        rightDetailDialogContentView.f46038c = (CardView) viewGroup.getChildAt(1);
        rightDetailDialogContentView.f46039d = (LiveMkWebView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        rightDetailDialogContentView.f46040e = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
