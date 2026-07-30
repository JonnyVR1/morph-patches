package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.officialshow.avatar.OfficialShowAvatarView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class o350 {
    /* JADX INFO: renamed from: a */
    public static void m162411a(OfficialShowAvatarView officialShowAvatarView, View view) {
        officialShowAvatarView.f51101a = (OfficialShowAvatarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        officialShowAvatarView.f51102b = (VLinear) viewGroup.getChildAt(0);
        officialShowAvatarView.f51103c = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        officialShowAvatarView.f51104d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        officialShowAvatarView.f51105e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowAvatarView.f51106f = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        officialShowAvatarView.f51107g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        officialShowAvatarView.f51108h = (CommonMaskAvatarView) viewGroup.getChildAt(1);
    }
}
