package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.purpose.PurposeItem;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class ykb0 {
    /* JADX INFO: renamed from: a */
    public static void m216466a(PurposeItem purposeItem, View view) {
        purposeItem.f36161a = (PurposeItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        purposeItem.f36162b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        purposeItem.f36163c = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        purposeItem.f36164d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        purposeItem.f36165e = (VText_AutoFit) viewGroup.getChildAt(1);
    }
}
