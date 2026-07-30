package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.IntlFakeLikersItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class jen {
    /* JADX INFO: renamed from: a */
    public static void m144601a(IntlFakeLikersItem intlFakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlFakeLikersItem.f36638h = (VDraweeView) viewGroup.getChildAt(0);
        intlFakeLikersItem.f36639i = (FrameLayout) viewGroup.getChildAt(2);
        intlFakeLikersItem.f36640j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        intlFakeLikersItem.f36641k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        intlFakeLikersItem.f36642l = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
