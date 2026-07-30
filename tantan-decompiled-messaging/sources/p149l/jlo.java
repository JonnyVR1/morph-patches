package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.account.p050ui.moregender.IntlMoreGenderItemView;

/* JADX INFO: loaded from: classes9.dex */
public class jlo {
    /* JADX INFO: renamed from: a */
    public static void m142101a(IntlMoreGenderItemView intlMoreGenderItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMoreGenderItemView._title = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlMoreGenderItemView._desc = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
