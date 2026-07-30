package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomIndicatorView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tgd0 {
    /* JADX INFO: renamed from: a */
    public static void m191025a(RoomIndicatorView roomIndicatorView, View view) {
        roomIndicatorView.f48591a = (RoomIndicatorView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        roomIndicatorView.f48592b = (LinearLayout) viewGroup.getChildAt(1);
        roomIndicatorView.f48593c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        roomIndicatorView.f48594d = (LinearLayout) viewGroup.getChildAt(2);
        roomIndicatorView.f48595e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
