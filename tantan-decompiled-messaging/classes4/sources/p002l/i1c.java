package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i1c {
    /* JADX INFO: renamed from: a */
    public static void m14976a(DanmakuItem danmakuItem, View view) {
        danmakuItem.f4885a = (DanmakuItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        danmakuItem.f4886b = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        danmakuItem.f4887c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        danmakuItem.f4888d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        danmakuItem.f4889e = viewGroup.getChildAt(3);
    }
}
