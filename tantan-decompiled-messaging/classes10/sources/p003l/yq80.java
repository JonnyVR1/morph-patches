package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.customized.result.PrivateCustomResultCountDownView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yq80 {
    /* JADX INFO: renamed from: a */
    public static void m11274a(PrivateCustomResultCountDownView privateCustomResultCountDownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privateCustomResultCountDownView.a = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privateCustomResultCountDownView.b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        privateCustomResultCountDownView.c = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        privateCustomResultCountDownView.d = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        privateCustomResultCountDownView.e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        privateCustomResultCountDownView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
