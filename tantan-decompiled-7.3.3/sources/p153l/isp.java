package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class isp {
    /* JADX INFO: renamed from: a */
    public static void m141886a(IntlVoiceDanmakuItem intlVoiceDanmakuItem, View view) {
        intlVoiceDanmakuItem.f49709d = (IntlVoiceDanmakuItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceDanmakuItem.f49710e = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        intlVoiceDanmakuItem.f49711f = (VText) viewGroup.getChildAt(1);
        intlVoiceDanmakuItem.f49712g = (VText) viewGroup.getChildAt(2);
        intlVoiceDanmakuItem.f49713h = (VDraweeView) viewGroup.getChildAt(3);
    }
}
