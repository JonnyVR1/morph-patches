package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomIndicatorView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class q8d0 {
    /* JADX INFO: renamed from: a */
    public static void m173368a(RoomIndicatorView roomIndicatorView, View view) {
        roomIndicatorView.f47743a = (RoomIndicatorView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        roomIndicatorView.f47744b = (LinearLayout) viewGroup.getChildAt(1);
        roomIndicatorView.f47745c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        roomIndicatorView.f47746d = (LinearLayout) viewGroup.getChildAt(2);
        roomIndicatorView.f47747e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
