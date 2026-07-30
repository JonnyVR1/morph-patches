package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetLimitedTimeHouseView;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iro0 {
    /* JADX INFO: renamed from: a */
    public static void m137906a(VoiceSweetLimitedTimeHouseView voiceSweetLimitedTimeHouseView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceSweetLimitedTimeHouseView.f53570a = (VRecyclerView) viewGroup.getChildAt(0);
        voiceSweetLimitedTimeHouseView.f53571b = (VLinear) viewGroup.getChildAt(1);
        voiceSweetLimitedTimeHouseView.f53572c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
