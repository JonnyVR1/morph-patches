package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.IntrRiskTipItem;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class twp {
    /* JADX INFO: renamed from: a */
    public static void m190868a(IntrRiskTipItem intrRiskTipItem, View view) {
        intrRiskTipItem.f30716a = (IntrRiskTipItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intrRiskTipItem.f30717b = (VLinear) viewGroup.getChildAt(0);
        intrRiskTipItem.f30718c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
