package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.result.SeeContent;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lge0 {
    /* JADX INFO: renamed from: a */
    public static void m154066a(SeeContent seeContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeContent.f36472a = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        seeContent.f36473b = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        seeContent.f36474c = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        seeContent.f36475d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        seeContent.f36476e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
