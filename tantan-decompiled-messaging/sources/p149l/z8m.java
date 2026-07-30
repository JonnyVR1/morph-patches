package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.newui.icebreak.DialogC8068a;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z8m {
    /* JADX INFO: renamed from: a */
    public static void m217617a(DialogC8068a dialogC8068a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dialogC8068a.f24102f = viewGroup.getChildAt(0);
        dialogC8068a.f24103g = (LinearLayout) viewGroup.getChildAt(1);
        dialogC8068a.f24104h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dialogC8068a.f24105i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dialogC8068a.f24106j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        dialogC8068a.f24107k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        dialogC8068a.f24108l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        dialogC8068a.f24109m = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        dialogC8068a.f24110n = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        dialogC8068a.f24111o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        dialogC8068a.f24112p = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        dialogC8068a.f24113q = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        dialogC8068a.f24114r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0);
        dialogC8068a.f24115s = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        dialogC8068a.f24116t = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m217618b(DialogC8068a dialogC8068a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95823i4, viewGroup, false);
        m217617a(dialogC8068a, viewInflate);
        return viewInflate;
    }
}
