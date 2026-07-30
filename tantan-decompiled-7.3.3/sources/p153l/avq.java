package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.newui.home.justreal.JustRealSuccessLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import p151v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class avq {
    /* JADX INFO: renamed from: a */
    public static void m100507a(JustRealSuccessLayout justRealSuccessLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        justRealSuccessLayout.f23955a = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        justRealSuccessLayout.f23956b = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        justRealSuccessLayout.f23957c = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        justRealSuccessLayout.f23958d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        justRealSuccessLayout.f23959e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
