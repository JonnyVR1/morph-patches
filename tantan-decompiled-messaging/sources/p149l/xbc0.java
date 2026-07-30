package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView;
import com.p046p1.mobile.putong.core.newui.view.LoveRadarSwitchView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xbc0 {
    /* JADX INFO: renamed from: a */
    public static void m207725a(RadarSwitchView radarSwitchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        radarSwitchView.f25399a = (VLinear) viewGroup.getChildAt(0);
        radarSwitchView.f25400b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        radarSwitchView.f25401c = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        radarSwitchView.f25402d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        radarSwitchView.f25403e = (LoveRadarSwitchView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
