package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveVoiceRoomView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lsg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m11710a(FeedCenterLiveVoiceRoomView feedCenterLiveVoiceRoomView, View view) {
        feedCenterLiveVoiceRoomView.f3324B = (FeedCenterLiveVoiceRoomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterLiveVoiceRoomView.f3325C = viewGroup.getChildAt(0);
        feedCenterLiveVoiceRoomView.f3326D = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f3327E = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f3328F = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f3329G = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f3330H = (FeedLiveVoiceRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f3331I = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedCenterLiveVoiceRoomView.f3332J = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f3333K = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f3334L = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f3335M = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f3336N = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
    }
}
