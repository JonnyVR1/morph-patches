package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightEquipAnchorItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class i2d0 {
    /* JADX INFO: renamed from: a */
    public static void m134050a(RightEquipAnchorItemView rightEquipAnchorItemView, View view) {
        rightEquipAnchorItemView.f46054d = (RightEquipAnchorItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rightEquipAnchorItemView.f46055e = (VDraweeView) viewGroup.getChildAt(0);
        rightEquipAnchorItemView.f46056f = (VText) viewGroup.getChildAt(1);
        rightEquipAnchorItemView.f46057g = (VImage) viewGroup.getChildAt(2);
    }
}
