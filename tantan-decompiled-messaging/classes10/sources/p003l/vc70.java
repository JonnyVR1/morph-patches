package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.newpic.PicExchangeLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vc70 {
    /* JADX INFO: renamed from: a */
    public static void m10211a(PicExchangeLayout picExchangeLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picExchangeLayout.a = (ImageView) viewGroup.getChildAt(0);
        picExchangeLayout.b = (FrameLayout) viewGroup.getChildAt(1);
        picExchangeLayout.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        picExchangeLayout.d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        picExchangeLayout.e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        picExchangeLayout.f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        picExchangeLayout.g = (FrameLayout) viewGroup.getChildAt(2);
        picExchangeLayout.h = (FrameLayout) viewGroup.getChildAt(3);
        picExchangeLayout.i = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        picExchangeLayout.j = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        picExchangeLayout.k = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
