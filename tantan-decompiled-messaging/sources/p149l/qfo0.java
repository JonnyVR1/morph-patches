package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.roominfobar.VoiceRoomInfoView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qfo0 {
    /* JADX INFO: renamed from: a */
    public static void m174366a(VoiceRoomInfoView voiceRoomInfoView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceRoomInfoView.f53390a = (LinearLayout) viewGroup.getChildAt(0);
        voiceRoomInfoView.f53391b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.f53392c = (FocusTextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.f53393d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        voiceRoomInfoView.f53394e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        voiceRoomInfoView.f53395f = (FrameLayout) viewGroup.getChildAt(1);
        voiceRoomInfoView.f53396g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.f53397h = (FocusTextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        voiceRoomInfoView.f53398i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.f53399j = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        voiceRoomInfoView.f53400k = (CommonMaskAvatarView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
