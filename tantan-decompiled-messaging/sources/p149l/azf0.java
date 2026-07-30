package p149l;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.view.RatioLayout;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class azf0 {
    /* JADX INFO: renamed from: a */
    public static void m99663a(StormDanmakuViewModel stormDanmakuViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        stormDanmakuViewModel.f48795a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        stormDanmakuViewModel.f48796b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        stormDanmakuViewModel.f48797c = (LinearLayout) viewGroup.getChildAt(1);
        stormDanmakuViewModel.f48798d = (RatioLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        stormDanmakuViewModel.f48799e = (TextureView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        stormDanmakuViewModel.f48800f = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        stormDanmakuViewModel.f48801g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        stormDanmakuViewModel.f48802h = (LinearLayout) viewGroup.getChildAt(2);
        stormDanmakuViewModel.f48803i = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        stormDanmakuViewModel.f48804j = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }
}
