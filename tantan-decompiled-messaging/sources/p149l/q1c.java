package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.DanmakuTag;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class q1c {
    /* JADX INFO: renamed from: a */
    public static void m172385a(DanmakuTag danmakuTag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        danmakuTag.f48770a = (VImage) viewGroup.getChildAt(0);
        danmakuTag.f48771b = (VText) viewGroup.getChildAt(1);
    }
}
