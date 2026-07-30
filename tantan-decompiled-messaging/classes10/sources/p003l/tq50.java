package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.operation.OperationBannerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tq50 {
    /* JADX INFO: renamed from: a */
    public static void m9616a(OperationBannerView operationBannerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        operationBannerView.a = viewGroup.getChildAt(0);
        operationBannerView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        operationBannerView.c = viewGroup.getChildAt(1);
    }
}
