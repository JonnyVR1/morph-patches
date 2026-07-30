package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.newpic.PicExchangeLayout;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class vc70 {
    /* JADX INFO: renamed from: a */
    public static void m197747a(PicExchangeLayout picExchangeLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picExchangeLayout.f32143a = (ImageView) viewGroup.getChildAt(0);
        picExchangeLayout.f32144b = (FrameLayout) viewGroup.getChildAt(1);
        picExchangeLayout.f32145c = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        picExchangeLayout.f32146d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        picExchangeLayout.f32147e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        picExchangeLayout.f32148f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        picExchangeLayout.f32149g = (FrameLayout) viewGroup.getChildAt(2);
        picExchangeLayout.f32150h = (FrameLayout) viewGroup.getChildAt(3);
        picExchangeLayout.f32151i = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        picExchangeLayout.f32152j = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        picExchangeLayout.f32153k = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
