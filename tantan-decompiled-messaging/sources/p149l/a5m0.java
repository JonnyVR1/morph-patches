package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualVoiceWindowView;
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualWaveView;

/* JADX INFO: loaded from: classes4.dex */
public class a5m0 {
    /* JADX INFO: renamed from: a */
    public static void m95055a(VirtualVoiceWindowView virtualVoiceWindowView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualVoiceWindowView.f51318a = (VirtualWaveView) viewGroup.getChildAt(1);
        virtualVoiceWindowView.f51319b = (CommonAnimMaskAvatarView) viewGroup.getChildAt(2);
    }
}
