package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qfo0 {
    /* JADX INFO: renamed from: a */
    public static void m21254a(VoiceRoomInfoView voiceRoomInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceRoomInfoView.a = (LinearLayout) viewGroup.getChildAt(0);
        voiceRoomInfoView.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceRoomInfoView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceRoomInfoView.f = (FrameLayout) viewGroup.getChildAt(1);
        voiceRoomInfoView.g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.k = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
