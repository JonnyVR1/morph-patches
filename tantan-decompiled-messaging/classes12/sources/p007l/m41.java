package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantListtem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m41 {
    /* JADX INFO: renamed from: a */
    public static void m11784a(AttitudeParticipantListtem attitudeParticipantListtem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        attitudeParticipantListtem.f2877a = viewGroup.getChildAt(0);
        attitudeParticipantListtem.f2878b = (LinearLayout) viewGroup.getChildAt(1);
        attitudeParticipantListtem.f2879c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        attitudeParticipantListtem.f2880d = viewGroup.getChildAt(2);
    }
}
