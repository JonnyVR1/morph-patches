package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.IntlFakeLikersItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class jcn {
    /* JADX INFO: renamed from: a */
    public static void m140982a(IntlFakeLikersItem intlFakeLikersItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlFakeLikersItem.f35790h = (VDraweeView) viewGroup.getChildAt(0);
        intlFakeLikersItem.f35791i = (FrameLayout) viewGroup.getChildAt(2);
        intlFakeLikersItem.f35792j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        intlFakeLikersItem.f35793k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        intlFakeLikersItem.f35794l = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
