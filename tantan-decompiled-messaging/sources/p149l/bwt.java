package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;
import com.p046p1.mobile.putong.live.livingroom.common.signin.prize.RoundImageView;

/* JADX INFO: loaded from: classes4.dex */
public class bwt {
    /* JADX INFO: renamed from: a */
    public static void m104251a(LiveSignInProgressView liveSignInProgressView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSignInProgressView.f49365a = (RoundImageView) viewGroup.getChildAt(0);
        liveSignInProgressView.f49366b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSignInProgressView.f49367c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
