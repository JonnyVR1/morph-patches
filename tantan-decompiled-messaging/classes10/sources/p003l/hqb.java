package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.innerpush.CountdownConvPushLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hqb {
    /* JADX INFO: renamed from: a */
    public static void m7060a(CountdownConvPushLayout countdownConvPushLayout, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        countdownConvPushLayout.a = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        countdownConvPushLayout.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        countdownConvPushLayout.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }
}
