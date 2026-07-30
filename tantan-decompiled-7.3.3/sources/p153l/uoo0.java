package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uoo0 {
    /* JADX INFO: renamed from: a */
    public static void m197002a(VoiceRoomInfoView voiceRoomInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceRoomInfoView.f54238a = (LinearLayout) viewGroup.getChildAt(0);
        voiceRoomInfoView.f54239b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.f54240c = (FocusTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.f54241d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceRoomInfoView.f54242e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceRoomInfoView.f54243f = (FrameLayout) viewGroup.getChildAt(1);
        voiceRoomInfoView.f54244g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.f54245h = (FocusTextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.f54246i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.f54247j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.f54248k = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
