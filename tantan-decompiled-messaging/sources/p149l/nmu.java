package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class nmu {
    /* JADX INFO: renamed from: a */
    public static void m160159a(mmu mmuVar, View view) {
        mmuVar.f134696a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mmuVar.f134697b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mmuVar.f134698c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mmuVar.f134699d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mmuVar.f134700e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        mmuVar.f134701f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        mmuVar.f134702g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }
}
