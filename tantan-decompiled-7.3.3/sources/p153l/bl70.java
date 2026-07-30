package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.newpic.PicExchangeLayout;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class bl70 {
    /* JADX INFO: renamed from: a */
    public static void m104870a(PicExchangeLayout picExchangeLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        picExchangeLayout.f32991a = (ImageView) viewGroup.getChildAt(0);
        picExchangeLayout.f32992b = (FrameLayout) viewGroup.getChildAt(1);
        picExchangeLayout.f32993c = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        picExchangeLayout.f32994d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        picExchangeLayout.f32995e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        picExchangeLayout.f32996f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        picExchangeLayout.f32997g = (FrameLayout) viewGroup.getChildAt(2);
        picExchangeLayout.f32998h = (FrameLayout) viewGroup.getChildAt(3);
        picExchangeLayout.f32999i = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        picExchangeLayout.f33000j = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        picExchangeLayout.f33001k = (ImageView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
    }
}
