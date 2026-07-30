package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.settings.filter.newui.NewFilterZodiacsItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cr20 {
    /* JADX INFO: renamed from: a */
    public static void m5992a(NewFilterZodiacsItem newFilterZodiacsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newFilterZodiacsItem.a = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newFilterZodiacsItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
