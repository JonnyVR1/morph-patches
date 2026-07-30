package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.svgaplayer.view.MomoSVGAImageView;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class i1c {
    /* JADX INFO: renamed from: a */
    public static void m133968a(DanmakuItem danmakuItem, View view) {
        danmakuItem.f48843a = (DanmakuItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        danmakuItem.f48844b = (CommonMaskAvatarView) viewGroup.getChildAt(0);
        danmakuItem.f48845c = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        danmakuItem.f48846d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        danmakuItem.f48847e = (MomoSVGAImageView) viewGroup.getChildAt(3);
    }
}
