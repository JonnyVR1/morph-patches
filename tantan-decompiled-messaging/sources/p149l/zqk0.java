package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VVirtualVoiceWindowView;
import com.p046p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualWaveView;

/* JADX INFO: loaded from: classes4.dex */
public class zqk0 {
    /* JADX INFO: renamed from: a */
    public static void m219855a(VVirtualVoiceWindowView vVirtualVoiceWindowView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vVirtualVoiceWindowView.f51312a = (VirtualWaveView) viewGroup.getChildAt(1);
        vVirtualVoiceWindowView.f51313b = (CommonAnimMaskAvatarView) viewGroup.getChildAt(2);
    }
}
