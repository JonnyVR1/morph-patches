package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class gdh {
    /* JADX INFO: renamed from: a */
    public static void m129925a(FeedLiveVoiceRoomView feedLiveVoiceRoomView, View view) {
        feedLiveVoiceRoomView.f42898a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedLiveVoiceRoomView.f42899b = (VDraweeView) viewGroup.getChildAt(0);
        feedLiveVoiceRoomView.f42900c = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedLiveVoiceRoomView.f42901d = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedLiveVoiceRoomView.f42902e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedLiveVoiceRoomView.f42903f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedLiveVoiceRoomView.f42904g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedLiveVoiceRoomView.f42905h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedLiveVoiceRoomView.f42906i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedLiveVoiceRoomView.f42907j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedLiveVoiceRoomView.f42908k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        feedLiveVoiceRoomView.f42909l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        feedLiveVoiceRoomView.f42910m = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m129926b(FeedLiveVoiceRoomView feedLiveVoiceRoomView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173665g1, viewGroup, false);
        m129925a(feedLiveVoiceRoomView, viewInflate);
        return viewInflate;
    }
}
