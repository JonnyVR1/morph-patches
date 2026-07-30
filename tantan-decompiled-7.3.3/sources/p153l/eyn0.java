package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem;

/* JADX INFO: loaded from: classes4.dex */
public class eyn0 {
    /* JADX INFO: renamed from: a */
    public static void m123214a(VoiceLiveFansItem voiceLiveFansItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveFansItem.f53920a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceLiveFansItem.f53921b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        voiceLiveFansItem.f53922c = (TextView) viewGroup.getChildAt(2);
    }
}
