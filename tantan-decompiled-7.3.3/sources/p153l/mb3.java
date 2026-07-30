package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomCallButton;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class mb3 {
    /* JADX INFO: renamed from: a */
    public static void m157765a(BottomCallButton bottomCallButton, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bottomCallButton.f49326a = (VDraweeView) viewGroup.getChildAt(0);
        bottomCallButton.f49327b = viewGroup.getChildAt(1);
        bottomCallButton.f49328c = (TextView) viewGroup.getChildAt(2);
    }
}
