package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantListtem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class t41 {
    /* JADX INFO: renamed from: a */
    public static void m189138a(AttitudeParticipantListtem attitudeParticipantListtem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        attitudeParticipantListtem.f42264a = (VDraweeView) viewGroup.getChildAt(0);
        attitudeParticipantListtem.f42265b = (LinearLayout) viewGroup.getChildAt(1);
        attitudeParticipantListtem.f42266c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        attitudeParticipantListtem.f42267d = (VText) viewGroup.getChildAt(2);
    }
}
