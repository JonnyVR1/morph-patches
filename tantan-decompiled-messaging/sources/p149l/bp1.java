package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bp1 {
    /* JADX INFO: renamed from: a */
    public static void m103009a(AvatarView avatarView, View view) {
        avatarView.f48399a = (AvatarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        avatarView.f48400b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        avatarView.f48401c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        avatarView.f48402d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        avatarView.f48403e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        avatarView.f48404f = (AvatarShineView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        avatarView.f48405g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        avatarView.f48406h = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        avatarView.f48407i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        avatarView.f48408j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        avatarView.f48409k = (AnimEffectPlayer) viewGroup.getChildAt(1);
        avatarView.f48410l = (VText) viewGroup.getChildAt(2);
        avatarView.f48411m = (CommonMaskAvatarView) viewGroup.getChildAt(3);
    }
}
