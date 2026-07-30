package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.voice.fans.VoiceLiveFansItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class apn0 {
    /* JADX INFO: renamed from: a */
    public static void m9993a(VoiceLiveFansItem voiceLiveFansItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        voiceLiveFansItem.a = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        voiceLiveFansItem.b = viewGroup.getChildAt(1);
        voiceLiveFansItem.c = (TextView) viewGroup.getChildAt(2);
    }
}
