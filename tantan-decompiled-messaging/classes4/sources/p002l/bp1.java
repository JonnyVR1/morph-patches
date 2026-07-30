package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.AvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.view.AvatarShineView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bp1 {
    /* JADX INFO: renamed from: a */
    public static void m10539a(AvatarView avatarView, View view) {
        avatarView.f4441a = (AvatarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        avatarView.f4442b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        avatarView.f4443c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        avatarView.f4444d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        avatarView.f4445e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        avatarView.f4446f = (AvatarShineView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        avatarView.f4447g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        avatarView.f4448h = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        avatarView.f4449i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        avatarView.f4450j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        avatarView.f4451k = viewGroup.getChildAt(1);
        avatarView.f4452l = viewGroup.getChildAt(2);
        avatarView.f4453m = (CommonMaskAvatarView) viewGroup.getChildAt(3);
    }
}
