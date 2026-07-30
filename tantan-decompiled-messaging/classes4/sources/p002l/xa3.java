package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomCallButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xa3 {
    /* JADX INFO: renamed from: a */
    public static void m25805a(BottomCallButton bottomCallButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomCallButton.f4520a = viewGroup.getChildAt(0);
        bottomCallButton.f4521b = viewGroup.getChildAt(1);
        bottomCallButton.f4522c = (TextView) viewGroup.getChildAt(2);
    }
}
