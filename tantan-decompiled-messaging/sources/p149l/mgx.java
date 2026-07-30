package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.medallabel.MedalLabelPageView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mgx {
    /* JADX INFO: renamed from: a */
    public static void m154584a(MedalLabelPageView medalLabelPageView, View view) {
        medalLabelPageView._root = (MedalLabelPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        medalLabelPageView._recyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        medalLabelPageView._empty = (VLinear) viewGroup.getChildAt(1);
        medalLabelPageView._empty_icon = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        medalLabelPageView._empty_text = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
