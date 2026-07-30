package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem;

/* JADX INFO: loaded from: classes12.dex */
public class n41 {
    /* JADX INFO: renamed from: a */
    public static void m157795a(AttitudeParticipantPagerItem attitudeParticipantPagerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        attitudeParticipantPagerItem.f41420a = (RelativeLayout) viewGroup.getChildAt(0);
        attitudeParticipantPagerItem.f41421b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        attitudeParticipantPagerItem.f41422c = (RecyclerView) viewGroup.getChildAt(1);
    }
}
