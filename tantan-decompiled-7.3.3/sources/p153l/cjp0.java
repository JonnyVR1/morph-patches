package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cjp0 {
    /* JADX INFO: renamed from: a */
    public static void m110275a(VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView, View view) {
        voiceVirtualRoomInfoTopBarView.f53563d = (VoiceVirtualRoomInfoTopBarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoTopBarView.f53564e = (ImageView) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoTopBarView.f53565f = (VDraweeView) viewGroup.getChildAt(1);
        voiceVirtualRoomInfoTopBarView.f53566g = (VDraweeView) viewGroup.getChildAt(2);
        voiceVirtualRoomInfoTopBarView.f53567h = (VLinear) viewGroup.getChildAt(3);
        voiceVirtualRoomInfoTopBarView.f53568i = (FocusTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualRoomInfoTopBarView.f53569j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualRoomInfoTopBarView.f53570k = (VText) viewGroup.getChildAt(4);
    }
}
