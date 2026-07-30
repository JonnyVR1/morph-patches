package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;
import com.p051p1.mobile.putong.live.livingroom.common.signin.prize.RoundImageView;

/* JADX INFO: loaded from: classes4.dex */
public class cyt {
    /* JADX INFO: renamed from: a */
    public static void m113248a(LiveSignInProgressView liveSignInProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignInProgressView.f50213a = (RoundImageView) viewGroup.getChildAt(0);
        liveSignInProgressView.f50214b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSignInProgressView.f50215c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
