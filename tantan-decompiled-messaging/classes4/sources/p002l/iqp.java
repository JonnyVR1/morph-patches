package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iqp {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m15297a(IntlVoiceDanmakuItem intlVoiceDanmakuItem, View view) {
        intlVoiceDanmakuItem.f4903d = (IntlVoiceDanmakuItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceDanmakuItem.f4904e = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        intlVoiceDanmakuItem.f4905f = viewGroup.getChildAt(1);
        intlVoiceDanmakuItem.f4906g = viewGroup.getChildAt(2);
        intlVoiceDanmakuItem.f4907h = viewGroup.getChildAt(3);
    }
}
