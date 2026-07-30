package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.topBar.VoiceVirtualRoomInfoTopBarView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class y9p0 {
    /* JADX INFO: renamed from: a */
    public static void m213547a(VoiceVirtualRoomInfoTopBarView voiceVirtualRoomInfoTopBarView, View view) {
        voiceVirtualRoomInfoTopBarView.f52715d = (VoiceVirtualRoomInfoTopBarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        voiceVirtualRoomInfoTopBarView.f52716e = (ImageView) viewGroup.getChildAt(0);
        voiceVirtualRoomInfoTopBarView.f52717f = (VDraweeView) viewGroup.getChildAt(1);
        voiceVirtualRoomInfoTopBarView.f52718g = (VDraweeView) viewGroup.getChildAt(2);
        voiceVirtualRoomInfoTopBarView.f52719h = (VLinear) viewGroup.getChildAt(3);
        voiceVirtualRoomInfoTopBarView.f52720i = (FocusTextView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        voiceVirtualRoomInfoTopBarView.f52721j = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        voiceVirtualRoomInfoTopBarView.f52722k = (VText) viewGroup.getChildAt(4);
    }
}
