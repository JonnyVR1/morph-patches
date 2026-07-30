package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuTag;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class d3c {
    /* JADX INFO: renamed from: a */
    public static void m113799a(DanmakuTag danmakuTag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        danmakuTag.f49618a = (VImage) viewGroup.getChildAt(0);
        danmakuTag.f49619b = (VText) viewGroup.getChildAt(1);
    }
}
