package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveTravelOneOrThreePairView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o6p0 {
    /* JADX INFO: renamed from: a */
    public static void m19255a(VoiceVirtualLoveTravelOneOrThreePairView voiceVirtualLoveTravelOneOrThreePairView, View view) {
        voiceVirtualLoveTravelOneOrThreePairView.d = (VoiceVirtualLoveTravelOneOrThreePairView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualLoveTravelOneOrThreePairView.e = viewGroup.getChildAt(0);
        voiceVirtualLoveTravelOneOrThreePairView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        voiceVirtualLoveTravelOneOrThreePairView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        voiceVirtualLoveTravelOneOrThreePairView.h = (LinearLayout) viewGroup.getChildAt(2);
        voiceVirtualLoveTravelOneOrThreePairView.i = (LinearLayout) viewGroup.getChildAt(3);
    }
}
