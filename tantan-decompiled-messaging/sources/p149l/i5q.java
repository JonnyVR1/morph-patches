package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemLimitTimePic;
import p147v.VDraweeView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class i5q {
    /* JADX INFO: renamed from: a */
    public static void m134527a(ItemLimitTimePic itemLimitTimePic, View view) {
        itemLimitTimePic.f31059a = (ItemLimitTimePic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLimitTimePic.f31060b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLimitTimePic.f31061c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLimitTimePic.f31062d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemLimitTimePic.f31063e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemLimitTimePic.f31064f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        itemLimitTimePic.f31065g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemLimitTimePic.f31066h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemLimitTimePic.f31067i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemLimitTimePic.f31068j = (TextView) viewGroup.getChildAt(1);
    }
}
