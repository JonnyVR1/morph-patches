package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.view.LookUpView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i3w {
    /* JADX INFO: renamed from: a */
    public static void m7126a(LookUpView lookUpView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        lookUpView.f2522a = (TextView) viewGroup.getChildAt(0);
        lookUpView.f2523b = viewGroup.getChildAt(1);
        lookUpView.f2524c = (TextView) viewGroup.getChildAt(2);
    }
}
