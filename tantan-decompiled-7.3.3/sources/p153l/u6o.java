package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareMenuItemView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class u6o {
    /* JADX INFO: renamed from: a */
    public static void m194720a(IntlLiveSquareMenuItemView intlLiveSquareMenuItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareMenuItemView.f46674a = (VImage) viewGroup.getChildAt(0);
        intlLiveSquareMenuItemView.f46675b = (VDraweeView) viewGroup.getChildAt(1);
        intlLiveSquareMenuItemView.f46676c = (VText) viewGroup.getChildAt(2);
    }
}
