package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.newui.home.justreal.JustRealSuccessLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class zsq {
    /* JADX INFO: renamed from: a */
    public static void m220055a(JustRealSuccessLayout justRealSuccessLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        justRealSuccessLayout.f23213a = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        justRealSuccessLayout.f23214b = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        justRealSuccessLayout.f23215c = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        justRealSuccessLayout.f23216d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        justRealSuccessLayout.f23217e = (VText_Default_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
