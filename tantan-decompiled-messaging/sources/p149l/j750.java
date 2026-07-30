package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class j750 {
    /* JADX INFO: renamed from: a */
    public static void m140075a(OfficialShowSwitchView officialShowSwitchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowSwitchView.f51145a = (VLinear) viewGroup.getChildAt(0);
        officialShowSwitchView.f51146b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        officialShowSwitchView.f51147c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        officialShowSwitchView.f51148d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowSwitchView.f51149e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        officialShowSwitchView.f51150f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        officialShowSwitchView.f51151g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
