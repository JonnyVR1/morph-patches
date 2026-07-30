package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.result.TanTanCoinItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lxh0 {
    /* JADX INFO: renamed from: a */
    public static void m7926a(TanTanCoinItem tanTanCoinItem, View view) {
        tanTanCoinItem.a = (TanTanCoinItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tanTanCoinItem.b = viewGroup.getChildAt(0);
        tanTanCoinItem.c = viewGroup.getChildAt(1);
        tanTanCoinItem.d = (ImageView) viewGroup.getChildAt(2);
    }
}
