package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.result.OnlineMatchContent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dj50 {
    /* JADX INFO: renamed from: a */
    public static void m6164a(OnlineMatchContent onlineMatchContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        onlineMatchContent.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        onlineMatchContent.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        onlineMatchContent.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
