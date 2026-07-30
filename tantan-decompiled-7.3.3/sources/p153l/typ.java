package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.IntrRiskTipItem;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class typ {
    /* JADX INFO: renamed from: a */
    public static void m193598a(IntrRiskTipItem intrRiskTipItem, View view) {
        intrRiskTipItem.f31564a = (IntrRiskTipItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intrRiskTipItem.f31565b = (VLinear) viewGroup.getChildAt(0);
        intrRiskTipItem.f31566c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
    }
}
