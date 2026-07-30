package p002l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class azf0 {
    /* JADX INFO: renamed from: a */
    public static void m10138a(StormDanmakuViewModel stormDanmakuViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        stormDanmakuViewModel.f4837a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        stormDanmakuViewModel.f4838b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        stormDanmakuViewModel.f4839c = (LinearLayout) viewGroup.getChildAt(1);
        stormDanmakuViewModel.f4840d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        stormDanmakuViewModel.f4841e = (TextureView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        stormDanmakuViewModel.f4842f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        stormDanmakuViewModel.f4843g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        stormDanmakuViewModel.f4844h = (LinearLayout) viewGroup.getChildAt(2);
        stormDanmakuViewModel.f4845i = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        stormDanmakuViewModel.f4846j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
