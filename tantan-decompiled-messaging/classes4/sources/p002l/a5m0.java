package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.other.voicewindow.virtual.VirtualVoiceWindowView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a5m0 {
    /* JADX INFO: renamed from: a */
    public static void m9400a(VirtualVoiceWindowView virtualVoiceWindowView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        virtualVoiceWindowView.a = viewGroup.getChildAt(1);
        virtualVoiceWindowView.b = (CommonAnimMaskAvatarView) viewGroup.getChildAt(2);
    }
}
