package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.messages.ItemVisitorHideFootPrint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class shq {
    /* JADX INFO: renamed from: a */
    public static void m9352a(ItemVisitorHideFootPrint itemVisitorHideFootPrint, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itemVisitorHideFootPrint.a = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        itemVisitorHideFootPrint.b = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        itemVisitorHideFootPrint.c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        itemVisitorHideFootPrint.d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
    }
}
