package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.result.BoostContent;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class o63 {
    /* JADX INFO: renamed from: a */
    public static void m166201a(BoostContent boostContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostContent.f36421a = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostContent.f36422b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        boostContent.f36423c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
