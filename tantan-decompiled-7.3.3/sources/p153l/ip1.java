package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ip1 {
    /* JADX INFO: renamed from: a */
    public static void m141392a(AvatarView avatarView, View view) {
        avatarView.f49247a = (AvatarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        avatarView.f49248b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        avatarView.f49249c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        avatarView.f49250d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        avatarView.f49251e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        avatarView.f49252f = (AvatarShineView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        avatarView.f49253g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        avatarView.f49254h = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        avatarView.f49255i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        avatarView.f49256j = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        avatarView.f49257k = (AnimEffectPlayer) viewGroup.getChildAt(1);
        avatarView.f49258l = (VText) viewGroup.getChildAt(2);
        avatarView.f49259m = (CommonMaskAvatarView) viewGroup.getChildAt(3);
    }
}
