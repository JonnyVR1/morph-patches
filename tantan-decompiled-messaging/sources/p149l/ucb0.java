package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.purpose.PurposeItem;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class ucb0 {
    /* JADX INFO: renamed from: a */
    public static void m193008a(PurposeItem purposeItem, View view) {
        purposeItem.f35313a = (PurposeItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purposeItem.f35314b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purposeItem.f35315c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        purposeItem.f35316d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        purposeItem.f35317e = (VText_AutoFit) viewGroup.getChildAt(1);
    }
}
