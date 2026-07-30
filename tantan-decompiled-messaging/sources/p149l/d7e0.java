package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.active.SeeActiveHeadItem;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class d7e0 {
    /* JADX INFO: renamed from: a */
    public static void m110225a(SeeActiveHeadItem seeActiveHeadItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        seeActiveHeadItem._vv_head = (VDraweeView) viewGroup.getChildAt(0);
        seeActiveHeadItem._iv_more = (VImage) viewGroup.getChildAt(1);
    }
}
