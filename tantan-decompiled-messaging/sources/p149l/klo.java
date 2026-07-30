package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.settings.intlGender.IntlMoreGenderItemView;

/* JADX INFO: loaded from: classes10.dex */
public class klo {
    /* JADX INFO: renamed from: a */
    public static void m146421a(IntlMoreGenderItemView intlMoreGenderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMoreGenderItemView._title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMoreGenderItemView._desc = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
