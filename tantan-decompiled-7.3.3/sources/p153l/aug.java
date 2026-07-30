package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterLiveVoiceRoomView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.livevoiceroom.FeedLiveVoiceRoomView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class aug {
    /* JADX INFO: renamed from: a */
    public static void m100391a(FeedCenterLiveVoiceRoomView feedCenterLiveVoiceRoomView, View view) {
        feedCenterLiveVoiceRoomView.f42711B = (FeedCenterLiveVoiceRoomView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedCenterLiveVoiceRoomView.f42712C = (VLinear) viewGroup.getChildAt(0);
        feedCenterLiveVoiceRoomView.f42713D = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f42714E = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f42715F = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f42716G = (VExpandableTextContainer) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f42717H = (FeedLiveVoiceRoomView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f42718I = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        feedCenterLiveVoiceRoomView.f42719J = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f42720K = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f42721L = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedCenterLiveVoiceRoomView.f42722M = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedCenterLiveVoiceRoomView.f42723N = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
    }
}
