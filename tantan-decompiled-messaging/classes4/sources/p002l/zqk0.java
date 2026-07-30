package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VVirtualVoiceWindowView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zqk0 {
    /* JADX INFO: renamed from: a */
    public static void m27504a(VVirtualVoiceWindowView vVirtualVoiceWindowView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vVirtualVoiceWindowView.a = viewGroup.getChildAt(1);
        vVirtualVoiceWindowView.b = (CommonAnimMaskAvatarView) viewGroup.getChildAt(2);
    }
}
