package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterGenderItem;
import p151v.VImage;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class iz20 {
    /* JADX INFO: renamed from: a */
    public static void m142755a(NewFilterGenderItem newFilterGenderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newFilterGenderItem.f37030a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newFilterGenderItem.f37031b = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newFilterGenderItem.f37032c = (VImage) viewGroup.getChildAt(1);
    }
}
