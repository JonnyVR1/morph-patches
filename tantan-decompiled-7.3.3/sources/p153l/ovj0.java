package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ovj0 {
    /* JADX INFO: renamed from: a */
    public static void m169453a(nvj0 nvj0Var, View view) {
        nvj0Var.f143805d = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nvj0Var.f143806e = (VLinear) viewGroup.getChildAt(0);
        nvj0Var.f143807f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nvj0Var.f143808g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nvj0Var.f143809h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        nvj0Var.f143810i = (VLinear) viewGroup.getChildAt(1);
    }
}
