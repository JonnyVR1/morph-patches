package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.messages.IntrRiskTipItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class twp {
    /* JADX INFO: renamed from: a */
    public static void m9627a(IntrRiskTipItem intrRiskTipItem, View view) {
        intrRiskTipItem.a = (IntrRiskTipItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intrRiskTipItem.b = viewGroup.getChildAt(0);
        intrRiskTipItem.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
