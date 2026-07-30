package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel.MedalLabelPageView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kpx {
    /* JADX INFO: renamed from: a */
    public static void m150798a(MedalLabelPageView medalLabelPageView, View view) {
        medalLabelPageView._root = (MedalLabelPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        medalLabelPageView._recyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        medalLabelPageView._empty = (VLinear) viewGroup.getChildAt(1);
        medalLabelPageView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        medalLabelPageView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
