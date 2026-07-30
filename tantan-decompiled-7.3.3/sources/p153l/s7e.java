package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class s7e {
    /* JADX INFO: renamed from: a */
    public static void m185004a(r7e r7eVar, View view) {
        r7eVar.f161604k = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r7eVar.f161605l = (LinearLayout) viewGroup.getChildAt(0);
        r7eVar.f161606m = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        r7eVar.f161607n = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        r7eVar.f161608o = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
