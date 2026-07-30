package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j750 {
    /* JADX INFO: renamed from: a */
    public static void m15720a(OfficialShowSwitchView officialShowSwitchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowSwitchView.f7187a = viewGroup.getChildAt(0);
        officialShowSwitchView.f7188b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        officialShowSwitchView.f7189c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        officialShowSwitchView.f7190d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowSwitchView.f7191e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        officialShowSwitchView.f7192f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        officialShowSwitchView.f7193g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
