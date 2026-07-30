package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.result.BoostContent;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z53 {
    /* JADX INFO: renamed from: a */
    public static void m217274a(BoostContent boostContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        boostContent.f35573a = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        boostContent.f35574b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        boostContent.f35575c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
