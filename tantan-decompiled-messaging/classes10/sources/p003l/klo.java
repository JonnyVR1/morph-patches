package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.settings.intlGender.IntlMoreGenderItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class klo {
    /* JADX INFO: renamed from: a */
    public static void m7609a(IntlMoreGenderItemView intlMoreGenderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMoreGenderItemView.a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMoreGenderItemView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
