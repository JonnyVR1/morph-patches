package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuRuleViewModel;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class s6g0 {
    /* JADX INFO: renamed from: a */
    public static void m184885a(StormDanmakuRuleViewModel stormDanmakuRuleViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        stormDanmakuRuleViewModel.f49641a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        stormDanmakuRuleViewModel.f49642b = (LiveMkWebView) viewGroup.getChildAt(1);
    }
}
