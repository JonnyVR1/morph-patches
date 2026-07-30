package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class l1o {
    /* JADX INFO: renamed from: a */
    public static void m152508a(IntlLiveSmallWindow intlLiveSmallWindow, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSmallWindow._image = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveSmallWindow._close = (ImageView) viewGroup.getChildAt(1);
    }
}
