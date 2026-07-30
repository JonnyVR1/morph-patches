package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.settings.filter.NewTagZodiacsItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ga40 {
    /* JADX INFO: renamed from: a */
    public static void m6620a(NewTagZodiacsItem newTagZodiacsItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        newTagZodiacsItem.a = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        newTagZodiacsItem.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
