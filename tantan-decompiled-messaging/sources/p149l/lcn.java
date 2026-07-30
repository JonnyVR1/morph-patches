package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.IntlFakeTurboItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class lcn {
    /* JADX INFO: renamed from: a */
    public static void m149339a(IntlFakeTurboItem intlFakeTurboItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlFakeTurboItem._icon = (VDraweeView) viewGroup.getChildAt(0);
        intlFakeTurboItem._desc = (TextView) viewGroup.getChildAt(1);
    }
}
