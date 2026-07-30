package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillItemView;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class s550 {
    /* JADX INFO: renamed from: a */
    public static void m182318a(OfficialShowPlayBillItemView officialShowPlayBillItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowPlayBillItemView.f51126a = (VLinear) viewGroup.getChildAt(0);
        officialShowPlayBillItemView.f51127b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        officialShowPlayBillItemView.f51128c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        officialShowPlayBillItemView.f51129d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        officialShowPlayBillItemView.f51130e = (LiveMainlandTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        officialShowPlayBillItemView.f51131f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        officialShowPlayBillItemView.f51132g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
