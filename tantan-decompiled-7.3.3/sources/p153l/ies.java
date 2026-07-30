package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.fans.LiveFansItem;

/* JADX INFO: loaded from: classes4.dex */
public class ies {
    /* JADX INFO: renamed from: a */
    public static void m139646a(LiveFansItem liveFansItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansItem.f49835a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        liveFansItem.f49836b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        liveFansItem.f49837c = (TextView) viewGroup.getChildAt(2);
    }
}
