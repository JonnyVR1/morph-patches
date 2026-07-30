package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantListtem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class m41 {
    /* JADX INFO: renamed from: a */
    public static void m152987a(AttitudeParticipantListtem attitudeParticipantListtem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        attitudeParticipantListtem.f41416a = (VDraweeView) viewGroup.getChildAt(0);
        attitudeParticipantListtem.f41417b = (LinearLayout) viewGroup.getChildAt(1);
        attitudeParticipantListtem.f41418c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        attitudeParticipantListtem.f41419d = (VText) viewGroup.getChildAt(2);
    }
}
