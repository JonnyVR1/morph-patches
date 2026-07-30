package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.switchanchor.OfficialShowSwitchView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class yf50 {
    /* JADX INFO: renamed from: a */
    public static void m215524a(OfficialShowSwitchView officialShowSwitchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowSwitchView.f51993a = (VLinear) viewGroup.getChildAt(0);
        officialShowSwitchView.f51994b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        officialShowSwitchView.f51995c = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        officialShowSwitchView.f51996d = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowSwitchView.f51997e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        officialShowSwitchView.f51998f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        officialShowSwitchView.f51999g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
