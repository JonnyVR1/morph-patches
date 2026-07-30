package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rbh {
    /* JADX INFO: renamed from: a */
    public static void m13892a(FeedLiveVoiceRoomView feedLiveVoiceRoomView, View view) {
        feedLiveVoiceRoomView.f3511a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedLiveVoiceRoomView.f3512b = viewGroup.getChildAt(0);
        feedLiveVoiceRoomView.f3513c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedLiveVoiceRoomView.f3514d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedLiveVoiceRoomView.f3515e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedLiveVoiceRoomView.f3516f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedLiveVoiceRoomView.f3517g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedLiveVoiceRoomView.f3518h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedLiveVoiceRoomView.f3519i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedLiveVoiceRoomView.f3520j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedLiveVoiceRoomView.f3521k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        feedLiveVoiceRoomView.f3522l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        feedLiveVoiceRoomView.f3523m = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m13893b(FeedLiveVoiceRoomView feedLiveVoiceRoomView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11215g1, viewGroup, false);
        m13892a(feedLiveVoiceRoomView, viewInflate);
        return viewInflate;
    }
}
