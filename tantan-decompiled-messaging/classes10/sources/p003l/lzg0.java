package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.supreme.SupremeCountDownView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lzg0 {
    /* JADX INFO: renamed from: a */
    public static void m7931a(SupremeCountDownView supremeCountDownView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        supremeCountDownView.a = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        supremeCountDownView.b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        supremeCountDownView.c = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        supremeCountDownView.d = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(2);
        supremeCountDownView.e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        supremeCountDownView.f = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
