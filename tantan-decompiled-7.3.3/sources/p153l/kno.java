package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.settings.intlGender.IntlMoreGenderItemView;

/* JADX INFO: loaded from: classes10.dex */
public class kno {
    /* JADX INFO: renamed from: a */
    public static void m150543a(IntlMoreGenderItemView intlMoreGenderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMoreGenderItemView._title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMoreGenderItemView._desc = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
