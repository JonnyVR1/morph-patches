package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.IntlFakeTurboItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class len {
    /* JADX INFO: renamed from: a */
    public static void m153916a(IntlFakeTurboItem intlFakeTurboItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlFakeTurboItem._icon = (VDraweeView) viewGroup.getChildAt(0);
        intlFakeTurboItem._desc = (TextView) viewGroup.getChildAt(1);
    }
}
