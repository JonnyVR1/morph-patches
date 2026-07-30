package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant.AttitudeParticipantPagerItem;

/* JADX INFO: loaded from: classes13.dex */
public class u41 {
    /* JADX INFO: renamed from: a */
    public static void m194463a(AttitudeParticipantPagerItem attitudeParticipantPagerItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        attitudeParticipantPagerItem.f42268a = (RelativeLayout) viewGroup.getChildAt(0);
        attitudeParticipantPagerItem.f42269b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        attitudeParticipantPagerItem.f42270c = (RecyclerView) viewGroup.getChildAt(1);
    }
}
