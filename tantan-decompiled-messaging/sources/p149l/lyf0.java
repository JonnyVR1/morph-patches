package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.webview.LiveMkWebView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuRuleViewModel;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class lyf0 {
    /* JADX INFO: renamed from: a */
    public static void m152246a(StormDanmakuRuleViewModel stormDanmakuRuleViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        stormDanmakuRuleViewModel.f48793a = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        stormDanmakuRuleViewModel.f48794b = (LiveMkWebView) viewGroup.getChildAt(1);
    }
}
