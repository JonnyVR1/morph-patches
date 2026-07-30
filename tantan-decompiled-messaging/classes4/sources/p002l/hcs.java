package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hcs {
    /* JADX INFO: renamed from: a */
    public static void m14306a(LiveFansItem liveFansItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansItem.f5029a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        liveFansItem.f5030b = viewGroup.getChildAt(1);
        liveFansItem.f5031c = (TextView) viewGroup.getChildAt(2);
    }
}
