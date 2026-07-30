package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.popup.NameFakeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class h320 {
    /* JADX INFO: renamed from: a */
    public static void m6907a(NameFakeView nameFakeView, View view) {
        nameFakeView.a = (NameFakeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nameFakeView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nameFakeView.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nameFakeView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        nameFakeView.e = viewGroup.getChildAt(1);
    }
}
