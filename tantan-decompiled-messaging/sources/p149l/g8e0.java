package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.result.SeeContent;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class g8e0 {
    /* JADX INFO: renamed from: a */
    public static void m124747a(SeeContent seeContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeContent.f35624a = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        seeContent.f35625b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        seeContent.f35626c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        seeContent.f35627d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        seeContent.f35628e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
