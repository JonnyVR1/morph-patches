package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualVoiceWindowView;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualWaveView;

/* JADX INFO: loaded from: classes4.dex */
public class eem0 {
    /* JADX INFO: renamed from: a */
    public static void m120552a(VirtualVoiceWindowView virtualVoiceWindowView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualVoiceWindowView.f52166a = (VirtualWaveView) viewGroup.getChildAt(1);
        virtualVoiceWindowView.f52167b = (CommonAnimMaskAvatarView) viewGroup.getChildAt(2);
    }
}
