package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareMenuItemView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class u4o {
    /* JADX INFO: renamed from: a */
    public static void m191759a(IntlLiveSquareMenuItemView intlLiveSquareMenuItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareMenuItemView.f45826a = (VImage) viewGroup.getChildAt(0);
        intlLiveSquareMenuItemView.f45827b = (VDraweeView) viewGroup.getChildAt(1);
        intlLiveSquareMenuItemView.f45828c = (VText) viewGroup.getChildAt(2);
    }
}
