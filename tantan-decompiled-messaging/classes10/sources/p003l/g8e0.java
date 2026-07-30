package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.result.SeeContent;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g8e0 {
    /* JADX INFO: renamed from: a */
    public static void m6615a(SeeContent seeContent, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeContent.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        seeContent.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        seeContent.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        seeContent.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        seeContent.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
