package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.LiveNewOptLabelView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class k7t {
    /* JADX INFO: renamed from: a */
    public static void m144701a(LiveNewOptLabelView liveNewOptLabelView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveNewOptLabelView.f44707d = (VLinear) viewGroup.getChildAt(0);
        liveNewOptLabelView.f44708e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveNewOptLabelView.f44709f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        liveNewOptLabelView.f44710g = (VDraweeView) viewGroup.getChildAt(1);
        liveNewOptLabelView.f44711h = (VDraweeView) viewGroup.getChildAt(2);
    }
}
