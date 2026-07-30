package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.account.p055ui.moregender.IntlMoreGenderItemView;

/* JADX INFO: loaded from: classes9.dex */
public class jno {
    /* JADX INFO: renamed from: a */
    public static void m146282a(IntlMoreGenderItemView intlMoreGenderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMoreGenderItemView._title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMoreGenderItemView._desc = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
