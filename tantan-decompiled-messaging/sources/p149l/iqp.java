package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iqp {
    /* JADX INFO: renamed from: a */
    public static void m137783a(IntlVoiceDanmakuItem intlVoiceDanmakuItem, View view) {
        intlVoiceDanmakuItem.f48861d = (IntlVoiceDanmakuItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceDanmakuItem.f48862e = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        intlVoiceDanmakuItem.f48863f = (VText) viewGroup.getChildAt(1);
        intlVoiceDanmakuItem.f48864g = (VText) viewGroup.getChildAt(2);
        intlVoiceDanmakuItem.f48865h = (VDraweeView) viewGroup.getChildAt(3);
    }
}
