package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.icebreak.DialogC8219a;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pbm {
    /* JADX INFO: renamed from: a */
    public static void m171525a(DialogC8219a dialogC8219a, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dialogC8219a.f24844f = viewGroup.getChildAt(0);
        dialogC8219a.f24845g = (LinearLayout) viewGroup.getChildAt(1);
        dialogC8219a.f24846h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        dialogC8219a.f24847i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        dialogC8219a.f24848j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        dialogC8219a.f24849k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        dialogC8219a.f24850l = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        dialogC8219a.f24851m = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        dialogC8219a.f24852n = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        dialogC8219a.f24853o = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(0);
        dialogC8219a.f24854p = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1)).getChildAt(1);
        dialogC8219a.f24855q = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2);
        dialogC8219a.f24856r = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(0);
        dialogC8219a.f24857s = (VCheckBox) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(2)).getChildAt(1);
        dialogC8219a.f24858t = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m171526b(DialogC8219a dialogC8219a, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125877i4, viewGroup, false);
        m171525a(dialogC8219a, viewInflate);
        return viewInflate;
    }
}
