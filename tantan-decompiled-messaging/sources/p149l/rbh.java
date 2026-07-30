package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class rbh {
    /* JADX INFO: renamed from: a */
    public static void m178600a(FeedLiveVoiceRoomView feedLiveVoiceRoomView, View view) {
        feedLiveVoiceRoomView.f42050a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedLiveVoiceRoomView.f42051b = (VDraweeView) viewGroup.getChildAt(0);
        feedLiveVoiceRoomView.f42052c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedLiveVoiceRoomView.f42053d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedLiveVoiceRoomView.f42054e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedLiveVoiceRoomView.f42055f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedLiveVoiceRoomView.f42056g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedLiveVoiceRoomView.f42057h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedLiveVoiceRoomView.f42058i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedLiveVoiceRoomView.f42059j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedLiveVoiceRoomView.f42060k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        feedLiveVoiceRoomView.f42061l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        feedLiveVoiceRoomView.f42062m = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m178601b(FeedLiveVoiceRoomView feedLiveVoiceRoomView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142196g1, viewGroup, false);
        m178600a(feedLiveVoiceRoomView, viewInflate);
        return viewInflate;
    }
}
