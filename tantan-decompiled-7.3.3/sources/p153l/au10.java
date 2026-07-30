package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.multiPkPlaying.MultiPkTimerView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class au10 {
    /* JADX INFO: renamed from: a */
    public static void m100315a(MultiPkTimerView multiPkTimerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        multiPkTimerView.f52287d = viewGroup.getChildAt(0);
        multiPkTimerView.f52288e = viewGroup.getChildAt(1);
        multiPkTimerView.f52289f = viewGroup.getChildAt(2);
        multiPkTimerView.f52290g = viewGroup.getChildAt(3);
        multiPkTimerView.f52291h = (VImage) viewGroup.getChildAt(4);
        multiPkTimerView.f52292i = (VImage) viewGroup.getChildAt(5);
        multiPkTimerView.f52293j = (TextView) viewGroup.getChildAt(6);
    }
}
