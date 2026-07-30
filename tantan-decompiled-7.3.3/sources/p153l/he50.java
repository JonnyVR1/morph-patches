package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.view.LiveMainlandTagView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.showlist.OfficialShowPlayBillItemView;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class he50 {
    /* JADX INFO: renamed from: a */
    public static void m134621a(OfficialShowPlayBillItemView officialShowPlayBillItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowPlayBillItemView.f51974a = (VLinear) viewGroup.getChildAt(0);
        officialShowPlayBillItemView.f51975b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        officialShowPlayBillItemView.f51976c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        officialShowPlayBillItemView.f51977d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        officialShowPlayBillItemView.f51978e = (LiveMainlandTagView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        officialShowPlayBillItemView.f51979f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        officialShowPlayBillItemView.f51980g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
