package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.result.OnlineMatchContent;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dj50 {
    /* JADX INFO: renamed from: a */
    public static void m112020a(OnlineMatchContent onlineMatchContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchContent.f35583a = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        onlineMatchContent.f35584b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        onlineMatchContent.f35585c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
