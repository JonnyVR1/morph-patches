package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveVoiceRoomView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class lsg {
    /* JADX INFO: renamed from: a */
    public static void m151562a(FeedCenterLiveVoiceRoomView feedCenterLiveVoiceRoomView, View view) {
        feedCenterLiveVoiceRoomView.f41863B = (FeedCenterLiveVoiceRoomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterLiveVoiceRoomView.f41864C = (VLinear) viewGroup.getChildAt(0);
        feedCenterLiveVoiceRoomView.f41865D = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f41866E = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f41867F = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f41868G = (VExpandableTextContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f41869H = (FeedLiveVoiceRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f41870I = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedCenterLiveVoiceRoomView.f41871J = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f41872K = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f41873L = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f41874M = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f41875N = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
    }
}
