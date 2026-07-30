package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.svgaplayer.view.MomoSVGAImageView;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class v2c {
    /* JADX INFO: renamed from: a */
    public static void m199127a(DanmakuItem danmakuItem, View view) {
        danmakuItem.f49691a = (DanmakuItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        danmakuItem.f49692b = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        danmakuItem.f49693c = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        danmakuItem.f49694d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        danmakuItem.f49695e = (MomoSVGAImageView) viewGroup.getChildAt(3);
    }
}
