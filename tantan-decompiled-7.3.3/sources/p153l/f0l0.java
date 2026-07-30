package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VVirtualVoiceWindowView;
import com.p051p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualWaveView;

/* JADX INFO: loaded from: classes4.dex */
public class f0l0 {
    /* JADX INFO: renamed from: a */
    public static void m123488a(VVirtualVoiceWindowView vVirtualVoiceWindowView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vVirtualVoiceWindowView.f52160a = (VirtualWaveView) viewGroup.getChildAt(1);
        vVirtualVoiceWindowView.f52161b = (CommonAnimMaskAvatarView) viewGroup.getChildAt(2);
    }
}
