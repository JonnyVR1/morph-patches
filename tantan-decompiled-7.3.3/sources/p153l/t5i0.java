package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.result.TanTanCoinItem;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t5i0 {
    /* JADX INFO: renamed from: a */
    public static void m189402a(TanTanCoinItem tanTanCoinItem, View view) {
        tanTanCoinItem.f36482a = (TanTanCoinItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tanTanCoinItem.f36483b = (VText) viewGroup.getChildAt(0);
        tanTanCoinItem.f36484c = (VText) viewGroup.getChildAt(1);
        tanTanCoinItem.f36485d = (ImageView) viewGroup.getChildAt(2);
    }
}
