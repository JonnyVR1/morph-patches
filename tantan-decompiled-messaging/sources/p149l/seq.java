package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemTagGuide;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class seq {
    /* JADX INFO: renamed from: a */
    public static void m183676a(ItemTagGuide itemTagGuide, View view) {
        itemTagGuide.f31501a = (ItemTagGuide) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemTagGuide.f31502b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemTagGuide.f31503c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemTagGuide.f31504d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemTagGuide.f31505e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
