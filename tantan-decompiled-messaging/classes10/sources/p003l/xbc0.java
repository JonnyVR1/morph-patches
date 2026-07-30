package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.RadarSwitchView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xbc0 {
    /* JADX INFO: renamed from: a */
    public static void m10782a(RadarSwitchView radarSwitchView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        radarSwitchView.a = viewGroup.getChildAt(0);
        radarSwitchView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        radarSwitchView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        radarSwitchView.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        radarSwitchView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
