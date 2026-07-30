package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.see.MomentSeeEntryItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class tq00 {
    /* JADX INFO: renamed from: a */
    public static void m192229a(MomentSeeEntryItemView momentSeeEntryItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentSeeEntryItemView.f43539a = (VLinear) viewGroup.getChildAt(0);
        momentSeeEntryItemView.f43540b = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentSeeEntryItemView.f43541c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentSeeEntryItemView.f43542d = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        momentSeeEntryItemView.f43543e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(3);
        momentSeeEntryItemView.f43544f = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        momentSeeEntryItemView.f43545g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
