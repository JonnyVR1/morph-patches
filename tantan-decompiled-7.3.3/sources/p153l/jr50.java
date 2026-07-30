package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.result.OnlineMatchContent;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jr50 {
    /* JADX INFO: renamed from: a */
    public static void m146708a(OnlineMatchContent onlineMatchContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchContent.f36431a = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        onlineMatchContent.f36432b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        onlineMatchContent.f36433c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
