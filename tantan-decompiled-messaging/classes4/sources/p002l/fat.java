package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.LivePkDecorateView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fat {
    /* JADX INFO: renamed from: a */
    public static void m13046a(LivePkDecorateView livePkDecorateView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        livePkDecorateView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        livePkDecorateView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        livePkDecorateView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        livePkDecorateView.d = viewGroup.getChildAt(1);
    }
}
