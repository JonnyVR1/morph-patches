package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class lzn {
    /* JADX INFO: renamed from: a */
    public static void m7933a(IntlLiveSmallWindow intlLiveSmallWindow, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSmallWindow.a = viewGroup.getChildAt(0);
        intlLiveSmallWindow.b = (ImageView) viewGroup.getChildAt(1);
    }
}
