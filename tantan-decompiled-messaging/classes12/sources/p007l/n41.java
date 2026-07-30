package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n41 {
    /* JADX INFO: renamed from: a */
    public static void m12067a(AttitudeParticipantPagerItem attitudeParticipantPagerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        attitudeParticipantPagerItem.f2881a = (RelativeLayout) viewGroup.getChildAt(0);
        attitudeParticipantPagerItem.f2882b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        attitudeParticipantPagerItem.f2883c = viewGroup.getChildAt(1);
    }
}
