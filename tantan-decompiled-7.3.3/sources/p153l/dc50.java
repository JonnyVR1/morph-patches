package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class dc50 {
    /* JADX INFO: renamed from: a */
    public static void m115216a(OfficialShowAvatarView officialShowAvatarView, View view) {
        officialShowAvatarView.f51949a = (OfficialShowAvatarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowAvatarView.f51950b = (VLinear) viewGroup.getChildAt(0);
        officialShowAvatarView.f51951c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        officialShowAvatarView.f51952d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        officialShowAvatarView.f51953e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowAvatarView.f51954f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        officialShowAvatarView.f51955g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowAvatarView.f51956h = (CommonMaskAvatarView) viewGroup.getChildAt(1);
    }
}
