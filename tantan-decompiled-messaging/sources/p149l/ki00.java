package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.see.MomentSeeEntryItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ki00 {
    /* JADX INFO: renamed from: a */
    public static void m146040a(MomentSeeEntryItemView momentSeeEntryItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentSeeEntryItemView.f42691a = (VLinear) viewGroup.getChildAt(0);
        momentSeeEntryItemView.f42692b = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentSeeEntryItemView.f42693c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentSeeEntryItemView.f42694d = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        momentSeeEntryItemView.f42695e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        momentSeeEntryItemView.f42696f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        momentSeeEntryItemView.f42697g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
