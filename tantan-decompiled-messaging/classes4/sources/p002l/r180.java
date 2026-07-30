package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.recreation.pk.view.PkScorllItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r180 {
    /* JADX INFO: renamed from: a */
    public static void m21715a(PkScorllItemView pkScorllItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pkScorllItemView.a = (TextView) viewGroup.getChildAt(0);
        pkScorllItemView.b = (ImageView) viewGroup.getChildAt(1);
    }
}
