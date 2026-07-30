package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveBigEventItemView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zwr {
    /* JADX INFO: renamed from: a */
    public static void m220686a(LiveBigEventItemView liveBigEventItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveBigEventItemView.f49065a = (RelativeLayout) viewGroup.getChildAt(0);
        liveBigEventItemView.f49066b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveBigEventItemView.f49067c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
