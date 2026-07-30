package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterGenderItem;
import p147v.VImage;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class yq20 {
    /* JADX INFO: renamed from: a */
    public static void m215694a(NewFilterGenderItem newFilterGenderItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newFilterGenderItem.f36182a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newFilterGenderItem.f36183b = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        newFilterGenderItem.f36184c = (VImage) viewGroup.getChildAt(1);
    }
}
