package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.discovery.SuggestUserItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xtg0 {
    /* JADX INFO: renamed from: a */
    public static void m210971a(SuggestUserItem suggestUserItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        suggestUserItem.f21367a = (VDraweeView) viewGroup.getChildAt(0);
        suggestUserItem.f21368b = (VText) viewGroup.getChildAt(1);
        suggestUserItem.f21369c = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        suggestUserItem.f21370d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        suggestUserItem.f21371e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
