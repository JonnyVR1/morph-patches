package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightEquipAnchorItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class lad0 {
    /* JADX INFO: renamed from: a */
    public static void m153471a(RightEquipAnchorItemView rightEquipAnchorItemView, View view) {
        rightEquipAnchorItemView.f46902d = (RightEquipAnchorItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightEquipAnchorItemView.f46903e = (VDraweeView) viewGroup.getChildAt(0);
        rightEquipAnchorItemView.f46904f = (VText) viewGroup.getChildAt(1);
        rightEquipAnchorItemView.f46905g = (VImage) viewGroup.getChildAt(2);
    }
}
