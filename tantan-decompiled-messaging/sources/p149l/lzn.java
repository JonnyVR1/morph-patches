package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class lzn {
    /* JADX INFO: renamed from: a */
    public static void m152351a(IntlLiveSmallWindow intlLiveSmallWindow, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSmallWindow._image = (VDraweeView) viewGroup.getChildAt(0);
        intlLiveSmallWindow._close = (ImageView) viewGroup.getChildAt(1);
    }
}
