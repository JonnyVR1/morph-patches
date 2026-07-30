package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.wallet.TanTanCoinItem2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kxh0 {
    /* JADX INFO: renamed from: a */
    public static void m7645a(TanTanCoinItem2 tanTanCoinItem2, View view) {
        tanTanCoinItem2.d = (TanTanCoinItem2) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tanTanCoinItem2.e = viewGroup.getChildAt(0);
        tanTanCoinItem2.f = (ImageView) viewGroup.getChildAt(1);
        tanTanCoinItem2.g = viewGroup.getChildAt(3);
        tanTanCoinItem2.h = viewGroup.getChildAt(4);
    }
}
