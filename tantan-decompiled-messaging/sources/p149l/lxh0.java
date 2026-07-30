package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.result.TanTanCoinItem;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class lxh0 {
    /* JADX INFO: renamed from: a */
    public static void m152064a(TanTanCoinItem tanTanCoinItem, View view) {
        tanTanCoinItem.f35634a = (TanTanCoinItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tanTanCoinItem.f35635b = (VText) viewGroup.getChildAt(0);
        tanTanCoinItem.f35636c = (VText) viewGroup.getChildAt(1);
        tanTanCoinItem.f35637d = (ImageView) viewGroup.getChildAt(2);
    }
}
