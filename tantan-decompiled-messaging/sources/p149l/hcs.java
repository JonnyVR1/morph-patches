package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;

/* JADX INFO: loaded from: classes4.dex */
public class hcs {
    /* JADX INFO: renamed from: a */
    public static void m130492a(LiveFansItem liveFansItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansItem.f48987a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        liveFansItem.f48988b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveFansItem.f48989c = (TextView) viewGroup.getChildAt(2);
    }
}
