package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.internal.PkWinTimesViewInternal;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j480 {
    /* JADX INFO: renamed from: a */
    public static void m15613a(PkWinTimesViewInternal pkWinTimesViewInternal, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkWinTimesViewInternal.a = viewGroup.getChildAt(0);
        pkWinTimesViewInternal.b = (TextView) viewGroup.getChildAt(1);
    }
}
