package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o350 {
    /* JADX INFO: renamed from: a */
    public static void m19193a(OfficialShowAvatarView officialShowAvatarView, View view) {
        officialShowAvatarView.f7143a = (OfficialShowAvatarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowAvatarView.f7144b = viewGroup.getChildAt(0);
        officialShowAvatarView.f7145c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        officialShowAvatarView.f7146d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        officialShowAvatarView.f7147e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowAvatarView.f7148f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        officialShowAvatarView.f7149g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowAvatarView.f7150h = (CommonMaskAvatarView) viewGroup.getChildAt(1);
    }
}
