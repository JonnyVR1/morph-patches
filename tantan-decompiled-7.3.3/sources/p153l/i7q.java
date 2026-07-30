package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemLimitTimePic;
import p151v.VDraweeView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class i7q {
    /* JADX INFO: renamed from: a */
    public static void m138981a(ItemLimitTimePic itemLimitTimePic, View view) {
        itemLimitTimePic.f31907a = (ItemLimitTimePic) view;
        ViewGroup viewGroup = (ViewGroup) view;
        itemLimitTimePic.f31908b = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itemLimitTimePic.f31909c = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itemLimitTimePic.f31910d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        itemLimitTimePic.f31911e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemLimitTimePic.f31912f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        itemLimitTimePic.f31913g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        itemLimitTimePic.f31914h = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        itemLimitTimePic.f31915i = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        itemLimitTimePic.f31916j = (TextView) viewGroup.getChildAt(1);
    }
}
