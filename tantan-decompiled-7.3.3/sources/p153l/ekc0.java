package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView;
import com.p051p1.mobile.putong.core.newui.view.LoveRadarSwitchView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ekc0 {
    /* JADX INFO: renamed from: a */
    public static void m121035a(RadarSwitchView radarSwitchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        radarSwitchView.f26141a = (VLinear) viewGroup.getChildAt(0);
        radarSwitchView.f26142b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        radarSwitchView.f26143c = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        radarSwitchView.f26144d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        radarSwitchView.f26145e = (LoveRadarSwitchView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
