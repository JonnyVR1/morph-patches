package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeItemView;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class egp {
    /* JADX INFO: renamed from: a */
    public static void m120794a(IntlTribeItemView intlTribeItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeItemView.f25028c = (VText_NoTopPadding) viewGroup.getChildAt(0);
        intlTribeItemView.f25029d = (VText_NoTopPadding) viewGroup.getChildAt(1);
        intlTribeItemView.f25030e = (VRecyclerView) viewGroup.getChildAt(2);
    }
}
