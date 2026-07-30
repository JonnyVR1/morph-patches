package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemLimitTimePic;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i5q {
    /* JADX INFO: renamed from: a */
    public static void m7130a(ItemLimitTimePic itemLimitTimePic, View view) {
        itemLimitTimePic.a = (ItemLimitTimePic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLimitTimePic.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLimitTimePic.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLimitTimePic.d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemLimitTimePic.e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemLimitTimePic.f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        itemLimitTimePic.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemLimitTimePic.h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemLimitTimePic.i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemLimitTimePic.j = (TextView) viewGroup.getChildAt(1);
    }
}
