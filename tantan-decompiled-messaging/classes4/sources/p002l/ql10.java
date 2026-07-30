package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ql10 {
    /* JADX INFO: renamed from: a */
    public static void m21476a(MultiPkTimerView multiPkTimerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        multiPkTimerView.d = viewGroup.getChildAt(0);
        multiPkTimerView.e = viewGroup.getChildAt(1);
        multiPkTimerView.f = viewGroup.getChildAt(2);
        multiPkTimerView.g = viewGroup.getChildAt(3);
        multiPkTimerView.h = viewGroup.getChildAt(4);
        multiPkTimerView.i = viewGroup.getChildAt(5);
        multiPkTimerView.j = (TextView) viewGroup.getChildAt(6);
    }
}
