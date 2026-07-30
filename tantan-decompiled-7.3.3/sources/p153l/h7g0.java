package p153l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.view.RatioLayout;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class h7g0 {
    /* JADX INFO: renamed from: a */
    public static void m133798a(StormDanmakuViewModel stormDanmakuViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        stormDanmakuViewModel.f49643a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        stormDanmakuViewModel.f49644b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        stormDanmakuViewModel.f49645c = (LinearLayout) viewGroup.getChildAt(1);
        stormDanmakuViewModel.f49646d = (RatioLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        stormDanmakuViewModel.f49647e = (TextureView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        stormDanmakuViewModel.f49648f = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        stormDanmakuViewModel.f49649g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        stormDanmakuViewModel.f49650h = (LinearLayout) viewGroup.getChildAt(2);
        stormDanmakuViewModel.f49651i = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        stormDanmakuViewModel.f49652j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
