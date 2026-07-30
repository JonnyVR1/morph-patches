package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y9p0 {
    /* JADX INFO: renamed from: a */
    public static void m26464a(VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView, View view) {
        voiceVirtualRoomInfoTopBarView.d = (VoiceVirtualRoomInfoTopBarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoTopBarView.e = (ImageView) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoTopBarView.f = viewGroup.getChildAt(1);
        voiceVirtualRoomInfoTopBarView.g = viewGroup.getChildAt(2);
        voiceVirtualRoomInfoTopBarView.h = viewGroup.getChildAt(3);
        voiceVirtualRoomInfoTopBarView.i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualRoomInfoTopBarView.j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualRoomInfoTopBarView.k = viewGroup.getChildAt(4);
    }
}
