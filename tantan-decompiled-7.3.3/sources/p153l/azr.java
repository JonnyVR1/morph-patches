package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveBigEventItemView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class azr {
    /* JADX INFO: renamed from: a */
    public static void m101082a(LiveBigEventItemView liveBigEventItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveBigEventItemView.f49913a = (RelativeLayout) viewGroup.getChildAt(0);
        liveBigEventItemView.f49914b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveBigEventItemView.f49915c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
