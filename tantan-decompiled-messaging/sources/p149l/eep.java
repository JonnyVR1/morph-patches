package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.intlmeet.tribe.IntlTribeItemView;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class eep {
    /* JADX INFO: renamed from: a */
    public static void m115986a(IntlTribeItemView intlTribeItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlTribeItemView.f24286c = (VText_NoTopPadding) viewGroup.getChildAt(0);
        intlTribeItemView.f24287d = (VText_NoTopPadding) viewGroup.getChildAt(1);
        intlTribeItemView.f24288e = (VRecyclerView) viewGroup.getChildAt(2);
    }
}
