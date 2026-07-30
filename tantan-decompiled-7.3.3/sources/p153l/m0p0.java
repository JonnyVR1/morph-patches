package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetLimitedTimeHouseView;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class m0p0 {
    /* JADX INFO: renamed from: a */
    public static void m156521a(VoiceSweetLimitedTimeHouseView voiceSweetLimitedTimeHouseView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetLimitedTimeHouseView.f54418a = (VRecyclerView) viewGroup.getChildAt(0);
        voiceSweetLimitedTimeHouseView.f54419b = (VLinear) viewGroup.getChildAt(1);
        voiceSweetLimitedTimeHouseView.f54420c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
