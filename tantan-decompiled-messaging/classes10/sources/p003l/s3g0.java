package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.settings.SubsItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s3g0 {
    /* JADX INFO: renamed from: a */
    public static void m9214a(SubsItemView subsItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        subsItemView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        subsItemView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        subsItemView.c = viewGroup.getChildAt(1);
    }
}
