package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem;

/* JADX INFO: loaded from: classes4.dex */
public class apn0 {
    /* JADX INFO: renamed from: a */
    public static void m98163a(VoiceLiveFansItem voiceLiveFansItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveFansItem.f53072a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceLiveFansItem.f53073b = (AnimEffectPlayer) viewGroup.getChildAt(1);
        voiceLiveFansItem.f53074c = (TextView) viewGroup.getChildAt(2);
    }
}
